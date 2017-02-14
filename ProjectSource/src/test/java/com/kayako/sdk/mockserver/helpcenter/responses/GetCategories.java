package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/02/17
 */
public class GetCategories extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "http://support.kayako.com//api/v1/categories.json?_case=camel&include=localeField&limit=10&offset=0";
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
                "            \"id\": 5,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1499,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"User Guide\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"5-user-guide\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1500,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": null,\n" +
                "                    \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"brand\": null,\n" +
                "            \"displayOrder\": 1,\n" +
                "            \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "            \"resourceType\": \"category\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 33,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Kayako Classic Documentation\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 34,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"brand\": null,\n" +
                "            \"displayOrder\": 2,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "            \"resourceType\": \"category\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 35,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"News\",\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/35\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"2-news\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 36,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": null,\n" +
                "                    \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/36\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"brand\": null,\n" +
                "            \"displayOrder\": 3,\n" +
                "            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-01T15:15:27+00:00\",\n" +
                "            \"resourceType\": \"category\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/2\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"category\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 10,\n" +
                "    \"totalCount\": 3\n" +
                "}";
    }
}
