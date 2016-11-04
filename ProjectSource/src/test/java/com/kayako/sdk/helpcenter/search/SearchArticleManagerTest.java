package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.RequesterFactory;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 26/08/16
 */
public class SearchArticleManagerTest {
    @Test
    public void getSearchArticles_LiveTest() throws Exception {
        Locale locale = Locale.US;
        String query = "hel";
        String helpCenterUrl = "https://support.kayako.com";
        List<SearchArticle> searchArticleList = new ListManager<SearchArticle>(RequesterFactory.getSearchArticleListRequester(helpCenterUrl, query, 0, 99), ParserFactory.getSearchArticleListParser(locale)).getList();

        for (SearchArticle searchArticle : searchArticleList) {
            System.out.println("------");
            System.out.println(searchArticle.getTitle());
            System.out.println(searchArticle.getCategoryName() + " > " + searchArticle.getSectionName());
            assertNotNull(searchArticle.getOriginalArticle());
            assertNotNull(searchArticle.getOriginalArticle().getSection());
            assertNotNull(searchArticle.getOriginalArticle().getSection().getCategory());
        }
    }

    @Test
    public void performMultipleSearches() throws Exception {
        try {
            performSearch("h");
        } catch (Exception e) {

        }

        try {
            performSearch("he");
        } catch (Exception e) {

        }

        try {
            performSearch("hel");
        } catch (Exception e) {

        }

        performSearch("zapier");
    }

    /**
     * Performs a search on the Kayako Articles.
     * <p>
     * The search fails if the query is less than 3 characters long.
     *
     * @param query query used for search
     */
    public void performSearch(String query) {
        Locale locale = Locale.ENGLISH;
        String helpCenterUrl = "https://support.kayako.com";

        List<SearchArticle> searchArticleList = new ListManager<SearchArticle>(RequesterFactory.getSearchArticleListRequester(helpCenterUrl, query, 0, 99), ParserFactory.getSearchArticleListParser(locale)).getList();

        for (SearchArticle searchArticle : searchArticleList) {
            System.out.println("------");
            System.out.println(searchArticle.getTitle());
            System.out.println(searchArticle.getCategoryName() + " > " + searchArticle.getSectionName());
            assertNotNull(searchArticle.getOriginalArticle());
            assertNotNull(searchArticle.getOriginalArticle().getSection());
            assertNotNull(searchArticle.getOriginalArticle().getSection().getCategory());
        }
    }
}