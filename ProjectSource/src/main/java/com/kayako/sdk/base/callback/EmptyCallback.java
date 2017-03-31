package com.kayako.sdk.base.callback;

import com.kayako.sdk.error.KayakoException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 31/03/17
 */
public interface EmptyCallback {
    void onSuccess();

    void onFailure(KayakoException exception);
}
