package com.kayako.sdk.error.response;

/**
 * Notifications are intended for end users (and are localized).
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class Notification implements ResponseResource {

    public String type;

    public String message;

    public boolean sticky;

    public Notification(String type, String message, boolean sticky) {
        this.type = type;
        this.message = message;
        this.sticky = sticky;
    }

    @Override
    public Type getType() {
        return Type.NOTIFICATION;
    }
}
