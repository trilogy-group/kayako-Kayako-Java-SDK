package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.requester.ItemRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Requester;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class GetLocaleRequester implements Requester {

    public static final String ENDPOINT = "/api/v1/locales/%s";
    public static final String INCLUDE = "locale";

    private String mHelpCenterUrl;
    private long mLocaleId;

    public GetLocaleRequester(String helpCenterUrl, long localeId) {
        mHelpCenterUrl = helpCenterUrl;
        mLocaleId = localeId;
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
        return String.format(ENDPOINT, mLocaleId);
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
