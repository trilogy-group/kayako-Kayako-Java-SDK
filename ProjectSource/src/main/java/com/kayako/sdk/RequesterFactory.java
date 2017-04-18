package com.kayako.sdk;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.CommonRequester;
import com.kayako.sdk.base.requester.Requester;
import com.kayako.sdk.helpcenter.articles.GetArticleListRequester;
import com.kayako.sdk.helpcenter.articles.GetArticleRequester;
import com.kayako.sdk.helpcenter.category.GetCategoryListRequester;
import com.kayako.sdk.helpcenter.category.GetCategoryRequester;
import com.kayako.sdk.helpcenter.locale.GetLocaleListRequester;
import com.kayako.sdk.helpcenter.locale.GetLocaleRequester;
import com.kayako.sdk.helpcenter.search.GetSearchArticleListRequester;
import com.kayako.sdk.helpcenter.section.GetSectionListRequester;
import com.kayako.sdk.helpcenter.section.GetSectionRequester;
import com.kayako.sdk.messenger.conversation.GetConversationListRequester;
import com.kayako.sdk.messenger.conversation.GetConversationRequester;
import com.kayako.sdk.messenger.conversation.PostConversationBodyParams;
import com.kayako.sdk.messenger.conversation.PostConversationRequester;
import com.kayako.sdk.messenger.conversationstarter.GetConversationStarterRequester;
import com.kayako.sdk.messenger.message.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/08/16
 */
public class RequesterFactory {

    public static Requester getCategoryListRequester(String helpCenterUrl, int offset, int limit) {
        return new CommonRequester(new GetCategoryListRequester(helpCenterUrl, offset, limit));
    }

    public static Requester getCategoryItemRequester(String helpCenterUrl, long categoryId) {
        return new CommonRequester(new GetCategoryRequester(helpCenterUrl, categoryId));
    }

    public static Requester getSectionListRequester(String helpCenterUrl, long categoryId, int offset, int limit) {
        return new CommonRequester(new GetSectionListRequester(helpCenterUrl, categoryId, offset, limit));
    }

    public static Requester getSectionItemRequester(String helpCenterUrl, long sectionId) {
        return new CommonRequester(new GetSectionRequester(helpCenterUrl, sectionId));
    }

    public static Requester getArticleListRequester(String helpCenterUrl, long sectionId, int offset, int limit) {
        return new CommonRequester(new GetArticleListRequester(helpCenterUrl, sectionId, offset, limit));
    }

    public static Requester getArticleItemRequester(String helpCenterUrl, long articleId) {
        return new CommonRequester(new GetArticleRequester(helpCenterUrl, articleId));
    }

    public static Requester getSearchArticleListRequester(String helpCenterUrl, String query, int offset, int limit) {
        return new CommonRequester(new GetSearchArticleListRequester(helpCenterUrl, query, offset, limit));
    }

    public static Requester getLocaleListRequester(String helpCenterUrl) {
        return new CommonRequester(new GetLocaleListRequester(helpCenterUrl));
    }

    public static Requester getLocaleItemRequester(String helpCenterUrl, long localeId) {
        return new CommonRequester(new GetLocaleRequester(helpCenterUrl, localeId));
    }

    public static Requester getConversationListRequester(String helpCenterUrl, FingerprintAuth auth, int offset, int limit) {
        return new CommonRequester(new GetConversationListRequester(helpCenterUrl, auth, offset, limit));
    }

    public static Requester getConversationItemRequester(String helpCenterUrl, FingerprintAuth auth, long conversationId) {
        return new CommonRequester(new GetConversationRequester(helpCenterUrl, auth, conversationId));
    }

    public static Requester postConversationRequester(String helpCenterUrl, FingerprintAuth auth, PostConversationBodyParams bodyParams) {
        return new CommonRequester(new PostConversationRequester(helpCenterUrl, auth, bodyParams));
    }

    public static Requester getMessageListRequester(String helpCenterUrl, FingerprintAuth auth, Long conversationId, int offset, int limit) {
        return new CommonRequester(new GetMessageListRequester(helpCenterUrl, auth, conversationId, offset, limit));
    }

    public static Requester getMessageRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, long conversationId, long messageId) {
        return new CommonRequester(new GetMessageRequester(helpdeskUrl, fingerprintAuth, conversationId, messageId));
    }

    public static Requester postMessageRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, Long conversationId, PostMessageBodyParams bodyParams) {
        return new CommonRequester(new PostMessageRequester(helpdeskUrl, fingerprintAuth, conversationId, bodyParams));
    }

    public static Requester getConversationStarterItemRequester(String helpDeskUrl, FingerprintAuth fingerprintAuth) {
        return new CommonRequester(new GetConversationStarterRequester(helpDeskUrl, fingerprintAuth));
    }

    public static Requester putMessageItemRequester(String helpCenterUrl, FingerprintAuth fingerprintAuth, long conversationId, long messageId, PutMessageBodyParams putMessageBodyParams) {
        return new CommonRequester(new PutMessageRequester(helpCenterUrl, fingerprintAuth, conversationId, messageId, putMessageBodyParams));
    }
}
