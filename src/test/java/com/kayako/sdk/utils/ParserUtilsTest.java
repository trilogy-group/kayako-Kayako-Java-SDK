package com.kayako.sdk.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public class ParserUtilsTest {

    @Test
    public void getTranslationFromLocaleField_whenSpecifiedLocaleAvailable() throws Exception {

        String sampleLocale = "{\"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1499,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"English Test\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 199,\n" +
                "                    \"locale\": \"ru\",\n" +
                "                    \"translation\": \"Russian Test\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/199\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 499,\n" +
                "                    \"locale\": \"it\",\n" +
                "                    \"translation\": \"Italian Test\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/499\"\n" +
                "                }\n" +

                "            ]}";

        Locale selectLocale = Locale.forLanguageTag("ru");
        JsonArray localeFields = new JsonParser().parse(sampleLocale).getAsJsonObject().get("titles").getAsJsonArray();

        String parsedTranslation = ParserUtils.getTranslationFromLocaleField(selectLocale, localeFields);
        String actualTranslation = "Russian Test";

        Assert.assertTrue("Parsing Failed, Translation not found!", parsedTranslation.equals(actualTranslation));

        performFinalMessage(actualTranslation, parsedTranslation);
    }

    @Test
    public void getTranslationFromLocaleField_whenSpecifiedLocaleUnAvailableSelectEnglishLocale() throws Exception {
        String sampleLocale = "{\"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 199,\n" +
                "                    \"locale\": \"ru\",\n" +
                "                    \"translation\": \"Russian Test\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/199\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 1499,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"English Test\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 499,\n" +
                "                    \"locale\": \"it\",\n" +
                "                    \"translation\": \"Italian Test\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/499\"\n" +
                "                }\n" +

                "            ]}";

        Locale selectLocale = Locale.forLanguageTag("ja");

        JsonArray localeFields = new JsonParser().parse(sampleLocale).getAsJsonObject().get("titles").getAsJsonArray();

        String parsedTranslation = ParserUtils.getTranslationFromLocaleField(selectLocale, localeFields);
        String expectedTranslation = "English Test";

        performFinalMessage(expectedTranslation, parsedTranslation);
    }

    @Test
    public void getTranslationFromLocaleField_whenSpecifiedLocaleUnavailableAndEnglishLocaleUnavailableSelectFirstLocale() throws Exception {
        String sampleLocale = "{\"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1499,\n" +
                "                    \"locale\": \"hi\",\n" +
                "                    \"translation\": \"Hindi Test (First Item)\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 199,\n" +
                "                    \"locale\": \"ru\",\n" +
                "                    \"translation\": \"Russian Test\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/199\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 499,\n" +
                "                    \"locale\": \"it\",\n" +
                "                    \"translation\": \"Italian Test\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/499\"\n" +
                "                }\n" +

                "            ]}";

        Locale selectLocale = Locale.forLanguageTag("ja");

        JsonArray localeFields = new JsonParser().parse(sampleLocale).getAsJsonObject().get("titles").getAsJsonArray();

        String parsedTranslation = ParserUtils.getTranslationFromLocaleField(selectLocale, localeFields);
        String expectedTranslation = "Hindi Test (First Item)";

        performFinalMessage(expectedTranslation, parsedTranslation);

    }

    private void performFinalMessage(String expectedTranslation, String parsedTranslation) {
        System.out.println("Parsed: " + parsedTranslation);
        System.out.println("Expected: " + expectedTranslation);

        Assert.assertTrue("Parsing Failed, Translation not found!", parsedTranslation.equals(expectedTranslation));

        System.out.println("First Translation parsed when translation for specified locale is missing and english translation is missing");
    }

}