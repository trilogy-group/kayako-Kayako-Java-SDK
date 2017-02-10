package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.base.requester.GetRequestProperty;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class GetSectionRequester implements GetRequestProperty {
    public static final String ENDPOINT = "/api/v1/sections/%s";
    public static final String INCLUDE = "localeField,category";

    private String mHelpCenterUrl;
    private long mSectionId;

    private GetSectionRequester() {
    }

    public GetSectionRequester(String helpCenterUrl, long sectionId) {
        mHelpCenterUrl = helpCenterUrl;
        mSectionId = sectionId;
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
        return String.format(ENDPOINT, mSectionId);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }

    @Override
    public METHOD getMethod() {
        return METHOD.GET;
    }

}
