package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetMessagesPage1 extends BaseSampleResponse {

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages?_case=camel&include=userMinimal&limit=5&offset=0";
    }

    @Override
    public String getMethod() {
        return "GET";
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
                "            \"id\": 325,\n" +
                "            \"uuid\": \"8d251009-be07-49dc-a02b-eaf90f00d98b\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hello Hello\",\n" +
                "            \"channel\": \"MAIL\",\n" +
                "            \"contentText\": \"Post 16\",\n" +
                "            \"contentHtml\": \"Post 16\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 10,\n" +
                "                \"fullName\": \"Neil Mathew #2\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T12:58:38+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1487077118\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-13T06:46:42+00:00\",\n" +
                "            \"createdAt\": \"2017-02-13T06:45:28+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T06:45:28+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages/325\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 323,\n" +
                "            \"uuid\": \"4a6fb541-2718-4b88-9bcf-079aa481cc13\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hello Hello\",\n" +
                "            \"channel\": \"MAIL\",\n" +
                "            \"contentText\": \"RUN FOREST RUN\",\n" +
                "            \"contentHtml\": \"RUN FOREST RUN\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 10,\n" +
                "                \"fullName\": \"Neil Mathew #2\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T12:58:38+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1487077118\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-13T06:46:15+00:00\",\n" +
                "            \"createdAt\": \"2017-02-13T06:44:59+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T06:44:59+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages/323\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 322,\n" +
                "            \"uuid\": \"d8767d1d-bc35-4d57-98cb-8a05bd3ac25c\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hello Hello\",\n" +
                "            \"channel\": \"MAIL\",\n" +
                "            \"contentText\": \"Jungle Hype\",\n" +
                "            \"contentHtml\": \"Jungle Hype\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 10,\n" +
                "                \"fullName\": \"Neil Mathew #2\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T12:58:38+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1487077118\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-13T06:46:05+00:00\",\n" +
                "            \"createdAt\": \"2017-02-13T06:44:47+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T06:44:47+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages/322\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 321,\n" +
                "            \"uuid\": \"0ebb957d-848a-4486-9a08-de62d7fa5273\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hello Hello\",\n" +
                "            \"channel\": \"MAIL\",\n" +
                "            \"contentText\": \"Jumping Jacks\",\n" +
                "            \"contentHtml\": \"Jumping Jacks\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 10,\n" +
                "                \"fullName\": \"Neil Mathew #2\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T12:58:38+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1487077118\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-13T06:45:58+00:00\",\n" +
                "            \"createdAt\": \"2017-02-13T06:44:39+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T06:44:39+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages/321\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 320,\n" +
                "            \"uuid\": \"8421796e-8148-48b2-8694-03ffe871b6ed\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hello Hello\",\n" +
                "            \"channel\": \"MAIL\",\n" +
                "            \"contentText\": \"HOOORAH\",\n" +
                "            \"contentHtml\": \"HOOORAH\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 10,\n" +
                "                \"fullName\": \"Neil Mathew #2\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T12:58:38+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1487077118\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-13T06:45:48+00:00\",\n" +
                "            \"createdAt\": \"2017-02-13T06:44:34+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T06:44:34+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages/320\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"conversationMessage\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 5,\n" +
                "    \"totalCount\": 16,\n" +
                "    \"nextUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages.json?_case=camel&include=userMinimal&limit=5&offset=5\",\n" +
                "    \"lastUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages.json?_case=camel&include=userMinimal&limit=5&offset=15\"\n" +
                "}";
    }
}
