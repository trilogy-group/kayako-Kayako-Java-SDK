package com.kayako.sdk.messenger.conversationstarter;

import com.kayako.sdk.base.parser.Resource;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import com.kayako.sdk.messenger.conversation.Conversation;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class ConversationStarter implements Resource {

    private List<UserMinimal> lastActiveAgents;

    private Double averageReplyTime;

    public ConversationStarter(List<UserMinimal> lastActiveAgents, Double averageReplyTime) {
        this.lastActiveAgents = lastActiveAgents;
        this.averageReplyTime = averageReplyTime;
    }

    public List<UserMinimal> getLastActiveAgents() {
        return lastActiveAgents;
    }

    public Double getAverageReplyTime() {
        return averageReplyTime;
    }

}
