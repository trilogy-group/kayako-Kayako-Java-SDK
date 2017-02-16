package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.requester.GetRequestProperty;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class GetLocaleListRequester extends GetRequestProperty {

    public static final String ENDPOINT = "/api/v1/locales.json";
    public static final String INCLUDE = "locale";

    private String mHelpCenterUrl;

    public GetLocaleListRequester(String helpCenterUrl) {
        mHelpCenterUrl = helpCenterUrl;
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpCenterUrl;
    }

    @Override
    public String getInclude() {
        return INCLUDE;
    }

    @Override
    public String getEndpointUrl() {
        return ENDPOINT;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }

}
