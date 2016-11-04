package com.kayako.sdk.base.parser;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface ListParser<T extends Resource> extends Parser {
    List<T> parse(String json) throws NullPointerException;
}
