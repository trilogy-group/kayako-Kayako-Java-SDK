package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class GetConversationStarter extends BaseSampleResponse {

    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/starter?include=userMinimal&_case=camel";
    }

    @Override
    public int getStatusCode() {
        return 200;
    }

    @Override
    public String getBody() {
        return "{\n" +
                "  \"status\": 200,\n" +
                "  \"data\": {\n" +
                "    \"lastActiveAgents\": [\n" +
                "      {\n" +
                "        \"id\": 6,\n" +
                "        \"fullName\": \"Robin Malhotra\",\n" +
                "        \"lastActiveAt\": \"2017-03-14T16:00:12+00:00\",\n" +
                "        \"lastSeenAt\": \"2017-03-14T16:00:12+00:00\",\n" +
                "        \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1489507212\",\n" +
                "        \"resourceType\": \"userMinimal\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/6\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 1,\n" +
                "        \"fullName\": \"Kayako Mobile Testing\",\n" +
                "        \"lastActiveAt\": \"2017-03-14T04:40:04+00:00\",\n" +
                "        \"lastSeenAt\": \"2017-03-14T04:40:04+00:00\",\n" +
                "        \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1489466404\",\n" +
                "        \"resourceType\": \"userMinimal\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 10,\n" +
                "        \"fullName\": \"Neil Mathew\",\n" +
                "        \"lastActiveAt\": \"2017-03-14T04:39:36+00:00\",\n" +
                "        \"lastSeenAt\": \"2017-03-14T04:39:36+00:00\",\n" +
                "        \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1489466376\",\n" +
                "        \"resourceType\": \"userMinimal\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"averageReplyTime\": 1257.2\n" +
                "  },\n" +
                "  \"resource\": \"conversationStarter\"\n" +
                "}";
    }
}
