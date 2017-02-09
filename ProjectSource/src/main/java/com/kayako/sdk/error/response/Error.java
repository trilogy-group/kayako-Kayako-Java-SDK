package com.kayako.sdk.error.response;

import java.util.List;

/**
 * Errors are intended for API clients (and, therefore, are not localized).
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class Error implements ResponseResource {

    public String code;

    public String parameter;

    public List<String> parameters;

    public String message;

    public String moreInfo;

    public Error(String code, String message, String moreInfo) {
        this.code = code;
        this.message = message;
        this.moreInfo = moreInfo;
    }

    public Error(String code, String message, String moreInfo, String parameter) {
        this.code = code;
        this.parameter = parameter;
        this.message = message;
        this.moreInfo = moreInfo;
    }

    public Error(String code, String message, String moreInfo, List<String> parameters) {
        this.code = code;
        this.parameters = parameters;
        this.message = message;
        this.moreInfo = moreInfo;
    }

    @Override
    public Type getResponseMessageType() {
        return Type.ERROR;
    }

    @Override
    public String toString() {
        return "Error{" +
                "code='" + code + '\'' +
                ", parameter='" + parameter + '\'' +
                ", parameters=" + parameters +
                ", message='" + message + '\'' +
                ", moreInfo='" + moreInfo + '\'' +
                '}';
    }
}
