package com.kayako.sdk.helpcenter.locale;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/09/16
 */
public class LocaleParserTest {

    String json = "{\n" +
            "    \"status\": 200,\n" +
            "    \"data\": [\n" +
            "        {\n" +
            "            \"id\": 1,\n" +
            "            \"locale\": \"en-us\",\n" +
            "            \"name\": \"English\",\n" +
            "            \"nativeName\": \"English (United States)\",\n" +
            "            \"region\": \"US\",\n" +
            "            \"nativeRegion\": \"United States\",\n" +
            "            \"script\": null,\n" +
            "            \"variant\": null,\n" +
            "            \"direction\": \"ltr\",\n" +
            "            \"isPublic\": true,\n" +
            "            \"isLocalised\": true,\n" +
            "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
            "            \"updatedAt\": \"2016-01-16T05:47:57+00:00\",\n" +
            "            \"resourceType\": \"locale\",\n" +
            "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/1\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 2,\n" +
            "            \"locale\": \"en-gb\",\n" +
            "            \"name\": \"English\",\n" +
            "            \"nativeName\": \"English (United Kingdom)\",\n" +
            "            \"region\": \"GB\",\n" +
            "            \"nativeRegion\": \"United Kingdom\",\n" +
            "            \"script\": null,\n" +
            "            \"variant\": null,\n" +
            "            \"direction\": \"ltr\",\n" +
            "            \"isPublic\": false,\n" +
            "            \"isLocalised\": false,\n" +
            "            \"createdAt\": \"2016-03-01T03:31:29+00:00\",\n" +
            "            \"updatedAt\": \"2016-05-26T13:13:31+00:00\",\n" +
            "            \"resourceType\": \"locale\",\n" +
            "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/2\"\n" +
            "        }," +
            "{\n" +
            "            \"id\": 42,\n" +
            "            \"locale\": \"sr\",\n" +
            "            \"name\": \"српски\",\n" +
            "            \"nativeName\": \"српски\",\n" +
            "            \"region\": null,\n" +
            "            \"nativeRegion\": null,\n" +
            "            \"script\": null,\n" +
            "            \"variant\": null,\n" +
            "            \"direction\": \"ltr\",\n" +
            "            \"isPublic\": false,\n" +
            "            \"isLocalised\": false,\n" +
            "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
            "            \"updatedAt\": \"2016-03-01T03:28:40+00:00\",\n" +
            "            \"resourceType\": \"locale\",\n" +
            "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/42\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 43,\n" +
            "            \"locale\": \"uk\",\n" +
            "            \"name\": \"українська\",\n" +
            "            \"nativeName\": \"українська\",\n" +
            "            \"region\": null,\n" +
            "            \"nativeRegion\": null,\n" +
            "            \"script\": null,\n" +
            "            \"variant\": null,\n" +
            "            \"direction\": \"ltr\",\n" +
            "            \"isPublic\": false,\n" +
            "            \"isLocalised\": false,\n" +
            "            \"createdAt\": \"2016-03-01T03:28:40+00:00\",\n" +
            "            \"updatedAt\": \"2016-05-26T13:04:17+00:00\",\n" +
            "            \"resourceType\": \"locale\",\n" +
            "            \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/43\"\n" +
            "        }   " +
            "      ],\n" +
            "    \"resource\": \"locale\",\n" +
            "    \"totalCount\": 42\n" +
            "}";

    @Test
    public void parse() throws Exception {
        LocaleParser localeParser = new LocaleParser();
        List<Locale> localeList = localeParser.parse(json);
        for (Locale locale : localeList) {
            validateLocale(locale);
        }
    }

    public static void validateLocale(Locale locale) {
        assertNotNull(locale.getId());
        assertNotNull(locale.getLocale());
        assertNotNull(locale.getNativeName());

        // Region and Native Region can be null

        System.out.println(locale.getId() + ": " + locale.getNativeName());
    }

}