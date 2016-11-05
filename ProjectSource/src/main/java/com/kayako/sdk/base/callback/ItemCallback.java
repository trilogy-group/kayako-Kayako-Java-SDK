package com.kayako.sdk.base.callback;

import com.kayako.sdk.base.parser.Resource;
import com.kayako.sdk.error.KayakoException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 29/08/16
 */
public interface ItemCallback<T extends Resource> extends Callback{
    void onSuccess(T item);

    void onFailure(KayakoException exception);
}
