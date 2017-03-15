package com.kayako.sdk.messenger.conversation;

import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.helpcenter.user.UserMinimalIncludeArgument;
import com.kayako.sdk.messenger.conversation.fields.priority.PriorityIncludeArgument;
import com.kayako.sdk.messenger.conversation.fields.status.StatusIncludeArgument;
import com.kayako.sdk.messenger.conversation.fields.team.TeamIncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class ConversationIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "conversation"
    };

    public ConversationIncludeArgument() {
        super(resources);
        append(new UserMinimalIncludeArgument());
        append(new TeamIncludeArgument());
        append(new StatusIncludeArgument());
        append(new PriorityIncludeArgument());
    }
}
