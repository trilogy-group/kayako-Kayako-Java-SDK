package com.kayako.sdk.base.requester;

import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class CommonRequester implements ListRequester, ItemRequester {

    private RequestProperty mRequestProperty;

    public CommonRequester(RequestProperty requester) {
        mRequestProperty = requester;
    }

    public Response request() throws IOException {
        switch (mRequestProperty.getMethod()) {
            case GET:
                GetRequestProperty getRequester = (GetRequestProperty) mRequestProperty;
                return RequesterUtils.getSync(getRequester.getHelpCenterUrl(), getRequester.getEndpointUrl(), getRequester.getInclude(), getRequester.getHeaders(), getRequester.getQueryParameters());
            case POST:
                PostRequestProperty postRequester = (PostRequestProperty) mRequestProperty;
                return RequesterUtils.postSync(postRequester.getHelpCenterUrl(), postRequester.getEndpointUrl(), postRequester.getInclude(), postRequester.getHeaders(), postRequester.getQueryParameters(), postRequester.getBodyParameters());
            default:
                throw new IllegalArgumentException("Only GET and POST is supported as of now");
        }
    }

    public void request(RequestCallback callback) {
        switch (mRequestProperty.getMethod()) {
            case GET:
                GetRequestProperty getRequester = (GetRequestProperty) mRequestProperty;
                RequesterUtils.getAsync(getRequester.getHelpCenterUrl(), getRequester.getEndpointUrl(), getRequester.getInclude(), getRequester.getHeaders(), getRequester.getQueryParameters(), callback);
                break;
            case POST:
                PostRequestProperty postRequester = (PostRequestProperty) mRequestProperty;
                RequesterUtils.postAsync(postRequester.getHelpCenterUrl(), postRequester.getEndpointUrl(), postRequester.getInclude(), postRequester.getHeaders(), postRequester.getQueryParameters(), postRequester.getBodyParameters(), callback);
                break;
            default:
                throw new IllegalArgumentException("Only GET and POST is supported as of now");
        }
    }
}
