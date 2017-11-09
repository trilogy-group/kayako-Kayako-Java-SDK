package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class GetMessage extends BaseSampleResponse {

    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/246?_case=camel&include=userMinimal";
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
                "    \"id\": 246,\n" +
                "    \"uuid\": \"d1e44db7-0d9b-4bc3-bc04-47d71fb28dc7\",\n" +
                "    \"clientId\": null,\n" +
                "    \"subject\": \"Hey\",\n" +
                "    \"channel\": \"MAIL\",\n" +
                "    \"contentText\": \"Hello Hello\",\n" +
                "    \"contentHtml\": \"Hello Hello\",\n" +
                "    \"creator\": {\n" +
                "      \"id\": 1,\n" +
                "      \"fullName\": \"Kayako Mobile Testing\",\n" +
                "      \"lastActiveAt\": \"2017-04-18T19:14:47+00:00\",\n" +
                "      \"lastSeenAt\": \"2017-04-18T19:14:47+00:00\",\n" +
                "      \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1492542887\",\n" +
                "      \"resourceType\": \"userMinimal\",\n" +
                "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
                "    },\n" +
                "    \"attachments\": [],\n" +
                "    \"downloadAll\": null,\n" +
                "    \"source\": null,\n" +
                "    \"metadata\": {\n" +
                "      \"user_agent\": \"\",\n" +
                "      \"page_url\": \"\"\n" +
                "    },\n" +
                "    \"messageStatus\": \"DELIVERED\",\n" +
                "    \"messageStatusRejectType\": null,\n" +
                "    \"messageStatusRejectReason\": null,\n" +
                "    \"messageStatusUpdatedAt\": \"2017-02-07T10:41:37+00:00\",\n" +
                "    \"createdAt\": \"2017-02-07T10:40:22+00:00\",\n" +
                "    \"updatedAt\": \"2017-02-07T10:40:22+00:00\",\n" +
                "    \"resourceType\": \"case_message\",\n" +
                "    \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/246\"\n" +
                "  },\n" +
                "  \"resource\": \"conversationMessage\"\n" +
                "}";
    }
}
