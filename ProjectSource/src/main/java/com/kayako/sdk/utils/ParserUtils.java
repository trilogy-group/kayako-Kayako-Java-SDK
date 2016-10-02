package com.kayako.sdk.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public class ParserUtils {

    private static final String ITEM_LOCALE = "locale";
    private static final String ITEM_TRANSLATION = "translation";

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

    public static long getTimeInMilliSeconds(String isoTimeStamp) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.UK);
            return sdf.parse(isoTimeStamp).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
}




