package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class CategoryRequester implements Requester {

    public static final String ENDPOINT = "/api/v1/categories.json";
    public static final String INCLUDE = "localeField";

    private Map<String, String> queryParams;

    public CategoryRequester(int offset, int limit) {
        queryParams = new HashMap<String, String>();
        queryParams.put(ARG_OFFSET, String.valueOf(offset));
        queryParams.put(ARG_LIMIT, String.valueOf(limit));
    }

    public String request(String helpDeskUrl) throws IOException {
        return RequesterUtils.getSync(helpDeskUrl, ENDPOINT, INCLUDE, null, null);
    }

    public void request(String helpDeskUrl, RequestCallback callback) {
        RequesterUtils.getAsync(helpDeskUrl, ENDPOINT, INCLUDE, null, null, callback);
    }
}
