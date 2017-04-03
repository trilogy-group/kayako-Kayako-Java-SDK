package com.kayako.sdk.base.requester;

import com.kayako.sdk.utils.RequesterUtils;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class CommonRequester implements Requester {

    private RequestProperty mRequestProperty;

    public CommonRequester(RequestProperty requester) {
        mRequestProperty = requester;
    }

    public Response request() throws IOException {
        switch (mRequestProperty.getMethod()) {
            case GET:
                GetRequestProperty getRequester = (GetRequestProperty) mRequestProperty;
                return RequesterUtils.getSync(getRequester.getHelpCenterUrl(), getRequester.getEndpointUrl(), getRequester.getInclude() == null ? null : getRequester.getInclude().toString(), getRequester.getHeaders(), getRequester.getQueryParameters());

            case POST:
                PostRequestProperty postRequester = (PostRequestProperty) mRequestProperty;
                return RequesterUtils.postSync(postRequester.getHelpCenterUrl(), postRequester.getEndpointUrl(), postRequester.getInclude() == null ? null : postRequester.getInclude().toString(), postRequester.getHeaders(), postRequester.getQueryParameters(), postRequester.getBodyParameters());

            case PUT:
                PutRequestProperty putRequester = (PutRequestProperty) mRequestProperty;
                return RequesterUtils.putSync(putRequester.getHelpCenterUrl(), putRequester.getEndpointUrl(), putRequester.getInclude() == null ? null : putRequester.getInclude().toString(), putRequester.getHeaders(), putRequester.getQueryParameters(), putRequester.getBodyParameters());

            default:
                throw new IllegalArgumentException("Only GET, POST and PUT is supported as of now");
        }
    }

    public void request(RequestCallback callback) {
        switch (mRequestProperty.getMethod()) {
            case GET:
                GetRequestProperty getRequester = (GetRequestProperty) mRequestProperty;
                RequesterUtils.getAsync(getRequester.getHelpCenterUrl(), getRequester.getEndpointUrl(), getRequester.getInclude().toString(), getRequester.getHeaders(), getRequester.getQueryParameters(), callback);
                break;

            case POST:
                PostRequestProperty postRequester = (PostRequestProperty) mRequestProperty;
                RequesterUtils.postAsync(postRequester.getHelpCenterUrl(), postRequester.getEndpointUrl(), postRequester.getInclude().toString(), postRequester.getHeaders(), postRequester.getQueryParameters(), postRequester.getBodyParameters(), callback);
                break;

            case PUT:
                PutRequestProperty putRequester = (PutRequestProperty) mRequestProperty;
                RequesterUtils.putAsync(putRequester.getHelpCenterUrl(), putRequester.getEndpointUrl(), putRequester.getInclude().toString(), putRequester.getHeaders(), putRequester.getQueryParameters(), putRequester.getBodyParameters(), callback);
                break;

            default:
                throw new IllegalArgumentException("Only GET, POST and PUT is supported as of now");
        }
    }
}
