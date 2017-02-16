package com.kayako.sdk.messenger;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.messenger.conversation.Conversation;
import com.kayako.sdk.messenger.conversation.PostConversationBodyParams;
import com.kayako.sdk.messenger.message.Message;
import com.kayako.sdk.messenger.message.PostMessageBodyParams;
import com.kayako.sdk.mockserver.MockWebServerHelper;
import com.kayako.sdk.mockserver.SampleDispatcher;
import com.kayako.sdk.mockserver.base.ISampleResponse;
import com.kayako.sdk.mockserver.messenger.responses.*;
import com.kayako.sdk.utils.ExceptionUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class MessengerTest {

    private MockWebServerHelper mockWebServerHelper;
    private String helpdeskUrl;

    @Before
    public void setUp() throws Exception {
        mockWebServerHelper = new MockWebServerHelper();
        mockWebServerHelper.callOnSetup();

        // helpdeskUrl = "https://kayako-mobile-testing.kayako.com"; //  Uncomment to get new values
        helpdeskUrl = mockWebServerHelper.getMockedUrl();
    }

    @After
    public void tearDown() throws Exception {
        mockWebServerHelper.callOnTearDown();
        mockWebServerHelper = null; // otherwise
    }

    private String fingerprintId = "d0bc691c-62c5-468c-a4a5-3b096684dc96";
    private FingerprintAuth fingerprintAuth = new FingerprintAuth(fingerprintId);

    @Test
    public void test_getExistingConversationList() throws Exception {
        mockWebServerHelper.setDispatcher(new SampleDispatcher(new GetConversationList()));

        try {
            List<Conversation> conversationList = new Messenger(helpdeskUrl, fingerprintAuth).getConversationList(0, 20);
            Assert.assertNotNull(conversationList);
            Assert.assertEquals(12, conversationList.size());
        } catch (KayakoException e) {
            ExceptionUtils.logAllErrors(e.getResponseMessages());
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void test_getEmptyConversationList() throws Exception {
        mockWebServerHelper.setDispatcher(new SampleDispatcher(new GetConversationListWithEmptyResponse()));
        List<Conversation> conversationList = new Messenger(helpdeskUrl, fingerprintAuth).getConversationList(0, 20);
        Assert.assertNotNull(conversationList);
        Assert.assertEquals(0, conversationList.size());
    }

    @Test
    public void test_getExistingConversation() throws Exception {
        mockWebServerHelper.setDispatcher(new SampleDispatcher(new GetConversation()));

        Conversation conversation = new Messenger(helpdeskUrl, fingerprintAuth).getConversation(23L);
        Assert.assertNotNull(conversation);
        Assert.assertEquals(23, conversation.getId().longValue());
    }

    @Test
    public void test_postNewConversation() throws Exception {
        mockWebServerHelper.setDispatcher(new SampleDispatcher(new PostConversation()));

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
        mockWebServerHelper.setDispatcher(new SampleDispatcher(new GetMessages()));

        try {
            Messenger messenger = new Messenger(helpdeskUrl, fingerprintAuth);
            List<Message> messageList = messenger.getMessages(20, 0, 0);

            Assert.assertNotNull(messageList);
            Assert.assertEquals(9, messageList.size());
            Assert.assertEquals("Hey", messageList.get(0).getSubject());
            Assert.assertEquals("Hey", messageList.get(8).getSubject());
        } catch (KayakoException e) {
            e.printStackTrace();
            ExceptionUtils.logAllErrors(e.getResponseMessages());
            fail();
        }
    }

    @Test
    public void test_getMessagesOfConversation_Pagination() throws Exception {
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetMessagesPage1());
        responses.add(new GetMessagesPage2());
        mockWebServerHelper.setDispatcher(new SampleDispatcher(responses));

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
        List<ISampleResponse> responses = new ArrayList<>();
        responses.add(new GetConversationListPage1());
        responses.add(new GetConversationListPage2());
        responses.add(new GetConversationListPage3());
        responses.add(new GetConversationListPage4());
        mockWebServerHelper.setDispatcher(new SampleDispatcher(responses));

        try {
            Messenger messenger = new Messenger(helpdeskUrl, fingerprintAuth);

            List<Conversation> conversations = messenger.getConversationList(0, 5);
            Assert.assertEquals(5, conversations.size());

            conversations.addAll(messenger.getConversationList(5, 3));
            Assert.assertEquals(8, conversations.size());

            conversations.addAll(messenger.getConversationList(8, 7));
            Assert.assertEquals(15, conversations.size());

            conversations.addAll(messenger.getConversationList(15, 5));
            Assert.assertEquals(15, conversations.size());

        } catch (KayakoException e) {
            e.printStackTrace();
            ExceptionUtils.logAllErrors(e.getResponseMessages());
            fail();
        }
    }

    @Test
    public void test_addNewMessage() {
        mockWebServerHelper.setDispatcher(new SampleDispatcher(new PostMessage()));

        Messenger messenger = new Messenger(helpdeskUrl, fingerprintAuth);

        try {
            String contents = "This a new message!";
            Message message = messenger.postMessage(23, new PostMessageBodyParams(contents, null));
            Assert.assertNotNull(message);
            Assert.assertEquals(contents, message.getContentText());
        } catch (KayakoException e) {
            e.printStackTrace();
            fail();
        }
    }
}