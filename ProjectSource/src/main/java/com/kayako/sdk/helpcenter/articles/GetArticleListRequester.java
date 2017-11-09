package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.requester.GetRequestProperty;
import com.kayako.sdk.base.requester.IncludeArgument;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class GetArticleListRequester extends GetRequestProperty {

    public static final String ENDPOINT = "/api/v1/articles.json";
    private static final String ARG_SECTION_ID = "section_id";
    private static final String ARG_OFFSET = "offset";
    private static final String ARG_LIMIT = "limit";

    private long mSectionId;
    private String mHelpCenterUrl;
    private Map<String, String> mQueryParams;

    public GetArticleListRequester(String helpCenterUrl, long sectionId, int offset, int limit) {
        mSectionId = sectionId;
        mHelpCenterUrl = helpCenterUrl;
        mQueryParams = new HashMap<String, String>();
        mQueryParams.put(ARG_SECTION_ID, String.valueOf(mSectionId));
        mQueryParams.put(ARG_OFFSET, String.valueOf(offset));
        mQueryParams.put(ARG_LIMIT, String.valueOf(limit));
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
