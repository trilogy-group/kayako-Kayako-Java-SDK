package com.kayako.sdk.base.requester;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface Requester {

    String getHelpCenterUrl();

    String getInclude();

    String getEndpointUrl();

    Map<String, String> getQueryParameters();

    Map<String, String> getHeaders();

}
