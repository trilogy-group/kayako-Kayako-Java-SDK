package com.kayako.sdk;

import com.kayako.sdk.base.requester.CommonRequester;
import com.kayako.sdk.base.requester.ItemRequester;
import com.kayako.sdk.helpcenter.articles.GetArticleListRequester;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.helpcenter.articles.GetArticleRequester;
import com.kayako.sdk.helpcenter.category.GetCategoryListRequester;
import com.kayako.sdk.helpcenter.category.GetCategoryRequester;
import com.kayako.sdk.helpcenter.locale.GetLocaleListRequester;
import com.kayako.sdk.helpcenter.locale.GetLocaleRequester;
import com.kayako.sdk.helpcenter.search.GetSearchArticleListRequester;
import com.kayako.sdk.helpcenter.section.GetSectionListRequester;
import com.kayako.sdk.helpcenter.section.GetSectionRequester;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class RequesterFactory {

    public static ListRequester getCategoryListRequester(String helpCenterUrl, int offset, int limit) {
        return new CommonRequester(new GetCategoryListRequester(helpCenterUrl, offset, limit));
    }

    public static ItemRequester getCategoryItemRequester(String helpCenterUrl, long categoryId) {
        return new CommonRequester(new GetCategoryRequester(helpCenterUrl, categoryId));
    }

    public static ListRequester getSectionListRequester(String helpCenterUrl, long categoryId, int offset, int limit) {
        return new CommonRequester(new GetSectionListRequester(helpCenterUrl, categoryId, offset, limit));
    }

    public static ItemRequester getSectionItemRequester(String helpCenterUrl, long sectionId) {
        return new CommonRequester(new GetSectionRequester(helpCenterUrl, sectionId));
    }

    public static ListRequester getArticleListRequester(String helpCenterUrl, long sectionId, int offset, int limit) {
        return new CommonRequester(new GetArticleListRequester(helpCenterUrl, sectionId, offset, limit));
    }

    public static ItemRequester getArticleItemRequester(String helpCenterUrl, long articleId) {
        return new CommonRequester(new GetArticleRequester(helpCenterUrl, articleId));
    }

    public static ListRequester getSearchArticleListRequester(String helpCenterUrl, String query, int offset, int limit) {
        return new CommonRequester(new GetSearchArticleListRequester(helpCenterUrl, query, offset, limit));
    }

    public static ListRequester getLocaleListRequester(String helpCenterUrl) {
        return new CommonRequester(new GetLocaleListRequester(helpCenterUrl));
    }

    public static ItemRequester getLocaleItemRequester(String helpCenterUrl, long localeId) {
        return new CommonRequester(new GetLocaleRequester(helpCenterUrl, localeId));
    }

}
