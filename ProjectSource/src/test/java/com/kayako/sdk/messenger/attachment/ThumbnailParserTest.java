package com.kayako.sdk.messenger.attachment;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class ThumbnailParserTest {

    String json = "{" +
            "              \"name\": \"DtjgfRRwpv_360.gif\",\n" +
            "              \"size\": 24723,\n" +
            "              \"width\": 360,\n" +
            "              \"height\": 188,\n" +
            "              \"type\": \"image/gif\",\n" +
            "              \"url\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url&size=360\",\n" +
            "              \"createdAt\": \"2017-04-18T20:29:13+00:00\"\n" +
            "            }\n";

    @Test
    public void test1() throws Exception {
        Thumbnail thumbnail = new ThumbnailParser().parse(json);
        Assert.assertEquals("DtjgfRRwpv_360.gif", thumbnail.getName());
        Assert.assertEquals("image/gif", thumbnail.getType());
        Assert.assertEquals(24723L, thumbnail.getSize().longValue());
        Assert.assertEquals(360L, thumbnail.getWidth().longValue());
        Assert.assertEquals(188L, thumbnail.getHeight().longValue());
        Assert.assertEquals("https://kayako-mobile-testing.kayako.com/api/v1/conversations/316/messages/2359/attachments/27/url&size=360", thumbnail.getUrl());
    }
}