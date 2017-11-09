package com.kayako.sdk.base.requester;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public abstract class GetRequestProperty implements RequestProperty {

    public abstract String getHelpCenterUrl();

    public abstract String getEndpointUrl();

    public abstract Map<String, String> getQueryParameters();

    public abstract Map<String, String> getHeaders();

    public abstract IncludeArgument getInclude();

    @Override
    public METHOD getMethod() {
        return METHOD.GET;
    }
}
