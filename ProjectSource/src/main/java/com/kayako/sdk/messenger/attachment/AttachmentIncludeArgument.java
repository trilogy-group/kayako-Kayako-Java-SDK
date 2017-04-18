package com.kayako.sdk.messenger.attachment;

import com.kayako.sdk.base.requester.IncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class AttachmentIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "attachment"
    };

    public AttachmentIncludeArgument() {
        super(resources);
    }
}
