package com.kayako.sdk.messenger;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.error.ResponseMessages;
import com.kayako.sdk.error.response.Error;
import com.kayako.sdk.error.response.Log;
import com.kayako.sdk.error.response.Notification;
import com.kayako.sdk.messenger.conversation.Conversation;
import com.kayako.sdk.messenger.conversation.PostConversationBodyParams;
import com.kayako.sdk.messenger.message.Message;
import com.kayako.sdk.utils.ExceptionUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.fail;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class MessengerTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    private String helpdeskUrl = "https://kayako-mobile-testing.kayako.com";
    private String fingerprintId = "d0bc691c-62c5-468c-a4a5-3b096684dc96";
    private FingerprintAuth fingerprintAuth = new FingerprintAuth(fingerprintId);

    @Test
    public void test_getExistingConversationList() throws Exception {
        try {
            List<Conversation> conversationList = new Messenger(helpdeskUrl, fingerprintAuth).getConversationList(0, 20);
            Assert.assertNotNull(conversationList);
            Assert.assertTrue(conversationList.size() > 4);
        } catch (KayakoException e) {
            ExceptionUtils.logAllErrors(e.getResponseMessages());
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void test_getNewConversationList() throws Exception {
        try {
            List<Conversation> conversationList = new Messenger(helpdeskUrl).getConversationList(0, 20);
            Assert.assertEquals(0, conversationList.size());
        } catch (KayakoException e) {
            ExceptionUtils.logAllErrors(e.getResponseMessages());
            fail();
        }
    }

    @Test
    public void test_getExistingConversation() throws Exception {
        Conversation conversation = new Messenger(helpdeskUrl, fingerprintAuth).getConversation(23L);
        Assert.assertNotNull(conversation);
        Assert.assertEquals(23, conversation.getId().longValue());
    }

    @Test
    public void test_postNewConversation() throws Exception {
        try {
            Messenger messenger = new Messenger(helpdeskUrl, fingerprintAuth);
            Conversation conversation = messenger.postConversation(new PostConversationBodyParams("John Doe 2", "johndoeii@mailify.org", "Hello Hello", "Bleh said Bleh to Bleh"));
            Assert.assertNotNull(conversation);
            Assert.assertNotNull(conversation.getId());
            System.out.println("Conversation id:" + conversation.getId());
        } catch (KayakoException e) {
            e.printStackTrace();
            ExceptionUtils.logAllErrors(e.getResponseMessages());
            fail();
        }

    }

    @Test
    public void test_getMessagesOfConversation() throws Exception {
        try {
            Messenger messenger = new Messenger(helpdeskUrl, fingerprintAuth);
            List<Message> messageList = messenger.getMessages(20, 0, 0);

            Assert.assertNotNull(messageList);
            Assert.assertEquals(9, messageList.size());
        } catch (KayakoException e) {
            e.printStackTrace();
            ExceptionUtils.logAllErrors(e.getResponseMessages());
            fail();
        }
    }

    @Test
    public void test_getMessagesOfConversation_Pagination() throws Exception {
        try {
            Messenger messenger = new Messenger(helpdeskUrl, fingerprintAuth);

            final long conversationId = 22;

            List<Message> messageList = messenger.getMessages(conversationId, 0, 5);
            Assert.assertNotNull(messageList);
            Assert.assertEquals(5, messageList.size());

            messageList = messenger.getMessages(conversationId, 15, 5);
            Assert.assertNotNull(messageList);
            Assert.assertEquals(1, messageList.size());


        } catch (KayakoException e) {
            e.printStackTrace();
            ExceptionUtils.logAllErrors(e.getResponseMessages());
            fail();
        }
    }

    @Test
    public void test_ConversationList_Pagination() throws Exception {
        try {
            Messenger messenger = new Messenger(helpdeskUrl, fingerprintAuth);

            List<Conversation> conversations = messenger.getConversationList(0, 5);
            Assert.assertEquals(5, conversations.size());

            conversations.addAll(messenger.getConversationList(5, 3));
            Assert.assertEquals(8, conversations.size());

            conversations.addAll(messenger.getConversationList(8, 7));
            Assert.assertEquals(12, conversations.size());

            conversations.addAll(messenger.getConversationList(15, 5));
            Assert.assertEquals(12, conversations.size());
        } catch (KayakoException e) {
            e.printStackTrace();
            ExceptionUtils.logAllErrors(e.getResponseMessages());
            fail();
        }
    }
}