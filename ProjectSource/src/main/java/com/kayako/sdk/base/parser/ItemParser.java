package com.kayako.sdk.base.parser;

import com.google.gson.JsonObject;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface ItemParser<T extends Resource> extends Parser{
    T parse(String json) throws NullPointerException;
}
