package com.kayako.sdk.helpcenter.category;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public class CategoryParserTest {

    CategoryParser categoryParser;

    @Before
    public void setUp() throws Exception {
        Locale locale = Locale.ENGLISH;
        categoryParser = new CategoryParser(locale);
    }

    @Test
    public void parse_ensureParsingWorks() throws Exception {
        String sampleJsonResponse = "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 5,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1499,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"User Guide\",\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"5-user-guide\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1500,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": null,\n" +
                "                    \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"brand\": null,\n" +
                "            \"display_order\": 1,\n" +
                "            \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "            \"updated_at\": \"2016-07-04T12:08:24+00:00\",\n" +
                "            \"resource_type\": \"category\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 33,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Kayako Classic Documentation\",\n" +
                "                    \"created_at\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"updated_at\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 34,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                    \"created_at\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"updated_at\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"brand\": null,\n" +
                "            \"display_order\": 2,\n" +
                "            \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updated_at\": \"2016-07-04T12:04:07+00:00\",\n" +
                "            \"resource_type\": \"category\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"category\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 10,\n" +
                "    \"total_count\": 3\n" +
                "}";

        Locale aLocale = Locale.forLanguageTag("en-us");

        checkIfParsedCategoryIsValid(sampleJsonResponse, aLocale);
    }

    @Test
    public void parse_ensureParsingWorksWhenTheTranslationFoundIsNull() throws Exception {
        String sampleJsonResponse = "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 35,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"News\",\n" +
                "                    \"created_at\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"updated_at\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/35\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"2-news\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 36,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": null,\n" +
                "                    \"created_at\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"updated_at\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/36\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"brand\": null,\n" +
                "            \"display_order\": 3,\n" +
                "            \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updated_at\": \"2016-07-01T15:15:27+00:00\",\n" +
                "            \"resource_type\": \"category\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/categories/2\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"category\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 10,\n" +
                "    \"total_count\": 3\n" +
                "}";

        Locale aLocale = Locale.forLanguageTag("en-us");

        checkIfParsedCategoryIsValid(sampleJsonResponse, aLocale);
    }

    private void checkIfParsedCategoryIsValid(String sampleJsonResponse, Locale aLocale) {
        List<Category> categories = categoryParser.parseList(sampleJsonResponse);

        assertNotNull(categories);
        for (Category category : categories) {
            assertTrue(category.getId() > 0);
            assertTrue(category.getTitle() != null && !category.getTitle().isEmpty());
            // Only the Id and Title need to be non-null. Description can, and is often, null.
        }
    }

}