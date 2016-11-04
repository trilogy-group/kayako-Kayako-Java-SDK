package com.kayako.sdk.helpcenter;

import com.kayako.sdk.base.requester.ItemRequester;
import com.kayako.sdk.helpcenter.articles.GetArticleListRequester;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.helpcenter.articles.GetArticleRequester;
import com.kayako.sdk.helpcenter.category.GetCategoryListRequester;
import com.kayako.sdk.helpcenter.category.GetCategoryRequester;
import com.kayako.sdk.helpcenter.locale.LocaleListRequester;
import com.kayako.sdk.helpcenter.locale.LocaleRequester;
import com.kayako.sdk.helpcenter.search.SearchArticleRequester;
import com.kayako.sdk.helpcenter.section.GetSectionListRequester;
import com.kayako.sdk.helpcenter.section.GetSectionRequester;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class RequesterFactory {

    public static ListRequester getCategoryListRequester(String helpCenterUrl, int offset, int limit) {
        return new GetCategoryListRequester(helpCenterUrl, offset, limit);
    }

    public static ItemRequester getCategoryItemRequester(String helpCenterUrl, long categoryId) {
        return new GetCategoryRequester(helpCenterUrl, categoryId);
    }

    public static ListRequester getSectionListRequester(String helpCenterUrl, long categoryId, int offset, int limit) {
        return new GetSectionListRequester(helpCenterUrl, categoryId, offset, limit);
    }

    public static ItemRequester getSectionItemRequester(String helpCenterUrl, long sectionId) {
        return new GetSectionRequester(helpCenterUrl, sectionId);
    }

    public static ListRequester getArticleListRequester(String helpCenterUrl, long sectionId, int offset, int limit) {
        return new GetArticleListRequester(helpCenterUrl, sectionId, offset, limit);
    }

    public static ItemRequester getArticleItemRequester(String helpCenterUrl, long articleId) {
        return new GetArticleRequester(helpCenterUrl, articleId);
    }

    public static ListRequester getSearchArticleListRequester(String helpCenterUrl, String query, int offset, int limit) {
        return new SearchArticleRequester(helpCenterUrl, query, offset, limit);
    }

    public static ListRequester getLocaleListRequester(String helpCenterUrl) {
        return new LocaleListRequester(helpCenterUrl);
    }

    public static ItemRequester getLocaleItemRequester(String helpCenterUrl, long localeId) {
        return new LocaleRequester(helpCenterUrl, localeId);
    }

}
