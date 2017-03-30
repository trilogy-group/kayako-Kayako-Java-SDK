package com.kayako.sdk.messenger.conversation;

import com.kayako.sdk.messenger.conversation.fields.ChannelType;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class ConversationParserTest {

    String conversationResponse1 = "{\n" +
            "    \"id\": 20,\n" +
            "    \"uuid\": \"a420b635-0d77-5306-af8a-867744566acc\",\n" +
            "    \"legacyId\": null,\n" +
            "    \"subject\": \"Hey\",\n" +
            "    \"channel\": \"HELPCENTER\",\n" +
            "    \"requester\": {\n" +
            "      \"id\": 14,\n" +
            "      \"fullName\": \"John Doe\",\n" +
            "      \"lastActiveAt\": null,\n" +
            "      \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
            "      \"resourceType\": \"userMinimal\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
            "    },\n" +
            "    \"creator\": {\n" +
            "      \"id\": 14,\n" +
            "      \"fullName\": \"John Doe\",\n" +
            "      \"lastActiveAt\": null,\n" +
            "      \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
            "      \"resourceType\": \"userMinimal\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
            "    },\n" +
            "    \"lastReplier\": {\n" +
            "      \"id\": 1,\n" +
            "      \"fullName\": \"Kayako Mobile Testing\",\n" +
            "      \"lastActiveAt\": \"2017-02-08T08:21:42+00:00\",\n" +
            "      \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1486542102\",\n" +
            "      \"resourceType\": \"userMinimal\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
            "    },\n" +
            "    \"assignedTeam\": {\n" +
            "      \"id\": 1,\n" +
            "      \"title\": \"General\",\n" +
            "      \"businesshour\": {\n" +
            "        \"id\": 3,\n" +
            "        \"title\": \"Default\",\n" +
            "        \"zones\": {\n" +
            "          \"monday\": [\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16,\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16\n" +
            "          ],\n" +
            "          \"tuesday\": [\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16,\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16\n" +
            "          ],\n" +
            "          \"wednesday\": [\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16,\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16\n" +
            "          ],\n" +
            "          \"thursday\": [\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16,\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16\n" +
            "          ],\n" +
            "          \"friday\": [\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16,\n" +
            "            9,\n" +
            "            10,\n" +
            "            11,\n" +
            "            12,\n" +
            "            13,\n" +
            "            14,\n" +
            "            15,\n" +
            "            16\n" +
            "          ],\n" +
            "          \"saturday\": [],\n" +
            "          \"sunday\": []\n" +
            "        },\n" +
            "        \"holidays\": [],\n" +
            "        \"isDefault\": true,\n" +
            "        \"createdAt\": \"2017-01-09T13:25:19+00:00\",\n" +
            "        \"updatedAt\": \"2017-01-09T13:25:19+00:00\",\n" +
            "        \"resourceType\": \"businessHour\",\n" +
            "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/businesshours/3\"\n" +
            "      },\n" +
            "      \"memberCount\": 10,\n" +
            "      \"createdAt\": \"2017-01-09T13:25:20+00:00\",\n" +
            "      \"updatedAt\": \"2017-01-09T13:25:20+00:00\",\n" +
            "      \"resourceType\": \"team\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/teams/1\"\n" +
            "    },\n" +
            "    \"assignedAgent\": null,\n" +
            "    \"status\": {\n" +
            "      \"id\": 2,\n" +
            "      \"label\": \"Open\",\n" +
            "      \"type\": \"OPEN\",\n" +
            "      \"sortOrder\": 2,\n" +
            "      \"isSlaActive\": true,\n" +
            "      \"isDeleted\": false,\n" +
            "      \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"resourceType\": \"caseStatus\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/statuses/2\"\n" +
            "    },\n" +
            "    \"isCompleted\": false,\n" +
            "    \"priority\": {\n" +
            "      \"id\": 4,\n" +
            "      \"label\": \"Urgent\",\n" +
            "      \"level\": 4,\n" +
            "      \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"resourceType\": \"casePriority\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/priorities/4\"\n" +
            "    },\n" +
            "    \"type\": null,\n" +
            "    \"readMarker\": null,\n" +
            "    \"customFields\": [],\n" +
            "    \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_20\",\n" +
            "    \"lastRepliedAt\": \"2017-02-07T10:40:22+00:00\",\n" +
            "    \"createdAt\": \"2017-02-07T09:41:42+00:00\",\n" +
            "    \"updatedAt\": \"2017-02-08T05:53:04+00:00\",\n" +
            "    \"resourceType\": \"conversation\",\n" +
            "    \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20\"\n" +
            "  }";

    String conversationResponse2 = "{\n" +
            "  \"status\": 200,\n" +
            "  \"data\": {\n" +
            "    \"id\": 20,\n" +
            "    \"uuid\": \"a420b635-0d77-5306-af8a-867744566acc\",\n" +
            "    \"legacyId\": null,\n" +
            "    \"subject\": \"Hey\",\n" +
            "    \"channel\": \"HELPCENTER\",\n" +
            "    \"requester\": {\n" +
            "      \"id\": 14,\n" +
            "      \"fullName\": \"John Doe\",\n" +
            "      \"lastActiveAt\": null,\n" +
            "      \"lastSeenAt\": null,\n" +
            "      \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
            "      \"resourceType\": \"userMinimal\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
            "    },\n" +
            "    \"creator\": {\n" +
            "      \"id\": 14,\n" +
            "      \"fullName\": \"John Doe\",\n" +
            "      \"lastActiveAt\": null,\n" +
            "      \"lastSeenAt\": null,\n" +
            "      \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
            "      \"resourceType\": \"userMinimal\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
            "    },\n" +
            "    \"lastReplier\": {\n" +
            "      \"id\": 1,\n" +
            "      \"fullName\": \"Kayako Mobile Testing\",\n" +
            "      \"lastActiveAt\": \"2017-03-30T15:43:29+00:00\",\n" +
            "      \"lastSeenAt\": \"2017-03-30T15:43:29+00:00\",\n" +
            "      \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1490888609\",\n" +
            "      \"resourceType\": \"userMinimal\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
            "    },\n" +
            "    \"lastAgentReplier\": {\n" +
            "      \"id\": 1,\n" +
            "      \"fullName\": \"Kayako Mobile Testing\",\n" +
            "      \"lastActiveAt\": \"2017-03-30T15:43:29+00:00\",\n" +
            "      \"lastSeenAt\": \"2017-03-30T15:43:29+00:00\",\n" +
            "      \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1490888609\",\n" +
            "      \"resourceType\": \"userMinimal\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
            "    },\n" +
            "    \"assignedTeam\": {\n" +
            "      \"id\": 1,\n" +
            "      \"title\": \"General\",\n" +
            "      \"businesshour\": {\n" +
            "        \"id\": 3,\n" +
            "        \"resourceType\": \"businessHour\"\n" +
            "      },\n" +
            "      \"memberCount\": 11,\n" +
            "      \"createdAt\": \"2017-01-09T13:25:20+00:00\",\n" +
            "      \"updatedAt\": \"2017-01-09T13:25:20+00:00\",\n" +
            "      \"resourceType\": \"team\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/teams/1\"\n" +
            "    },\n" +
            "    \"assignedAgent\": {\n" +
            "      \"id\": 12,\n" +
            "      \"fullName\": \"Neil Mathew #3\",\n" +
            "      \"lastActiveAt\": \"2017-03-29T11:03:21+00:00\",\n" +
            "      \"lastSeenAt\": \"2017-03-29T11:03:21+00:00\",\n" +
            "      \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/6174fbe8-3589-5e9f-bdd7-dd4e2b267e8c?1490785401\",\n" +
            "      \"resourceType\": \"userMinimal\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/12\"\n" +
            "    },\n" +
            "    \"status\": {\n" +
            "      \"id\": 2,\n" +
            "      \"label\": \"Open\",\n" +
            "      \"type\": \"OPEN\",\n" +
            "      \"sortOrder\": 2,\n" +
            "      \"isSlaActive\": true,\n" +
            "      \"isDeleted\": false,\n" +
            "      \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"resourceType\": \"caseStatus\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/statuses/2\"\n" +
            "    },\n" +
            "    \"isCompleted\": false,\n" +
            "    \"priority\": {\n" +
            "      \"id\": 4,\n" +
            "      \"label\": \"Urgent\",\n" +
            "      \"level\": 4,\n" +
            "      \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"resourceType\": \"casePriority\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/priorities/4\"\n" +
            "    },\n" +
            "    \"type\": null,\n" +
            "    \"readMarker\": {\n" +
            "      \"id\": 48,\n" +
            "      \"lastReadPostId\": 241,\n" +
            "      \"lastReadAt\": \"2017-02-07T12:21:08+00:00\",\n" +
            "      \"unreadCount\": 1,\n" +
            "      \"resourceType\": \"readMarker\"\n" +
            "    },\n" +
            "    \"customFields\": [],\n" +
            "    \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_20\",\n" +
            "    \"lastMessagePreview\": \"Hello Hello\",\n" +
            "    \"lastMessageStatus\": \"DELIVERED\",\n" +
            "    \"lastRepliedAt\": \"2017-02-07T10:40:22+00:00\",\n" +
            "    \"createdAt\": \"2017-02-07T09:41:42+00:00\",\n" +
            "    \"updatedAt\": \"2017-02-08T05:53:04+00:00\",\n" +
            "    \"resourceType\": \"conversation\",\n" +
            "    \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20\"\n" +
            "  },\n" +
            "  \"resource\": \"conversation\",\n" +
            "  \"logs\": [\n" +
            "    {\n" +
            "      \"level\": \"NOTICE\",\n" +
            "      \"message\": \"Redundant request parameters supplied: limit, offset\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    @Test
    public void test1() throws Exception {
        ConversationParser conversationParser = new ConversationParser();
        Conversation conversation = conversationParser.parse(conversationResponse1);

        Assert.assertNotNull(conversation);
        Assert.assertEquals(20, conversation.getId().intValue());
        Assert.assertEquals("a420b635-0d77-5306-af8a-867744566acc", conversation.getUuid());
        Assert.assertEquals(null, conversation.getLegacyId());
        Assert.assertEquals("Hey", conversation.getSubject());
        Assert.assertEquals(ChannelType.HELPCENTER, conversation.getChannel());

        Assert.assertEquals("John Doe", conversation.getRequester().getFullName());
        Assert.assertEquals("https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502", conversation.getCreator().getAvatarUrl());
        Assert.assertEquals("Kayako Mobile Testing", conversation.getLastReplier().getFullName());

        Assert.assertEquals("General", conversation.getAssignedTeam().getTitle());
        Assert.assertEquals("Open", conversation.getStatus().getLabel());
        Assert.assertEquals("Urgent", conversation.getPriority().getLabel());
        Assert.assertEquals("presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_20", conversation.getRealtimeChannel());
        Assert.assertEquals(false, conversation.isCompleted());
    }

    @Test
    public void test2() throws Exception {
        ConversationParser conversationParser = new ConversationParser();
        Conversation conversation = conversationParser.parse(conversationResponse2);

        Assert.assertEquals(48L, conversation.getReadMarker().getId().longValue());
        Assert.assertEquals(1, conversation.getReadMarker().getUnreadCount().intValue());
        Assert.assertEquals(241L, conversation.getReadMarker().getLastReadAt().longValue());
    }
}