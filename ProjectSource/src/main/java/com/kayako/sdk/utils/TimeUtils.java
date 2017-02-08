package com.kayako.sdk.utils;

import org.joda.time.DateTime;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class TimeUtils {

    public static Long getIso8601StringToUnixTimestamp(String dateInIso8601Format) {
        DateTime dateTime = new DateTime(dateInIso8601Format);
        return dateTime.toDateTime().getMillis();
    }
}
