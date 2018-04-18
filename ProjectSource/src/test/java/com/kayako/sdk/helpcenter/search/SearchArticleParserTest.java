package com.kayako.sdk.helpcenter.search;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import java.util.Locale;
import org.junit.Test;
import com.kayako.sdk.base.parser.DataNodeParser;
import com.kayako.sdk.utils.MessageLoader;

public class SearchArticleParserTest {

  private final String MESSAGE_FILE = "search_article_parser";
  private final String CONTENT_FILE = "search_article_parser";
  private final int CONTENT_LENGTH = 3;

  @Test
  public void parse() throws Exception {
    String json = MessageLoader.readFile(MESSAGE_FILE, CONTENT_FILE, CONTENT_LENGTH);

    SearchArticleParser searchArticleParser =
        new SearchArticleParser(Locale.forLanguageTag("en-us"));
    List<SearchArticle> searchArticleList =
        new DataNodeParser<>(searchArticleParser).parseList(json);

    for (SearchArticle searchArticle : searchArticleList) {
      System.out.println(searchArticle.getTitle() + " : " + searchArticle.getCategoryName() + " > "
          + searchArticle.getSectionName());
      assertNotNull(searchArticle.getTitle());
      assertNotNull(searchArticle.getCategoryName());
      assertNotNull(searchArticle.getSectionName());
      assertNotNull(searchArticle.getOriginalArticle());
      assertNotNull(searchArticle.getOriginalArticle().getSection());
      assertNotNull(searchArticle.getOriginalArticle().getSection().getCategory());
    }
  }
}
