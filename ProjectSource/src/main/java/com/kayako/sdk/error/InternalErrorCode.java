package com.kayako.sdk.error;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public enum InternalErrorCode {
    /**
     * Error States prefixed with INTERNAL_ are exceptions that are local in nature and does not involve server
     */
    INTERNAL_UNABLE_TO_CONNECT_TO_SERVER,
    INTERNAL_UNABLE_TO_PARSE_RESPONSE;

}
