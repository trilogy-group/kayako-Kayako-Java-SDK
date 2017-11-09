package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.helpcenter.locale.LocaleIncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class CategoryIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "category"
    };


    public CategoryIncludeArgument() {
        super(resources);
        append(new LocaleIncludeArgument());
    }
}
