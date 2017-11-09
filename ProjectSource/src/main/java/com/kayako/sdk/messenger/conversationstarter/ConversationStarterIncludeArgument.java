package com.kayako.sdk.messenger.conversationstarter;

import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.helpcenter.user.UserMinimalIncludeArgument;
import com.kayako.sdk.messenger.conversation.ConversationIncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class ConversationStarterIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "conversationStarter"
    };

    public ConversationStarterIncludeArgument() {
        super(resources);
        append(new UserMinimalIncludeArgument());
    }
}
