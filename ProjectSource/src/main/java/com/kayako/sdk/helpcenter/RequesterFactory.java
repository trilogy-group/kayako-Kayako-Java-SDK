package com.kayako.sdk.helpcenter;

import com.kayako.sdk.helpcenter.articles.ArticleRequester;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.helpcenter.category.CategoryRequester;
import com.kayako.sdk.helpcenter.locale.LocaleRequester;
import com.kayako.sdk.helpcenter.search.SearchArticleRequester;
import com.kayako.sdk.helpcenter.section.SectionRequester;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class RequesterFactory {

    public static ListRequester getCategoryRequester(String helpCenterUrl, int offset, int limit) {
        return new CategoryRequester(helpCenterUrl, offset, limit);
    }

    public static ListRequester getSectionRequester(String helpCenterUrl, long categoryId, int offset, int limit) {
        return new SectionRequester(helpCenterUrl, categoryId, offset, limit);
    }

    public static ListRequester getArticleRequester(String helpCenterUrl, long sectionId, int offset, int limit) {
        return new ArticleRequester(helpCenterUrl, sectionId, offset, limit);
    }

    public static ListRequester getSearchArticlesRequester(String helpCenterUrl, String query, int offset, int limit) {
        return new SearchArticleRequester(helpCenterUrl, query, offset, limit);
    }

    public static ListRequester getLocaleRequester(String helpCenterUrl) {
        return new LocaleRequester(helpCenterUrl);
    }
}
