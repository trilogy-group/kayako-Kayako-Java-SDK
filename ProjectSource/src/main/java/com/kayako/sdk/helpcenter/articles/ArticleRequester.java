package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class ArticleRequester implements Requester {

    public static final String ENDPOINT = "/api/v1/articles.json";
    public static final String INCLUDE = "localeField,category,section,userMinimal";
    private static final String ARG_SECTION_ID = "section_id";

    private long mSectionId;
    private Map<String, String> queryParams;

    public ArticleRequester(long sectionId, int offset, int limit) {
        mSectionId = sectionId;
        queryParams = new HashMap<String, String>();
        queryParams.put(ARG_SECTION_ID, String.valueOf(mSectionId));
        queryParams.put(ARG_OFFSET, String.valueOf(offset));
        queryParams.put(ARG_LIMIT, String.valueOf(limit));
    }

    public String request(String helpDeskUrl) throws IOException {
        return RequesterUtils.getSync(helpDeskUrl, ENDPOINT, INCLUDE, null, queryParams);
    }

    public void request(String helpDeskUrl, RequestCallback callback) {
        RequesterUtils.getAsync(helpDeskUrl, ENDPOINT, INCLUDE, null, queryParams, callback);
    }

}