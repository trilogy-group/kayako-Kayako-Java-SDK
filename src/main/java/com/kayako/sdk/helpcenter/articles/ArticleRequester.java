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
    public static final String INCLUDE = "localeField";
    private static final String ARG_SECTION_ID = "section_id";

    private long mSectionId;

    private ArticleRequester() {
    }

    public ArticleRequester(long sectionId) {
        mSectionId = sectionId;
    }

    @Override
    public String request(String helpDeskUrl) throws IOException {

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put(ARG_SECTION_ID, String.valueOf(mSectionId));

        return RequesterUtils.get(helpDeskUrl, ENDPOINT, INCLUDE, null, queryParams);
    }
}
