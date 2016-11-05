package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.manager.ItemManager;
import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.RequesterFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.fail;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class ArticleManagerTest {

    @Test
    public void getArticles_LiveTest() {
        try {
            Locale locale = Locale.forLanguageTag("en-us");
            Long sectionId = 253L;
            ListManager<Article> articleManager = new ListManager<>(RequesterFactory.getArticleListRequester("https://support.kayako.com", sectionId, 0, 20), ParserFactory.getArticleListParser(locale));
            List<Article> articleList = articleManager.getList();

            for (Article article : articleList) {
                validateArticle(article);
            }
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void getArticle_LiveTest() {
        try {
            Locale locale = Locale.forLanguageTag("en-us");
            Long sectionId = 253L;

            Article article = new ItemManager<Article>(RequesterFactory.getArticleItemRequester("https://support.kayako.com", 1210), ParserFactory.getArticleItemParser(locale)).getItem();
            validateArticle(article);
        } catch (Exception e) {
            Assert.fail();
        }
    }


    private void validateArticle(Article article) {
        Assert.assertNotNull(article);
        Assert.assertNotNull(article.getTitle());
        Assert.assertNotNull(article.getContents());
        Assert.assertNotNull(article.getId());
        System.out.println(article.getId() + " : " + article.getTitle() + ":" + article.getContents());
    }

}