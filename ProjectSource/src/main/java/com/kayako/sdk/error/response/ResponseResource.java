package com.kayako.sdk.error.response;

import com.kayako.sdk.base.parser.Resource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public interface ResponseResource extends Resource {
    Type getResponseMessageType();
}
