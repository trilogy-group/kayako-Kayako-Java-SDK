package com.kayako.sdk.messenger.attachment;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class AttachmentParserTest {

    private String response = "{\n" +
            "          \"id\": 27,\n" +
            "          \"name\": \"DtjgfRRwpv.gif\",\n" +
            "          \"size\": 409456,\n" +
            "          \"width\": 1261,\n" +
            "          \"height\": 660,\n" +
            "          \"type\": \"image/gif\",\n" +
            "          \"contentId\": null,\n" +
            "          \"alt\": null,\n" +
            "          \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url\",\n" +
            "          \"urlDownload\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/download\",\n" +
            "          \"thumbnails\": [\n" +
            "            {\n" +
            "              \"name\": \"DtjgfRRwpv_64.gif\",\n" +
            "              \"size\": 2071,\n" +
            "              \"width\": 64,\n" +
            "              \"height\": 33,\n" +
            "              \"type\": \"image/gif\",\n" +
            "              \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url&size=64\",\n" +
            "              \"createdAt\": \"2017-04-18T20:29:12+00:00\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"name\": \"DtjgfRRwpv_80.gif\",\n" +
            "              \"size\": 2764,\n" +
            "              \"width\": 80,\n" +
            "              \"height\": 41,\n" +
            "              \"type\": \"image/gif\",\n" +
            "              \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url&size=80\",\n" +
            "              \"createdAt\": \"2017-04-18T20:29:12+00:00\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"name\": \"DtjgfRRwpv_100.gif\",\n" +
            "              \"size\": 3753,\n" +
            "              \"width\": 100,\n" +
            "              \"height\": 52,\n" +
            "              \"type\": \"image/gif\",\n" +
            "              \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url&size=100\",\n" +
            "              \"createdAt\": \"2017-04-18T20:29:12+00:00\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"name\": \"DtjgfRRwpv_160.gif\",\n" +
            "              \"size\": 6911,\n" +
            "              \"width\": 160,\n" +
            "              \"height\": 83,\n" +
            "              \"type\": \"image/gif\",\n" +
            "              \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url&size=160\",\n" +
            "              \"createdAt\": \"2017-04-18T20:29:12+00:00\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"name\": \"DtjgfRRwpv_200.gif\",\n" +
            "              \"size\": 9390,\n" +
            "              \"width\": 200,\n" +
            "              \"height\": 104,\n" +
            "              \"type\": \"image/gif\",\n" +
            "              \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url&size=200\",\n" +
            "              \"createdAt\": \"2017-04-18T20:29:13+00:00\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"name\": \"DtjgfRRwpv_360.gif\",\n" +
            "              \"size\": 24723,\n" +
            "              \"width\": 360,\n" +
            "              \"height\": 188,\n" +
            "              \"type\": \"image/gif\",\n" +
            "              \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url&size=360\",\n" +
            "              \"createdAt\": \"2017-04-18T20:29:13+00:00\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"createdAt\": \"2017-04-18T20:29:11+00:00\",\n" +
            "          \"resourceType\": \"attachment\",\n" +
            "          \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27\"\n" +
            "        }\n";

    @Test
    public void test1() throws Exception {
        Attachment attachment = new AttachmentParser().parse(response);

        Assert.assertEquals(27L, attachment.getId().longValue());
        Assert.assertEquals("DtjgfRRwpv.gif", attachment.getName());
        Assert.assertEquals(409456L, attachment.getSize().longValue());
        Assert.assertEquals(1261, attachment.getWidth().longValue());
        Assert.assertEquals(660, attachment.getHeight().longValue());
        Assert.assertEquals("image/gif", attachment.getType());
        Assert.assertEquals("https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url", attachment.getUrl());
        Assert.assertEquals("https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/download", attachment.getUrlDownload());
        Assert.assertEquals(6, attachment.getThumbnails().size());

        Thumbnail thumbnail = attachment.getThumbnails().get(5);
        Assert.assertNotNull(thumbnail);
    }
}