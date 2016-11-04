package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class GetSectionListRequester implements ListRequester {
    public static final String ENDPOINT = "/api/v1/sections.json";
    public static final String INCLUDE = "localeField,category";
    private static final String ARG_CATEGORY_ID = "category_id";

    private String mHelpCenterUrl;
    private long mCategoryId;
    private Map<String, String> queryParams;

    private GetSectionListRequester() {
    }

    public GetSectionListRequester(String helpCenterUrl, long categoryId, int offset, int limit) {
        mHelpCenterUrl = helpCenterUrl;
        mCategoryId = categoryId;
        queryParams = new HashMap<String, String>();
        queryParams.put(ARG_CATEGORY_ID, String.valueOf(mCategoryId));
        queryParams.put(ARG_OFFSET, String.valueOf(offset));
        queryParams.put(ARG_LIMIT, String.valueOf(limit));
    }

    public Response request() throws IOException {
        return RequesterUtils.getSync(mHelpCenterUrl, ENDPOINT, INCLUDE, null, queryParams);
    }

    public void request(RequestCallback callback) {
        RequesterUtils.getAsync(mHelpCenterUrl, ENDPOINT, INCLUDE, null, queryParams, callback);
    }
}
