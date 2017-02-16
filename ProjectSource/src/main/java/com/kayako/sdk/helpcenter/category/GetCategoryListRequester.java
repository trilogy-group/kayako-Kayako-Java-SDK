package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.base.requester.GetRequestProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class GetCategoryListRequester extends GetRequestProperty {

    public static final String ENDPOINT = "/api/v1/categories.json";
    public static final String INCLUDE = "localeField";
    private static final String ARG_OFFSET = "offset";
    private static final String ARG_LIMIT = "limit";

    private Map<String, String> mQueryParams;
    private String mHelpDeskUrl;

    public GetCategoryListRequester(String helpDeskUrl, int offset, int limit) {
        mQueryParams = new HashMap<String, String>();
        mQueryParams.put(ARG_OFFSET, String.valueOf(offset));
        mQueryParams.put(ARG_LIMIT, String.valueOf(limit));
        mHelpDeskUrl = helpDeskUrl;
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpDeskUrl;
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
        return mQueryParams;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }

}
