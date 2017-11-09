package com.kayako.sdk.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.base.parser.Resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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


    // PRIVATE METHODS

    private static <T extends Resource> List<T> convertJsonArrayToResourceList(JsonArray jsonArray, Parser<T> parser) {
        List<T> list = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            list.add(parser.parse(element.getAsJsonObject().toString()));
        }
        return list;
    }

    private static JsonArray getDataNodeAsJsonArray(String json) throws NullPointerException {
        return getNodeAsJsonArray(json, NODE_DATA);
    }

    private static JsonObject getDataNodeAsJsonObject(String json) throws NullPointerException {
        return getNodeAsJsonObject(json, NODE_DATA);
    }

    private static JsonArray getNodeAsJsonArray(String json, String nodeName) {
        return sJsonParser.parse(json).getAsJsonObject().getAsJsonArray(nodeName);
    }

    private static JsonObject getNodeAsJsonObject(String json, String nodeName) throws NullPointerException {
        return sJsonParser.parse(json).getAsJsonObject().getAsJsonObject(nodeName);
    }

    private static JsonObject convertJsonToJsonObject(String json) {
        return sJsonParser.parse(json).getAsJsonObject();
    }

    private static boolean checkIfContained(String json, String memberName) {
        JsonObject jsonObject = sJsonParser.parse(json).getAsJsonObject();
        return jsonObject.has(memberName) && !jsonObject.get(memberName).isJsonNull();
    }

    // PUBLIC METHODS, MADE PUBLIC ONLY FOR TESTS

    public static long getTimeInMilliSeconds(String isoTimeStamp) {
        try {
            return IsoTimeFormatUtils.getTimeInMillisecondsFromIso8601String(isoTimeStamp);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
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

    // PUBLIC METHODS

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
        return new MyResourceMap(convertJsonToJsonObject(json));
    }

    public static boolean checkIfListContained(String jsonOfResponse, String memberName) {
        return checkIfContained(jsonOfResponse, memberName) && convertJsonToJsonObject(jsonOfResponse).get(memberName).isJsonArray();
    }

    public static boolean checkIfListContainedInDataNode(String jsonOfResponse) {
        return checkIfContained(jsonOfResponse, NODE_DATA);
    }

    public static boolean checkIfItemContained(String jsonOfResponse, String memberName) {
        return checkIfContained(jsonOfResponse, memberName) && convertJsonToJsonObject(jsonOfResponse).get(memberName).isJsonObject();
    }

    public static boolean checkIfItemContainedInDataNode(String jsonOfResponse) {
        return checkIfItemContained(jsonOfResponse, NODE_DATA);
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
        boolean isNotNull(String memberName);

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
         * @param memberName
         * @return List of json responses
         */
        List<String> getAsArrayOfJsonStrings(String memberName);

        /**
         * @param memberName Key
         * @return Value as int type
         */
        Integer getAsInt(String memberName);

        /**
         * @param memberName Key
         * @return Value as long type
         */
        Long getAsLong(String memberName);

        /**
         * @param memberName Key
         * @return Value as boolean type
         */
        Boolean getAsBoolean(String memberName);

        /**
         * @param memberName
         * @return
         */
        Double getAsDouble(String memberName);

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
        Long getAsTimeInMilliseconds(String memberName);

        /**
         * Custom logic to traverse through and select the appropriate locale
         *
         * @param memberName   Key
         * @param selectLocale Locale by which to retrieve string
         * @return Value as localized string as specified in selectLocale
         */
        String getAsLocalizedString(String memberName, Locale selectLocale);

        <E extends Enum> E getAsEnumType(String memberName, Class<E> enumClass);

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

        private MyResourceMap(JsonObject jsonObjectOfResource) {
            mJsonObject = jsonObjectOfResource;
        }

        private boolean isValueValid(String memberName) {
            return hasMember(memberName) && isNotNull(memberName);
        }

        @Override
        public boolean hasMember(String memberName) {
            return mJsonObject.has(memberName);
        }

        @Override
        public boolean isNotNull(String memberName) {
            return !mJsonObject
                    .get(memberName)
                    .isJsonNull();
        }

        public String getAsJsonString(String memberName) {
            return mJsonObject.get(memberName).toString();
        }

        @Override
        public List<String> getAsArrayOfJsonStrings(String memberName) {
            if (!isValueValid(memberName)) {
                return null;
            }

            List<String> strings = new ArrayList<>();
            for (JsonElement element : mJsonObject.get(memberName).getAsJsonArray()) {
                strings.add(element.toString());
            }
            return strings;
        }

        public String getAsString(String memberName) {
            if (!isValueValid(memberName)) {
                return null;
            }
            return mJsonObject.get(memberName).getAsString();
        }

        public Integer getAsInt(String memberName) {
            if (!isValueValid(memberName)) {
                return null;
            }
            return mJsonObject.get(memberName).getAsInt();
        }

        public Long getAsLong(String memberName) {
            if (!isValueValid(memberName)) {
                return null;
            }
            return mJsonObject.get(memberName).getAsLong();
        }

        public Boolean getAsBoolean(String memberName) {
            if (!isValueValid(memberName)) {
                return null;
            }
            return mJsonObject.get(memberName).getAsBoolean();
        }

        @Override
        public Double getAsDouble(String memberName) {
            if (!isValueValid(memberName)) {
                return null;
            }
            return mJsonObject.get(memberName).getAsDouble();
        }

        @Override
        public List<String> getAsArrayOfStrings(String memberName) {
            if (!isValueValid(memberName)) {
                return null;
            }

            List<String> strings = new ArrayList<>();
            for (JsonElement element : mJsonObject.get(memberName).getAsJsonArray()) {
                strings.add(element.getAsString());
            }
            return strings;
        }

        @Override
        public Long getAsTimeInMilliseconds(String memberName) {
            if (!isValueValid(memberName)) {
                return null;
            }

            String dateString = mJsonObject.get(memberName).getAsString();
            return ParserUtils.getTimeInMilliSeconds(dateString);
        }

        public String getAsLocalizedString(String memberName, Locale selectLocale) {
            if (!isValueValid(memberName)) {
                return null;
            }

            JsonArray localeFields = mJsonObject.get(memberName).getAsJsonArray();
            return ParserUtils.getTranslationFromLocaleField(selectLocale, localeFields);
        }

        @Override
        public <E extends Enum> E getAsEnumType(String memberName, Class<E> enumClass) {
            if (!isValueValid(memberName)) {
                return null;
            }

            String type = getAsString(memberName);
            if (type == null) {
                return null;
            } else {
                return (E) Enum.valueOf(enumClass, type);
            }
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




