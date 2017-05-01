package com.kayako.sdk.messenger.rating;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 01/05/17
 */
public class RatingParser implements Parser<Rating> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_SCORE = "score";
    private static final String ITEM_COMMENT = "comment";
    private static final String ITEM_CREATED_AT = "createdAt";
    private static final String ITEM_UPDATED_AT = "updatedAt";

    @Override
    public Rating parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);
        return new Rating(
                resourceMap.getAsLong(ITEM_ID),
                resourceMap.getAsEnumType(ITEM_SCORE, Rating.SCORE.class),
                resourceMap.getAsString(ITEM_COMMENT),
                resourceMap.getAsTimeInMilliseconds(ITEM_CREATED_AT),
                resourceMap.getAsTimeInMilliseconds(ITEM_UPDATED_AT));
    }
}
