package com.kayako.sdk.error.type;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public enum Type {
    ERROR,
    NOTIFICATION,
    LOG;

    @Override
    public String toString() {
        switch (this) {
            case ERROR:
                return "Error";
            case NOTIFICATION:
                return "Notification";
            case LOG:
                return "Log";
            default:
                return super.toString();
        }
    }
}
