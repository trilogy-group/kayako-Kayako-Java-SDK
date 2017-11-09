package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/02/17
 */
public class GetCategory extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "http://support.kayako.com//api/v1/categories/1?_case=camel&include=localeField";
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
                "        \"id\": 1,\n" +
                "        \"titles\": [\n" +
                "            {\n" +
                "                \"id\": 33,\n" +
                "                \"locale\": \"en-us\",\n" +
                "                \"translation\": \"Kayako Classic Documentation\",\n" +
                "                \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                \"resourceType\": \"localeField\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/33\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"slugs\": [\n" +
                "            {\n" +
                "                \"locale\": \"en-us\",\n" +
                "                \"translation\": \"1-kayako-classic-documentation\",\n" +
                "                \"resourceType\": \"slug\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"descriptions\": [\n" +
                "            {\n" +
                "                \"id\": 34,\n" +
                "                \"locale\": \"en-us\",\n" +
                "                \"translation\": \"This user guide will bring you up to speed on key features, walk you through common tasks, and put you on the path to Kayako mastery.\",\n" +
                "                \"createdAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                \"updatedAt\": \"2016-04-29T05:03:00+00:00\",\n" +
                "                \"resourceType\": \"localeField\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/34\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"brand\": null,\n" +
                "        \"displayOrder\": 2,\n" +
                "        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "        \"updatedAt\": \"2016-07-04T12:04:07+00:00\",\n" +
                "        \"resourceType\": \"category\",\n" +
                "        \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/1\"\n" +
                "    },\n" +
                "    \"resource\": \"category\"\n" +
                "}";
    }
}
