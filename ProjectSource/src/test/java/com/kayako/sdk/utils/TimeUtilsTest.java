package com.kayako.sdk.utils;

import org.junit.Assert;
import org.junit.Test;

import static com.kayako.sdk.utils.TimeUtils.getIso8601StringToUnixTimestamp;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class TimeUtilsTest {

    @Test
    public void testIsoDates() throws Exception {
        // Converted using http://coderstoolbox.net/unixtimestamp/
        Assert.assertNotNull(getIso8601StringToUnixTimestamp("2017-02-08T12:59:31+05:30"));
        Assert.assertEquals(1486538971000L, getIso8601StringToUnixTimestamp("2017-02-08T12:59:31+05:30").longValue());
        Assert.assertEquals(1476318971000L, getIso8601StringToUnixTimestamp("2016-10-13T00:36:11Z").longValue());
    }
}