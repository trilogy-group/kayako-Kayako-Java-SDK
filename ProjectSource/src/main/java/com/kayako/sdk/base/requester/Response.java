package com.kayako.sdk.base.requester;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class Response {

    public int statusCode;

    public String body;

    public Response(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }
}
