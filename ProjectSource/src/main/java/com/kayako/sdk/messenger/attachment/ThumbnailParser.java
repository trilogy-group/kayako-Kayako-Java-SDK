package com.kayako.sdk.messenger.attachment;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class ThumbnailParser implements Parser<Thumbnail> {

    private static final String ITEM_NAME = "name";
    private static final String ITEM_SIZE = "size";
    private static final String ITEM_WIDTH = "width";
    private static final String ITEM_HEIGHT = "height";
    private static final String ITEM_TYPE = "type";
    private static final String ITEM_URL = "url";
    private static final String ITEM_CREATED_AT = "createdAt";

    @Override
    public Thumbnail parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        // Expecting all of the below fields to be filled - no null values
        return new Thumbnail(
                resourceMap.getAsString(ITEM_NAME),
                resourceMap.getAsLong(ITEM_SIZE),
                resourceMap.getAsLong(ITEM_WIDTH),
                resourceMap.getAsLong(ITEM_HEIGHT),
                resourceMap.getAsString(ITEM_TYPE),
                resourceMap.getAsString(ITEM_URL),
                resourceMap.getAsTimeInMilliseconds(ITEM_CREATED_AT)
        );
    }
}
