package com.kayako.sdk.helpcenter.section;

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
public class SectionParser implements ListParser<Section> {

    private static final String NODE_DATA = "data";
    private static final String NODE_TITLES = "titles";
    private static final String ITEM_ID = "id";
    private static final String ITEM_LOCALE = "locale";
    private static final String ITEM_TRANSLATION = "translation";
    private static final String NODE_DESCRIPTION = "descriptions";

    private Locale mLocale;

    private SectionParser() {
    }

    public SectionParser(Locale locale) {
        mLocale = locale;
    }

    public List<Section> parse(String json, Locale locale) {
        List<Section> sectionList = new ArrayList<>();

        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        JsonArray data = jsonObject.getAsJsonArray(NODE_DATA);

        for (JsonElement dataNode : data) {
            JsonObject sectionNode = dataNode.getAsJsonObject();
            Section section = new Section();

            // Id
            section.setId(sectionNode.get(ITEM_ID).getAsLong());

            // Title
            JsonArray titleLocales = sectionNode.get(NODE_TITLES).getAsJsonArray();
            section.setTitle(ParserUtils.getTranslationFromLocaleField(mLocale, titleLocales));

            // Description
            JsonArray descriptionLocales = sectionNode.get(NODE_DESCRIPTION).getAsJsonArray();
            section.setDescription(ParserUtils.getTranslationFromLocaleField(mLocale, descriptionLocales));

            sectionList.add(section);
        }

        return sectionList;
    }

    @Override
    public List parse(String json) {
        return parse(json, mLocale);
    }
}
