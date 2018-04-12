package com.kayako.sdk;

import com.kayako.sdk.base.parser.DataNodeParser;
import com.kayako.sdk.error.response.*;
import com.kayako.sdk.helpcenter.articles.ArticleParser;
import com.kayako.sdk.helpcenter.category.CategoryParser;
import com.kayako.sdk.helpcenter.locale.LocaleParser;
import com.kayako.sdk.helpcenter.search.SearchArticleParser;
import com.kayako.sdk.helpcenter.section.SectionParser;
import com.kayako.sdk.helpcenter.user.UserMinimalParser;
import com.kayako.sdk.messenger.attachment.AttachmentParser;
import com.kayako.sdk.messenger.attachment.ThumbnailParser;
import com.kayako.sdk.messenger.conversation.ConversationParser;
import com.kayako.sdk.messenger.conversation.fields.priority.PriorityParser;
import com.kayako.sdk.messenger.conversation.fields.readmarker.ReadMarkerParser;
import com.kayako.sdk.messenger.conversation.fields.status.StatusParser;
import com.kayako.sdk.messenger.conversation.fields.team.TeamParser;
import com.kayako.sdk.messenger.conversationstarter.ConversationStarterParser;
import com.kayako.sdk.messenger.message.MessageParser;
import static org.hamcrest.CoreMatchers.instanceOf;

import com.kayako.sdk.messenger.rating.RatingParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

public class ParserFactoryTest {

    private Locale locale;

    @Before
    public void setup() {
        locale = Locale.ENGLISH;
    }

    @Test
    public void getErrorListParser() {
        Assert.assertThat(ParserFactory.getErrorListParser(), instanceOf(ErrorListParser.class));
    }

    @Test
    public void getErrorParser() {
        Assert.assertThat(ParserFactory.getErrorParser(), instanceOf(ErrorListParser.class));
    }

    @Test
    public void getNotificationListParser() {
        Assert.assertThat(ParserFactory.getNotificationListParser(), instanceOf(NotificationListParser.class));
    }

    @Test
    public void getLogListParser() {
        Assert.assertThat(ParserFactory.getLogListParser(), instanceOf(LogListParser.class));
    }

    @Test
    public void getLogParser() {
        Assert.assertThat(ParserFactory.getLogParser(),instanceOf(LogListParser.class));
    }

    @Test
    public void getCategoryListParser() {
        Assert.assertThat(ParserFactory.getCategoryListParser(locale), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getCategoryItemParser() {
        Assert.assertThat(ParserFactory.getCategoryItemParser(locale), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getCategoryParser() {
        Assert.assertThat(ParserFactory.getCategoryParser(locale), instanceOf(CategoryParser.class));
    }

    @Test
    public void getSectionListParser() {
        Assert.assertThat(ParserFactory.getSectionListParser(locale), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getSectionItemParser() {
        Assert.assertThat(ParserFactory.getSectionItemParser(locale), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getSectionParser() {
        Assert.assertThat(ParserFactory.getSectionParser(locale), instanceOf(SectionParser.class));
    }

    @Test
    public void getArticleListParser() {
        Assert.assertThat(ParserFactory.getArticleListParser(locale), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getArticleItemParser() {
        Assert.assertThat(ParserFactory.getArticleItemParser(locale), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getArticleParser() {
        Assert.assertThat(ParserFactory.getArticleParser(locale), instanceOf(ArticleParser.class));
    }

    @Test
    public void getSearchArticleListParser() {
        Assert.assertThat(ParserFactory.getSearchArticleListParser(locale), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getSearchArticleParser() {
        Assert.assertThat(ParserFactory.getSearchArticleParser(locale), instanceOf(SearchArticleParser.class));
    }

    @Test
    public void getLocaleListParser() {
        Assert.assertThat(ParserFactory.getLocaleListParser(), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getLocaleItemParser() {
        Assert.assertThat(ParserFactory.getLocaleItemParser(), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getLocaleParser() {
        Assert.assertThat(ParserFactory.getLocaleParser(), instanceOf(LocaleParser.class));
    }

    @Test
    public void getUserMinimalParser() {
        Assert.assertThat(ParserFactory.getUserMinimalParser(), instanceOf(UserMinimalParser.class));
    }

    @Test
    public void getConversationItemParser() {
        Assert.assertThat(ParserFactory.getConversationItemParser(), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getConversationListParser() {
        Assert.assertThat(ParserFactory.getConversationListParser(), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getConversationParser() {
        Assert.assertThat(ParserFactory.getConversationParser(), instanceOf(ConversationParser.class));
    }

    @Test
    public void getTeamParser() {
        Assert.assertThat(ParserFactory.getTeamParser(), instanceOf(TeamParser.class));
    }

    @Test
    public void getStatusParser() {
        Assert.assertThat(ParserFactory.getStatusParser(), instanceOf(StatusParser.class));
    }

    @Test
    public void getPriorityParser() {
        Assert.assertThat(ParserFactory.getPriorityParser(), instanceOf(PriorityParser.class));
    }

    @Test
    public void getReadMarkerParser() {
        Assert.assertThat(ParserFactory.getReadMarkerParser(), instanceOf(ReadMarkerParser.class));
    }

    @Test
    public void getMessageParser() {
        Assert.assertThat(ParserFactory.getMessageParser(), instanceOf(MessageParser.class));
    }

    @Test
    public void getMessageListParser() {
        Assert.assertThat(ParserFactory.getMessageListParser(), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getMessageItemParser() {
        Assert.assertThat(ParserFactory.getMessageItemParser(), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getConversationStarterParser() {
        Assert.assertThat(ParserFactory.getConversationStarterParser(), instanceOf(ConversationStarterParser.class));
    }

    @Test
    public void getConversationStarterItemParser() {
        Assert.assertThat(ParserFactory.getConversationStarterItemParser(), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getThumbnailParser() {
        Assert.assertThat(ParserFactory.getThumbnailParser(), instanceOf(ThumbnailParser.class));
    }

    @Test
    public void getAttachmentParser() {
        Assert.assertThat(ParserFactory.getAttachmentParser(), instanceOf(AttachmentParser.class));
    }

    @Test
    public void getRatingParser() {
        Assert.assertThat(ParserFactory.getRatingParser(), instanceOf(RatingParser.class));
    }

    @Test
    public void getRatingListParser() {
        Assert.assertThat(ParserFactory.getRatingListParser(), instanceOf(DataNodeParser.class));
    }

    @Test
    public void getItemRatingParser() {
        Assert.assertThat(ParserFactory.getItemRatingParser(), instanceOf(DataNodeParser.class));
    }
}
