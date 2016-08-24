package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.helpcenter.category.CategoryParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class SectionParserTest {
    @Test
    public void parse() throws Exception {
        String sampleResponse = "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 243,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1501,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Getting started\",\n" +
                "                    \"created_at\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1501\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"243-getting-started\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1502,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"If you're new to Kayako, this is the place to be. Let's get you up and running!\",\n" +
                "                    \"created_at\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1502\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"resource_type\": \"category\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resource_type\": \"user_minimal\"\n" +
                "            },\n" +
                "            \"article_order_by\": \"LATEST\",\n" +
                "            \"total_articles\": 5,\n" +
                "            \"created_at\": \"2016-06-23T14:13:00+00:00\",\n" +
                "            \"updated_at\": \"2016-08-12T18:56:41+00:00\",\n" +
                "            \"resource_type\": \"section\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/sections/243\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 244,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1505,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Cases\",\n" +
                "                    \"created_at\": \"2016-06-23T14:38:55+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:38:55+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1505\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"244-cases\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1506,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Get help replying to, updating, viewing, customizing, and all-around wrangling your cases.\",\n" +
                "                    \"created_at\": \"2016-06-23T14:38:55+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:38:55+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1506\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"resource_type\": \"category\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resource_type\": \"user_minimal\"\n" +
                "            },\n" +
                "            \"article_order_by\": \"LATEST\",\n" +
                "            \"total_articles\": 7,\n" +
                "            \"created_at\": \"2016-06-23T14:38:55+00:00\",\n" +
                "            \"updated_at\": \"2016-08-15T18:34:16+00:00\",\n" +
                "            \"resource_type\": \"section\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/sections/244\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 245,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1507,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Channels\",\n" +
                "                    \"created_at\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1507\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"245-channels\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1508,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Communicate with customers via email, chat, and social media – all without ever leaving Kayako.\",\n" +
                "                    \"created_at\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1508\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"resource_type\": \"category\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resource_type\": \"user_minimal\"\n" +
                "            },\n" +
                "            \"article_order_by\": \"LATEST\",\n" +
                "            \"total_articles\": 8,\n" +
                "            \"created_at\": \"2016-06-23T14:39:29+00:00\",\n" +
                "            \"updated_at\": \"2016-07-08T17:21:01+00:00\",\n" +
                "            \"resource_type\": \"section\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/sections/245\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 246,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1509,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"People\",\n" +
                "                    \"created_at\": \"2016-06-23T14:39:42+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:39:42+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1509\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"246-people\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1510,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Make sure your users – whether customers or staff – are getting the most out of their Kayako accounts.\",\n" +
                "                    \"created_at\": \"2016-06-23T14:39:42+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:39:42+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1510\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"resource_type\": \"category\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resource_type\": \"user_minimal\"\n" +
                "            },\n" +
                "            \"article_order_by\": \"LATEST\",\n" +
                "            \"total_articles\": 8,\n" +
                "            \"created_at\": \"2016-06-23T14:39:42+00:00\",\n" +
                "            \"updated_at\": \"2016-07-28T18:14:13+00:00\",\n" +
                "            \"resource_type\": \"section\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/sections/246\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 247,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1511,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Automation\",\n" +
                "                    \"created_at\": \"2016-06-23T14:39:59+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:39:59+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1511\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"247-automation\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1512,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Take work off your team's plate by mastering Kayako's powerful, versatile automation tools.\",\n" +
                "                    \"created_at\": \"2016-06-23T14:40:00+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:40:00+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1512\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"resource_type\": \"category\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resource_type\": \"user_minimal\"\n" +
                "            },\n" +
                "            \"article_order_by\": \"LATEST\",\n" +
                "            \"total_articles\": 6,\n" +
                "            \"created_at\": \"2016-06-23T14:39:59+00:00\",\n" +
                "            \"updated_at\": \"2016-08-23T17:45:40+00:00\",\n" +
                "            \"resource_type\": \"section\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/sections/247\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 248,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1513,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Help Center\",\n" +
                "                    \"created_at\": \"2016-06-23T14:40:25+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:40:25+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1513\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"248-help-center\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1514,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Dial in your Help Center content and appearance, so you can provide the best self-service around.\",\n" +
                "                    \"created_at\": \"2016-06-23T14:40:25+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:40:25+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1514\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"resource_type\": \"category\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resource_type\": \"user_minimal\"\n" +
                "            },\n" +
                "            \"article_order_by\": \"LATEST\",\n" +
                "            \"total_articles\": 5,\n" +
                "            \"created_at\": \"2016-06-23T14:40:25+00:00\",\n" +
                "            \"updated_at\": \"2016-07-04T12:21:04+00:00\",\n" +
                "            \"resource_type\": \"section\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/sections/248\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 249,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1515,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Integrations\",\n" +
                "                    \"created_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1515\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"249-integrations\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1516,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"No Kayako is an island. Integrate with all your (other) favorite tools to power up your support.\",\n" +
                "                    \"created_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"updated_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1516\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"resource_type\": \"category\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resource_type\": \"user_minimal\"\n" +
                "            },\n" +
                "            \"article_order_by\": \"LATEST\",\n" +
                "            \"total_articles\": 3,\n" +
                "            \"created_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "            \"updated_at\": \"2016-07-04T12:21:21+00:00\",\n" +
                "            \"resource_type\": \"section\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/sections/249\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 252,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1623,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Release notes\",\n" +
                "                    \"created_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1623\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"252-release-notes\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1624,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Weekly summaries of improvements, new features and fixes in each release.\",\n" +
                "                    \"created_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1624\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"resource_type\": \"category\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 22,\n" +
                "                \"resource_type\": \"user_minimal\"\n" +
                "            },\n" +
                "            \"article_order_by\": \"LATEST\",\n" +
                "            \"total_articles\": 7,\n" +
                "            \"created_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "            \"updated_at\": \"2016-08-19T14:04:16+00:00\",\n" +
                "            \"resource_type\": \"section\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/sections/252\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 253,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1654,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Upgrades & Migration\",\n" +
                "                    \"created_at\": \"2016-08-04T20:09:09+00:00\",\n" +
                "                    \"updated_at\": \"2016-08-04T20:09:09+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1654\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"253-upgrades-migration\",\n" +
                "                    \"resource_type\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1655,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Getting ready to upgrade from Kayako Classic? Find answers to all your questions here. \",\n" +
                "                    \"created_at\": \"2016-08-04T20:09:09+00:00\",\n" +
                "                    \"updated_at\": \"2016-08-04T20:09:09+00:00\",\n" +
                "                    \"resource_type\": \"locale_field\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1655\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"resource_type\": \"category\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resource_type\": \"user_minimal\"\n" +
                "            },\n" +
                "            \"article_order_by\": \"LATEST\",\n" +
                "            \"total_articles\": 7,\n" +
                "            \"created_at\": \"2016-08-04T20:09:09+00:00\",\n" +
                "            \"updated_at\": \"2016-08-12T18:56:41+00:00\",\n" +
                "            \"resource_type\": \"section\",\n" +
                "            \"resource_url\": \"https://support.kayako.com/api/v1/sections/253\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"section\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 10,\n" +
                "    \"total_count\": 9\n" +
                "}";

        Locale locale = Locale.forLanguageTag("en-us");

        SectionParser sectionParser = new SectionParser(locale);

        List<Section> sectionList = sectionParser.parse(sampleResponse, locale);

        assertTrue("There should be 9 sections parsed", sectionList.size() == 9);
        for (Section section : sectionList) {
            Assert.assertNotNull(section.getId());
            Assert.assertNotNull(section.getTitle());
            System.out.println(section.getId() + ":" + section.getTitle());
        }
    }

    // TODO: How about loading more than 10 items. Load More Implementation?

}