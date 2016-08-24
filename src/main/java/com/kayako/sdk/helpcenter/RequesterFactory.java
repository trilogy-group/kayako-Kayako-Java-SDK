package com.kayako.sdk.helpcenter;

import com.kayako.sdk.helpcenter.articles.ArticleRequester;
import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.helpcenter.category.CategoryRequester;
import com.kayako.sdk.helpcenter.section.SectionRequester;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class RequesterFactory {

    public static Requester getCategoryRequester() {
        return new CategoryRequester();
    }

    public static Requester getSectionRequester(long categoryId) {
        return new SectionRequester(categoryId);
    }

    public static Requester getArticleRequester(long sectionId) {
        return new ArticleRequester(sectionId);
    }
}
