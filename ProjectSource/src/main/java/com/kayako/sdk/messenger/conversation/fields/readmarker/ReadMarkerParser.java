package com.kayako.sdk.messenger.conversation.fields.readmarker;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 30/03/17
 */
public class ReadMarkerParser implements Parser<ReadMarker> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_LAST_READ_POST_ID = "lastReadPostId";
    private static final String ITEM_LAST_READ_AT = "lastReadAt";
    private static final String ITEM_UNREAD_COUNT = "unreadCount";

    @Override
    public ReadMarker parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        Long id = resourceMap.getAsLong(ITEM_ID);
        Long lastReadPostId = resourceMap.getAsLong(ITEM_LAST_READ_POST_ID);
        Long lastReadAt = resourceMap.getAsTimeInMilliseconds(ITEM_LAST_READ_AT);
        Integer unreadCount = resourceMap.getAsInt(ITEM_UNREAD_COUNT);
        return new ReadMarker(id, lastReadPostId, lastReadAt, unreadCount);
    }
}
