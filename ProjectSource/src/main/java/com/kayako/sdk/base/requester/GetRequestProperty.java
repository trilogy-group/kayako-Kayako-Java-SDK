package com.kayako.sdk.base.requester;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public interface GetRequestProperty extends RequestProperty {

    String getHelpCenterUrl();

    String getInclude();

    String getEndpointUrl();

    Map<String, String> getQueryParameters();

    Map<String, String> getHeaders();
}
