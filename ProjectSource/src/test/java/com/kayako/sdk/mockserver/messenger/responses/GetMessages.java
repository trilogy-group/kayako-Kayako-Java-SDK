package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetMessages extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages?_case=camel&include=userMinimal&limit=0&offset=0";
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
                "            \"id\": 246,\n" +
                "            \"uuid\": \"d1e44db7-0d9b-4bc3-bc04-47d71fb28dc7\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"MAIL\",\n" +
                "            \"contentText\": \"Hello Hello\",\n" +
                "            \"contentHtml\": \"Hello Hello\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 1,\n" +
                "                \"fullName\": \"Kayako Mobile Testing\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T13:06:10+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1487077570\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-07T10:41:37+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T10:40:22+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T10:40:22+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/246\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 245,\n" +
                "            \"uuid\": \"142bf458-83e4-426d-94da-f6e55ff4618d\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"contentText\": \"bleh 17\",\n" +
                "            \"contentHtml\": \"bleh 17\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 14,\n" +
                "                \"fullName\": \"John Doe\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-07T10:40:01+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T10:40:01+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T10:40:01+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/245\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 244,\n" +
                "            \"uuid\": \"5586528e-0622-4f63-a393-b0e5e67c41a1\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"contentText\": \"bleh 16\",\n" +
                "            \"contentHtml\": \"bleh 16\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 14,\n" +
                "                \"fullName\": \"John Doe\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-07T10:39:51+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T10:39:51+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T10:39:51+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/244\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 243,\n" +
                "            \"uuid\": \"bb79285a-b2dd-452e-89ef-c4e6c61a6b13\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"contentText\": \"bleh 14\",\n" +
                "            \"contentHtml\": \"bleh 14\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 14,\n" +
                "                \"fullName\": \"John Doe\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-07T10:39:48+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T10:39:48+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T10:39:48+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/243\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 242,\n" +
                "            \"uuid\": \"ddb798ff-4f9a-41e9-bbd8-038ca7dde397\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"contentText\": \"bleh 13\",\n" +
                "            \"contentHtml\": \"bleh 13\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 14,\n" +
                "                \"fullName\": \"John Doe\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-07T10:39:46+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T10:39:46+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T10:39:46+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/242\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 241,\n" +
                "            \"uuid\": \"49fd16ee-944e-4362-aaf9-d8cf1b8fc019\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"MAIL\",\n" +
                "            \"contentText\": \"Smooth. Hello!\",\n" +
                "            \"contentHtml\": \"Smooth. Hello!\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 1,\n" +
                "                \"fullName\": \"Kayako Mobile Testing\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T13:06:10+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1487077570\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"SEEN\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-07T12:21:08+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T10:39:40+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T10:39:40+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/241\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 240,\n" +
                "            \"uuid\": \"38c546a0-b573-4b90-b0a1-181fc0125e8a\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"contentText\": \"bleh 12\",\n" +
                "            \"contentHtml\": \"bleh 12\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 14,\n" +
                "                \"fullName\": \"John Doe\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-07T10:39:05+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T10:39:05+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T10:39:05+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/240\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 239,\n" +
                "            \"uuid\": \"a8d3d47d-e0be-4803-a587-e00e242d0e03\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"contentText\": \"bleh 11\",\n" +
                "            \"contentHtml\": \"bleh 11\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 14,\n" +
                "                \"fullName\": \"John Doe\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-07T10:39:03+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T10:39:03+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T10:39:03+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/239\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 238,\n" +
                "            \"uuid\": \"76a24025-33f6-4606-9d76-599868d60beb\",\n" +
                "            \"clientId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"contentText\": \"bleh 10\",\n" +
                "            \"contentHtml\": \"bleh 10\",\n" +
                "            \"creator\": {\n" +
                "                \"id\": 14,\n" +
                "                \"fullName\": \"John Doe\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"source\": null,\n" +
                "            \"metadata\": {\n" +
                "                \"user_agent\": \"\",\n" +
                "                \"page_url\": \"\"\n" +
                "            },\n" +
                "            \"messageStatus\": \"DELIVERED\",\n" +
                "            \"messageStatusUpdatedAt\": \"2017-02-07T10:39:01+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T10:39:01+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-07T10:39:01+00:00\",\n" +
                "            \"resourceType\": \"case_message\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/238\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"conversationMessage\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 10,\n" +
                "    \"totalCount\": 20,\n" +
                "    \"nextUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages.json?_case=camel&include=userMinimal&offset=10\",\n" +
                "    \"lastUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages.json?_case=camel&include=userMinimal&offset=10\"\n" +
                "}";
    }
}
