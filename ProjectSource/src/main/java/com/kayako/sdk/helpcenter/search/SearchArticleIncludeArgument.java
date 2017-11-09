package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.helpcenter.articles.ArticleIncludeArgument;
import com.kayako.sdk.helpcenter.locale.LocaleIncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class SearchArticleIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[] {
             "search"
    };

    public SearchArticleIncludeArgument() {
        super(resources);
        append(new ArticleIncludeArgument());
        append(new LocaleIncludeArgument());
    }
}
