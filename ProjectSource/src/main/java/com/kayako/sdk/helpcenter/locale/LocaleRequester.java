package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.requester.ItemRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class LocaleRequester implements ItemRequester {

    public static final String ENDPOINT = "/api/v1/locales/%s";
    public static final String INCLUDE = "locale";

    private String mHelpCenterUrl;
    private long mLocaleId;


    public LocaleRequester(String helpCenterUrl, long localeId) {
        mHelpCenterUrl = helpCenterUrl;
        mLocaleId = localeId;
    }

    @Override
    public Response request() throws IOException {
        return RequesterUtils.getSync(mHelpCenterUrl, String.format(ENDPOINT, mLocaleId), INCLUDE, null, null);
    }

    @Override
    public void request(RequestCallback callback) {
        RequesterUtils.getAsync(mHelpCenterUrl, String.format(ENDPOINT, mLocaleId), INCLUDE, null, null, callback);
    }
}
