package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.RequesterFactory;
import com.kayako.sdk.helpcenter.section.Section;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class ArticleManagerTest {

    @Test
    public void getArticles_LiveTest() throws Exception {
        Locale locale = Locale.forLanguageTag("en-us");
        Long sectionId = 253L;
        ArticleManager articleManager = new ArticleManager(RequesterFactory.getArticleRequester(sectionId, 0, 20), ParserFactory.getArticleParser(locale));
        List<Article> articleList = articleManager.getArticles("https://support.kayako.com");

        for (Article article : articleList) {
            Assert.assertNotNull(article);
            Assert.assertNotNull(article.getTitle());
            Assert.assertNotNull(article.getId());

            System.out.println(article.getId() + " : " + article.getTitle());
        }
    }

}