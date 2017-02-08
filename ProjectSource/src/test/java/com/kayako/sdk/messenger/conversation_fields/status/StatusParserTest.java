package com.kayako.sdk.messenger.conversation_fields.status;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class StatusParserTest {

    String statusResponse1 = "{\n" +
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
            "    }";

    @Test
    public void test() throws Exception {

        StatusParser statusParser = new StatusParser();
        Status status = statusParser.parse(statusResponse1);

        Assert.assertNotNull(status);
        Assert.assertEquals(2, status.getId().longValue());
        Assert.assertEquals("Open", status.getLabel());
        Assert.assertEquals(Status.Type.OPEN, status.getType());
        Assert.assertEquals(2, status.getSortOrder().intValue());
        Assert.assertEquals(true, status.isSlaActive());
        Assert.assertEquals(false, status.isDeleted());
        Assert.assertEquals(1483968338000L, status.getCreatedAt().longValue());
        Assert.assertEquals(1483968338000L, status.getUpdatedAt().longValue());

    }
}