package com.kayako.sdk.messenger;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.RequesterFactory;
import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.callback.ItemCallback;
import com.kayako.sdk.base.callback.ListCallback;
import com.kayako.sdk.base.manager.ItemManager;
import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.messenger.conversation.Conversation;
import com.kayako.sdk.messenger.conversation.PostConversationBodyParams;
import com.kayako.sdk.messenger.message.Message;
import com.kayako.sdk.utils.FingerprintUtils;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class Messenger {

    private String mHelpDeskUrl;
    private FingerprintAuth mFingerprintAuth;

    /**
     * Create a Messenger instance for a new user - generating a new Fingerprint Id
     *
     * @param helpDeskUrl
     */
    public Messenger(String helpDeskUrl) {
        mHelpDeskUrl = helpDeskUrl;
        mFingerprintAuth = generateNewFingerprintId();
    }

    /**
     * Create a Messenger instance for an existing user - using the existing Fingerprint Id
     *
     * @param helpDeskUrl
     * @param fingerprintAuth
     */
    public Messenger(String helpDeskUrl, FingerprintAuth fingerprintAuth) {
        mHelpDeskUrl = helpDeskUrl;
        mFingerprintAuth = fingerprintAuth;
    }

    private FingerprintAuth generateNewFingerprintId() {
        String fingerprintId = FingerprintUtils.generateUUIDv4();
        return new FingerprintAuth(fingerprintId);
    }

    /**
     * This is useful when you'd like to save the fingerprint auth for multiple requests using the same authentications
     *
     * @return
     */
    public FingerprintAuth getFingerprintAuth() {
        return mFingerprintAuth;
    }

    /**
     * Reset the fingerprint authentication of the current Authentication
     *
     * @param mFingerprintAuth
     */
    public void setFingerprintAuth(FingerprintAuth mFingerprintAuth) {
        this.mFingerprintAuth = mFingerprintAuth;
    }

    // TODO: GET List Messages
    // TODO: POST Message

    public List<Conversation> getConversationList() throws KayakoException {
        return new ListManager<Conversation>(RequesterFactory.getConversationListRequester(mHelpDeskUrl, mFingerprintAuth), ParserFactory.getConversationListParser()).getList();
    }

    public void getConversationList(ListCallback<Conversation> callback) {
        new ListManager<Conversation>(RequesterFactory.getConversationListRequester(mHelpDeskUrl, mFingerprintAuth), ParserFactory.getConversationListParser()).getList(callback);
    }

    public Conversation getConversation(long conversationId) throws KayakoException {
        return new ItemManager<Conversation>(RequesterFactory.getConversationItemRequester(mHelpDeskUrl, mFingerprintAuth, conversationId), ParserFactory.getConversationItemParser()).getItem();
    }

    public void getConversation(long conversationId, ItemCallback<Conversation> callback) {
        new ItemManager<Conversation>(RequesterFactory.getConversationItemRequester(mHelpDeskUrl, mFingerprintAuth, conversationId), ParserFactory.getConversationItemParser()).getItem(callback);
    }

    public Conversation postConversation(PostConversationBodyParams bodyParams) throws KayakoException {
        return new ItemManager<Conversation>(RequesterFactory.postConversationRequester(mHelpDeskUrl, mFingerprintAuth, bodyParams), ParserFactory.getConversationItemParser()).getItem();
    }

    public void postConversation(PostConversationBodyParams bodyParams, ItemCallback<Conversation> callback) {
        new ItemManager<Conversation>(RequesterFactory.postConversationRequester(mHelpDeskUrl, mFingerprintAuth, bodyParams), ParserFactory.getConversationItemParser()).getItem(callback);
    }

    public List<Message> getMessages(long conversationId, int offset, int limit) throws KayakoException {
        return new ListManager<Message>(RequesterFactory.getMessageListRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, offset, limit), ParserFactory.getMessageListParser()).getList();
    }

    public void getMessages(long conversationId, int offset, int limit, ListCallback<Message> callback) {
        new ListManager<Message>(RequesterFactory.getMessageListRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, offset, limit), ParserFactory.getMessageListParser()).getList(callback);
    }
}
