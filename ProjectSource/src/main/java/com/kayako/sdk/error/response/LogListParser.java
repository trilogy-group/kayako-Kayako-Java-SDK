package com.kayako.sdk.error.response;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.utils.ParserUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class LogListParser implements ListParser<Log> {

    private static final String NODE_LOGS = "logs";
    private static final String ITEM_LEVEL = "level";
    private static final String ITEM_MESSAGE = "message";

    @Override
    public List<Log> parseList(String json) throws NullPointerException {
        return ParserUtils.getResourceList(json, NODE_LOGS, this);
    }

    @Override
    public Log parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        String level = resourceMap.getAsString(ITEM_LEVEL);
        String message = resourceMap.getAsString(ITEM_MESSAGE);
        return new Log(level, message);
    }
}
