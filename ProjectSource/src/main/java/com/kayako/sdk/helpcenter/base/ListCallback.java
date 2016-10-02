package com.kayako.sdk.helpcenter.base;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 29/08/16
 */
public interface ListCallback<T extends Resource> {
    void onSuccess(List<T> items);

    void onError(Throwable error);
}
