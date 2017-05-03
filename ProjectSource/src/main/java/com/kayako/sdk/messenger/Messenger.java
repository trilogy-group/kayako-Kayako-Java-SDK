package com.kayako.sdk.messenger;

import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.RequesterFactory;
import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.callback.EmptyCallback;
import com.kayako.sdk.base.callback.ItemCallback;
import com.kayako.sdk.base.callback.ListCallback;
import com.kayako.sdk.base.manager.EmptyManager;
import com.kayako.sdk.base.manager.ItemManager;
import com.kayako.sdk.base.manager.ListManager;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.messenger.conversation.Conversation;
import com.kayako.sdk.messenger.conversation.PostConversationBodyParams;
import com.kayako.sdk.messenger.conversationstarter.ConversationStarter;
import com.kayako.sdk.messenger.message.Message;
import com.kayako.sdk.messenger.message.PostMessageBodyParams;
import com.kayako.sdk.messenger.message.PutMessageBodyParams;
import com.kayako.sdk.messenger.rating.PostRatingBodyParams;
import com.kayako.sdk.messenger.rating.PutRatingBodyParams;
import com.kayako.sdk.messenger.rating.Rating;
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

    public List<Conversation> getConversationList(int offset, int limit) throws KayakoException {
        return new ListManager<Conversation>(RequesterFactory.getConversationListRequester(mHelpDeskUrl, mFingerprintAuth, offset, limit), ParserFactory.getConversationListParser()).getList();
    }

    public void getConversationList(int offset, int limit, ListCallback<Conversation> callback) {
        new ListManager<Conversation>(RequesterFactory.getConversationListRequester(mHelpDeskUrl, mFingerprintAuth, offset, limit), ParserFactory.getConversationListParser()).getList(callback);
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

    public Message getMessage(long conversationId, long messageId) throws KayakoException {
        return new ItemManager<Message>(RequesterFactory.getMessageRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, messageId), ParserFactory.getMessageItemParser()).getItem();
    }

    public void getMessage(long conversationId, long messageId, ItemCallback<Message> callback) {
        new ItemManager<Message>(RequesterFactory.getMessageRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, messageId), ParserFactory.getMessageItemParser()).getItem(callback);
    }

    public Message postMessage(long conversationId, PostMessageBodyParams bodyParams) throws KayakoException {
        return new ItemManager<Message>(RequesterFactory.postMessageRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, bodyParams), ParserFactory.getMessageItemParser()).getItem();
    }

    public void postMessage(long conversationId, PostMessageBodyParams bodyParams, ItemCallback<Message> callback) {
        new ItemManager<Message>(RequesterFactory.postMessageRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, bodyParams), ParserFactory.getMessageItemParser()).getItem(callback);
    }

    public ConversationStarter getConversationStarter() throws KayakoException {
        return new ItemManager<ConversationStarter>(RequesterFactory.getConversationStarterItemRequester(mHelpDeskUrl, mFingerprintAuth), ParserFactory.getConversationStarterItemParser()).getItem();
    }

    public void getConversationStarter(ItemCallback<ConversationStarter> callback) {
        new ItemManager<ConversationStarter>(RequesterFactory.getConversationStarterItemRequester(mHelpDeskUrl, mFingerprintAuth), ParserFactory.getConversationStarterItemParser()).getItem(callback);
    }

    public boolean putMessage(long conversationId, long messageId, PutMessageBodyParams putMessageBodyParams) throws KayakoException {
        new EmptyManager(RequesterFactory.putMessageItemRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, messageId, putMessageBodyParams)).getStatus();
        return true;
    }

    public void putMessage(long conversationId, long messageId, PutMessageBodyParams putMessageBodyParams, EmptyCallback emptyCallback) {
        new EmptyManager(RequesterFactory.putMessageItemRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, messageId, putMessageBodyParams)).getStatus(emptyCallback);
    }

    public List<Rating> getRatingList(long conversationId) throws KayakoException {
        return new ListManager<Rating>(RequesterFactory.getRatingListRequester(mHelpDeskUrl, mFingerprintAuth, conversationId), ParserFactory.getRatingListParser()).getList();
    }

    public void getRatingList(long conversationId, ListCallback<Rating> callback) {
        new ListManager<Rating>(RequesterFactory.getRatingListRequester(mHelpDeskUrl, mFingerprintAuth, conversationId), ParserFactory.getRatingListParser()).getList(callback);
    }

    public Rating postRating(long conversationId, PostRatingBodyParams postRatingBodyParams) throws KayakoException {
        return new ItemManager<Rating>(
                RequesterFactory.postRatingRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, postRatingBodyParams),
                ParserFactory.getItemRatingParser()).getItem();
    }

    public void postRating(long conversationId, PostRatingBodyParams postRatingBodyParams, ItemCallback callback) {
        new ItemManager<Rating>(RequesterFactory.postRatingRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, postRatingBodyParams),
                ParserFactory.getItemRatingParser())
                .getItem(callback);
    }

    public Rating putRating(long conversationId, long ratingId, PutRatingBodyParams putRatingBodyParams) throws KayakoException {
        return new ItemManager<Rating>(
                RequesterFactory.putRatingRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, ratingId, putRatingBodyParams),
                ParserFactory.getItemRatingParser())
                .getItem();
    }

    public void putRating(long conversationId, long ratingId, PutRatingBodyParams putRatingBodyParams, ItemCallback callback) {
        new ItemManager<Rating>(
                RequesterFactory.putRatingRequester(mHelpDeskUrl, mFingerprintAuth, conversationId, ratingId, putRatingBodyParams),
                ParserFactory.getItemRatingParser())
                .getItem(callback);
    }
}