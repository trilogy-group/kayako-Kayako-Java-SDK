package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.utils.ParserUtils;

import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class SearchArticleParser implements Parser<SearchArticle> {

    private static final String NODE_ORIGINAL = "original";

    private Locale mLocale;

    private SearchArticleParser() {
    }

    public SearchArticleParser(Locale locale) {
        mLocale = locale;
    }

    @Override
    public SearchArticle parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);
        Parser<Article> articleParser = ParserFactory.getArticleParser(mLocale);

        Article article = articleParser.parse(resourceMap.getAsJsonString(NODE_ORIGINAL));

        SearchArticle searchArticle = new SearchArticle();
        searchArticle.setOriginalArticle(article);
        searchArticle.setTitle(article.getTitle());
        searchArticle.setSectionName(article.getSection().getTitle());
        searchArticle.setCategoryName(article.getSection().getCategory().getTitle());

        return searchArticle;
    }

}
