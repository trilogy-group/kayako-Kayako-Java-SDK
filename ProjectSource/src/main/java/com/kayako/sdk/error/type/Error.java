package com.kayako.sdk.error.type;

/**
 * Errors are intended for API clients (and, therefore, are not localized).
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class Error implements ResponseResource {

    public String code;

    public String parameter;

    public String parameters[];

    public String message;

    public Error(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Error(String code, String parameter, String message) {
        this.code = code;
        this.parameter = parameter;
        this.message = message;
    }

    public Error(String code, String[] parameters, String message) {
        this.code = code;
        this.parameters = parameters;
        this.message = message;
    }

    @Override
    public Type getType() {
        return Type.ERROR;
    }
}
