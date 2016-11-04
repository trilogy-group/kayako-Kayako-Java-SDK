package com.kayako.sdk.base.requester;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface Requester {
    String ARG_OFFSET = "offset";
    String ARG_LIMIT = "limit";

    Response request(String helpDeskUrl) throws IOException;

    void request(String helpDeskUrl, RequestCallback callback);
}
