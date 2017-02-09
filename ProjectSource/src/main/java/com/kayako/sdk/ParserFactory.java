package com.kayako.sdk;

import com.kayako.sdk.base.parser.Parser;
import com.kayako.sdk.base.parser.DataNodeParser;
import com.kayako.sdk.error.response.*;
import com.kayako.sdk.error.response.Error;
import com.kayako.sdk.helpcenter.articles.Article;
import com.kayako.sdk.helpcenter.articles.ArticleParser;
import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.helpcenter.category.Category;
import com.kayako.sdk.helpcenter.category.CategoryParser;
import com.kayako.sdk.helpcenter.locale.LocaleParser;
import com.kayako.sdk.helpcenter.search.SearchArticle;
import com.kayako.sdk.helpcenter.search.SearchArticleParser;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.section.SectionParser;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import com.kayako.sdk.helpcenter.user.UserParser;
import com.kayako.sdk.messenger.conversation.Conversation;
import com.kayako.sdk.messenger.conversation.ConversationParser;
import com.kayako.sdk.messenger.conversation.fields.priority.Priority;
import com.kayako.sdk.messenger.conversation.fields.priority.PriorityParser;
import com.kayako.sdk.messenger.conversation.fields.status.Status;
import com.kayako.sdk.messenger.conversation.fields.status.StatusParser;
import com.kayako.sdk.messenger.conversation.fields.team.Team;
import com.kayako.sdk.messenger.conversation.fields.team.TeamParser;

import java.util.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class ParserFactory {

    // Category
    public static ListParser<Category> getCategoryListParser(Locale locale) {
        return new DataNodeParser<Category>(getCategoryParser(locale));
    }

    public static ItemParser<Category> getCategoryItemParser(Locale locale) {
        return new DataNodeParser<Category>(getCategoryParser(locale));
    }

    public static Parser<Category> getCategoryParser(Locale locale) {
        return new CategoryParser(locale);
    }

    // Sections
    public static ListParser<Section> getSectionListParser(Locale locale) {
        return new DataNodeParser<>(getSectionParser(locale));
    }

    public static ItemParser<Section> getSectionItemParser(Locale locale) {
        return new DataNodeParser<>(getSectionParser(locale));
    }

    public static Parser<Section> getSectionParser(Locale locale) {
        return new SectionParser(locale);
    }

    // Articles
    public static ListParser<Article> getArticleListParser(Locale locale) {
        return new DataNodeParser<>(new ArticleParser(locale));
    }

    public static ItemParser<Article> getArticleItemParser(Locale locale) {
        return new DataNodeParser<>(new ArticleParser(locale));
    }

    public static Parser<Article> getArticleParser(Locale locale) {
        return new ArticleParser(locale);
    }

    // Search Article
    public static ListParser<SearchArticle> getSearchArticleListParser(Locale locale) {
        return new DataNodeParser<>(getSearchArticleParser(locale));
    }

    public static Parser<SearchArticle> getSearchArticleParser(Locale locale) {
        return new SearchArticleParser(locale);
    }

    // Locales
    public static ListParser<com.kayako.sdk.helpcenter.locale.Locale> getLocaleListParser() {
        return new DataNodeParser<>(getLocaleParser());
    }

    public static ItemParser<com.kayako.sdk.helpcenter.locale.Locale> getLocaleItemParser() {
        return new DataNodeParser<>(getLocaleParser());
    }

    public static Parser<com.kayako.sdk.helpcenter.locale.Locale> getLocaleParser() {
        return new LocaleParser();
    }

    // User
    public static Parser<UserMinimal> getUserMinimalParser() {
        return new UserParser();
    }

    // Conversation

    public static ItemParser<Conversation> getConversationItemParser() {
        return new DataNodeParser<>(getConversationParser());
    }

    public static ListParser<Conversation> getConversationListParser() {
        return new DataNodeParser<>(getConversationParser());
    }

    public static Parser<Conversation> getConversationParser() {
        return new ConversationParser();
    }

    public static Parser<Team> getTeamParser() {
        return new TeamParser();
    }

    public static Parser<Status> getStatusParser() {
        return new StatusParser();
    }

    public static Parser<Priority> getPriorityParser() {
        return new PriorityParser();
    }

    // Response Message: Error
    public static ListParser<Error> getErrorListParser() {
        return new ErrorListParser();
    }

    public static Parser<Error> getErrorParser() {
        return new ErrorListParser();
    }

    // Response Message: Notification
    public static ListParser<Notification> getNotificationListParser() {
        return new NotificationListParser();
    }

    public static Parser<Notification> getNotificationParser() {
        return new NotificationListParser();
    }

    // Response Message: Log
    public static ListParser<Log> getLogListParser() {
        return new LogListParser();
    }

    public static Parser<Log> getLogParser() {
        return new LogListParser();
    }


}
