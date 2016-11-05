package com.kayako.sdk.base.parser;

/**
 * This interface is used where the json node in other responses are converted into objects.
 * <p>
 * For example, Parser<Category> can be used while parsing an Article to convert the node into a Category.
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public interface Parser<T extends Resource> {
    T parse(String jsonOfResource) throws NullPointerException;
}
