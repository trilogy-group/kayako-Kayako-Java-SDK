package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/02/17
 */
public class GetSections extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "http://support.kayako.com//api/v1/sections.json?_case=camel&include=localeField,category&limit=10&category_id=1&offset=0";
    }

    @Override
    public int getStatusCode() {
        return 200;
    }

    @Override
    public String getBody() {
        return "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 194,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 39,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Quick Start Guides\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-10-20T16:25:39+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/39\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"194-quick-start-guides\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 40,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Get to know Kayako Classic with guides to the interface, key features, and common workflows.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/40\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 9,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-10-20T16:25:39+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/194\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 196,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 41,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Support Tickets\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/41\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"196-support-tickets\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 42,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Brush up on building ticket views, defining custom fields, and managing Kayako Classic support tickets.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/42\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 20,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:09:25+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/196\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 197,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 43,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Email Support\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/43\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"197-email-support\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 44,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Get detailed instructions for managing inbound and outbound emails in Kayako Classic.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/44\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 15,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-10-27T06:27:42+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/197\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 198,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 45,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Calls and Live Chat\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/45\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"198-calls-and-live-chat\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 46,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Working to set up calls or chat in Kayako Classic? These articles will get you up and running.\\n\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/46\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 10,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:17:30+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/198\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 199,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 47,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"User Accounts\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/47\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"199-user-accounts\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 48,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Learn all about creating, configuring, and managing Kayako Classic user accounts.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/48\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 2,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:11:26+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/199\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 202,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 49,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Multi-Language Support\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/49\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"202-multi-language-support\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 50,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Get advice on how to add multi-language support in Kayako Classic.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/50\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 2,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:11:53+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/202\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 203,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 51,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Custom Templates\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/51\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"203-custom-templates\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 52,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Master Kayako Classic's custom templates, so you can fine tune your customers' support experience.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/52\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 8,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:12:14+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/203\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 204,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 53,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Advanced Configuration\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:02+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:02+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/53\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"204-advanced-configuration\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 54,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Turn here for advice on Kayako Classic's  APIs, integrations, and mobile apps.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:02+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:02+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/54\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 11,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:12:31+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/204\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 205,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 55,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Installation and Upgrades\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:02+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:02+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/55\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"205-installation-and-upgrades\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 56,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Consult this section for help with installing, upgrading, or migrating Kayako Classic.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:02+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:02+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/56\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 3,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T00:53:19+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/205\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 237,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 87,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Interactive Tutorials\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:04+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:04+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/87\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"237-interactive-tutorials\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 88,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Get help performing common Kayako Classic tasks with these interactive tutorials.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:04+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:04+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/88\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 1,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 33,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Kayako Classic Documentation\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 34,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                        \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 2,\n" +
                "                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 4,\n" +
                "            \"createdAt\": \"2016-02-24T21:45:50+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:13:12+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/237\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"section\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 10,\n" +
                "    \"totalCount\": 12,\n" +
                "    \"nextUrl\": \"https://support.kayako.com/api/v1/sections.json?_case=camel&categoryId=1&include=localeField%2Ccategory&offset=10\",\n" +
                "    \"lastUrl\": \"https://support.kayako.com/api/v1/sections.json?_case=camel&categoryId=1&include=localeField%2Ccategory&offset=10\"\n" +
                "}";
    }
}
