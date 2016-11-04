package com.kayako.sdk.base.parser;

/**
 *
 * This interface is used to parse out a response that only contains one item.
 *
 * Eg: ItemParser<Category> is used to parse out the response made to an API Endpoint that returns a specific Category
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public interface ItemParser<T extends Resource> extends Parser<T>{
    T parseItem(String jsonOfResponse) throws NullPointerException;
}
