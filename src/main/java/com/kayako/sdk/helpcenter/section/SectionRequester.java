package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class SectionRequester implements Requester {
    public static final String ENDPOINT = "/api/v1/sections.json";
    public static final String INCLUDE = "localeField,category";
    private static final String ARG_CATEGORY_ID = "category_id";

    private long mCategoryId;
    private Map<String, String> queryParams;

    private SectionRequester() {
    }

    public SectionRequester(long categoryId, int offset, int limit) {
        mCategoryId = categoryId;
        queryParams = new HashMap<String, String>();
        queryParams.put(ARG_CATEGORY_ID, String.valueOf(mCategoryId));
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
