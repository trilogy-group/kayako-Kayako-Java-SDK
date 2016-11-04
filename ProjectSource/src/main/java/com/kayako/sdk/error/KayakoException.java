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
     * The error code that explains the generic reason for failure to perform action
     */
    private ErrorCode code;

    /**
     * Contains all the notifications, logs and errors in a response
     */
    private ResponseMessages responseMessages;


    public KayakoException(ErrorCode code, String message,
                           ResponseMessages responseMessages) {
        super(message);
        this.message = message;
        this.code = code;
        this.responseMessages = responseMessages;
    }

    /**
     * @return code to identify response of failure
     */
    public ErrorCode getCode() {
        return code;
    }

    /**
     * @return message explaining reason for failure
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return Contains all the notifications, logs and errors returned in API response
     */
    public ResponseMessages getResponseMessages() {
        return responseMessages;
    }
}
