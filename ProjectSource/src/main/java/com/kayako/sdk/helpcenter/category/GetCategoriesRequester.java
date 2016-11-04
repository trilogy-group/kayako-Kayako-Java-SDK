package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class GetCategoriesRequester implements ListRequester {

    public static final String ENDPOINT = "/api/v1/categories.json";
    public static final String INCLUDE = "localeField";

    private Map<String, String> mQueryParams;
    private String mHelpDeskUrl;

    public GetCategoriesRequester(String helpDeskUrl, int offset, int limit) {
        mQueryParams = new HashMap<String, String>();
        mQueryParams.put(ARG_OFFSET, String.valueOf(offset));
        mQueryParams.put(ARG_LIMIT, String.valueOf(limit));
        mHelpDeskUrl = helpDeskUrl;
    }

    public Response request() throws IOException {
        return RequesterUtils.getSync(mHelpDeskUrl, ENDPOINT, INCLUDE, null, mQueryParams);
    }

    public void request(RequestCallback callback) {
        RequesterUtils.getAsync(mHelpDeskUrl, ENDPOINT, INCLUDE, null, mQueryParams, callback);
    }
}
