package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.manager.ItemManager;
import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.RequesterFactory;
import org.junit.Test;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/09/16
 */
public class LocaleManagerTest {

    @Test
    public void getLocales() throws Exception {
        List<Locale> locales = new ListManager<Locale>(RequesterFactory.getLocaleListRequester("http://support.kayako.com"), ParserFactory.getLocaleListParser()).getList();

        for (Locale locale : locales) {
            LocaleParserTest.validateLocale(locale);
        }
    }

    @Test
    public void getLocale() throws Exception {
        Locale locale = new ItemManager<Locale>(RequesterFactory.getLocaleItemRequester("http://support.kayako.com", 1), ParserFactory.getLocaleItemParser()).getItem();
        LocaleParserTest.validateLocale(locale);
    }

}