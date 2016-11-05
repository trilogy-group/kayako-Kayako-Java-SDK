package com.kayako.sdk.error.response;

import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.utils.ParserUtils;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 04/11/16
 */
public class NotificationListParser implements ListParser<Notification> {

    private static final String NODE_NOTIFICATIONS = "notifications";
    private static final String ITEM_STICKY = "sticky";
    private static final String ITEM_TYPE = "type";
    private static final String ITEM_MESSAGE = "message";

    public List<Notification> parseList(String json) throws NullPointerException {
        return ParserUtils.getResourceList(json, NODE_NOTIFICATIONS, this);
    }

    public Notification parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);
        return new Notification(resourceMap.getAsString(ITEM_TYPE), resourceMap.getAsString(ITEM_MESSAGE), resourceMap.getAsBoolean(ITEM_STICKY));
    }
}
