package com.kayako.sdk.helpcenter;

import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.helpcenter.category.CategoryManager;
import com.kayako.sdk.helpcenter.category.CategoryParser;
import com.kayako.sdk.helpcenter.category.CategoryRequester;

import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class HelpCenter {

    private String mHelpDeskUrl;
    private Locale mLocale;

    private CategoryManager mCategoryManager;

    public HelpCenter(String helpDeskUrl, Locale locale) {
        mHelpDeskUrl = helpDeskUrl;
        mLocale = locale;
        mCategoryManager = new CategoryManager(new CategoryRequester(), new CategoryParser(mLocale));
    }

    List<Category> getCategories() {
        return mCategoryManager.getCategories(mHelpDeskUrl);
    }

}
