package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.requester.GetRequestProperty;
import com.kayako.sdk.base.requester.IncludeArgument;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class GetLocaleRequester extends GetRequestProperty {

    public static final String ENDPOINT = "/api/v1/locales/%s";

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
    public IncludeArgument getInclude() {
        return new LocaleIncludeArgument();
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
