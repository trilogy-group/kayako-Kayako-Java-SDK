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
public class ErrorListParser implements ListParser<Error> {

    private static final String NODE_ERRORS = "errors";

    private static final String ITEM_CODE = "code";
    private static final String ITEM_MESSAGE = "message";
    private static final String ITEM_MORE_INFO = "moreInfo";
    private static final String ITEM_PARAMETER = "parameter";
    private static final String ITEM_PARAMETERS = "parameters";

    public List<Error> parseList(String json) throws NullPointerException {
        return ParserUtils.getResourceList(json, NODE_ERRORS, this);
    }

    public Error parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        // Core parameters
        String code = resourceMap.getAsString(ITEM_CODE);
        String message = resourceMap.getAsString(ITEM_MESSAGE);
        String moreInfo = resourceMap.getAsString(ITEM_MORE_INFO);

        // Additional parameters
        if (resourceMap.hasMember(ITEM_PARAMETER)) {
            return new Error(code, message, moreInfo, resourceMap.getAsString(ITEM_PARAMETER));

        } else if (resourceMap.hasMember(ITEM_PARAMETERS)) {
            return new Error(code, message, moreInfo, resourceMap.getAsArrayOfStrings(ITEM_PARAMETERS));

        } else {
            return new Error(code, message, moreInfo);
        }
    }
}
