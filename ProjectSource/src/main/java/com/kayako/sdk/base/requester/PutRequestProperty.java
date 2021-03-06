package com.kayako.sdk.base.requester;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public abstract class PutRequestProperty extends GetRequestProperty {

    public abstract Map<String, String> getBodyParameters();

    public METHOD getMethod() {
        return METHOD.PUT;
    }
}
