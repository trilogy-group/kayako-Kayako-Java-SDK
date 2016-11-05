package com.kayako.sdk.base.parser;

import java.util.List;

/**
 * This interface is used to parse out a list of items
 * <p>
 * Eg: ListParser<Category> is used to parse out categories returned in an API Request to get all Categories
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface ListParser<T extends Resource> extends Parser<T> {
    List<T> parseList(String jsonOfResponse) throws NullPointerException;

    boolean containsList(String jsonOfResponse);
}
