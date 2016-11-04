package com.kayako.sdk.error;

import com.kayako.sdk.error.response.Error;
import com.kayako.sdk.error.response.Log;
import com.kayako.sdk.error.response.Notification;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class ResponseMessages {

    private int statusCode;

    private List<Notification> notifications;

    private List<Error> errors;

    private List<Log> logs;

    public ResponseMessages(int statusCode, List<Notification> notifications, List<Error> errors, List<Log> logs) {
        this.statusCode = statusCode;
        this.notifications = notifications;
        this.errors = errors;
        this.logs = logs;
    }

    /**
     * @return Http Status code
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * @return list of notification-response response messages
     */
    public List<Notification> getNotifications() {
        if (notifications == null) {
            return new ArrayList<>();
        }
        return notifications;
    }

    /**
     * @param notifications notification-response response messages
     */
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    /**
     * @return list of error-response response messages
     */
    public List<Error> getErrors() {
        if (errors == null) {
            return new ArrayList<>();
        }
        return errors;
    }

    /**
     * @param errors error-response response messages
     */
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    /**
     * @return list of log-response response messages
     */
    public List<Log> getLogs() {
        if (logs == null) {
            return new ArrayList<>();
        }
        return logs;
    }

    /**
     * @param logs log-response response messages
     */
    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }
}
