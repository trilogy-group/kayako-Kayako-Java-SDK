package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 16/02/17
 */
public class PostMessage extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "POST";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/23/messages?_case=camel&include=userMinimal";
    }

    @Override
    public int getStatusCode() {
        return 201;
    }

    @Override
    public String getBody() {
        return "{\n" +
                "    \"status\": 201,\n" +
                "    \"data\": {\n" +
                "        \"id\": 340,\n" +
                "        \"uuid\": \"40beb7d6-125a-4cbf-ad2f-b67e60c86295\",\n" +
                "        \"clientId\": null,\n" +
                "        \"subject\": \"Hello Hello\",\n" +
                "        \"channel\": \"HELPCENTER\",\n" +
                "        \"contentText\": \"This a new message!\",\n" +
                "        \"contentHtml\": \"This a new message!\",\n" +
                "        \"creator\": {\n" +
                "            \"id\": 15,\n" +
                "            \"fullName\": \"John Doe 2\",\n" +
                "            \"lastActiveAt\": null,\n" +
                "            \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "            \"resourceType\": \"userMinimal\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"attachments\": [],\n" +
                "        \"downloadAll\": null,\n" +
                "        \"source\": null,\n" +
                "        \"metadata\": {\n" +
                "            \"user_agent\": \"\",\n" +
                "            \"page_url\": \"\"\n" +
                "        },\n" +
                "        \"messageStatus\": \"DELIVERED\",\n" +
                "        \"messageStatusUpdatedAt\": \"2017-02-16T11:54:07+00:00\",\n" +
                "        \"createdAt\": \"2017-02-16T11:54:07+00:00\",\n" +
                "        \"updatedAt\": \"2017-02-16T11:54:07+00:00\",\n" +
                "        \"resourceType\": \"case_message\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/23/messages/340\"\n" +
                "    },\n" +
                "    \"resource\": \"conversationMessage\"\n" +
                "}";
    }
}
