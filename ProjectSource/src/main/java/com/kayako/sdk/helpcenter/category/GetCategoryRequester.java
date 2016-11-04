package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.base.requester.ItemRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class GetCategoryRequester implements ItemRequester {

    public static final String ENDPOINT = "/api/v1/categories/%s";
    public static final String INCLUDE = "localeField";

    private String mHelpDeskUrl;
    private Long mId;

    public GetCategoryRequester(String helpDeskUrl, long id) {
        mHelpDeskUrl = helpDeskUrl;
        mId = id;
    }

    public Response request() throws IOException {
        return RequesterUtils.getSync(mHelpDeskUrl, String.format(ENDPOINT, mId), INCLUDE, null, null);
    }

    public void request(RequestCallback callback) {
        RequesterUtils.getAsync(mHelpDeskUrl, ENDPOINT, INCLUDE, null, null, callback);
    }
}
