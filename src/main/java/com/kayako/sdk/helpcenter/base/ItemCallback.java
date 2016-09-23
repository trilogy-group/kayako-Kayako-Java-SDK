package com.kayako.sdk.helpcenter.base;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 29/08/16
 */
public interface ItemCallback<T extends Resource> {
    void onSuccess(T item);

    void onError(Throwable error);
}
