package com.kayako.sdk.helpcenter.articles;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.base.ItemParser;
import com.kayako.sdk.helpcenter.base.ListParser;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.user.UserMinimal;
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
    private static final String NODE_CONTENTS = "contents";
    private static final String ITEM_ID = "id";
    private static final String ITEM_UIID = "uuid";
    private static final String NODE_AUTHOR = "author";
    private static final String NODE_SECTION = "section";

    private Locale mLocale;

    private ArticleParser() {
    }

    public ArticleParser(Locale locale) {
        mLocale = locale;
    }

    private List<Article> parse(String json, Locale locale) {
        List<Article> articleList = new ArrayList<Article>();

        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        JsonArray data = jsonObject.getAsJsonArray(NODE_DATA);

        for (JsonElement articleNode : data) {
            Article article = parseItem(articleNode.getAsJsonObject());
            articleList.add(article);
        }

        return articleList;
    }

    public List parse(String json) {
        return parse(json, mLocale);
    }

    public Article parseItem(JsonObject articleNode) {
        Article article = new Article();

        // Id
        article.setId(articleNode.get(ITEM_ID).getAsLong());

        // UUID
        article.setUuid(articleNode.get(ITEM_UIID).getAsString());

        // Contents
        JsonArray contentLocales = articleNode.get(NODE_CONTENTS).getAsJsonArray();
        article.setContents(ParserUtils.getTranslationFromLocaleField(mLocale, contentLocales));

        // Title
        JsonArray titleLocales = articleNode.get(NODE_TITLES).getAsJsonArray();
        article.setTitle(ParserUtils.getTranslationFromLocaleField(mLocale, titleLocales));

        // Section
        ListParser<Section> sectionParser = ParserFactory.getSectionParser(mLocale);
        JsonObject sectionNode = articleNode.get(NODE_SECTION).getAsJsonObject();
        article.setSection(sectionParser.parseItem(sectionNode));

        // Author
        JsonObject authorNode = articleNode.get(NODE_AUTHOR).getAsJsonObject();
        ItemParser userParser = ParserFactory.getUserMinimalParser();
        UserMinimal author = (UserMinimal) userParser.parseItem(authorNode);
        article.setAuthor(author);

        return article;

    }
}
