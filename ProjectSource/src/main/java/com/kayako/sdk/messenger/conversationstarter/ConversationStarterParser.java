package com.kayako.sdk.messenger.conversationstarter;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import com.kayako.sdk.messenger.conversation.Conversation;
import com.kayako.sdk.utils.ParserUtils;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class ConversationStarterParser implements Parser<ConversationStarter> {

    private static final String ITEM_LAST_ACTIVE_AGENTS = "lastActiveAgents";
    private static final String ITEM_AVERAGE_REPLY_TIME = "averageReplyTime";
    private static final String ITEM_ACTIVE_CONVERSATIONS = "activeConversations";

    @Override
    public ConversationStarter parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        List<UserMinimal> lastActiveAgentList = null;
        List<Conversation> conversationList = null;

        if (resourceMap.isNotNull(ITEM_LAST_ACTIVE_AGENTS)) {
            lastActiveAgentList = ParserUtils.getResourceList(jsonOfResource, ITEM_LAST_ACTIVE_AGENTS, ParserFactory.getUserMinimalParser());
        }

        if (resourceMap.isNotNull(ITEM_ACTIVE_CONVERSATIONS)) {
            Parser<Conversation> conversationParser = ParserFactory.getConversationParser();
            conversationList = ParserUtils.getResourceList(jsonOfResource, ITEM_ACTIVE_CONVERSATIONS, conversationParser);
        }

        return new ConversationStarter(
                lastActiveAgentList,
                resourceMap.getAsDouble(ITEM_AVERAGE_REPLY_TIME),
                conversationList
        );
    }
}
