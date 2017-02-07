package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class GetArticleListRequester implements ListRequester {

    public static final String ENDPOINT = "/api/v1/articles.json";
    public static final String INCLUDE = "localeField,category,section,userMinimal";
    private static final String ARG_SECTION_ID = "section_id";

    private long mSectionId;
    private String mHelpCenterUrl;
    private Map<String, String> queryParams;

    public GetArticleListRequester(String helpCenterUrl, long sectionId, int offset, int limit) {
        mSectionId = sectionId;
        mHelpCenterUrl = helpCenterUrl;
        queryParams = new HashMap<String, String>();
        queryParams.put(ARG_SECTION_ID, String.valueOf(mSectionId));
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
