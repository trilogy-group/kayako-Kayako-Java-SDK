package com.kayako.sdk.helpcenter.articles;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kayako.sdk.helpcenter.base.ListParser;
import com.kayako.sdk.utils.ParserUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class ArticleParser implements ListParser<Article> {

    private static final String NODE_DATA = "data";
    private static final String NODE_TITLES = "titles";
    private static final String ITEM_ID = "id";
    private static final String ITEM_UIID = "uuid";
    private static final String NODE_DESCRIPTION = "descriptions";

    private Locale mLocale;

    private ArticleParser() {
    }

    public ArticleParser(Locale locale) {
        mLocale = locale;
    }

    private List<Article> parse(String json, Locale locale) {
        List<Article> articleList = new ArrayList<>();

        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        JsonArray data = jsonObject.getAsJsonArray(NODE_DATA);

        for (JsonElement dataNode : data) {
            JsonObject sectionNode = dataNode.getAsJsonObject();
            Article article = new Article();

            // Id
            article.setId(sectionNode.get(ITEM_ID).getAsLong());

            // UUID
            article.setUuid(sectionNode.get(ITEM_UIID).getAsString());

            // Title
            JsonArray titleLocales = sectionNode.get(NODE_TITLES).getAsJsonArray();
            article.setTitle(ParserUtils.getTranslationFromLocaleField(mLocale, titleLocales));

            articleList.add(article);
        }

        return articleList;
    }

    @Override
    public List parse(String json) {
        return parse(json, mLocale);
    }
}
