package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class CategoryRequester implements Requester {

    public static final String ENDPOINT = "/api/v1/categories.json";
    public static final String INCLUDE = "localeField";

    @Override
    public String request(String helpDeskUrl) throws IOException {
        return RequesterUtils.get(helpDeskUrl, ENDPOINT, INCLUDE, null, null);
    }
}
