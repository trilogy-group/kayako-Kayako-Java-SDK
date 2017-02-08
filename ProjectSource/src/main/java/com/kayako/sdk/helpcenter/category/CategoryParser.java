package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.utils.ParserUtils;

import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class CategoryParser implements ListParser<Category>, ItemParser<Category> {

    private static final String NODE_TITLES = "titles";
    private static final String ITEM_ID = "id";
    private static final String NODE_DESCRIPTION = "descriptions";

    private Locale mLocale;

    private CategoryParser() {
    }

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

    public List<Category> parseList(String json) {
        return ParserUtils.getResourceListFromDataNode(json, this);
    }

    public Category parseItem(String json) throws NullPointerException {
        return ParserUtils.getResourceFromDataNode(json, this);
    }

    public boolean containsList(String jsonOfResponse) {
        return ParserUtils.checkIfListContainedInDataNode(jsonOfResponse);
    }

    public boolean containsItem(String jsonOfResponse) {
        return ParserUtils.checkIfItemContainedInDataNode(jsonOfResponse);
    }
}
