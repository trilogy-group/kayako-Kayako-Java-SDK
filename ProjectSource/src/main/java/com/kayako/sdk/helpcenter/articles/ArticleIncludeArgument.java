package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.helpcenter.locale.LocaleIncludeArgument;
import com.kayako.sdk.helpcenter.section.SectionIncludeArgument;
import com.kayako.sdk.helpcenter.user.UserMinimalIncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class ArticleIncludeArgument extends IncludeArgument {

    private final static String[] resources = new String[]{"article"};

    public ArticleIncludeArgument() {
        super(resources);
        append(new SectionIncludeArgument());
        append(new UserMinimalIncludeArgument());
        append(new LocaleIncludeArgument());
    }
}
