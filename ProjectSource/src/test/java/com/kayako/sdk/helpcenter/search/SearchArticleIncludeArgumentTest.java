package com.kayako.sdk.helpcenter.search;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertNotNull;

public class SearchArticleIncludeArgumentTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: SearchArticleIncludeArgument */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void clinit() throws Throwable {
        Object constructed;
        {
            /* Act */
            /* Using constructor to test static initializer */
            constructed = Reflector.getInstance("com.kayako.sdk.helpcenter.search.SearchArticleIncludeArgument");
            assertNotNull(constructed);
        /* Method return type is void, or not expected to return */
        }
    }
}
