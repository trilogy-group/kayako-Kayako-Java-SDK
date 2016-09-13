package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class LocaleRequester implements Requester {

    public static final String ENDPOINT = "/api/v1/locales.json";
    public static final String INCLUDE = "locale";

    // TODO: Test? All 42+ Locales are loaded (no need to specify limit)

    public String request(String helpDeskUrl) throws IOException {
        return RequesterUtils.getSync(helpDeskUrl, ENDPOINT, INCLUDE, null, null);
    }

    public void request(String helpDeskUrl, RequestCallback callback) {
        RequesterUtils.getAsync(helpDeskUrl, ENDPOINT, INCLUDE, null, null, callback);
    }
}
