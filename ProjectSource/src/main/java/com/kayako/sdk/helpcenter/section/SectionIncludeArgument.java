package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.helpcenter.category.CategoryIncludeArgument;
import com.kayako.sdk.helpcenter.locale.LocaleIncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class SectionIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "section"
    };

    public SectionIncludeArgument() {
        super(resources);
        append(new CategoryIncludeArgument());
        append(new LocaleIncludeArgument());
    }
}
