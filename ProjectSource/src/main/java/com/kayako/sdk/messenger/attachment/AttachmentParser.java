package com.kayako.sdk.messenger.attachment;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class AttachmentParser implements Parser<Attachment> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_NAME = "name";
    private static final String ITEM_SIZE = "size";
    private static final String ITEM_WIDTH = "width";
    private static final String ITEM_HEIGHT = "height";
    private static final String ITEM_TYPE = "type";
    private static final String ITEM_URL = "url";
    private static final String ITEM_DOWNLOAD_URL = "urlDownload";
    private static final String ITEM_THUMBNAILS = "thumbnails";
    private static final String ITEM_CREATED_AT = "createdAt";

    @Override
    public Attachment parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        List<Thumbnail> thumbnails = new ArrayList<>();
        List<String> thumbnailsJson = resourceMap.getAsArrayOfJsonStrings(ITEM_THUMBNAILS);
        if (thumbnailsJson != null) {
            for (String thumbnailJson : thumbnailsJson) {
                thumbnails.add(ParserFactory.getThumbnailParser().parse(thumbnailJson));
            }
        }

        return new Attachment(
                resourceMap.getAsLong(ITEM_ID),
                resourceMap.getAsString(ITEM_NAME),
                resourceMap.getAsLong(ITEM_SIZE),
                resourceMap.getAsLong(ITEM_WIDTH),
                resourceMap.getAsLong(ITEM_HEIGHT),
                resourceMap.getAsString(ITEM_TYPE),
                resourceMap.getAsString(ITEM_URL),
                resourceMap.getAsString(ITEM_DOWNLOAD_URL),
                thumbnails,
                resourceMap.getAsTimeInMilliseconds(ITEM_CREATED_AT)
        );
    }
}
