package com.kayako.sdk.messenger;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.error.ResponseMessages;
import com.kayako.sdk.error.response.Error;
import com.kayako.sdk.error.response.Log;
import com.kayako.sdk.error.response.Notification;
import com.kayako.sdk.messenger.conversation.Conversation;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.fail;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class MessengerTest {

    @Test
    public void test_getExistingConversationList() throws Exception {
        FingerprintAuth fingerprintAuth = new FingerprintAuth("d0bc691c-62c5-468c-a4a5-3b096684dc96");
        String helpdeskUrl = "https://kayako-mobile-testing.kayako.com";

        try {
            List<Conversation> conversationList = new Messenger(helpdeskUrl, fingerprintAuth).getConversationList();
            Assert.assertNotNull(conversationList);
            Assert.assertEquals(1, conversationList.size());
        } catch (KayakoException e) {
            showAllKayakoErrors(e);

            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void test_getNewConversationList() throws Exception {
        String helpdeskUrl = "https://kayako-mobile-testing.kayako.com";
        try {
            List<Conversation> conversationList = new Messenger(helpdeskUrl).getConversationList();
            Assert.assertEquals(0, conversationList.size());
        } catch (KayakoException e) {
            showAllKayakoErrors(e);
            fail();
        }
    }


    public static final void showAllKayakoErrors(KayakoException e) {
        for (Error error : e.getResponseMessages().getErrors()) {
            System.out.println(error.toString());
        }

        for (Log error : e.getResponseMessages().getLogs()) {
            System.out.println(error.toString());
        }

        for (Notification error : e.getResponseMessages().getNotifications()) {
            System.out.println(error.toString());
        }
    }
}