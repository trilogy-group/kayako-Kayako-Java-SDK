package com.kayako.sdk.utils;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.error.ErrorCode;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.error.ResponseMessages;
import com.kayako.sdk.error.response.Error;
import com.kayako.sdk.error.response.Log;
import com.kayako.sdk.error.response.Notification;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class ExceptionUtils {

    public static KayakoException generateInternalKayakoException(ErrorCode errorCode, Throwable throwable) {
        return new KayakoException(errorCode, generateErrorMessage(errorCode), throwable);
    }

    public static KayakoException generateExternalKayakoException(int statusCode, String json) {
        ErrorCode errorCode = generateErrorCode(statusCode);
        String message = generateErrorMessage(errorCode);
        ResponseMessages responseMessages = generateResponseMessages(statusCode, json);
        return new KayakoException(errorCode, message, responseMessages);
    }

    public static ResponseMessages generateResponseMessages(int statusCode, String json) {
        ListParser<Notification> notificationListParser = ParserFactory.getNotificationListParser();
        ListParser<Error> errorListParser = ParserFactory.getErrorListParser();
        ListParser<Log> logListParser = ParserFactory.getLogListParser();

        List<Notification> notifications = null;
        List<Error> errors = null;
        List<Log> logs = null;

        if (logListParser.containsList(json)) {
            logs = logListParser.parseList(json);
        }

        if (notificationListParser.containsList(json)) {
            notifications = notificationListParser.parseList(json);
        }

        if (errorListParser.containsList(json)) {
            errors = errorListParser.parseList(json);
        }
        
        return new ResponseMessages(statusCode, notifications, errors, logs);
    }

    public static ErrorCode generateErrorCode(int statusCode) {
        if (statusCode > 300 && statusCode < 399) {
            return ErrorCode.EXTERNAL_REDIRECTION_ERROR;
        } else if (statusCode > 400 && statusCode < 499) {
            return ErrorCode.EXTERNAL_CLIENT_ERROR;
        } else if (statusCode > 500 && statusCode < 599) {
            return ErrorCode.EXTERNAL_SERVER_ERROR;
        } else {
            return ErrorCode.OTHER;
        }
    }

    public static String generateErrorMessage(ErrorCode errorCode) {
        switch (errorCode) {
            case INTERNAL_UNABLE_TO_CONNECT_TO_SERVER:
                return "Unable to connect to server";

            case INTERNAL_UNABLE_TO_PARSE_RESPONSE:
                return "Unable to parse response";

            case EXTERNAL_CLIENT_ERROR:
            case EXTERNAL_REDIRECTION_ERROR:
            case EXTERNAL_SERVER_ERROR:
                return "Network Error";

            case OTHER:
            default:
                return "Failed to make request";
        }
    }
}
