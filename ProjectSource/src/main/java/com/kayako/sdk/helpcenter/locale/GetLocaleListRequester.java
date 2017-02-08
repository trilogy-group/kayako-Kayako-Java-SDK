package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class GetLocaleListRequester implements ListRequester {

    public static final String ENDPOINT = "/api/v1/locales.json";
    public static final String INCLUDE = "locale";

    private String mHelpCenterUrl;

    public GetLocaleListRequester(String helpCenterUrl) {
        mHelpCenterUrl = helpCenterUrl;
    }

    public Response request() throws IOException {
        return RequesterUtils.getSync(mHelpCenterUrl, ENDPOINT, INCLUDE, null, null);
    }

    public void request(RequestCallback callback) {
        RequesterUtils.getAsync(mHelpCenterUrl, ENDPOINT, INCLUDE, null, null, callback);
    }
}
