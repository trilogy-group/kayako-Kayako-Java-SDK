package com.kayako.sdk.mockserver.base;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/02/17
 */
public interface ISampleResponse {

    // REQUEST
    String getMethod();

    String getPath();

    Map<String, String> getQueryParameters();

    // RESPONSE

    int getStatusCode();

    String getBody();
}
