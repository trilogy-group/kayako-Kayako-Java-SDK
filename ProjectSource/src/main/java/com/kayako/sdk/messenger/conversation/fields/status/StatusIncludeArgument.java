package com.kayako.sdk.messenger.conversation.fields.status;

import com.kayako.sdk.base.requester.IncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class StatusIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "caseStatus"
    };


    public StatusIncludeArgument() {
        super(resources);
    }
}
