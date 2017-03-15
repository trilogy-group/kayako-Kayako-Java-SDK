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
}