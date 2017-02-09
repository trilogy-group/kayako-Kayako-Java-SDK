package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.base.requester.CommonRequester;
import com.kayako.sdk.base.requester.Requester;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 26/08/16
 */
public class GetSearchArticleListRequester implements Requester {
    private static final String ENDPOINT = "/api/v1/helpcenter/search";
    private static final String INCLUDE = "localeField,category,section,article,userMinimal";

    private static final String ARG_IN = "in";
    private static final String ARG_VALUE_ARTICLES = "articles";
    private static final String ARG_QUERY = "query";
    private static final String ARG_OFFSET = "offset";
    private static final String ARG_LIMIT = "limit";


    private String mHelpCenterUrl;
    private String mQuery;
    private Map<String, String> mQueryParameters;

    private GetSearchArticleListRequester() {
    }

    public GetSearchArticleListRequester(String helpCenterUrl, String query, int offset, int limit) {
        mQuery = query;
        mHelpCenterUrl = helpCenterUrl;
        mQueryParameters = new HashMap<String, String>();
        mQueryParameters.put(ARG_OFFSET, String.valueOf(offset));
        mQueryParameters.put(ARG_LIMIT, String.valueOf(limit));
        mQueryParameters.put(ARG_QUERY, mQuery);
        mQueryParameters.put(ARG_IN, ARG_VALUE_ARTICLES);
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
        return mQueryParameters;
    }

    @Override
    public Map<String, String> getHeader() {
        return null;
    }
}
