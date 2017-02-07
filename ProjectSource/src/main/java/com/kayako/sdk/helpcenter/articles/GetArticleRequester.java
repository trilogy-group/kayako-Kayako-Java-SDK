package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.requester.ItemRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class GetArticleRequester implements ItemRequester {

    public static final String ENDPOINT = "/api/v1/articles/%s";
    public static final String INCLUDE = "localeField,category,section,userMinimal";
    private static final String ARG_SECTION_ID = "section_id";

    private long mArticleId;
    private String mHelpCenterUrl;

    public GetArticleRequester(String helpCenterUrl, long articleId) {
        mArticleId = articleId;
        mHelpCenterUrl = helpCenterUrl;
    }

    public Response request() throws IOException {
        return RequesterUtils.getSync(mHelpCenterUrl, String.format(ENDPOINT, mArticleId), INCLUDE, null, null);
    }

    public void request(RequestCallback callback) {
        RequesterUtils.getAsync(mHelpCenterUrl, String.format(ENDPOINT, mArticleId), INCLUDE, null, null, callback);
    }

}
