package com.kayako.sdk.error;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public enum ErrorCode {

    /**
     * When new error states are introduced on the server side, they will be grouped under OTHER
     */
    SERVER_ERROR,

    /**
     * When new error states are introduced on the server side, they will be grouped under OTHER
     */
    OTHER,

    /**
     * Error States prefixed with INTERNAL_ are exceptions that are local in nature and not
     */
    INTERNAL_UNABLE_TO_CONNECT_TO_SERVER,
    INTERNAL_UNABLE_TO_PARSE_RESPONSE;

}
