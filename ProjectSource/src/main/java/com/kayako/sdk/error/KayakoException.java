package com.kayako.sdk.error;

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


    public KayakoException(String message, ErrorCode code, ResponseMessages responseMessages) {
        super(message);
        this.message = message;
        this.code = code;
        this.responseMessages = responseMessages;
    }

    /**
     * @return message to show the user
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return code to identify type of failure  (For Developers)
     */
    public ErrorCode getCode() {
        return code;
    }

    /**
     * @return Contains all the notifications, logs and errors returned in API response (For Developers)
     */
    public ResponseMessages getResponseMessages() {
        return responseMessages;
    }
}
