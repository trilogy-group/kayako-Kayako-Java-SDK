package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.requester.*;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class GetArticleRequester extends GetRequestProperty {

    public static final String ENDPOINT = "/api/v1/articles/%s";

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
    public IncludeArgument getInclude() {
        return new ArticleIncludeArgument();
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
