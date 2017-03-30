package com.kayako.sdk.messenger.conversation;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.messenger.conversation.fields.ChannelType;
import com.kayako.sdk.messenger.message.MessageStatus;
import com.kayako.sdk.utils.ParserUtils;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class ConversationParser implements Parser<Conversation> {

    private static final String ITEM_ID = "id";
    private static final String ITEM_UUID = "uuid";
    private static final String ITEM_LEGACY_ID = "legacyId";
    private static final String ITEM_SUBJECT = "subject";
    private static final String ITEM_CHANNEL = "channel";
    private static final String ITEM_REQUESTER = "requester";
    private static final String ITEM_CREATOR = "creator";
    private static final String ITEM_LAST_REPLIER = "lastReplier";
    private static final String ITEM_TEAM = "assignedTeam";
    private static final String ITEM_STATUS = "status";
    private static final String ITEM_IS_COMPLETED = "isCompleted";
    private static final String ITEM_PRIORITY = "priority";
    private static final String ITEM_REALTIME_CHANNEL = "realtimeChannel";
    private static final String ITEM_READ_MARKER = "readMarker";
    private static final String ITEM_LAST_REPLIED_AT = "lastRepliedAt";
    private static final String ITEM_CREATED_AT = "createdAt";
    private static final String ITEM_UPDATED_AT = "updatedAt";
    private static final String ITEM_LAST_MESSAGE_PREVIEW = "lastMessagePreview";
    private static final String ITEM_LAST_MESSAGE_STATUS = "lastMessageStatus";

    @Override
    public Conversation parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);
        return new Conversation(
                resourceMap.getAsLong(ITEM_ID),
                resourceMap.getAsString(ITEM_UUID),
                resourceMap.getAsString(ITEM_LEGACY_ID),
                resourceMap.getAsString(ITEM_SUBJECT),
                resourceMap.getAsEnumType(ITEM_CHANNEL, ChannelType.class),
                resourceMap.isNotNull(ITEM_REQUESTER) ? ParserFactory.getUserMinimalParser().parse(resourceMap.getAsJsonString(ITEM_REQUESTER)) : null,
                resourceMap.isNotNull(ITEM_CREATOR) ? ParserFactory.getUserMinimalParser().parse(resourceMap.getAsJsonString(ITEM_CREATOR)) : null,
                resourceMap.isNotNull(ITEM_LAST_REPLIER) ? ParserFactory.getUserMinimalParser().parse(resourceMap.getAsJsonString(ITEM_LAST_REPLIER)) : null,
                resourceMap.isNotNull(ITEM_TEAM) ? ParserFactory.getTeamParser().parse(resourceMap.getAsJsonString(ITEM_TEAM)) : null,
                resourceMap.isNotNull(ITEM_STATUS) ? ParserFactory.getStatusParser().parse(resourceMap.getAsJsonString(ITEM_STATUS)) : null,
                resourceMap.getAsBoolean(ITEM_IS_COMPLETED),
                resourceMap.isNotNull(ITEM_READ_MARKER) ? ParserFactory.getReadMarkerParser().parse(resourceMap.getAsJsonString(ITEM_READ_MARKER)) : null,
                resourceMap.isNotNull(ITEM_PRIORITY) ? ParserFactory.getPriorityParser().parse(resourceMap.getAsJsonString(ITEM_PRIORITY)) : null,
                resourceMap.getAsString(ITEM_REALTIME_CHANNEL),
                resourceMap.getAsTimeInMilliseconds(ITEM_LAST_REPLIED_AT),
                resourceMap.getAsTimeInMilliseconds(ITEM_CREATED_AT),
                resourceMap.getAsTimeInMilliseconds(ITEM_UPDATED_AT),
                resourceMap.getAsString(ITEM_LAST_MESSAGE_PREVIEW),
                resourceMap.getAsEnumType(ITEM_LAST_MESSAGE_STATUS, MessageStatus.class)
        );
    }
}
