package com.kayako.sdk.messenger.conversation.fields.team;

import com.kayako.sdk.base.requester.IncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class TeamIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "team"
    };


    public TeamIncludeArgument() {
        super(resources);
    }
}
