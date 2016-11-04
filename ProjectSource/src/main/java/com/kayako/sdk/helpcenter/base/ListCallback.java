package com.kayako.sdk.helpcenter.base;

import com.kayako.sdk.base.parser.Resource;

import java.util.List;

/**
 *
 * This Callback is deprecated. Please use com.kayako.sdk.base.callback.ListCallback instead.
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 29/08/16
 */
@Deprecated
public interface ListCallback<T extends Resource> {
    void onSuccess(List<T> items);

    void onError(Throwable error);
}
