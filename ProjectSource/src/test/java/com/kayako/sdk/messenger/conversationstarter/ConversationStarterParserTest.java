package com.kayako.sdk.messenger.conversationstarter;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class ConversationStarterParserTest {

    String conversationStarterResponse1 = "{\n" +
            "\t\"lastActiveAgents\": [{\n" +
            "\t\t\"id\": 6,\n" +
            "\t\t\"fullName\": \"Robin Malhotra\",\n" +
            "\t\t\"lastActiveAt\": \"2017-03-14T16:00:12+00:00\",\n" +
            "\t\t\"lastSeenAt\": \"2017-03-14T16:00:12+00:00\",\n" +
            "\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1489507212\",\n" +
            "\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/6\"\n" +
            "\t}, {\n" +
            "\t\t\"id\": 1,\n" +
            "\t\t\"fullName\": \"Kayako Mobile Testing\",\n" +
            "\t\t\"lastActiveAt\": \"2017-03-14T04:40:04+00:00\",\n" +
            "\t\t\"lastSeenAt\": \"2017-03-14T04:40:04+00:00\",\n" +
            "\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1489466404\",\n" +
            "\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
            "\t}, {\n" +
            "\t\t\"id\": 10,\n" +
            "\t\t\"fullName\": \"Neil Mathew\",\n" +
            "\t\t\"lastActiveAt\": \"2017-03-14T04:39:36+00:00\",\n" +
            "\t\t\"lastSeenAt\": \"2017-03-14T04:39:36+00:00\",\n" +
            "\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1489466376\",\n" +
            "\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
            "\t}],\n" +
            "\t\"averageReplyTime\": 1257.2,\n" +
            "\t\"activeConversations\": [{\n" +
            "\t\t\"id\": 21,\n" +
            "\t\t\"uuid\": \"f37c6894-8c17-5193-9457-5defae7d68ca\",\n" +
            "\t\t\"legacyId\": null,\n" +
            "\t\t\"subject\": \"Hello Hello\",\n" +
            "\t\t\"channel\": \"HELPCENTER\",\n" +
            "\t\t\"requester\": {\n" +
            "\t\t\t\"id\": 15,\n" +
            "\t\t\t\"fullName\": \"John Doe 2\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
            "\t\t},\n" +
            "\t\t\"creator\": {\n" +
            "\t\t\t\"id\": 15,\n" +
            "\t\t\t\"fullName\": \"John Doe 2\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
            "\t\t},\n" +
            "\t\t\"lastReplier\": {\n" +
            "\t\t\t\"id\": 10,\n" +
            "\t\t\t\"fullName\": \"Neil Mathew\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-14T04:39:36+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-14T04:39:36+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1489466376\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
            "\t\t},\n" +
            "\t\t\"assignedTeam\": {\n" +
            "\t\t\t\"id\": 1,\n" +
            "\t\t\t\"resourceType\": \"team\"\n" +
            "\t\t},\n" +
            "\t\t\"assignedAgent\": {\n" +
            "\t\t\t\"id\": 10,\n" +
            "\t\t\t\"fullName\": \"Neil Mathew\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-14T04:39:36+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-14T04:39:36+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1489466376\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
            "\t\t},\n" +
            "\t\t\"status\": {\n" +
            "\t\t\t\"id\": 1,\n" +
            "\t\t\t\"resourceType\": \"caseStatus\"\n" +
            "\t\t},\n" +
            "\t\t\"isCompleted\": false,\n" +
            "\t\t\"priority\": null,\n" +
            "\t\t\"type\": null,\n" +
            "\t\t\"readMarker\": null,\n" +
            "\t\t\"customFields\": [],\n" +
            "\t\t\"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_21\",\n" +
            "\t\t\"lastMessagePreview\": \"Apple\",\n" +
            "\t\t\"lastMessageStatus\": \"DELIVERED\",\n" +
            "\t\t\"lastRepliedAt\": \"2017-02-13T06:43:02+00:00\",\n" +
            "\t\t\"createdAt\": \"2017-02-10T03:53:47+00:00\",\n" +
            "\t\t\"updatedAt\": \"2017-02-13T06:43:02+00:00\",\n" +
            "\t\t\"resourceType\": \"conversation\",\n" +
            "\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/21\"\n" +
            "\t}, {\n" +
            "\t\t\"id\": 23,\n" +
            "\t\t\"uuid\": \"b6871f2c-543c-591d-b175-82b431c06035\",\n" +
            "\t\t\"legacyId\": null,\n" +
            "\t\t\"subject\": \"Hello Hello\",\n" +
            "\t\t\"channel\": \"HELPCENTER\",\n" +
            "\t\t\"requester\": {\n" +
            "\t\t\t\"id\": 15,\n" +
            "\t\t\t\"fullName\": \"John Doe 2\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
            "\t\t},\n" +
            "\t\t\"creator\": {\n" +
            "\t\t\t\"id\": 15,\n" +
            "\t\t\t\"fullName\": \"John Doe 2\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
            "\t\t},\n" +
            "\t\t\"lastReplier\": {\n" +
            "\t\t\t\"id\": 15,\n" +
            "\t\t\t\"fullName\": \"John Doe 2\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
            "\t\t},\n" +
            "\t\t\"assignedTeam\": null,\n" +
            "\t\t\"assignedAgent\": null,\n" +
            "\t\t\"status\": {\n" +
            "\t\t\t\"id\": 1,\n" +
            "\t\t\t\"resourceType\": \"caseStatus\"\n" +
            "\t\t},\n" +
            "\t\t\"isCompleted\": false,\n" +
            "\t\t\"priority\": null,\n" +
            "\t\t\"type\": null,\n" +
            "\t\t\"readMarker\": null,\n" +
            "\t\t\"customFields\": [],\n" +
            "\t\t\"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_23\",\n" +
            "\t\t\"lastMessagePreview\": \"This a new message!\",\n" +
            "\t\t\"lastMessageStatus\": \"DELIVERED\",\n" +
            "\t\t\"lastRepliedAt\": \"2017-03-15T08:54:00+00:00\",\n" +
            "\t\t\"createdAt\": \"2017-02-10T04:00:55+00:00\",\n" +
            "\t\t\"updatedAt\": \"2017-03-15T08:54:01+00:00\",\n" +
            "\t\t\"resourceType\": \"conversation\",\n" +
            "\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/23\"\n" +
            "\t}, {\n" +
            "\t\t\"id\": 24,\n" +
            "\t\t\"uuid\": \"dcb74939-1b34-52be-878b-8e62b5386b15\",\n" +
            "\t\t\"legacyId\": null,\n" +
            "\t\t\"subject\": \"Hello Hello\",\n" +
            "\t\t\"channel\": \"HELPCENTER\",\n" +
            "\t\t\"requester\": {\n" +
            "\t\t\t\"id\": 15,\n" +
            "\t\t\t\"fullName\": \"John Doe 2\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
            "\t\t},\n" +
            "\t\t\"creator\": {\n" +
            "\t\t\t\"id\": 15,\n" +
            "\t\t\t\"fullName\": \"John Doe 2\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
            "\t\t},\n" +
            "\t\t\"lastReplier\": {\n" +
            "\t\t\t\"id\": 15,\n" +
            "\t\t\t\"fullName\": \"John Doe 2\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-15T08:53:56+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1489568036\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
            "\t\t},\n" +
            "\t\t\"assignedTeam\": {\n" +
            "\t\t\t\"id\": 1,\n" +
            "\t\t\t\"resourceType\": \"team\"\n" +
            "\t\t},\n" +
            "\t\t\"assignedAgent\": {\n" +
            "\t\t\t\"id\": 6,\n" +
            "\t\t\t\"fullName\": \"Robin Malhotra\",\n" +
            "\t\t\t\"lastActiveAt\": \"2017-03-14T16:00:12+00:00\",\n" +
            "\t\t\t\"lastSeenAt\": \"2017-03-14T16:00:12+00:00\",\n" +
            "\t\t\t\"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1489507212\",\n" +
            "\t\t\t\"resourceType\": \"userMinimal\",\n" +
            "\t\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/6\"\n" +
            "\t\t},\n" +
            "\t\t\"status\": {\n" +
            "\t\t\t\"id\": 1,\n" +
            "\t\t\t\"resourceType\": \"caseStatus\"\n" +
            "\t\t},\n" +
            "\t\t\"isCompleted\": false,\n" +
            "\t\t\"priority\": null,\n" +
            "\t\t\"type\": null,\n" +
            "\t\t\"readMarker\": null,\n" +
            "\t\t\"customFields\": [],\n" +
            "\t\t\"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_24\",\n" +
            "\t\t\"lastMessagePreview\": \"hello asd\",\n" +
            "\t\t\"lastMessageStatus\": \"DELIVERED\",\n" +
            "\t\t\"lastRepliedAt\": \"2017-02-16T12:31:56+00:00\",\n" +
            "\t\t\"createdAt\": \"2017-02-10T04:02:54+00:00\",\n" +
            "\t\t\"updatedAt\": \"2017-02-16T12:31:56+00:00\",\n" +
            "\t\t\"resourceType\": \"conversation\",\n" +
            "\t\t\"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/24\"\n" +
            "\t}]\n" +
            "}";


    String conversationStarterResponse2 =
            "{\n" +
                    "    \"lastActiveAgents\": [\n" +
                    "      {\n" +
                    "        \"id\": 12,\n" +
                    "        \"fullName\": \"Neil Mathew #3\",\n" +
                    "        \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "        \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "        \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "        \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "        \"resourceType\": \"userMinimal\",\n" +
                    "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 6,\n" +
                    "        \"fullName\": \"Robin Malhotra\",\n" +
                    "        \"lastActiveAt\": \"2018-02-19T11:52:50+00:00\",\n" +
                    "        \"lastSeenAt\": \"2018-02-19T11:52:50+00:00\",\n" +
                    "        \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1519041170\",\n" +
                    "        \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@fd8ccb1f90684010b781754e1def7d144e5f1b5c\",\n" +
                    "        \"resourceType\": \"userMinimal\",\n" +
                    "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/6\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 1,\n" +
                    "        \"fullName\": \"Kayako Mobile Testing\",\n" +
                    "        \"lastActiveAt\": \"2018-02-19T10:55:51+00:00\",\n" +
                    "        \"lastSeenAt\": \"2018-02-19T10:55:51+00:00\",\n" +
                    "        \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1519037751\",\n" +
                    "        \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e3b4d467545d207f54d7ebb2a007de3cd6540f57\",\n" +
                    "        \"resourceType\": \"userMinimal\",\n" +
                    "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"averageReplyTime\": null,\n" +
                    "    \"activeConversations\": [\n" +
                    "      {\n" +
                    "        \"id\": 788,\n" +
                    "        \"uuid\": \"641cd793-3a23-5d0b-8612-7f66452333c9\",\n" +
                    "        \"legacyId\": null,\n" +
                    "        \"subject\": \"WHY RECYCLERVIEW... WHY?\",\n" +
                    "        \"channel\": \"MAIL\",\n" +
                    "        \"requester\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"creator\": {\n" +
                    "          \"id\": 10,\n" +
                    "          \"fullName\": \"Neil Mathew\",\n" +
                    "          \"lastActiveAt\": \"2018-02-15T11:53:25+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-15T11:53:25+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1518695605\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@1005669c4225b240d3bea1e6cb90a3ddba68b4f5\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                    "        },\n" +
                    "        \"lastReplier\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"lastAgentReplier\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"assignedTeam\": {\n" +
                    "          \"id\": 1,\n" +
                    "          \"title\": \"General\",\n" +
                    "          \"resourceType\": \"team\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/teams/1\"\n" +
                    "        },\n" +
                    "        \"assignedAgent\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"status\": {\n" +
                    "          \"id\": 3,\n" +
                    "          \"label\": \"Pending\",\n" +
                    "          \"type\": \"PENDING\",\n" +
                    "          \"sortOrder\": 3,\n" +
                    "          \"isSlaActive\": false,\n" +
                    "          \"isDeleted\": false,\n" +
                    "          \"resourceType\": \"caseStatus\"\n" +
                    "        },\n" +
                    "        \"isClosed\": false,\n" +
                    "        \"priority\": {\n" +
                    "          \"id\": 1,\n" +
                    "          \"label\": \"Low\",\n" +
                    "          \"level\": 1,\n" +
                    "          \"resourceType\": \"casePriority\"\n" +
                    "        },\n" +
                    "        \"type\": null,\n" +
                    "        \"readMarker\": {\n" +
                    "          \"id\": 1269,\n" +
                    "          \"lastReadPostId\": 11894,\n" +
                    "          \"lastReadAt\": \"2017-11-07T10:05:33+00:00\",\n" +
                    "          \"unreadCount\": 0,\n" +
                    "          \"resourceType\": \"readMarker\"\n" +
                    "        },\n" +
                    "        \"customFields\": [\n" +
                    "          \n" +
                    "        ],\n" +
                    "        \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_788\",\n" +
                    "        \"lastMessagePreview\": \"43 1\",\n" +
                    "        \"lastMessageStatus\": \"SENT\",\n" +
                    "        \"lastRepliedAt\": \"2017-10-03T11:04:26+00:00\",\n" +
                    "        \"createdAt\": \"2017-07-03T11:31:47+00:00\",\n" +
                    "        \"updatedAt\": \"2017-10-03T11:04:26+00:00\",\n" +
                    "        \"resourceType\": \"conversation\",\n" +
                    "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/788\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 217,\n" +
                    "        \"uuid\": \"3f3ad8f1-a886-583d-9a56-261458b61e5a\",\n" +
                    "        \"legacyId\": null,\n" +
                    "        \"subject\": \"A new day\",\n" +
                    "        \"channel\": \"HELPCENTER\",\n" +
                    "        \"requester\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"creator\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"lastReplier\": {\n" +
                    "          \"id\": 1,\n" +
                    "          \"fullName\": \"Kayako Mobile Testing\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T10:55:51+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T10:55:51+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1519037751\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e3b4d467545d207f54d7ebb2a007de3cd6540f57\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
                    "        },\n" +
                    "        \"lastAgentReplier\": {\n" +
                    "          \"id\": 1,\n" +
                    "          \"fullName\": \"Kayako Mobile Testing\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T10:55:51+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T10:55:51+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1519037751\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e3b4d467545d207f54d7ebb2a007de3cd6540f57\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
                    "        },\n" +
                    "        \"assignedTeam\": {\n" +
                    "          \"id\": 1,\n" +
                    "          \"title\": \"General\",\n" +
                    "          \"resourceType\": \"team\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/teams/1\"\n" +
                    "        },\n" +
                    "        \"assignedAgent\": {\n" +
                    "          \"id\": 1,\n" +
                    "          \"fullName\": \"Kayako Mobile Testing\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T10:55:51+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T10:55:51+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1519037751\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e3b4d467545d207f54d7ebb2a007de3cd6540f57\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
                    "        },\n" +
                    "        \"status\": {\n" +
                    "          \"id\": 1,\n" +
                    "          \"label\": \"New\",\n" +
                    "          \"type\": \"NEW\",\n" +
                    "          \"sortOrder\": 1,\n" +
                    "          \"isSlaActive\": true,\n" +
                    "          \"isDeleted\": false,\n" +
                    "          \"resourceType\": \"caseStatus\"\n" +
                    "        },\n" +
                    "        \"isClosed\": false,\n" +
                    "        \"priority\": null,\n" +
                    "        \"type\": null,\n" +
                    "        \"readMarker\": {\n" +
                    "          \"id\": 298,\n" +
                    "          \"lastReadPostId\": 7482,\n" +
                    "          \"lastReadAt\": \"2017-12-08T05:29:39+00:00\",\n" +
                    "          \"unreadCount\": 0,\n" +
                    "          \"resourceType\": \"readMarker\"\n" +
                    "        },\n" +
                    "        \"customFields\": [\n" +
                    "          \n" +
                    "        ],\n" +
                    "        \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_217\",\n" +
                    "        \"lastMessagePreview\": \"me onine?\",\n" +
                    "        \"lastMessageStatus\": \"SEEN\",\n" +
                    "        \"lastRepliedAt\": \"2017-07-27T15:23:29+00:00\",\n" +
                    "        \"createdAt\": \"2017-04-05T12:10:44+00:00\",\n" +
                    "        \"updatedAt\": \"2017-07-27T15:23:29+00:00\",\n" +
                    "        \"resourceType\": \"conversation\",\n" +
                    "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/217\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 417,\n" +
                    "        \"uuid\": \"54557209-b145-5baf-8ed1-fe495762c5c1\",\n" +
                    "        \"legacyId\": null,\n" +
                    "        \"subject\": \"Hello\",\n" +
                    "        \"channel\": \"MESSENGER\",\n" +
                    "        \"requester\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"creator\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"lastReplier\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"lastAgentReplier\": {\n" +
                    "          \"id\": 12,\n" +
                    "          \"fullName\": \"Neil Mathew #3\",\n" +
                    "          \"lastActiveAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"lastSeenAt\": \"2018-02-19T11:59:41+00:00\",\n" +
                    "          \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1519041581\",\n" +
                    "          \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@e2c2348469126cf926a106707c2d6545c42cec8d\",\n" +
                    "          \"resourceType\": \"userMinimal\",\n" +
                    "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
                    "        },\n" +
                    "        \"assignedTeam\": null,\n" +
                    "        \"assignedAgent\": null,\n" +
                    "        \"status\": {\n" +
                    "          \"id\": 1,\n" +
                    "          \"label\": \"New\",\n" +
                    "          \"type\": \"NEW\",\n" +
                    "          \"sortOrder\": 1,\n" +
                    "          \"isSlaActive\": true,\n" +
                    "          \"isDeleted\": false,\n" +
                    "          \"resourceType\": \"caseStatus\"\n" +
                    "        },\n" +
                    "        \"isClosed\": false,\n" +
                    "        \"priority\": null,\n" +
                    "        \"type\": null,\n" +
                    "        \"readMarker\": {\n" +
                    "          \"id\": 646,\n" +
                    "          \"lastReadPostId\": 3333,\n" +
                    "          \"lastReadAt\": \"2017-05-09T10:19:17+00:00\",\n" +
                    "          \"unreadCount\": 0,\n" +
                    "          \"resourceType\": \"readMarker\"\n" +
                    "        },\n" +
                    "        \"customFields\": [\n" +
                    "          \n" +
                    "        ],\n" +
                    "        \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_417\",\n" +
                    "        \"lastMessagePreview\": \"Hello\",\n" +
                    "        \"lastMessageStatus\": \"DELIVERED\",\n" +
                    "        \"lastRepliedAt\": \"2017-05-09T10:19:17+00:00\",\n" +
                    "        \"createdAt\": \"2017-05-09T10:19:17+00:00\",\n" +
                    "        \"updatedAt\": \"2017-05-09T10:19:17+00:00\",\n" +
                    "        \"resourceType\": \"conversation\",\n" +
                    "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/417\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"userEmail\": \"neil.mathew+3@kayako.com\",\n" +
                    "    \"user\": null,\n" +
                    "    \"engagementRule\": null,\n" +
                    "    \"delayedEngagementRules\": [\n" +
                    "      \n" +
                    "    ],\n" +
                    "    \"defaultLocale\": \"en-gb\",\n" +
                    "    \"defaultTimezone\": \"Asia/Kolkata\",\n" +
                    "    \"removeBranding\": true,\n" +
                    "    \"realtimeUrl\": \"wss://kre.kayako.net/socket\"\n" +
                    "  }";

    @Test
    public void test1() throws Exception {
        ConversationStarterParser conversationStarterParser = new ConversationStarterParser();
        ConversationStarter conversationStarter = conversationStarterParser.parse(conversationStarterResponse1);

        Assert.assertEquals(3, conversationStarter.getLastActiveAgents().size());
        Assert.assertEquals(1257.2, conversationStarter.getAverageReplyTime().doubleValue(), 0.09);
    }

    @Test
    public void test2() throws Exception {
        ConversationStarterParser conversationStarterParser = new ConversationStarterParser();
        ConversationStarter conversationStarter = conversationStarterParser.parse(conversationStarterResponse2);

        Assert.assertEquals("wss://kre.kayako.net/socket", conversationStarter.getRealtimeUrl());

    }
}