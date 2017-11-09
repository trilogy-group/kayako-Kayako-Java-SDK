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

    @Test
    public void test1() throws Exception {
        ConversationStarterParser conversationStarterParser = new ConversationStarterParser();
        ConversationStarter conversationStarter = conversationStarterParser.parse(conversationStarterResponse1);

        Assert.assertEquals(3, conversationStarter.getLastActiveAgents().size());
        Assert.assertEquals(1257.2, conversationStarter.getAverageReplyTime().doubleValue(), 0.09);
    }
}