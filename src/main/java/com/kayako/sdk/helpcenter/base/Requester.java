package com.kayako.sdk.helpcenter.base;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface Requester {
    String ARG_OFFSET = "offset";
    String ARG_LIMIT = "limit";

    String request(String helpDeskUrl) throws IOException;

    void request(String helpDeskUrl, RequestCallback callback);

    interface RequestCallback {
        void onSuccess(String jsonResponse);

        void onFailure(Throwable error);
    }
}
