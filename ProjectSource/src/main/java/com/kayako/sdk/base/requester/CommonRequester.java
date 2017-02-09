package com.kayako.sdk.base.requester;

import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class CommonRequester implements ListRequester, ItemRequester {

    private Requester mRequester;

    public CommonRequester(Requester requester) {
        mRequester = requester;
    }

    public Response request() throws IOException {
        return RequesterUtils.getSync(mRequester.getHelpCenterUrl(), mRequester.getEndpointUrl(), mRequester.getInclude(), null, mRequester.getQueryParameters());
    }

    public void request(RequestCallback callback) {
        RequesterUtils.getAsync(mRequester.getHelpCenterUrl(), mRequester.getEndpointUrl(), mRequester.getInclude(), null, mRequester.getQueryParameters(), callback);
    }

    @Override
    public String getHelpCenterUrl() {
        return mRequester.getHelpCenterUrl();
    }

    @Override
    public String getInclude() {
        return mRequester.getInclude();
    }

    @Override
    public String getEndpointUrl() {
        return mRequester.getEndpointUrl();
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return mRequester.getQueryParameters();
    }

    @Override
    public Map<String, String> getHeader() {
        return mRequester.getHeader();
    }
}
