package com.kayako.sdk.helpcenter;

import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.helpcenter.search.SearchArticle;
import com.kayako.sdk.helpcenter.section.Section;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 30/09/16
 */
public class HelpCenterTest {

    HelpCenter mHelpCenter;

    @Before
    public void setUp() {
        mHelpCenter = new HelpCenter("http://support.kayako.com", Locale.US);
    }

    @Test
    public void getCategories() {
        System.out.print(mHelpCenter.getCategories(0, 10).get(0));
    }

    @Test
    public void getCategoriesCallback() {
        mHelpCenter.getCategories(0, 10, new ListCallback<Category>() {
            @Override
            public void onSuccess(List<Category> items) {
                System.out.print(items.get(0));
            }

            @Override
            public void onError(Throwable error) {
                fail();
            }
        });
    }

    @Test
    public void getSections() {
        System.out.print(mHelpCenter.getSections(1, 0, 10).get(0));
    }

    @Test
    public void getSectionsCallback() {
        mHelpCenter.getSections(1, 0, 10, new ListCallback<Section>() {
            @Override
            public void onSuccess(List<Section> items) {
                System.out.print(items.get(0));
            }

            @Override
            public void onError(Throwable error) {
                fail();
            }
        });
    }

    @Test
    public void getArticles() {
        System.out.print(mHelpCenter.getArticles(243, 0, 10).get(0));
    }

    @Test
    public void getArticlesCallback() {
        mHelpCenter.getArticles(1, 0, 10, new ListCallback<Article>() {
            @Override
            public void onSuccess(List<Article> items) {
                System.out.print(items.get(0));
            }

            @Override
            public void onError(Throwable error) {
                fail();
            }
        });
    }

    @Test
    public void getSearchArticles() {
        System.out.print(mHelpCenter.getSearchArticles("kayako", 0, 10).get(0));
    }

    @Test
    public void getSearchArticlesCallback() {
        mHelpCenter.getSearchArticles("kayako", 0, 10, new ListCallback<SearchArticle>() {
            @Override
            public void onSuccess(List<SearchArticle> items) {
                System.out.print(items.get(0));
            }

            @Override
            public void onError(Throwable error) {
                fail();
            }
        });
    }

    @Test
    public void getLocales() {
        System.out.print(mHelpCenter.getLocales().get(0));
    }

    @Test
    public void getLocalesCallback() {
        mHelpCenter.getLocales(new ListCallback<com.kayako.sdk.helpcenter.locale.Locale>() {
            @Override
            public void onSuccess(List<com.kayako.sdk.helpcenter.locale.Locale> items) {
                System.out.print(items.get(0));
            }

            @Override
            public void onError(Throwable error) {
                fail();
            }
        });
    }
}