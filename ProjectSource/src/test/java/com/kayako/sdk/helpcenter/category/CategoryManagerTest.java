package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.RequesterFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public class CategoryManagerTest {

    private CategoryManager mCategoryManager;

    @Test
    public void getCategories_LiveTest() throws Exception {
        Locale locale = Locale.US;
        mCategoryManager = new CategoryManager(RequesterFactory.getCategoryRequester(0, 999), ParserFactory.getCategoryParser(locale));

        String url = "https://support.kayako.com";
        List<Category> categoryList = mCategoryManager.getCategories(url);
        Assert.assertNotNull(categoryList);

        for (Category category : categoryList) {
            Assert.assertNotNull(category);
            Assert.assertNotNull(category.getTitle());
            Assert.assertNotNull(category.getId());

            System.out.println(category.getId() + " : " + category.getTitle());
        }
    }
}