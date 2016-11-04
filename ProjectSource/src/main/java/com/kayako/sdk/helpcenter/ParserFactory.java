package com.kayako.sdk.helpcenter;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.articles.ArticleParser;
import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.helpcenter.category.CategoryParser;
import com.kayako.sdk.helpcenter.locale.LocaleParser;
import com.kayako.sdk.helpcenter.search.SearchArticle;
import com.kayako.sdk.helpcenter.search.SearchArticleParser;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.section.SectionParser;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import com.kayako.sdk.helpcenter.user.UserParser;

import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class ParserFactory {

    // Category
    public static ListParser<Category> getCategoryListParser(Locale locale) {
        return new CategoryParser(locale);
    }

    public static ItemParser<Category> getCategoryItemParser(Locale locale) {
        return new CategoryParser(locale);
    }

    public static Parser<Category> getCategoryParser(Locale locale) {
        return new CategoryParser(locale);
    }

    // Sections
    public static ListParser<Section> getSectionListParser(Locale locale) {
        return new SectionParser(locale);
    }

    public static ItemParser<Section> getSectionItemParser(Locale locale) {
        return new SectionParser(locale);
    }

    public static Parser<Section> getSectionParser(Locale locale) {
        return new SectionParser(locale);
    }

    // Articles
    public static ListParser<Article> getArticleListParser(Locale locale) {
        return new ArticleParser(locale);
    }

    public static ItemParser<Article> getArticleItemParser(Locale locale) {
        return new ArticleParser(locale);
    }

    public static Parser<Article> getArticleParser(Locale locale) {
        return new ArticleParser(locale);
    }

    // Search Article
    public static ListParser<SearchArticle> getSearchArticleListParser(Locale locale) {
        return new SearchArticleParser(locale);
    }

    // Locales
    public static ListParser<com.kayako.sdk.helpcenter.locale.Locale> getLocaleListParser() {
        return new LocaleParser();
    }

    public static ItemParser<com.kayako.sdk.helpcenter.locale.Locale> getLocaleItemParser() {
        return new LocaleParser();
    }

    public static Parser<com.kayako.sdk.helpcenter.locale.Locale> getLocaleParser() {
        return new LocaleParser();
    }


    // All Parsers that only parse JSON Nodes

    public static Parser<UserMinimal> getUserMinimalParser() {
        return new UserParser();
    }
}
