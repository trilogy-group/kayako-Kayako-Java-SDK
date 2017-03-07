package com.kayako.sdk.utils;

import org.junit.Assert;
import org.junit.Test;

import static com.kayako.sdk.utils.IsoTimeFormatUtils.getTimeInMillisecondsFromIso8601String;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class IsoTimeFormatUtilsTest {

    @Test
    public void testIsoDates() throws Exception {
        // Converted using http://coderstoolbox.net/unixtimestamp/
        Assert.assertNotNull(getTimeInMillisecondsFromIso8601String("2017-02-08T12:59:31+05:30"));
        Assert.assertNotNull(getTimeInMillisecondsFromIso8601String("2016-10-13T00:36:11Z"));

        Assert.assertEquals(1476318971000L, getTimeInMillisecondsFromIso8601String("2016-10-13T00:36:11Z").longValue());
        Assert.assertEquals(1486538971000L, getTimeInMillisecondsFromIso8601String("2017-02-08T12:59:31+05:30").longValue());
    }
}