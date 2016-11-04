package com.kayako.sdk.helpcenter.search;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.base.parser.ListParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class SearchArticleParser implements ListParser<SearchArticle> {

    private static final String NODE_DATA = "data";
    private static final String NODE_ORIGINAL = "original";

    private Locale mLocale;

    private SearchArticleParser() {
    }

    public SearchArticleParser(Locale locale) {
        mLocale = locale;
    }

    private List<SearchArticle> parse(String json, Locale locale) {
        List<SearchArticle> searchArticleList = new ArrayList<SearchArticle>();

        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        JsonArray dataNode = jsonObject.getAsJsonArray(NODE_DATA);

        // The json response has a separate title and content fields (non-localized).
        // Therefore, choosing to extract the localized titles from the original node (where the article object is available);

        JsonArray searchResults = dataNode.getAsJsonArray();

        for (JsonElement jsonElement : searchResults) {
            JsonObject searchResultNode = jsonElement.getAsJsonObject();
            SearchArticle searchArticle = parseItem(searchResultNode);
            searchArticleList.add(searchArticle);
        }

        return searchArticleList;
    }


    public List parse(String json) {
        return parse(json, mLocale);
    }

    public SearchArticle parseItem(JsonObject node) {
        JsonObject articleNode = node.get(NODE_ORIGINAL).getAsJsonObject();

        Parser<Article> articleParser = ParserFactory.getArticleParser(mLocale);
        Article article = articleParser.parseItem(articleNode);

        SearchArticle searchArticle = new SearchArticle();
        searchArticle.setOriginalArticle(article);
        searchArticle.setTitle(article.getTitle());
        searchArticle.setSectionName(article.getSection().getTitle());
        searchArticle.setCategoryName(article.getSection().getCategory().getTitle());

        return searchArticle;
    }
}
