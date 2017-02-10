package com.kayako.sdk.base.requester;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface ItemRequester  {

    Response request() throws IOException;

    void request(RequestCallback callback);
}
