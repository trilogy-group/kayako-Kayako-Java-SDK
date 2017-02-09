package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.requester.*;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class GetArticleRequester implements Requester {

    public static final String ENDPOINT = "/api/v1/articles/%s";
    public static final String INCLUDE = "localeField,category,section,userMinimal";

    private long mArticleId;
    private String mHelpCenterUrl;

    public GetArticleRequester(String helpCenterUrl, long articleId) {
        mArticleId = articleId;
        mHelpCenterUrl = helpCenterUrl;
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
        return String.format(ENDPOINT, mArticleId);
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
