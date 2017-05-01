package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class GetRatingList extends BaseSampleResponse {

    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/359/ratings.json?_case=camel";
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
                "            \"id\": 1,\n" +
                "            \"score\": \"GOOD\",\n" +
                "            \"comment\": null,\n" +
                "            \"conversation\": {\n" +
                "                \"id\": 359,\n" +
                "                \"resourceType\": \"conversation\"\n" +
                "            },\n" +
                "            \"creator\": {\n" +
                "                \"id\": 22,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"createdAt\": \"2017-05-01T07:03:22+00:00\",\n" +
                "            \"updatedAt\": \"2017-05-01T07:03:22+00:00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"score\": \"GOOD\",\n" +
                "            \"comment\": null,\n" +
                "            \"conversation\": {\n" +
                "                \"id\": 359,\n" +
                "                \"resourceType\": \"conversation\"\n" +
                "            },\n" +
                "            \"creator\": {\n" +
                "                \"id\": 22,\n" +
                "                \"resourceType\": \"userMinimal\"\n" +
                "            },\n" +
                "            \"createdAt\": \"2017-05-01T07:03:37+00:00\",\n" +
                "            \"updatedAt\": \"2017-05-01T07:03:37+00:00\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"conversationRating\",\n" +
                "    \"totalCount\": 2\n" +
                "}";
    }
}
