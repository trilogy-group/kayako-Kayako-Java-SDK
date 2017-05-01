package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class PutRating extends BaseSampleResponse {

    @Override
    public String getMethod() {
        return "PUT";
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
                "    \"data\": {\n" +
                "        \"id\": 3,\n" +
                "        \"score\": \"GOOD\",\n" +
                "        \"comment\": \"Nice. I love it.\",\n" +
                "        \"conversation\": {\n" +
                "            \"id\": 360,\n" +
                "            \"resourceType\": \"conversation\"\n" +
                "        },\n" +
                "        \"creator\": {\n" +
                "            \"id\": 22,\n" +
                "            \"resourceType\": \"userMinimal\"\n" +
                "        },\n" +
                "        \"createdAt\": \"2017-05-01T10:33:43+00:00\",\n" +
                "        \"updatedAt\": \"2017-05-01T10:33:43+00:00\"\n" +
                "    },\n" +
                "    \"resource\": \"conversationRating\"\n" +
                "}";
    }
}
