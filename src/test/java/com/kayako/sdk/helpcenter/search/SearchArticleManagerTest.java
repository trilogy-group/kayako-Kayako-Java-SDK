package com.kayako.sdk.helpcenter.search;

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
        Locale locale = Locale.forLanguageTag("en-us");
        String query = "zapier";
        String helpCenterUrl = "https://support.kayako.com";
        SearchArticleManager searchArticleManager = new SearchArticleManager(RequesterFactory.getSearchArticlesRequester(query,0,99), ParserFactory.getSearchArticleParser(locale));
        List<SearchArticle> searchArticleList = searchArticleManager.getSearchArticles(helpCenterUrl);

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