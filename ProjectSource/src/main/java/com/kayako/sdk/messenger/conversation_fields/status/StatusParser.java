package com.kayako.sdk.messenger.conversation_fields.status;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class StatusParser implements Parser<Status> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_LABEL = "label";
    private static final String ITEM_TYPE = "type";
    private static final String ITEM_SORT_ORDER = "sortOrder";
    private static final String ITEM_IS_SLA_ACTIVE = "isSlaActive";
    private static final String ITEM_IS_DELETED = "isDeleted";
    private static final String ITEM_CREATED_AT = "createdAt";
    private static final String ITEM_UPDATED_AT = "updatedAt";

    @Override
    public Status parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);
        return new Status(
                resourceMap.getAsLong(ITEM_ID),
                resourceMap.getAsString(ITEM_LABEL),
                resourceMap.getAsInt(ITEM_SORT_ORDER),
                resourceMap.getAsEnumType(ITEM_TYPE, Status.Type.class),
                resourceMap.getAsBoolean(ITEM_IS_SLA_ACTIVE),
                resourceMap.getAsBoolean(ITEM_IS_DELETED),
                resourceMap.getAsTimeInMilliseconds(ITEM_CREATED_AT),
                resourceMap.getAsTimeInMilliseconds(ITEM_UPDATED_AT));
    }
}
