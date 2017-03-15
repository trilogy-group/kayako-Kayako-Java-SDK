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
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/starter?include=userMinimal,conversation&_case=camel";
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
                "    \"averageReplyTime\": 1257.2,\n" +
                "    \"activeConversations\": [\n" +
                "      {\n" +
                "        \"id\": 21,\n" +
                "        \"uuid\": \"f37c6894-8c17-5193-9457-5defae7d68ca\",\n" +
                "        \"legacyId\": null,\n" +
                "        \"subject\": \"Hello Hello\",\n" +
                "        \"channel\": \"HELPCENTER\",\n" +
                "        \"requester\": {\n" +
                "          \"id\": 15,\n" +
                "          \"fullName\": \"John Doe 2\",\n" +
                "          \"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"creator\": {\n" +
                "          \"id\": 15,\n" +
                "          \"fullName\": \"John Doe 2\",\n" +
                "          \"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"lastReplier\": {\n" +
                "          \"id\": 10,\n" +
                "          \"fullName\": \"Neil Mathew\",\n" +
                "          \"lastActiveAt\": \"2017-03-14T04:39:36+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-14T04:39:36+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1489466376\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "        },\n" +
                "        \"assignedTeam\": {\n" +
                "          \"id\": 1,\n" +
                "          \"resourceType\": \"team\"\n" +
                "        },\n" +
                "        \"assignedAgent\": {\n" +
                "          \"id\": 10,\n" +
                "          \"fullName\": \"Neil Mathew\",\n" +
                "          \"lastActiveAt\": \"2017-03-14T04:39:36+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-14T04:39:36+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1489466376\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "        },\n" +
                "        \"status\": {\n" +
                "          \"id\": 1,\n" +
                "          \"resourceType\": \"caseStatus\"\n" +
                "        },\n" +
                "        \"isCompleted\": false,\n" +
                "        \"priority\": null,\n" +
                "        \"type\": null,\n" +
                "        \"readMarker\": null,\n" +
                "        \"customFields\": [],\n" +
                "        \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_21\",\n" +
                "        \"lastMessagePreview\": \"Apple\",\n" +
                "        \"lastMessageStatus\": \"DELIVERED\",\n" +
                "        \"lastRepliedAt\": \"2017-02-13T06:43:02+00:00\",\n" +
                "        \"createdAt\": \"2017-02-10T03:53:47+00:00\",\n" +
                "        \"updatedAt\": \"2017-02-13T06:43:02+00:00\",\n" +
                "        \"resourceType\": \"conversation\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/21\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 23,\n" +
                "        \"uuid\": \"b6871f2c-543c-591d-b175-82b431c06035\",\n" +
                "        \"legacyId\": null,\n" +
                "        \"subject\": \"Hello Hello\",\n" +
                "        \"channel\": \"HELPCENTER\",\n" +
                "        \"requester\": {\n" +
                "          \"id\": 15,\n" +
                "          \"fullName\": \"John Doe 2\",\n" +
                "          \"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"creator\": {\n" +
                "          \"id\": 15,\n" +
                "          \"fullName\": \"John Doe 2\",\n" +
                "          \"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"lastReplier\": {\n" +
                "          \"id\": 15,\n" +
                "          \"fullName\": \"John Doe 2\",\n" +
                "          \"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"assignedTeam\": null,\n" +
                "        \"assignedAgent\": null,\n" +
                "        \"status\": {\n" +
                "          \"id\": 1,\n" +
                "          \"resourceType\": \"caseStatus\"\n" +
                "        },\n" +
                "        \"isCompleted\": false,\n" +
                "        \"priority\": null,\n" +
                "        \"type\": null,\n" +
                "        \"readMarker\": null,\n" +
                "        \"customFields\": [],\n" +
                "        \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_23\",\n" +
                "        \"lastMessagePreview\": \"This a new message!\",\n" +
                "        \"lastMessageStatus\": \"DELIVERED\",\n" +
                "        \"lastRepliedAt\": \"2017-03-15T08:54:00+00:00\",\n" +
                "        \"createdAt\": \"2017-02-10T04:00:55+00:00\",\n" +
                "        \"updatedAt\": \"2017-03-15T08:54:01+00:00\",\n" +
                "        \"resourceType\": \"conversation\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/23\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 24,\n" +
                "        \"uuid\": \"dcb74939-1b34-52be-878b-8e62b5386b15\",\n" +
                "        \"legacyId\": null,\n" +
                "        \"subject\": \"Hello Hello\",\n" +
                "        \"channel\": \"HELPCENTER\",\n" +
                "        \"requester\": {\n" +
                "          \"id\": 15,\n" +
                "          \"fullName\": \"John Doe 2\",\n" +
                "          \"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"creator\": {\n" +
                "          \"id\": 15,\n" +
                "          \"fullName\": \"John Doe 2\",\n" +
                "          \"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"lastReplier\": {\n" +
                "          \"id\": 15,\n" +
                "          \"fullName\": \"John Doe 2\",\n" +
                "          \"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"assignedTeam\": {\n" +
                "          \"id\": 1,\n" +
                "          \"resourceType\": \"team\"\n" +
                "        },\n" +
                "        \"assignedAgent\": {\n" +
                "          \"id\": 6,\n" +
                "          \"fullName\": \"Robin Malhotra\",\n" +
                "          \"lastActiveAt\": \"2017-03-14T16:00:12+00:00\",\n" +
                "          \"lastSeenAt\": \"2017-03-14T16:00:12+00:00\",\n" +
                "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1489507212\",\n" +
                "          \"resourceType\": \"userMinimal\",\n" +
                "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/6\"\n" +
                "        },\n" +
                "        \"status\": {\n" +
                "          \"id\": 1,\n" +
                "          \"resourceType\": \"caseStatus\"\n" +
                "        },\n" +
                "        \"isCompleted\": false,\n" +
                "        \"priority\": null,\n" +
                "        \"type\": null,\n" +
                "        \"readMarker\": null,\n" +
                "        \"customFields\": [],\n" +
                "        \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_24\",\n" +
                "        \"lastMessagePreview\": \"hello asd\",\n" +
                "        \"lastMessageStatus\": \"DELIVERED\",\n" +
                "        \"lastRepliedAt\": \"2017-02-16T12:31:56+00:00\",\n" +
                "        \"createdAt\": \"2017-02-10T04:02:54+00:00\",\n" +
                "        \"updatedAt\": \"2017-02-16T12:31:56+00:00\",\n" +
                "        \"resourceType\": \"conversation\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/24\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"resource\": \"conversationStarter\"\n" +
                "}";
    }
}
