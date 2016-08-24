package com.kayako.sdk.helpcenter.category;

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
 * @date 11/08/16
 */
public class CategoryParser implements ListParser<Category> {

    private static final String NODE_DATA = "data";
    private static final String NODE_TITLES = "titles";
    private static final String ITEM_ID = "id";
    private static final String NODE_DESCRIPTION = "descriptions";

    private Locale mLocale;

    private CategoryParser() {
    }

    public CategoryParser(Locale locale) {
        mLocale = locale;
    }

    public List<Category> parse(String json, Locale locale) {
        List<Category> categoryList = new ArrayList<>();

        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        JsonArray data = jsonObject.getAsJsonArray(NODE_DATA);

        for (JsonElement dataNode : data) {
            JsonObject categoryNode = dataNode.getAsJsonObject();
            Category category = new Category();

            // Id
            category.setId(categoryNode.get(ITEM_ID).getAsLong());

            // Title
            JsonArray titleLocales = categoryNode.get(NODE_TITLES).getAsJsonArray();
            category.setTitle(ParserUtils.getTranslationFromLocaleField(mLocale, titleLocales));

            // Description
            JsonArray descriptionLocales = categoryNode.get(NODE_DESCRIPTION).getAsJsonArray();
            category.setDescription(ParserUtils.getTranslationFromLocaleField(mLocale, descriptionLocales));

            categoryList.add(category);
        }

        return categoryList;
    }

    @Override
    public List<Category> parse(String json) {
        return parse(json, mLocale);
    }
}
