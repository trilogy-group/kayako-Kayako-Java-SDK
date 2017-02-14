package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetMessagesPage2 extends BaseSampleResponse {

    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages?_case=camel&include=userMinimal&limit=5&offset=15";
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
                "            \"id\": 254,\n" +
                "            \"uuid\": \"cd670e39-05ad-43b2-9261-3a7aea56b7f2\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hello Hello\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"contentText\": \"Bleh said Bleh to Bleh\",\n" +
                "            \"contentHtml\": \"Bleh said Bleh to Bleh\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-10T03:59:41+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T03:59:41+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-10T03:59:41+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages/254\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"conversationMessage\",\n" +
                "    \"offset\": 15,\n" +
                "    \"limit\": 5,\n" +
                "    \"totalCount\": 16,\n" +
                "    \"firstUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages.json?_case=camel&include=userMinimal&limit=5\",\n" +
                "    \"previousUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages.json?_case=camel&include=userMinimal&limit=5&offset=10\"\n" +
                "}";
    }
}
