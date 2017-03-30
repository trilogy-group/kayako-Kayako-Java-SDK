package com.kayako.sdk.messenger.conversation.fields.readmarker;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 30/03/17
 */
public class ReadMarkerParserTest {

    @Test
    public void name() throws Exception {
        String json = "{\n" +
                "\t\"id\": 48,\n" +
                "\t\"lastReadPostId\": 241,\n" +
                "\t\"lastReadAt\": \"2017-02-07T12:21:08+00:00\",\n" +
                "\t\"unreadCount\": 1,\n" +
                "\t\"resourceType\": \"readMarker\"\n" +
                "}";

        ReadMarker readMarker = new ReadMarkerParser().parse(json);
        Assert.assertEquals(48L, readMarker.getId().longValue());
        Assert.assertEquals(241L, readMarker.getLastReadPostId().longValue());
        Assert.assertEquals(1, readMarker.getUnreadCount().intValue());
        Assert.assertEquals(1486470068000L, readMarker.getLastReadAt().longValue());
    }

}