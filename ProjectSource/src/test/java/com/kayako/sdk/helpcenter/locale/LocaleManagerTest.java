package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.RequesterFactory;
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
        LocaleManager localeManager = new LocaleManager(RequesterFactory.getLocaleRequester(), ParserFactory.getLocaleParser());
        List<Locale> locales = localeManager.getLocales("http://support.kayako.com");

        for (Locale locale : locales) {
            LocaleParserTest.validateLocale(locale);
        }
    }

}