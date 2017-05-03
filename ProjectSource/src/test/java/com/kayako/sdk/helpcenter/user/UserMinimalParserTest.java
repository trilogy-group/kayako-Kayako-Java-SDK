package com.kayako.sdk.helpcenter.user;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class UserMinimalParserTest {

    @Test
    public void test1() throws Exception {
        String userMinimalResponse = "{\n" +
                "        \"id\": 6,\n" +
                "        \"fullName\": \"Robin Malhotra\",\n" +
                "        \"lastActiveAt\": \"2017-03-14T16:00:12+00:00\",\n" +
                "        \"lastSeenAt\": \"2017-03-14T16:00:12+00:00\",\n" +
                "        \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1489507212\",\n" +
                "        \"resourceType\": \"userMinimal\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/6\"\n" +
                "      }";

        UserMinimalParser userMinimalParser = new UserMinimalParser();
        UserMinimal userMinimal = userMinimalParser.parse(userMinimalResponse);

        Assert.assertEquals("https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1489507212", userMinimal.getAvatarUrl());
        Assert.assertEquals("Robin Malhotra", userMinimal.getFullName());
        Assert.assertEquals(6, userMinimal.getId().longValue());
        Assert.assertEquals(148950212000L, userMinimal.getLastActiveAt().longValue());
        Assert.assertEquals(148950212000L, userMinimal.getLastSeenAt().longValue());
    }

    @Test
    public void test2() throws Exception {
        String userMinimalResponse = "{\n" +
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": \"2017-04-27T20:01:16+00:00\",\n" +
                "                \"lastSeenAt\": \"2017-04-27T20:01:16+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1493323276\",\n" +
                "                \"presenceChannel\": \"user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@b8b00e42aed4662afcc068f7acb9c0ef549c6699\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            }";

        UserMinimalParser userMinimalParser = new UserMinimalParser();
        UserMinimal userMinimal = userMinimalParser.parse(userMinimalResponse);

        Assert.assertEquals("user_presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@b8b00e42aed4662afcc068f7acb9c0ef549c6699", userMinimal.getPresenceChannel());
    }
}