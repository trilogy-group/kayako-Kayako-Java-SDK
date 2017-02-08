package com.kayako.sdk.error;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public enum ErrorCode {

    /**
     * 3xx Status Code
     */
    EXTERNAL_REDIRECTION_ERROR,

    /**
     * 4xx Status Code
     */
    EXTERNAL_CLIENT_ERROR,

    /**
     * 5xx Http Status Code
     */
    EXTERNAL_SERVER_ERROR,


    /**
     * Error States prefixed with INTERNAL_ are exceptions that are local in nature and does not involve server
     */
    INTERNAL_UNABLE_TO_CONNECT_TO_SERVER,
    INTERNAL_UNABLE_TO_PARSE_RESPONSE,

    /**
     * When new or uncovered error states are introduced, they will be grouped under OTHER until the next version of SDK covers it
     */
    OTHER;

}
