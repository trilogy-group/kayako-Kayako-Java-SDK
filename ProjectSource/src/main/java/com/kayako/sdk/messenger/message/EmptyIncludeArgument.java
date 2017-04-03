package com.kayako.sdk.messenger.message;

import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.helpcenter.user.UserMinimalIncludeArgument;

import java.util.Collections;
import java.util.Set;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class EmptyIncludeArgument extends IncludeArgument {

    public EmptyIncludeArgument() {
        super(Collections.EMPTY_SET);
    }
}
