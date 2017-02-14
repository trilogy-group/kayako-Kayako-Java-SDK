package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/02/17
 */
public class GetSection extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "http://support.kayako.com//api/v1/sections/194?_case=camel&include=localeField,category";
    }

    @Override
    public int getStatusCode() {
        return 200;
    }

    @Override
    public String getBody() {
        return "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": {\n" +
                "        \"id\": 194,\n" +
                "        \"titles\": [\n" +
                "            {\n" +
                "                \"id\": 39,\n" +
                "                \"locale\": \"en-us\",\n" +
                "                \"translation\": \"Quick Start Guides\",\n" +
                "                \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                \"updatedAt\": \"2016-10-20T16:25:39+00:00\",\n" +
                "                \"resourceType\": \"localeField\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/39\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"slugs\": [\n" +
                "            {\n" +
                "                \"locale\": \"en-us\",\n" +
                "                \"translation\": \"194-quick-start-guides\",\n" +
                "                \"resourceType\": \"slug\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"descriptions\": [\n" +
                "            {\n" +
                "                \"id\": 40,\n" +
                "                \"locale\": \"en-us\",\n" +
                "                \"translation\": \"Get to know Kayako Classic with guides to the interface, key features, and common workflows.\",\n" +
                "                \"createdAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                \"updatedAt\": \"2016-04-29T05:03:01+00:00\",\n" +
                "                \"resourceType\": \"localeField\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/40\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"visibility\": \"PUBLIC\",\n" +
                "        \"category\": {\n" +
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
                "        \"agent\": {\n" +
                "            \"id\": 389,\n" +
                "            \"resourceType\": \"userMinimal\"\n" +
                "        },\n" +
                "        \"articleOrderBy\": \"LATEST\",\n" +
                "        \"totalArticles\": 9,\n" +
                "        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "        \"updatedAt\": \"2016-10-20T16:25:39+00:00\",\n" +
                "        \"resourceType\": \"section\",\n" +
                "        \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/194\"\n" +
                "    },\n" +
                "    \"resource\": \"section\"\n" +
                "}";
    }
}
