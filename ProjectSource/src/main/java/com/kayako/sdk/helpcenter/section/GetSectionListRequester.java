package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.base.requester.CommonRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Requester;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class GetSectionListRequester implements Requester {
    public static final String ENDPOINT = "/api/v1/sections.json";
    public static final String INCLUDE = "localeField,category";

    private static final String ARG_CATEGORY_ID = "category_id";
    private static final String ARG_OFFSET = "offset";
    private static final String ARG_LIMIT = "limit";

    private String mHelpCenterUrl;
    private long mCategoryId;
    private Map<String, String> mQueryParams;

    private GetSectionListRequester() {
    }

    public GetSectionListRequester(String helpCenterUrl, long categoryId, int offset, int limit) {
        mHelpCenterUrl = helpCenterUrl;
        mCategoryId = categoryId;
        mQueryParams = new HashMap<String, String>();
        mQueryParams.put(ARG_CATEGORY_ID, String.valueOf(mCategoryId));
        mQueryParams.put(ARG_OFFSET, String.valueOf(offset));
        mQueryParams.put(ARG_LIMIT, String.valueOf(limit));
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
        return mQueryParams;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }
}
