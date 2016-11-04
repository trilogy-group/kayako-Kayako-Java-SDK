package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.RequesterFactory;
import com.kayako.sdk.helpcenter.category.Category;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/09/16
 */
public class LocaleManagerTest {

    @Test
    public void getLocales() throws Exception {

        List<Locale> locales = new ListManager<Locale>(RequesterFactory.getLocaleRequester("http://support.kayako.com"), ParserFactory.getLocaleParser()).getList();

        for (Locale locale : locales) {
            LocaleParserTest.validateLocale(locale);
        }
    }

}