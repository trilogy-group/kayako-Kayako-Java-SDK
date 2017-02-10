package com.kayako.sdk.base.requester;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
interface RequestProperty {

    enum METHOD {
        GET, PUT, POST, DELETE
    }

    METHOD getMethod();
}
