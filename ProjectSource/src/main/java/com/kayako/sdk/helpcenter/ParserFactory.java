package com.kayako.sdk.helpcenter;

import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.articles.ArticleParser;
import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.helpcenter.category.CategoryParser;
import com.kayako.sdk.helpcenter.locale.LocaleParser;
import com.kayako.sdk.helpcenter.search.SearchArticleParser;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.section.SectionParser;
import com.kayako.sdk.helpcenter.user.UserParser;

import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class ParserFactory {

    public static ListParser<Category> getCategoryParser(Locale locale) {
        return new CategoryParser(locale);
    }

    public static ListParser<Section> getSectionParser(Locale locale) {
        return new SectionParser(locale);
    }

    public static ListParser<Article> getArticleParser(Locale locale) {
        return new ArticleParser(locale);
    }

    public static ListParser getSearchArticleParser(Locale locale) {
        return new SearchArticleParser(locale);
    }

    public static ItemParser getUserMinimalParser() {
        return new UserParser();
    }

    public static ListParser<com.kayako.sdk.helpcenter.locale.Locale> getLocaleParser() {
        return new LocaleParser();
    }
}
