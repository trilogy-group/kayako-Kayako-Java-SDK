package com.kayako.sdk.base.parser;

import com.kayako.sdk.utils.ParserUtils;

import java.util.List;

/**
 * This class wraps all the methods necessary for parsing a response where the relevant values are in the data node of the JSON response.
 *
 * This is unlike the ErrorParsers.
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class DataNodeParser<T extends Resource> implements ListParser<T>, ItemParser<T> {

    private Parser<T> mParser;

    public DataNodeParser(Parser<T> parser) {
        mParser = parser;
    }

    @Override
    public T parse(String jsonOfResource) throws NullPointerException {
        return ParserUtils.getResourceFromDataNode(jsonOfResource, mParser);
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
