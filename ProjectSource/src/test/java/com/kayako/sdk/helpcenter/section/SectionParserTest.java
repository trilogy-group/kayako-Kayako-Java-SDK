package com.kayako.sdk.helpcenter.section;

import com.google.gson.JsonParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertTrue;

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
                "                    \"createdAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1501\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"243-getting-started\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1502,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"If you're new to Kayako, this is the place to be. Let's get you up and running!\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1502\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1499,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"User Guide\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"5-user-guide\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 1500,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": null,\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 1,\n" +
                "                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"fullName\": \"Kelly O'Brien\",\n" +
                "                \"role\": {\n" +
                "                    \"id\": 1,\n" +
                "                    \"title\": \"Administrator\",\n" +
                "                    \"type\": \"ADMIN\",\n" +
                "                    \"resourceType\": \"role\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                },\n" +
                "                \"teams\": [\n" +
                "                    {\n" +
                "                        \"id\": 16,\n" +
                "                        \"title\": \"Support\",\n" +
                "                        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                        \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                        \"resourceType\": \"teamMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                \"lastActivityAt\": null,\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 5,\n" +
                "            \"createdAt\": \"2016-06-23T14:13:00+00:00\",\n" +
                "            \"updatedAt\": \"2016-08-12T18:56:41+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/243\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 248,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1513,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Help Center\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:40:25+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:40:25+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1513\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"248-help-center\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1514,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Dial in your Help Center content and appearance, so you can provide the best self-service around.\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:40:25+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:40:25+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1514\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1499,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"User Guide\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"5-user-guide\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 1500,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": null,\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 1,\n" +
                "                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"fullName\": \"Kelly O'Brien\",\n" +
                "                \"role\": {\n" +
                "                    \"id\": 1,\n" +
                "                    \"title\": \"Administrator\",\n" +
                "                    \"type\": \"ADMIN\",\n" +
                "                    \"resourceType\": \"role\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                },\n" +
                "                \"teams\": [\n" +
                "                    {\n" +
                "                        \"id\": 16,\n" +
                "                        \"title\": \"Support\",\n" +
                "                        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                        \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                        \"resourceType\": \"teamMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                \"lastActivityAt\": null,\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 5,\n" +
                "            \"createdAt\": \"2016-06-23T14:40:25+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:21:04+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/248\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 249,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1515,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Integrations\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1515\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"249-integrations\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1516,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"No Kayako is an island. Integrate with all your (other) favorite tools to power up your support.\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1516\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1499,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"User Guide\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"5-user-guide\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 1500,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": null,\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 1,\n" +
                "                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"fullName\": \"Kelly O'Brien\",\n" +
                "                \"role\": {\n" +
                "                    \"id\": 1,\n" +
                "                    \"title\": \"Administrator\",\n" +
                "                    \"type\": \"ADMIN\",\n" +
                "                    \"resourceType\": \"role\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                },\n" +
                "                \"teams\": [\n" +
                "                    {\n" +
                "                        \"id\": 16,\n" +
                "                        \"title\": \"Support\",\n" +
                "                        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                        \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                        \"resourceType\": \"teamMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                \"lastActivityAt\": null,\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 3,\n" +
                "            \"createdAt\": \"2016-06-23T14:40:49+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:21:21+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/249\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 252,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1623,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Release notes\",\n" +
                "                    \"createdAt\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                    \"updatedAt\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1623\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"252-release-notes\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1624,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Weekly summaries of improvements, new features and fixes in each release.\",\n" +
                "                    \"createdAt\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                    \"updatedAt\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1624\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1499,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"User Guide\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"5-user-guide\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 1500,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": null,\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 1,\n" +
                "                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 22,\n" +
                "                \"fullName\": \"Jamie Edwards\",\n" +
                "                \"role\": {\n" +
                "                    \"id\": 5,\n" +
                "                    \"title\": \"Owner\",\n" +
                "                    \"type\": \"OWNER\",\n" +
                "                    \"resourceType\": \"role\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/5\"\n" +
                "                },\n" +
                "                \"teams\": [\n" +
                "                    {\n" +
                "                        \"id\": 46,\n" +
                "                        \"title\": \"Hello\",\n" +
                "                        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                        \"updatedAt\": \"2016-01-16T12:58:38+00:00\",\n" +
                "                        \"resourceType\": \"teamMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/46\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/e020e878-f992-4f8e-b1bf-d51708d5459a?1470042534\",\n" +
                "                \"lastActivityAt\": null,\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/22\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 7,\n" +
                "            \"createdAt\": \"2016-07-08T15:30:20+00:00\",\n" +
                "            \"updatedAt\": \"2016-08-19T14:04:16+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/252\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 253,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1654,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Upgrades & Migration\",\n" +
                "                    \"createdAt\": \"2016-08-04T20:09:09+00:00\",\n" +
                "                    \"updatedAt\": \"2016-08-04T20:09:09+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1654\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"253-upgrades-migration\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1655,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Getting ready to upgrade from Kayako Classic? Find answers to all your questions here. \",\n" +
                "                    \"createdAt\": \"2016-08-04T20:09:09+00:00\",\n" +
                "                    \"updatedAt\": \"2016-08-04T20:09:09+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1655\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1499,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"User Guide\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"5-user-guide\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 1500,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": null,\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 1,\n" +
                "                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"fullName\": \"Kelly O'Brien\",\n" +
                "                \"role\": {\n" +
                "                    \"id\": 1,\n" +
                "                    \"title\": \"Administrator\",\n" +
                "                    \"type\": \"ADMIN\",\n" +
                "                    \"resourceType\": \"role\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                },\n" +
                "                \"teams\": [\n" +
                "                    {\n" +
                "                        \"id\": 16,\n" +
                "                        \"title\": \"Support\",\n" +
                "                        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                        \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                        \"resourceType\": \"teamMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                \"lastActivityAt\": null,\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 7,\n" +
                "            \"createdAt\": \"2016-08-04T20:09:09+00:00\",\n" +
                "            \"updatedAt\": \"2016-08-12T18:56:41+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/253\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"section\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 10,\n" +
                "    \"totalCount\": 9\n" +
                "}";

        Locale locale = Locale.ENGLISH;

        SectionParser sectionParser = new SectionParser(locale);

        List<Section> sectionList = sectionParser.parse(sampleResponse);


        assertTrue("There should be 5 sections parsed", sectionList.size() == 5);
        for (Section section : sectionList) {
            validateSection(section);
        }
    }

    private void validateSection(Section section) {
        Assert.assertNotNull(section.getId());
        Assert.assertNotNull(section.getTitle());
        System.out.println(section.getId() + ":" + section.getTitle());
    }
}