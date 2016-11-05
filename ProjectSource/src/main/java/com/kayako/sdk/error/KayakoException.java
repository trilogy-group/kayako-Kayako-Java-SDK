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
     * Contains all the notifications, logs and errors returned in the APU response (External)
     */
    private ResponseMessages responseMessages;

    /**
     * Contains the throwable that caused the error (Internal)
     */
    private Throwable throwable;


    /**
     * Constructor for Exceptions caused after making a successful request (provided by Server)
     *
     * @param code
     * @param message
     * @param responseMessages
     */
    public KayakoException(ErrorCode code, String message,
                           ResponseMessages responseMessages) {
        super(message);
        this.message = message;
        this.code = code;
        this.responseMessages = responseMessages;
    }

    /**
     * Constructor for Exceptions caused in the app
     *
     * @param code
     * @param message
     * @param throwable
     */
    public KayakoException(ErrorCode code, String message,
                           Throwable throwable) {
        super(message);
        this.message = message;
        this.code = code;
        this.throwable = throwable;
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
     * @return responseMessages (notifications, logs and errors returned in API response)
     */
    public ResponseMessages getResponseMessages() {
        return responseMessages;
    }

    /**
     * @return throwable that caused the internal error
     */
    public Throwable getThrowable() {
        return throwable;
    }
}
