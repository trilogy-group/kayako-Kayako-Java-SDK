package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 26/08/16
 */
public class SearchArticleRequester implements ListRequester {
    private static final String ENDPOINT = "/api/v1/helpcenter/search";
    private static final String INCLUDE = "localeField,category,section,article,userMinimal";

    private static final String ARG_IN = "in";
    private static final String ARG_VALUE_ARTICLES = "articles";
    private static final String ARG_QUERY = "query";

    private String mHelpCenterUrl;
    private String mQuery;
    private Map<String, String> queryParameters;

    private SearchArticleRequester() {
    }

    public SearchArticleRequester(String helpCenterUrl, String query, int offset, int limit) {
        mQuery = query;
        mHelpCenterUrl = helpCenterUrl;
        queryParameters = new HashMap<String, String>();
        queryParameters.put(ARG_OFFSET, String.valueOf(offset));
        queryParameters.put(ARG_LIMIT, String.valueOf(limit));
        queryParameters.put(ARG_QUERY, mQuery);
        queryParameters.put(ARG_IN, ARG_VALUE_ARTICLES);
    }

    public Response request() throws IOException {
        return RequesterUtils.getSync(mHelpCenterUrl, ENDPOINT, INCLUDE, null, queryParameters);
    }

    public void request(RequestCallback callback) {
        RequesterUtils.getAsync(mHelpCenterUrl, ENDPOINT, INCLUDE, null, queryParameters, callback);
    }
}
