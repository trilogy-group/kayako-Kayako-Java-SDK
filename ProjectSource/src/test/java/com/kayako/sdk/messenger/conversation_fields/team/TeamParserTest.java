package com.kayako.sdk.messenger.conversation_fields.team;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class TeamParserTest {

    String jsonResponse1 = "{\n" +
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
            "    }";

    @Test
    public void test1() throws Exception {
        TeamParser teamParser = new TeamParser();

        Team team = teamParser.parse(jsonResponse1);
        Assert.assertNotNull(team);
        Assert.assertEquals(1, team.getId().longValue());
        Assert.assertEquals("General", team.getTitle());
        Assert.assertEquals(10, team.getMemberCount().intValue());
        Assert.assertEquals(1483968320000L, team.getCreatedAt().longValue());
        Assert.assertEquals(1483968320000L, team.getUpdatedAt().longValue());
    }
}