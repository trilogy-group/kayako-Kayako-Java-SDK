package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.utils.ParserUtils;

import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class SectionParser implements Parser<Section> {

    private static final String NODE_TITLES = "titles";
    private static final String ITEM_ID = "id";
    private static final String NODE_CATEGORY = "category";
    private static final String NODE_DESCRIPTION = "descriptions";

    private Locale mLocale;

    private SectionParser() {
    }

    public SectionParser(Locale locale) {
        mLocale = locale;
    }

    @Override
    public Section parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap = ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        Section section = new Section();
        section.setId(resourceMap.getAsLong(ITEM_ID));
        section.setTitle(resourceMap.getAsLocalizedString(NODE_TITLES, mLocale));
        section.setDescription(resourceMap.getAsLocalizedString(NODE_DESCRIPTION, mLocale));

        Category category = ParserFactory.getCategoryParser(mLocale).parse(resourceMap.getAsJsonString(NODE_CATEGORY));
        section.setCategory(category);

        return section;
    }
}
