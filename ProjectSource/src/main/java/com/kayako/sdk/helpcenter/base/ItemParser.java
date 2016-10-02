package com.kayako.sdk.helpcenter.base;

import com.google.gson.JsonObject;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface ItemParser<T extends Resource> {
    T parse(String json) throws NullPointerException;

    T parseItem(JsonObject node) throws NullPointerException;

}
