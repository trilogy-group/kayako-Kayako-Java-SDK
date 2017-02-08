package com.kayako.sdk.base.parser;

import com.kayako.sdk.utils.ParserUtils;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class ResponseParser<T extends Resource> implements ListParser<T>, ItemParser<T> {

    Parser<T> mParser;

    public ResponseParser(Parser<T> parser) {
        mParser = parser;
    }

    @Override
    public T parse(String jsonOfResource) throws NullPointerException {
        return null;
    }

    @Override
    public List<T> parseList(String jsonOfResponse) throws NullPointerException {
        return ParserUtils.getResourceListFromDataNode(jsonOfResponse, mParser);
    }

    @Override
    public boolean containsList(String jsonOfResponse) {
        return ParserUtils.checkIfListContainedInDataNode(jsonOfResponse);
    }

    @Override
    public T parseItem(String jsonOfResponse) throws NullPointerException {
        return ParserUtils.getResourceFromDataNode(jsonOfResponse, mParser);
    }

    @Override
    public boolean containsItem(String jsonOfResponse) {
        return ParserUtils.checkIfItemContainedInDataNode(jsonOfResponse);
    }
}
