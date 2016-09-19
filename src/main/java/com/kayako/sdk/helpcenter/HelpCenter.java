package com.kayako.sdk.helpcenter;

import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.articles.ArticleManager;
import com.kayako.sdk.helpcenter.articles.ArticleParser;
import com.kayako.sdk.helpcenter.articles.ArticleRequester;
import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.helpcenter.category.CategoryManager;
import com.kayako.sdk.helpcenter.category.CategoryParser;
import com.kayako.sdk.helpcenter.category.CategoryRequester;
import com.kayako.sdk.helpcenter.locale.LocaleManager;
import com.kayako.sdk.helpcenter.search.SearchArticle;
import com.kayako.sdk.helpcenter.search.SearchArticleManager;
import com.kayako.sdk.helpcenter.search.SearchArticleParser;
import com.kayako.sdk.helpcenter.search.SearchArticleRequester;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.section.SectionManager;
import com.kayako.sdk.helpcenter.section.SectionParser;
import com.kayako.sdk.helpcenter.section.SectionRequester;

import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class HelpCenter {

    private String mHelpDeskUrl;
    private Locale mLocale;

    public HelpCenter(String helpDeskUrl, Locale locale) {
        mHelpDeskUrl = helpDeskUrl;
        mLocale = locale;
    }

    public List<Category> getCategories(int offset, int limit) {
        CategoryManager categoryManager = new CategoryManager(RequesterFactory.getCategoryRequester(offset, limit), ParserFactory.getCategoryParser(mLocale));
        return categoryManager.getCategories(mHelpDeskUrl);
    }

    public void getCategories(int offset, int limit, CategoryManager.Callback callback) {
        CategoryManager categoryManager = new CategoryManager(RequesterFactory.getCategoryRequester(offset, limit), ParserFactory.getCategoryParser(mLocale));
        categoryManager.getCategories(mHelpDeskUrl, callback);
    }

    public List<Section> getSections(long categoryId, int offset, int limit) {
        SectionManager sectionManager = new SectionManager(RequesterFactory.getSectionRequester(categoryId, offset, limit), ParserFactory.getSectionParser(mLocale));
        return sectionManager.getSections(mHelpDeskUrl);
    }

    public void getSections(long categoryId, int offset, int limit, SectionManager.Callback callback) {
        SectionManager sectionManager = new SectionManager(RequesterFactory.getSectionRequester(categoryId, offset, limit), ParserFactory.getSectionParser(mLocale));
        sectionManager.getSections(mHelpDeskUrl, callback);
    }

    public List<Article> getArticles(long sectionId, int offset, int limit) {
        ArticleManager articleManager = new ArticleManager(RequesterFactory.getArticleRequester(sectionId, offset, limit), ParserFactory.getArticleParser(mLocale));
        return articleManager.getArticles(mHelpDeskUrl);
    }

    public void getArticles(long sectionId, int offset, int limit, ArticleManager.Callback callback) {
        ArticleManager articleManager = new ArticleManager(RequesterFactory.getArticleRequester(sectionId, offset, limit), ParserFactory.getArticleParser(mLocale));
        articleManager.getArticles(mHelpDeskUrl, callback);
    }

    public List<SearchArticle> getSearchArticles(String query, int offset, int limit) {
        SearchArticleManager searchArticleManager = new SearchArticleManager(RequesterFactory.getSearchArticlesRequester(query, offset, limit), ParserFactory.getSearchArticleParser(mLocale));
        return searchArticleManager.getSearchArticles(mHelpDeskUrl);
    }

    public void getSearchArticles(String query, int offset, int limit, SearchArticleManager.Callback callback) {
        SearchArticleManager searchArticleManager = new SearchArticleManager(RequesterFactory.getSearchArticlesRequester(query, offset, limit), ParserFactory.getSearchArticleParser(mLocale));
        searchArticleManager.getSearchArticles(mHelpDeskUrl, callback);
    }

    public List<com.kayako.sdk.helpcenter.locale.Locale> getLocales() {
        LocaleManager localeManager = new LocaleManager(RequesterFactory.getLocaleRequester(), ParserFactory.getLocaleParser());
        return localeManager.getLocales(mHelpDeskUrl);
    }

    public void getLocales(LocaleManager.Callback callback) {
        LocaleManager localeManager = new LocaleManager(RequesterFactory.getLocaleRequester(), ParserFactory.getLocaleParser());
        localeManager.getLocales(mHelpDeskUrl, callback);
    }
    
}
