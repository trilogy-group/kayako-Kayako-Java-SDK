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
            "      \"attachments\": [\n" +
            "                {\n" +
            "                    \"id\": 27,\n" +
            "                    \"name\": \"DtjgfRRwpv.gif\",\n" +
            "                    \"size\": 409456,\n" +
            "                    \"width\": 1261,\n" +
            "                    \"height\": 660,\n" +
            "                    \"type\": \"image/gif\",\n" +
            "                    \"contentId\": null,\n" +
            "                    \"alt\": null,\n" +
            "                    \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/url\",\n" +
            "                    \"urlDownload\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/download\",\n" +
            "                    \"thumbnails\": [\n" +
            "                        {\n" +
            "                            \"name\": \"DtjgfRRwpv_64.gif\",\n" +
            "                            \"size\": 2071,\n" +
            "                            \"width\": 64,\n" +
            "                            \"height\": 33,\n" +
            "                            \"type\": \"image/gif\",\n" +
            "                            \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/url&size=64\",\n" +
            "                            \"createdAt\": \"2017-04-18T20:29:12+00:00\"\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"name\": \"DtjgfRRwpv_80.gif\",\n" +
            "                            \"size\": 2764,\n" +
            "                            \"width\": 80,\n" +
            "                            \"height\": 41,\n" +
            "                            \"type\": \"image/gif\",\n" +
            "                            \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/url&size=80\",\n" +
            "                            \"createdAt\": \"2017-04-18T20:29:12+00:00\"\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"name\": \"DtjgfRRwpv_100.gif\",\n" +
            "                            \"size\": 3753,\n" +
            "                            \"width\": 100,\n" +
            "                            \"height\": 52,\n" +
            "                            \"type\": \"image/gif\",\n" +
            "                            \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/url&size=100\",\n" +
            "                            \"createdAt\": \"2017-04-18T20:29:12+00:00\"\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"name\": \"DtjgfRRwpv_160.gif\",\n" +
            "                            \"size\": 6911,\n" +
            "                            \"width\": 160,\n" +
            "                            \"height\": 83,\n" +
            "                            \"type\": \"image/gif\",\n" +
            "                            \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/url&size=160\",\n" +
            "                            \"createdAt\": \"2017-04-18T20:29:12+00:00\"\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"name\": \"DtjgfRRwpv_200.gif\",\n" +
            "                            \"size\": 9390,\n" +
            "                            \"width\": 200,\n" +
            "                            \"height\": 104,\n" +
            "                            \"type\": \"image/gif\",\n" +
            "                            \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/url&size=200\",\n" +
            "                            \"createdAt\": \"2017-04-18T20:29:13+00:00\"\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"name\": \"DtjgfRRwpv_360.gif\",\n" +
            "                            \"size\": 24723,\n" +
            "                            \"width\": 360,\n" +
            "                            \"height\": 188,\n" +
            "                            \"type\": \"image/gif\",\n" +
            "                            \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/url&size=360\",\n" +
            "                            \"createdAt\": \"2017-04-18T20:29:13+00:00\"\n" +
            "                        }\n" +
            "                    ],\n" +
            "                    \"createdAt\": \"2017-04-18T20:29:11+00:00\",\n" +
            "                    \"resourceType\": \"attachment\",\n" +
            "                    \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27\"\n" +
            "                }\n" +
            "            ],\n" +
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

        Assert.assertEquals("https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/url", message.getAttachments().get(0).getUrl());
        Assert.assertEquals("https://kayako-mobile-testing.kayako.com/api/v1/cases/316/messages/1879/attachments/27/url&size=80", message.getAttachments().get(0).getThumbnails().get(1).getUrl());

        Assert.assertEquals(MessageStatus.DELIVERED, message.getMessageStatus());
        Assert.assertEquals(1486464097_000L, message.getMessageStatusUpdatedAt().longValue());
        Assert.assertEquals(1486464022_000L, message.getCreatedAt().longValue());
        Assert.assertEquals(1486464022_000L, message.getUpdatedAt().longValue());
    }
}