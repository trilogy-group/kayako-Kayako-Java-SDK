package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.utils.ParserUtils;

import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class CategoryParser implements Parser<Category> {

    private static final String NODE_TITLES = "titles";
    private static final String ITEM_ID = "id";
    private static final String NODE_DESCRIPTION = "descriptions";

    private Locale mLocale;

    public CategoryParser(Locale locale) {
        mLocale = locale;
    }

    @Override
    public Category parse(String jsonOfResource) throws NullPointerException {
        ParserUtils.ResourceMap resourceMap =
                ParserUtils.convertResourceJsonToResourceMap(jsonOfResource);

        Category category = new Category();
        category.setId(resourceMap.getAsLong(ITEM_ID));
        category.setTitle(resourceMap.getAsLocalizedString(NODE_TITLES, mLocale));
        category.setDescription(resourceMap.getAsLocalizedString(NODE_DESCRIPTION, mLocale));
        return category;
    }
}
