package com.kayako.sdk.messenger.message;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.messenger.conversation.fields.ChannelType;
import com.kayako.sdk.utils.ParserUtils;
import com.kayako.sdk.utils.TimeUtils;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/02/17
 */
public class MessageParser implements Parser<Message> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_UUID = "uuid";
    private static final String ITEM_CLIENT_ID = "clientId";
    private static final String ITEM_SUBJECT = "subject";
    private static final String ITEM_CHANNEL = "channel";
    private static final String ITEM_CONTENT_TEXT = "contentText";
    private static final String ITEM_CONTENT_HTML = "contentHtml";
    private static final String ITEM_CREATOR = "creator";

    // TODO: Attachments, Metadata

    private static final String ITEM_MESSAGE_STATUS = "messageStatus";
    private static final String ITEM_MESSAGE_STATUS_UPDATED_AT = "messageStatusUpdatedAt";
    private static final String ITEM_CREATED_AT = "createdAt";
    private static final String ITEM_UPDATED_AT = "updatedAt";

    @Override
    public Message parse(String jsonOfResource) throws NullPointerException {

        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        return new Message(
                resourceMap.getAsLong(ITEM_ID),
                resourceMap.getAsString(ITEM_UUID),
                resourceMap.getAsString(ITEM_CLIENT_ID),
                resourceMap.getAsString(ITEM_SUBJECT),
                resourceMap.getAsEnumType(ITEM_CHANNEL, ChannelType.class),
                resourceMap.getAsString(ITEM_CONTENT_TEXT),
                resourceMap.getAsString(ITEM_CONTENT_HTML),
                ParserFactory.getUserMinimalParser().parse(resourceMap.getAsJsonString(ITEM_CREATOR)),
                resourceMap.getAsEnumType(ITEM_MESSAGE_STATUS, MessageStatus.class),
                TimeUtils.getIso8601StringToUnixTimestamp(resourceMap.getAsString(ITEM_MESSAGE_STATUS_UPDATED_AT)),
                TimeUtils.getIso8601StringToUnixTimestamp(resourceMap.getAsString(ITEM_CREATED_AT)),
                TimeUtils.getIso8601StringToUnixTimestamp(resourceMap.getAsString(ITEM_UPDATED_AT))
        );
    }
}
