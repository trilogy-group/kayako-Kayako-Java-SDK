package com.kayako.sdk.helpcenter.base;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface Requester {
    String request(String helpDeskUrl) throws IOException;
}
