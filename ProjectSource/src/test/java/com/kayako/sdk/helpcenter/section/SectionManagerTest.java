package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.RequesterFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class SectionManagerTest {

    @Test
    public void getSections_LiveTest() throws Exception {
        Locale locale = Locale.US;
        long categoryId = 5;
        List<Section> sectionList = new ListManager<Section>(RequesterFactory.getSectionRequester("https://support.kayako.com", categoryId, 0, 999), ParserFactory.getSectionParser(locale)).getList();

        for (Section section : sectionList) {
            Assert.assertNotNull(section);
            Assert.assertNotNull(section.getTitle());
            Assert.assertNotNull(section.getId());

            System.out.println(section.getId() + " : " + section.getTitle());
        }
    }

}