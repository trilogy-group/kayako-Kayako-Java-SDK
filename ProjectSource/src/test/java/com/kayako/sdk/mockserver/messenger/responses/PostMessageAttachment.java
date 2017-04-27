package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 31/03/17
 */
public class PostMessageAttachment extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "POST";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/24/messages?_case=camel&include=message,attachment,userMinimal";
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
                "        \"id\": 2599,\n" +
                "        \"uuid\": \"a47c2ac6-a1cd-454f-9506-6a96168f3d3a\",\n" +
                "        \"clientId\": null,\n" +
                "        \"subject\": \"Hello Hello\",\n" +
                "        \"channel\": \"HELPCENTER\",\n" +
                "        \"contentText\": \"This a new message!\",\n" +
                "        \"contentHtml\": \"This a new message!\",\n" +
                "        \"creator\": {\n" +
                "            \"id\": 15,\n" +
                "            \"fullName\": \"John Doe 2\",\n" +
                "            \"lastActiveAt\": \"2017-04-27T19:53:55+00:00\",\n" +
                "            \"lastSeenAt\": \"2017-04-27T19:53:55+00:00\",\n" +
                "            \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1493322835\",\n" +
                "            \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@b8b00e42aed4662afcc068f7acb9c0ef549c6699\",\n" +
                "            \"resourceType\": \"userMinimal\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"attachments\": [\n" +
                "            {\n" +
                "                \"id\": 34,\n" +
                "                \"name\": \"something.txt\",\n" +
                "                \"size\": 0,\n" +
                "                \"width\": 0,\n" +
                "                \"height\": 0,\n" +
                "                \"type\": \"text/plain\",\n" +
                "                \"contentId\": null,\n" +
                "                \"alt\": null,\n" +
                "                \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/23/messages/2599/attachments/34/url\",\n" +
                "                \"urlDownload\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/23/messages/2599/attachments/34/download\",\n" +
                "                \"thumbnails\": [],\n" +
                "                \"createdAt\": \"2017-04-27T19:53:55+00:00\",\n" +
                "                \"resourceType\": \"attachment\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/23/messages/2599/attachments/34\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"downloadAll\": null,\n" +
                "        \"source\": null,\n" +
                "        \"metadata\": {\n" +
                "            \"user_agent\": \"\",\n" +
                "            \"page_url\": \"\"\n" +
                "        },\n" +
                "        \"messageStatus\": \"DELIVERED\",\n" +
                "        \"messageStatusRejectType\": null,\n" +
                "        \"messageStatusRejectReason\": null,\n" +
                "        \"messageStatusUpdatedAt\": \"2017-04-27T19:53:55+00:00\",\n" +
                "        \"createdAt\": \"2017-04-27T19:53:55+00:00\",\n" +
                "        \"updatedAt\": \"2017-04-27T19:53:55+00:00\",\n" +
                "        \"resourceType\": \"case_message\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/23/messages/2599\"\n" +
                "    },\n" +
                "    \"resource\": \"conversationMessage\"\n" +
                "}";
    }
}