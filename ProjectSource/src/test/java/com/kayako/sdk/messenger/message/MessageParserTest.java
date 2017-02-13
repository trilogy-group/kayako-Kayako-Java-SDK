package com.kayako.sdk.messenger.message;

import com.kayako.sdk.messenger.conversation.fields.ChannelType;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/02/17
 */
public class MessageParserTest {

    String response1 = "{\n" +
            "      \"id\": 246,\n" +
            "      \"uuid\": \"d1e44db7-0d9b-4bc3-bc04-47d71fb28dc7\",\n" +
            "      \"clientId\": null,\n" +
            "      \"subject\": \"Hey\",\n" +
            "      \"channel\": \"MAIL\",\n" +
            "      \"contentText\": \"Hello Hello\",\n" +
            "      \"contentHtml\": \"Hello Hello\",\n" +
            "      \"creator\": {\n" +
            "        \"id\": 1,\n" +
            "        \"fullName\": \"Kayako Mobile Testing\",\n" +
            "        \"lastActiveAt\": \"2017-02-09T05:21:04+00:00\",\n" +
            "        \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1486617664\",\n" +
            "        \"resourceType\": \"userMinimal\",\n" +
            "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
            "      },\n" +
            "      \"attachments\": [],\n" +
            "      \"downloadAll\": null,\n" +
            "      \"source\": null,\n" +
            "      \"metadata\": {\n" +
            "        \"user_agent\": \"\",\n" +
            "        \"page_url\": \"\"\n" +
            "      },\n" +
            "      \"messageStatus\": \"DELIVERED\",\n" +
            "      \"messageStatusUpdatedAt\": \"2017-02-07T10:41:37+00:00\",\n" +
            "      \"createdAt\": \"2017-02-07T10:40:22+00:00\",\n" +
            "      \"updatedAt\": \"2017-02-07T10:40:22+00:00\",\n" +
            "      \"resourceType\": \"case_message\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages/246\"\n" +
            "    }";

    @Test
    public void parseTest1() throws Exception {

        MessageParser messengerParser = new MessageParser();
        Message message = messengerParser.parse(response1);

        Assert.assertNotNull(message);
        Assert.assertEquals(246L, message.getId().longValue());
        Assert.assertEquals("d1e44db7-0d9b-4bc3-bc04-47d71fb28dc7", message.getUuid());
        Assert.assertEquals("Hey", message.getSubject());
        Assert.assertEquals(ChannelType.MAIL, message.getChannel());
        Assert.assertEquals("Hello Hello", message.getContentHtml());
        Assert.assertEquals("Hello Hello", message.getContentText());

        Assert.assertNotNull(message.getCreator());
        Assert.assertEquals("Kayako Mobile Testing", message.getCreator().getFullName());

        //TODO: Attachments,metadata

        Assert.assertEquals(MessageStatus.DELIVERED, message.getMessageStatus());
        Assert.assertEquals(1486464097_000L, message.getMessageStatusUpdatedAt().longValue());
        Assert.assertEquals(1486464022_000L, message.getCreatedAt().longValue());
        Assert.assertEquals(1486464022_000L, message.getUpdatedAt().longValue());
    }
}