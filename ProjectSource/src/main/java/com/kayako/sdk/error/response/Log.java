package com.kayako.sdk.error.response;

/**
 * Logs are to be logged by API clients and are intended for their developers and maintainers.
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class Log implements ResponseResource {

    public String level;

    public String message;

    public Log(String level, String message) {
        this.level = level;
        this.message = message;
    }

    @Override
    public Type getResponseMessageType() {
        return Type.LOG;
    }

    @Override
    public String toString() {
        return "Log{" +
                "level='" + level + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
