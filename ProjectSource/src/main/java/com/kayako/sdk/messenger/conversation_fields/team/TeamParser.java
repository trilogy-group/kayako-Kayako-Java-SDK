package com.kayako.sdk.messenger.conversation_fields.team;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class TeamParser implements Parser<Team> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_TITLE = "title";
    private static final String ITEM_MEMBER_COUNT = "memberCount";
    private static final String ITEM_CREATED_AT = "createdAt";
    private static final String ITEM_UPDATED_AT = "updatedAt";

    @Override
    public Team parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);
        return new Team(
                resourceMap.getAsLong(ITEM_ID),
                resourceMap.getAsString(ITEM_TITLE),
                resourceMap.getAsInt(ITEM_MEMBER_COUNT),
                resourceMap.getAsTimeInMilliseconds(ITEM_CREATED_AT),
                resourceMap.getAsTimeInMilliseconds(ITEM_UPDATED_AT)
        );
    }
}
