package com.kayako.sdk.error;

import com.sun.istack.internal.Nullable;
import com.sun.javafx.beans.annotations.NonNull;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class KayakoException extends Exception {

    /**
     * Message to show the user
     */
    private String message;

    /**
     * The error code that explains the reason for failure to perform action
     */
    private ErrorCode code;

    /**
     * Contains all the notifications, logs and errors in a response
     */
    private ResponseMessages responseMessages;


    public KayakoException(@NonNull ErrorCode code, @Nullable String message, @Nullable ResponseMessages responseMessages) {
        super(message);
        this.message = message;
        this.code = code;
        this.responseMessages = responseMessages;
    }

    /**
     * @return code to identify type of failure  (For Developers)
     */
    @NonNull
    public ErrorCode getCode() {
        return code;
    }

    /**
     * @return message to show the user
     */
    @Nullable
    public String getMessage() {
        return message;
    }

    /**
     * @return Contains all the notifications, logs and errors returned in API response (For Developers)
     */
    @Nullable
    public ResponseMessages getResponseMessages() {
        return responseMessages;
    }
}
