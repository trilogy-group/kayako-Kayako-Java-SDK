package com.kayako.sdk.messenger.conversation.fields.priority;

import com.kayako.sdk.base.requester.IncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class PriorityIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "casePriority"
    };


    public PriorityIncludeArgument() {
        super(resources);
    }
}
