package com.kayako.sdk.helpcenter.base;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface ListParser<T extends Resource> {
    List<T> parse(String json);
}
