package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.base.requester.ItemRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class GetSectionRequester implements ItemRequester {
    public static final String ENDPOINT = "/api/v1/sections/%s";
    public static final String INCLUDE = "localeField,category";

    private String mHelpCenterUrl;
    private long mSectionId;

    private GetSectionRequester() {
    }

    public GetSectionRequester(String helpCenterUrl, long sectionId) {
        mHelpCenterUrl = helpCenterUrl;
        mSectionId = sectionId;
    }

    public Response request() throws IOException {
        return RequesterUtils.getSync(mHelpCenterUrl, String.format(ENDPOINT, mSectionId), INCLUDE, null, null);
    }

    public void request(RequestCallback callback) {
        RequesterUtils.getAsync(mHelpCenterUrl, String.format(ENDPOINT, mSectionId), INCLUDE, null, null, callback);
    }
}
