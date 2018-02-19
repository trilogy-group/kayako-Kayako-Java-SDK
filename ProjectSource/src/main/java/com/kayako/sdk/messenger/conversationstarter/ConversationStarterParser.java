package com.kayako.sdk.messenger.conversationstarter;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import com.kayako.sdk.utils.ParserUtils;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class ConversationStarterParser implements Parser<ConversationStarter> {

    private static final String ITEM_REALTIME_URL = "realtimeUrl";
    private static final String ITEM_LAST_ACTIVE_AGENTS = "lastActiveAgents";
    private static final String ITEM_AVERAGE_REPLY_TIME = "averageReplyTime";
    private static final String ITEM_ACTIVE_CONVERSATIONS = "activeConversations";

    @Override
    public ConversationStarter parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);


        List<UserMinimal> lastActiveAgentList = null;

        if (resourceMap.isNotNull(ITEM_LAST_ACTIVE_AGENTS)) {
            lastActiveAgentList = ParserUtils.getResourceList(jsonOfResource, ITEM_LAST_ACTIVE_AGENTS, ParserFactory.getUserMinimalParser());
        }

        String realtimeUrl = resourceMap.getAsString(ITEM_REALTIME_URL);

        return new ConversationStarter(
                realtimeUrl,
                lastActiveAgentList,
                resourceMap.getAsDouble(ITEM_AVERAGE_REPLY_TIME)
        );
    }
}
