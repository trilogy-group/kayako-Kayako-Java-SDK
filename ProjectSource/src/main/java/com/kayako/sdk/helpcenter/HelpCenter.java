package com.kayako.sdk.helpcenter;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.RequesterFactory;
import com.kayako.sdk.base.callback.ItemCallback;
import com.kayako.sdk.base.manager.ItemManager;
import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.error.KayakoException;
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

    // Category

    public List<Category> getCategories(int offset, int limit) throws KayakoException {
        return new ListManager<Category>(RequesterFactory.getCategoryListRequester(mHelpDeskUrl, offset, limit), ParserFactory.getCategoryListParser(mLocale)).getList();
    }

    @Deprecated
    public void getCategories(int offset, int limit, ListCallback<Category> callback) {
        new ListManager<Category>(RequesterFactory.getCategoryListRequester(mHelpDeskUrl, offset, limit), ParserFactory.getCategoryListParser(mLocale)).getList(callback);
    }

    public void getCategories(int offset, int limit, com.kayako.sdk.base.callback.ListCallback<Category> callback) throws KayakoException {
        new ListManager<Category>(RequesterFactory.getCategoryListRequester(mHelpDeskUrl, offset, limit), ParserFactory.getCategoryListParser(mLocale)).getList(callback);
    }

    public Category getCategory(long categoryId) throws KayakoException {
        return new ItemManager<Category>(RequesterFactory.getCategoryItemRequester(mHelpDeskUrl, categoryId), ParserFactory.getCategoryItemParser(mLocale)).getItem();
    }

    public void getCategory(long categoryId, ItemCallback<Category> callback) {
        new ItemManager<Category>(RequesterFactory.getCategoryItemRequester(mHelpDeskUrl, categoryId), ParserFactory.getCategoryItemParser(mLocale)).getItem(callback);
    }


    // Section

    public List<Section> getSections(long categoryId, int offset, int limit) throws KayakoException {
        return new ListManager<Section>(RequesterFactory.getSectionListRequester(mHelpDeskUrl, categoryId, offset, limit), ParserFactory.getSectionListParser(mLocale)).getList();
    }

    @Deprecated
    public void getSections(long categoryId, int offset, int limit, ListCallback<Section> callback) {
        new ListManager<Section>(RequesterFactory.getSectionListRequester(mHelpDeskUrl, categoryId, offset, limit), ParserFactory.getSectionListParser(mLocale)).getList(callback);
    }

    public void getSection(long categoryId, int offset, int limit, com.kayako.sdk.base.callback.ListCallback<Section> callback) {
        new ListManager<Section>(RequesterFactory.getSectionListRequester(mHelpDeskUrl, categoryId, offset, limit), ParserFactory.getSectionListParser(mLocale)).getList(callback);
    }

    public Section getSection(long sectionId) throws KayakoException {
        return new ItemManager<Section>(RequesterFactory.getSectionItemRequester(mHelpDeskUrl, sectionId), ParserFactory.getSectionItemParser(mLocale)).getItem();
    }

    public void getSection(long sectionId, ItemCallback<Section> callback) {
        new ItemManager<Section>(RequesterFactory.getSectionItemRequester(mHelpDeskUrl, sectionId), ParserFactory.getSectionItemParser(mLocale)).getItem(callback);
    }


    // Article

    public List<Article> getArticles(long sectionId, int offset, int limit) throws KayakoException {
        return new ListManager<Article>(RequesterFactory.getArticleListRequester(mHelpDeskUrl, sectionId, offset, limit), ParserFactory.getArticleListParser(mLocale)).getList();
    }

    @Deprecated
    public void getArticles(long sectionId, int offset, int limit, ListCallback<Article> callback) {
        new ListManager<Article>(RequesterFactory.getArticleListRequester(mHelpDeskUrl, sectionId, offset, limit), ParserFactory.getArticleListParser(mLocale)).getList(callback);
    }

    public void getArticles(long sectionId, int offset, int limit, com.kayako.sdk.base.callback.ListCallback<Article> callback) {
        new ListManager<Article>(RequesterFactory.getArticleListRequester(mHelpDeskUrl, sectionId, offset, limit), ParserFactory.getArticleListParser(mLocale)).getList(callback);
    }

    public Article getArticle(long articleId) throws KayakoException {
        return new ItemManager<Article>(RequesterFactory.getArticleItemRequester(mHelpDeskUrl, articleId), ParserFactory.getArticleItemParser(mLocale)).getItem();
    }

    public void getArticle(long articleId, ItemCallback<Article> callback) {
        new ItemManager<Article>(RequesterFactory.getArticleItemRequester(mHelpDeskUrl, articleId), ParserFactory.getArticleItemParser(mLocale)).getItem(callback);
    }


    // Search Articles

    public List<SearchArticle> getSearchArticles(String query, int offset, int limit) throws KayakoException {
        return new ListManager<SearchArticle>(RequesterFactory.getSearchArticleListRequester(mHelpDeskUrl, query, offset, limit), ParserFactory.getSearchArticleListParser(mLocale)).getList();
    }

    @Deprecated
    public void getSearchArticles(String query, int offset, int limit, ListCallback<SearchArticle> callback) {
        new ListManager<SearchArticle>(RequesterFactory.getSearchArticleListRequester(mHelpDeskUrl, query, offset, limit), ParserFactory.getSearchArticleListParser(mLocale)).getList(callback);
    }

    public void getSearchArticles(String query, int offset, int limit, com.kayako.sdk.base.callback.ListCallback<SearchArticle> callback) {
        new ListManager<SearchArticle>(RequesterFactory.getSearchArticleListRequester(mHelpDeskUrl, query, offset, limit), ParserFactory.getSearchArticleListParser(mLocale)).getList(callback);
    }

    // Locale

    public List<com.kayako.sdk.helpcenter.locale.Locale> getLocales() throws KayakoException {
        return new ListManager<com.kayako.sdk.helpcenter.locale.Locale>(RequesterFactory.getLocaleListRequester(mHelpDeskUrl), ParserFactory.getLocaleListParser()).getList();
    }

    @Deprecated
    public void getLocales(ListCallback<com.kayako.sdk.helpcenter.locale.Locale> callback) {
        new ListManager<com.kayako.sdk.helpcenter.locale.Locale>(RequesterFactory.getLocaleListRequester(mHelpDeskUrl), ParserFactory.getLocaleListParser()).getList(callback);
    }

    public void getLocales(com.kayako.sdk.base.callback.ListCallback<com.kayako.sdk.helpcenter.locale.Locale> callback) {
        new ListManager<com.kayako.sdk.helpcenter.locale.Locale>(RequesterFactory.getLocaleListRequester(mHelpDeskUrl), ParserFactory.getLocaleListParser()).getList(callback);
    }


    public com.kayako.sdk.helpcenter.locale.Locale getLocale(long localeId) throws KayakoException {
        return new ItemManager<com.kayako.sdk.helpcenter.locale.Locale>(RequesterFactory.getLocaleItemRequester(mHelpDeskUrl, localeId), ParserFactory.getLocaleItemParser()).getItem();
    }

    public void getLocale(long localeId, ItemCallback<com.kayako.sdk.helpcenter.locale.Locale> callback) {
        new ItemManager<com.kayako.sdk.helpcenter.locale.Locale>(RequesterFactory.getLocaleItemRequester(mHelpDeskUrl, localeId), ParserFactory.getLocaleItemParser()).getItem(callback);
    }

}
