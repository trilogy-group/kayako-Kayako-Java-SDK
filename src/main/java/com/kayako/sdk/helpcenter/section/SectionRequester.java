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
    public static final String INCLUDE = "localeField";
    private static final String ARG_CATEGORY_ID = "category_id";

    private long mCategoryId;

    private SectionRequester() {
    }

    public SectionRequester(long categoryId) {
        mCategoryId = categoryId;
    }

    @Override
    public String request(String helpDeskUrl) throws IOException {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put(ARG_CATEGORY_ID, String.valueOf(mCategoryId));

        return RequesterUtils.get(helpDeskUrl, ENDPOINT, INCLUDE, null, queryParams);
    }
}
