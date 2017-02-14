package com.kayako.sdk.mockserver.base;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/02/17
 */
public abstract class BaseSampleResponse implements ISampleResponse {

    public abstract String getMethod();

    public abstract String getRequestUrl();

    public abstract int getStatusCode();

    public abstract String getBody();

    private URL getUrl() {
        try {
            return new URL(getRequestUrl());
        } catch (MalformedURLException e) {
            throw new AssertionError("Can't breakup Request URL");
        }
    }

    public String getPath() {
        return getUrl().getPath();
    }

    public Map<String, String> getQueryParameters() {
        Map<String, String> queryParameters = new HashMap<>();

        String[] parts = getUrl().getQuery().split("&");
        for (String part : parts) {
            String[] keyValue = part.split("=");
            queryParameters.put(keyValue[0], keyValue[1]);
        }
        return queryParameters;
    }
}
