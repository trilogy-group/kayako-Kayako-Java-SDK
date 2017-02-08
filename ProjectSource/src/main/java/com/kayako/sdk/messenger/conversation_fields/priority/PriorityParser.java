package com.kayako.sdk.messenger.conversation_fields.priority;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class PriorityParser implements Parser<Priority> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_LABEL = "label";
    private static final String ITEM_LEVEL = "level";
    private static final String ITEM_CREATED_AT = "createdAt";
    private static final String ITEM_UPDATED_AT = "updatedAt";

    @Override
    public Priority parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        // Mandatory Fields
        long id = resourceMap.getAsLong(ITEM_ID);
        String label = resourceMap.getAsString(ITEM_LABEL);
        int level = resourceMap.getAsInt(ITEM_LEVEL);
        long createdAt = resourceMap.getAsTimeInMilliseconds(ITEM_CREATED_AT);
        long updatedAt = resourceMap.getAsTimeInMilliseconds(ITEM_UPDATED_AT);
        return new Priority(id, label, level, createdAt, updatedAt);
    }
}
