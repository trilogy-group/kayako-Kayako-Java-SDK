package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.requester.IncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class LocaleIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "localeField"
    };

    public LocaleIncludeArgument() {
        super(resources);
    }
}
