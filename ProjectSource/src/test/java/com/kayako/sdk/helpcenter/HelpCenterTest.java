package com.kayako.sdk.helpcenter;

import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.helpcenter.search.SearchArticle;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.mockserver.MockWebServerHelper;
import com.kayako.sdk.mockserver.SampleDispatcher;
import com.kayako.sdk.mockserver.base.ISampleResponse;
import com.kayako.sdk.mockserver.helpcenter.responses.*;
import com.kayako.sdk.utils.LogUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 30/09/16
 */
public class HelpCenterTest {

    private MockWebServerHelper mMockWebServer = new MockWebServerHelper();
    private HelpCenter mHelpCenter;

    @Before
    public void setUp() throws IOException {
        mMockWebServer.callOnSetup();

        // String helpCenterUrl = "http://support.kayako.com"; LogUtils.setShowLogs(true);
        String helpCenterUrl = mMockWebServer.getMockedUrl();
        mHelpCenter = new HelpCenter(helpCenterUrl, Locale.US);
    }

    @After
    public void tearDown() throws Exception {
        mMockWebServer.callOnTearDown();
    }

    @Test
    public void getCategories() {
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetCategories());
        responses.add(new GetCategory());
        mMockWebServer.setDispatcher(new SampleDispatcher(responses));

        try {
            System.out.print(mHelpCenter.getCategories(0, 10).get(0));
            System.out.print(mHelpCenter.getCategory(1));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getCategoriesCallback() {
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetCategories());
        responses.add(new GetCategory());
        mMockWebServer.setDispatcher(new SampleDispatcher(responses));

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
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetSections());
        responses.add(new GetSection());
        mMockWebServer.setDispatcher(new SampleDispatcher(responses));

        try {
            System.out.print(mHelpCenter.getSections(1, 0, 10).get(0));

            System.out.print(mHelpCenter.getSection(194));
        } catch (Exception e) {
            fail();
        }

    }

    @Test
    public void getSectionsCallback() {
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetSections());
        responses.add(new GetSection());
        mMockWebServer.setDispatcher(new SampleDispatcher(responses));

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
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetArticle());
        responses.add(new GetArticles());
        mMockWebServer.setDispatcher(new SampleDispatcher(responses));

        try {
            System.out.print(mHelpCenter.getArticles(243, 0, 10).get(0));

            System.out.print(mHelpCenter.getArticle(1145));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getArticlesCallback() {
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetArticle());
        responses.add(new GetArticles());
        mMockWebServer.setDispatcher(new SampleDispatcher(responses));

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
        mMockWebServer.setDispatcher(new SampleDispatcher(new GetSearchArticles()));

        try {
            System.out.print(mHelpCenter.getSearchArticles("kayako", 0, 10).get(0));
        } catch (Exception e) {
            fail();
        }

    }

    @Test
    public void getSearchArticlesCallback() {
        mMockWebServer.setDispatcher(new SampleDispatcher(new GetSearchArticles()));

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
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetLocale());
        responses.add(new GetLocales());
        mMockWebServer.setDispatcher(new SampleDispatcher(responses));

        try {
            System.out.print(mHelpCenter.getLocales().get(0));

            System.out.print(mHelpCenter.getLocale(1));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getLocalesCallback() {
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetLocale());
        responses.add(new GetLocales());
        mMockWebServer.setDispatcher(new SampleDispatcher(responses));

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