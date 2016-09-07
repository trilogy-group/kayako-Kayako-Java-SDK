package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 26/08/16
 */
public class SearchArticleRequester implements Requester {
    private static final String ENDPOINT = "/api/v1/helpcenter/search";
    private static final String INCLUDE = "locale_field,category,section,article";

    private static final String ARG_IN = "in";
    private static final String ARG_VALUE_ARTICLES = "articles";
    private static final String ARG_QUERY = "query";

    private String mQuery;
    private Map<String, String> queryParameters;

    private SearchArticleRequester() {
    }

    public SearchArticleRequester(String query, int offset, int limit) {
        mQuery = query;
        queryParameters = new HashMap<String, String>();
        queryParameters.put(ARG_OFFSET, String.valueOf(offset));
        queryParameters.put(ARG_LIMIT, String.valueOf(limit));
        queryParameters.put(ARG_QUERY, mQuery);
        queryParameters.put(ARG_IN, ARG_VALUE_ARTICLES);
    }

    public String request(String helpDeskUrl) throws IOException {
        return RequesterUtils.getSync(helpDeskUrl, ENDPOINT, INCLUDE, null, queryParameters);
    }

    public void request(String helpDeskUrl, RequestCallback callback) {
        RequesterUtils.getAsync(helpDeskUrl, ENDPOINT, INCLUDE, null, queryParameters, callback);
    }
}
