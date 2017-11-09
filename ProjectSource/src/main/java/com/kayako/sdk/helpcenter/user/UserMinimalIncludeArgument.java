package com.kayako.sdk.helpcenter.user;

import com.kayako.sdk.base.requester.IncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class UserMinimalIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "userMinimal"
    };

    public UserMinimalIncludeArgument() {
        super(resources);
    }
}
