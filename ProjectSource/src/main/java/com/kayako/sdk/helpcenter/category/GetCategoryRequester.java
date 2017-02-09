package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.base.requester.*;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class GetCategoryRequester implements Requester {

    public static final String ENDPOINT = "/api/v1/categories/%s";
    public static final String INCLUDE = "localeField";

    private String mHelpDeskUrl;
    private long mCategoryId;

    public GetCategoryRequester(String helpDeskUrl, long categoryId) {
        mHelpDeskUrl = helpDeskUrl;
        mCategoryId = categoryId;
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
        return String.format(ENDPOINT, mCategoryId);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return null;
    }

    @Override
    public Map<String, String> getHeader() {
        return null;
    }
}
