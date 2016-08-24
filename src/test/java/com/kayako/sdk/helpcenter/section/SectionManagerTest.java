package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.helpcenter.ParserFactory;
import com.kayako.sdk.helpcenter.RequesterFactory;
import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.helpcenter.category.Category;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class SectionManagerTest {

    @Test
    public void getSections_LiveTest() throws Exception {
        Locale locale = Locale.forLanguageTag("en-us");
        long categoryId = 5;
        SectionManager sectionManager = new SectionManager(RequesterFactory.getSectionRequester(categoryId), ParserFactory.getSectionParser(locale));
        List<Section> sectionList = sectionManager.getSections("https://support.kayako.com");

        for (Section section : sectionList) {
            Assert.assertNotNull(section);
            Assert.assertNotNull(section.getTitle());
            Assert.assertNotNull(section.getId());

            System.out.println(section.getId() + " : " + section.getTitle());
        }
    }

}