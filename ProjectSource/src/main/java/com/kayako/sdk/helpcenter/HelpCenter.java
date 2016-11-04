package com.kayako.sdk.helpcenter;

import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.helpcenter.search.SearchArticle;
import com.kayako.sdk.helpcenter.section.Section;

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
        return new ListManager<Category>(RequesterFactory.getCategoryRequester(mHelpDeskUrl, offset, limit), ParserFactory.getCategoryParser(mLocale)).getList();
    }

    @Deprecated
    public void getCategories(int offset, int limit, ListCallback<Category> callback) {
        new ListManager<Category>(RequesterFactory.getCategoryRequester(mHelpDeskUrl, offset, limit), ParserFactory.getCategoryParser(mLocale)).getList(callback);
    }

    public List<Section> getSections(long categoryId, int offset, int limit) {
        return new ListManager<Section>(RequesterFactory.getSectionRequester(mHelpDeskUrl, categoryId, offset, limit), ParserFactory.getSectionParser(mLocale)).getList();
    }

    @Deprecated
    public void getSections(long categoryId, int offset, int limit, ListCallback<Section> callback) {
        new ListManager<Section>(RequesterFactory.getSectionRequester(mHelpDeskUrl, categoryId, offset, limit), ParserFactory.getSectionParser(mLocale)).getList(callback);
    }

    public List<Article> getArticles(long sectionId, int offset, int limit) {
        return new ListManager<Article>(RequesterFactory.getArticleRequester(mHelpDeskUrl, sectionId, offset, limit), ParserFactory.getArticleParser(mLocale)).getList();
    }

    @Deprecated
    public void getArticles(long sectionId, int offset, int limit, ListCallback<Article> callback) {
        new ListManager<Article>(RequesterFactory.getArticleRequester(mHelpDeskUrl, sectionId, offset, limit), ParserFactory.getArticleParser(mLocale)).getList(callback);
    }

    public List<SearchArticle> getSearchArticles(String query, int offset, int limit) {
        return new ListManager<SearchArticle>(RequesterFactory.getSearchArticlesRequester(mHelpDeskUrl, query, offset, limit), ParserFactory.getSearchArticleParser(mLocale)).getList();
    }

    @Deprecated
    public void getSearchArticles(String query, int offset, int limit, ListCallback<SearchArticle> callback) {
        new ListManager<SearchArticle>(RequesterFactory.getSearchArticlesRequester(mHelpDeskUrl, query, offset, limit), ParserFactory.getSearchArticleParser(mLocale)).getList(callback);
    }

    public List<com.kayako.sdk.helpcenter.locale.Locale> getLocales() {
        return new ListManager<com.kayako.sdk.helpcenter.locale.Locale>(RequesterFactory.getLocaleRequester(mHelpDeskUrl), ParserFactory.getLocaleParser()).getList();
    }

    @Deprecated
    public void getLocales(ListCallback<com.kayako.sdk.helpcenter.locale.Locale> callback) {
        new ListManager<com.kayako.sdk.helpcenter.locale.Locale>(RequesterFactory.getLocaleRequester(mHelpDeskUrl), ParserFactory.getLocaleParser()).getList(callback);
    }

}
