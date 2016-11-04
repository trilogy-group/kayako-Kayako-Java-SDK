package com.kayako.sdk.utils;

import com.google.gson.*;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.base.parser.Resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * All functions using Gson Library will be restricted to this Util class.
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public class ParserUtils<T extends Resource> {

    private static final String NODE_DATA = "data";
    private static final String ITEM_LOCALE = "locale";
    private static final String ITEM_TRANSLATION = "translation";

    private static JsonParser sJsonParser = new JsonParser();

    private static String getTranslationFromLocaleField(Locale selectLocale, String jsonOfLocaleFields) {
        JsonArray localeFields = sJsonParser.parse(jsonOfLocaleFields).getAsJsonArray();

        String enTranslation = null;
        String firstTranslation = null;

        for (JsonElement field : localeFields) {
            JsonObject element = field.getAsJsonObject();

            JsonElement translationElement = element.get(ITEM_TRANSLATION);
            JsonElement localeElement = element.get(ITEM_LOCALE);

            if (translationElement == null || translationElement.isJsonNull()) { // If the translation is null, there's no point in moving further.
                continue;
            }

            String currentLocaleCode = localeElement.getAsString();
            String currentTranslation = translationElement.getAsString();
            Locale currentLocale = new Locale(LocaleUtils.getLanguage(currentLocaleCode));

            if (selectLocale.equals(currentLocale)) {
                return currentTranslation;
            }

            if (Locale.ENGLISH.equals(currentLocale)) {
                enTranslation = currentTranslation;
            }

            if (firstTranslation == null) {
                firstTranslation = currentTranslation;
            }
        }

        if (enTranslation != null) {
            return enTranslation;
        } else if (firstTranslation != null) {
            return firstTranslation;
        } else {
            return null;
        }
    }

    /**
     * Extract the translation based on the specified Locale field.
     * If select one unavailable, search for en-us locale.
     * If en-us one unavailable, pick first one.
     *
     * @param selectLocale
     * @param localeFields
     * @return
     */
    public static String getTranslationFromLocaleField(Locale selectLocale, JsonArray localeFields) {
        return getTranslationFromLocaleField(selectLocale, localeFields.toString());
    }

    public static long getTimeInMilliSeconds(String isoTimeStamp) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.UK);
            return sdf.parse(isoTimeStamp).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static <T extends Resource> List<T> convertJsonArrayToResourceList(JsonArray jsonArray, Parser<T> parser) {
        List<T> list = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            list.add(parser.parse(element.getAsJsonObject().toString()));
        }
        return list;
    }

    public static <T extends Resource> List<T> getResourceList(String json, String nodeName, Parser<T> parser) {
        return convertJsonArrayToResourceList(getNodeAsJsonArray(json, nodeName), parser);
    }

    public static <T extends Resource> List<T> getResourceListFromDataNode(String json, Parser<T> parser) {
        return convertJsonArrayToResourceList(getDataNodeAsJsonArray(json), parser);
    }

    public static <T extends Resource> T getResource(String json, String nodeName, Parser<T> parser) {
        return parser.parse(getNodeAsJsonObject(json, nodeName).toString());
    }

    public static <T extends Resource> T getResourceFromDataNode(String json, Parser<T> parser) {
        return parser.parse(getDataNodeAsJsonObject(json).toString());
    }

    public static ResourceMap convertResourceJsonToResourceMap(String json) {
        return new MyResourceMap(convertJsonOfResourceToJsonObject(json));
    }

    // TODO: Once you shift all gson usage to this class, make sure you make the following classes private

    public static JsonArray getDataNodeAsJsonArray(String json) throws NullPointerException {
        return getNodeAsJsonArray(json, NODE_DATA);
    }

    public static JsonObject getDataNodeAsJsonObject(String json) throws NullPointerException {
        return getNodeAsJsonObject(json, NODE_DATA);
    }

    public static JsonArray getNodeAsJsonArray(String json, String nodeName) {
        return sJsonParser.parse(json).getAsJsonObject().getAsJsonArray(nodeName);
    }

    public static JsonObject getNodeAsJsonObject(String json, String nodeName) throws NullPointerException {
        return sJsonParser.parse(json).getAsJsonObject().getAsJsonObject(nodeName);
    }

    public static JsonObject convertJsonOfResourceToJsonObject(String jsonOfResource) {
        return sJsonParser.parse(jsonOfResource).getAsJsonObject();
    }

    public interface ResourceMap {

        /**
         * Check if member is contained
         *
         * @param memberName Key
         * @return true if available
         */
        boolean hasMember(String memberName);

        /**
         * Check if the value is not null
         *
         * @param memberName Key
         * @return true if value is null
         */
        boolean checkNotNull(String memberName);

        /**
         * @param memberName Key
         * @return Value as String
         */
        String getAsString(String memberName);

        /**
         * @param memberName Key
         * @return Value as String type in JSON format
         */
        String getAsJsonString(String memberName);

        /**
         * @param memberName Key
         * @return Value as int type
         */
        int getAsInt(String memberName);

        /**
         * @param memberName Key
         * @return Value as long type
         */
        long getAsLong(String memberName);

        /**
         * @param memberName Key
         * @return Value as boolean type
         */
        boolean getAsBoolean(String memberName);

        /**
         * @param memberName Key
         * @return Value as List of Strings
         */
        List<String> getAsArrayOfStrings(String memberName);

        /**
         * This method converts dates into
         *
         * @param memberName Key
         * @return Value as long type (time in milliseconds)
         */
        long getAsTimeInMilliseconds(String memberName);

        /**
         * Custom logic to traverse through and select the appropriate locale
         *
         * @param memberName   Key
         * @param selectLocale Locale by which to retrieve string
         * @return Value as localized string as specified in selectLocale
         */
        String getAsLocalizedString(String memberName, Locale selectLocale);

        /**
         * @param memberName Key
         * @return Value as ResourceMap
         */
        ResourceMap getAsResourceMap(String memberName);

        /**
         * @param memberName Key
         * @return Value as List of ResourceMap
         */
        List<ResourceMap> getAsArrayOfResourceMap(String memberName);
    }

    public static class MyResourceMap implements ResourceMap {

        private JsonObject mJsonObject;

        MyResourceMap(JsonObject jsonObjectOfResource) {
            mJsonObject = jsonObjectOfResource;
        }

        @Override
        public boolean hasMember(String memberName) {
            return mJsonObject.has(memberName);
        }

        @Override
        public boolean checkNotNull(String memberName) {
            return !mJsonObject.get(memberName).isJsonNull();
        }

        public String getAsString(String memberName) {
            return mJsonObject.get(memberName).getAsString();
        }

        public String getAsJsonString(String memberName) {
            return mJsonObject.get(memberName).toString();
        }

        public int getAsInt(String memberName) {
            return mJsonObject.get(memberName).getAsInt();
        }

        public long getAsLong(String memberName) {
            return mJsonObject.get(memberName).getAsLong();
        }

        public boolean getAsBoolean(String memberName) {
            return mJsonObject.get(memberName).getAsBoolean();
        }

        @Override
        public List<String> getAsArrayOfStrings(String memberName) {
            List<String> strings = new ArrayList<>();
            for (JsonElement element : mJsonObject.get(memberName).getAsJsonArray()) {
                strings.add(element.getAsString());
            }
            return strings;
        }

        @Override
        public long getAsTimeInMilliseconds(String memberName) {
            String dateString = mJsonObject.get(memberName).getAsString();
            return ParserUtils.getTimeInMilliSeconds(dateString);
        }

        public String getAsLocalizedString(String memberName, Locale selectLocale) {
            JsonArray localeFields = mJsonObject.get(memberName).getAsJsonArray();
            return ParserUtils.getTranslationFromLocaleField(selectLocale, localeFields);
        }

        public ResourceMap getAsResourceMap(String memberName) {
            JsonObject jsonObject = mJsonObject.get(memberName).getAsJsonObject();
            return new MyResourceMap(jsonObject);
        }

        public List<ResourceMap> getAsArrayOfResourceMap(String memberName) {
            List<ResourceMap> resourceMaps = new ArrayList<>();

            JsonArray jsonArray = mJsonObject.get(memberName).getAsJsonArray();
            for (JsonElement element : jsonArray) {
                ResourceMap resourceMap = convertResourceJsonToResourceMap(element.getAsJsonObject().toString());
                resourceMaps.add(resourceMap);
            }
            return resourceMaps;
        }
    }
}




