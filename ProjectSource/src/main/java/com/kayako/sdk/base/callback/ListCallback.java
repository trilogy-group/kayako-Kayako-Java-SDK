package com.kayako.sdk.base.callback;

import com.kayako.sdk.base.parser.Resource;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 29/08/16
 */
public interface ListCallback<T extends Resource> extends Callback {
    void onSuccess(List<T> items);
}
