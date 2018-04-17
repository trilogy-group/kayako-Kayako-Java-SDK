package com.kayako.sdk.helpcenter.section;

import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.List;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import com.kayako.sdk.base.parser.DataNodeParser;
import com.kayako.sdk.utils.MessageLoader;

public class SectionParserTest {

  private final String MESSAGE_FILE = "section_parser";
  private final String CONTENT_FILE = "section_parser";
  private final int CONTENT_LENGTH = 5;

  @Rule
  public final ErrorCollector collector = new ErrorCollector();

  @Test
  public void parse() throws Exception {
    String sampleResponse = MessageLoader.readFile(MESSAGE_FILE, CONTENT_FILE, CONTENT_LENGTH);

    Locale locale = Locale.ENGLISH;

    SectionParser sectionParser = new SectionParser(locale);

    List<Section> sectionList = new DataNodeParser<>(sectionParser).parseList(sampleResponse);

    assertTrue("There should be 5 sections parsed", sectionList.size() == 5);
    for (Section section : sectionList) {
      validateSection(section);
    }
  }

  private void validateSection(Section section) {
    collector.checkThat(section.getId(), notNullValue());
    collector.checkThat(section.getTitle(), notNullValue());
    System.out.println(section.getId() + ":" + section.getTitle());
  }
}
