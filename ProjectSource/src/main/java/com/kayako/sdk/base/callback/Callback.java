package com.kayako.sdk.base.callback;

import com.kayako.sdk.error.KayakoException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public interface Callback {

    void onFailure(KayakoException exception);
}
