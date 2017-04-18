package com.kayako.sdk.messenger.message;

import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.helpcenter.user.UserMinimalIncludeArgument;
import com.kayako.sdk.messenger.attachment.AttachmentIncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class MessageIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "message"
    };

    public MessageIncludeArgument() {
        super(resources);
        append(new UserMinimalIncludeArgument());
        append(new AttachmentIncludeArgument());
    }
}
