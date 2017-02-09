package com.kayako.sdk.helpcenter.category;

import com.kayako.sdk.base.manager.ItemManager;
import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.RequesterFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public class CategoryManagerTest {

    final private Locale LOCALE = Locale.US;
    final private String URL = "https://support.kayako.com";

    @Test
    public void getCategories_LiveTest() throws Exception {
        List<Category> categoryList = new ListManager<Category>(RequesterFactory.getCategoryListRequester(URL, 0, 999), ParserFactory.getCategoryListParser(LOCALE)).getList();
        Assert.assertNotNull(categoryList);

        for (Category category : categoryList) {
            validateCategory(category);
        }
    }

    @Test
    public void getCategory_LiveTest() throws Exception {
        Category category = new ItemManager<Category>(RequesterFactory.getCategoryItemRequester(URL, 1), ParserFactory.getCategoryItemParser(LOCALE)).getItem();
        validateCategory(category);
    }

    private void validateCategory(Category category) {
        Assert.assertNotNull(category);
        Assert.assertNotNull(category.getTitle());
        Assert.assertNotNull(category.getId());
        System.out.println(category.getId() + " : " + category.getTitle());
    }

}