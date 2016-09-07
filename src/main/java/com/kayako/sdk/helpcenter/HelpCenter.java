package com.kayako.sdk.helpcenter;

import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.articles.ArticleManager;
import com.kayako.sdk.helpcenter.articles.ArticleParser;
import com.kayako.sdk.helpcenter.articles.ArticleRequester;
import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.helpcenter.category.CategoryManager;
import com.kayako.sdk.helpcenter.category.CategoryParser;
import com.kayako.sdk.helpcenter.category.CategoryRequester;
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

    private SectionManager mSectionManager;
    private ArticleManager mArticleManager;
    private SearchArticle mSearchArticleManager;

    public HelpCenter(String helpDeskUrl, Locale locale) {
        mHelpDeskUrl = helpDeskUrl;
        mLocale = locale;
    }

    public List<Category> getCategories(int offset, int limit) {
        CategoryManager categoryManager = new CategoryManager(new CategoryRequester(offset, limit), new CategoryParser(mLocale));
        return categoryManager.getCategories(mHelpDeskUrl);
    }

    public void getCategories(int offset, int limit, CategoryManager.Callback callback) {
        CategoryManager categoryManager = new CategoryManager(new CategoryRequester(offset, limit), new CategoryParser(mLocale));
        categoryManager.getCategories(mHelpDeskUrl, callback);
    }

    public List<Section> getSections(long categoryId, int offset, int limit) {
        SectionManager sectionManager = new SectionManager(new SectionRequester(categoryId, offset, limit), new SectionParser(mLocale));
        return sectionManager.getSections(mHelpDeskUrl);
    }

    public void getSections(long categoryId, int offset, int limit, SectionManager.Callback callback) {
        SectionManager sectionManager = new SectionManager(new SectionRequester(categoryId, offset, limit), new SectionParser(mLocale));
        sectionManager.getSections(mHelpDeskUrl, callback);
    }

    public List<Article> getArticles(long sectionId, int offset, int limit) {
        ArticleManager articleManager = new ArticleManager(new ArticleRequester(sectionId, offset, limit), new ArticleParser(mLocale));
        return articleManager.getArticles(mHelpDeskUrl);
    }

    public void getArticles(long sectionId, int offset, int limit, ArticleManager.Callback callback) {
        ArticleManager articleManager = new ArticleManager(new ArticleRequester(sectionId, offset, limit), new ArticleParser(mLocale));
        articleManager.getArticles(mHelpDeskUrl, callback);
    }

    public List<SearchArticle> getSearchArticles(String query, int offset, int limit) {
        SearchArticleManager searchArticleManager = new SearchArticleManager(new SearchArticleRequester(query, offset, limit), new SearchArticleParser(mLocale));
        return searchArticleManager.getSearchArticles(mHelpDeskUrl);
    }

    public void getSearchArticles(String query, int offset, int limit, SearchArticleManager.Callback callback) {
        SearchArticleManager searchArticleManager = new SearchArticleManager(new SearchArticleRequester(query, offset, limit), new SearchArticleParser(mLocale));
        searchArticleManager.getSearchArticles(mHelpDeskUrl, callback);
    }
}
