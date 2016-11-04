package com.kayako.sdk.error;

import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.error.response.*;
import com.kayako.sdk.error.response.Error;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class ParserFactory {

    // Category
    public static ListParser<Error> getErrorListParser() {
        return new ErrorListParser();
    }

    public static Parser<Error> getErrorParser() {
        return new ErrorListParser();
    }


    public static ListParser<Notification> getNotificationListParser() {
        return new NotificationListParser();
    }

    public static Parser<Notification> getNotificationParser() {
        return new NotificationListParser();
    }


    public static ListParser<Log> getLogListParser() {
        return new LogListParser();
    }

    public static Parser<Log> getLogParser() {
        return new LogListParser();
    }

}
