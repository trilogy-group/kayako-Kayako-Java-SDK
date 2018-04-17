package com.kayako.sdk.helpcenter.articles;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;
import com.kayako.sdk.base.parser.DataNodeParser;
import com.kayako.sdk.utils.MessageLoader;

public class ArticleParserTest {

  private static final String MESSAGE_FILE = "article_parser";
  private static final String CONTENT_FILE = "article_parser";
  private static final int CONTENT_LENGTH = 2;

  @Test
  public void parse() throws Exception {
    String jsonSample = MessageLoader.readFile(MESSAGE_FILE, CONTENT_FILE, CONTENT_LENGTH);

    Locale locale = Locale.US;
    ArticleParser articleParser = new ArticleParser(locale);
    List<Article> articleList = new DataNodeParser<>(articleParser).parseList(jsonSample);

    assertTrue("There should be 2 articles parsed", articleList.size() == 2);
    validateArticle1(articleList.get(0));
  }

  private void validateArticle1(Article article) {
    Assert.assertTrue(article.getLastPosted() != 0);
    Assert.assertTrue(article.getLastUpdated() != 0);

    Assert.assertTrue(article.getId() == 1145);
    Assert.assertTrue(article.getTitle().equals("Starting out with Kayako"));
    Assert.assertTrue(article.getAuthor().getId() == 389);

    System.out.println(article.getId() + ":" + article.getTitle());
    System.out.println("Author:" + article.getAuthor().getFullName());
  }
}
