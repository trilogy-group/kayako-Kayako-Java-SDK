package com.kayako.sdk.helpcenter;

import com.kayako.sdk.helpcenter.articles.ArticleRequester;
import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.helpcenter.category.CategoryRequester;
import com.kayako.sdk.helpcenter.search.SearchArticleRequester;
import com.kayako.sdk.helpcenter.section.SectionRequester;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class RequesterFactory {

    public static Requester getCategoryRequester(int offset, int limit) {
        return new CategoryRequester(offset, limit);
    }

    public static Requester getSectionRequester(long categoryId, int offset, int limit) {
        return new SectionRequester(categoryId, offset, limit);
    }

    public static Requester getArticleRequester(long sectionId, int offset, int limit) {
        return new ArticleRequester(sectionId, offset, limit);
    }

    public static Requester getSearchArticlesRequester(String query, int offset, int limit) {
        return new SearchArticleRequester(query, offset, limit);
    }
}
