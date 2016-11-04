package com.kayako.sdk.error;

import com.kayako.sdk.error.type.Error;
import com.kayako.sdk.error.type.Log;
import com.kayako.sdk.error.type.Notification;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class ResponseMessages {

    private List<Notification> notifications;

    private List<Error> errors;

    private List<Log> logs;

    /**
     * @return list of notification-type response messages
     */
    public List<Notification> getNotifications() {
        if (notifications == null) {
            return new ArrayList<>();
        }
        return notifications;
    }

    /**
     * @param notifications notification-type response messages
     */
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    /**
     * @return list of error-type response messages
     */
    public List<Error> getErrors() {
        if (errors == null) {
            return new ArrayList<>();
        }
        return errors;
    }

    /**
     * @param errors error-type response messages
     */
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    /**
     * @return list of log-type response messages
     */
    public List<Log> getLogs() {
        if (logs == null) {
            return new ArrayList<>();
        }
        return logs;
    }

    /**
     * @param logs log-type response messages
     */
    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }
}
