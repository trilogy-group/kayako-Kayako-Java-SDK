package com.kayako.sdk.messenger.message;

import com.diffblue.deeptestutils.Reflector;
import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.AttachmentFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PostMessageRequesterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: PostMessageRequester */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 39 branch to line 39
     * conditional line 41 branch to line 45
     * conditional line 45 branch to line 49
     * conditional line 49 branch to line 54
     */
    @Test
    public void init() throws Throwable {
        PostMessageRequester instance;
        {
            /* Arrange */
            String helpdeskUrl = null;
            FingerprintAuth fingerprintAuth = null;
            Long conversationId = null;
            PostMessageBodyParams param0 = (PostMessageBodyParams) Reflector.getInstance("com.kayako.sdk.messenger.message.PostMessageBodyParams");
            Reflector.setField(param0, "attachmentFileList", null);
            Reflector.setField(param0, "clientId", null);
            Reflector.setField(param0, "type", null);
            Reflector.setField(param0, "contents", null);
            PostMessageBodyParams bodyParams = param0;
            /* Act */
            /* Creating object to test constructor */
            instance = new PostMessageRequester(helpdeskUrl, fingerprintAuth, conversationId, bodyParams);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 39 branch to line 39
     * conditional line 41 branch to line 45
     * conditional line 45 branch to line 46
     * conditional line 46 branch to line 46
     * conditional line 49 branch to line 54
     */
    @Test
    public void init1() throws Throwable {
        PostMessageRequester instance;
        {
            /* Arrange */
            String helpdeskUrl = null;
            FingerprintAuth fingerprintAuth = null;
            Long conversationId = null;
            String param1 = "";
            String param3 = "";
            PostMessageBodyParams param4 = (PostMessageBodyParams) Reflector.getInstance("com.kayako.sdk.messenger.message.PostMessageBodyParams");
            Reflector.setField(param4, "attachmentFileList", null);
            Reflector.setField(param4, "clientId", param1);
            Reflector.setField(param4, "type", null);
            Reflector.setField(param4, "contents", param3);
            PostMessageBodyParams bodyParams = param4;
            /* Act */
            /* Creating object to test constructor */
            instance = new PostMessageRequester(helpdeskUrl, fingerprintAuth, conversationId, bodyParams);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 39 branch to line 39
     * conditional line 41 branch to line 45
     * conditional line 45 branch to line 49
     * conditional line 49 branch to line 50
     * conditional line 50 branch to line 50

     * conditional line 50 branch to line 54
     */
    @Test
    public void init2() throws Throwable {
        PostMessageRequester instance;
        {
            /* Arrange */
            String helpdeskUrl = null;
            FingerprintAuth fingerprintAuth = null;
            Long conversationId = null;
            AttachmentFile[] dynamic_37_array = new AttachmentFile[] {};
            AttachmentFile[] param1 = dynamic_37_array;
            ArrayList param2 = new ArrayList();
            PostMessageBodyParams param3 = (PostMessageBodyParams) Reflector.getInstance("com.kayako.sdk.messenger.message.PostMessageBodyParams");
            Reflector.setField(param3, "attachmentFileList", param2);
            Reflector.setField(param3, "clientId", null);
            Reflector.setField(param3, "type", null);
            Reflector.setField(param3, "contents", null);
            PostMessageBodyParams bodyParams = param3;
            /* Act */
            /* Creating object to test constructor */
            instance = new PostMessageRequester(helpdeskUrl, fingerprintAuth, conversationId, bodyParams);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 39 branch to line 39
     * conditional line 41 branch to line 42
     * conditional line 42 branch to line 42
     * conditional line 45 branch to line 46
     * conditional line 46 branch to line 46
     * conditional line 49 branch to line 54
     */
    @Test
    public void init3() throws Throwable {
        PostMessageRequester instance;
        {
            /* Arrange */
            String helpdeskUrl = null;
            FingerprintAuth fingerprintAuth = null;
            Long conversationId = null;
            String param1 = "";
            String param3 = "";
            MessageSourceType param4 = (MessageSourceType) Reflector.getInstance("com.kayako.sdk.messenger.message.MessageSourceType");
            Reflector.setField(param4, "name", param3);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            PostMessageBodyParams param7 = (PostMessageBodyParams) Reflector.getInstance("com.kayako.sdk.messenger.message.PostMessageBodyParams");
            Reflector.setField(param7, "attachmentFileList", null);
            Reflector.setField(param7, "clientId", param1);
            Reflector.setField(param7, "type", param4);
            Reflector.setField(param7, "contents", param6);
            PostMessageBodyParams bodyParams = param7;
            /* Act */
            /* Creating object to test constructor */
            instance = new PostMessageRequester(helpdeskUrl, fingerprintAuth, conversationId, bodyParams);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers:
     * conditional line 39 branch to line 39
     * conditional line 41 branch to line 42
     * conditional line 42 branch to line 42
     * conditional line 45 branch to line 46
     * conditional line 46 branch to line 46
     * conditional line 49 branch to line 50
     * conditional line 50 branch to line 50

     * conditional line 50 branch to line 50
     * conditional line 51 branch to line 51

     * conditional line 50 branch to line 54
     */
    @Test
    public void init4() throws Throwable {
        PostMessageRequester instance;
        {
            /* Arrange */
            String helpdeskUrl = null;
            FingerprintAuth fingerprintAuth = null;
            Long conversationId = null;
            AttachmentFile[] dynamic_88_array = new AttachmentFile[] { null, null };
            AttachmentFile[] param1 = dynamic_88_array;
            ArrayList param2 = new ArrayList();
            param2.add(null);
            String param4 = "";
            String param6 = "";
            MessageSourceType param7 = (MessageSourceType) Reflector.getInstance("com.kayako.sdk.messenger.message.MessageSourceType");
            Reflector.setField(param7, "name", param6);
            Reflector.setField(param7, "ordinal", 0);
            String param9 = "";
            PostMessageBodyParams param10 = (PostMessageBodyParams) Reflector.getInstance("com.kayako.sdk.messenger.message.PostMessageBodyParams");
            Reflector.setField(param10, "attachmentFileList", param2);
            Reflector.setField(param10, "clientId", param4);
            Reflector.setField(param10, "type", param7);
            Reflector.setField(param10, "contents", param9);
            PostMessageBodyParams bodyParams = param10;
            /* Act */
            /* Creating object to test constructor */
            instance = new PostMessageRequester(helpdeskUrl, fingerprintAuth, conversationId, bodyParams);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getAttachmentFiles() throws Throwable {
        Map<String, AttachmentFile> retval;
        {
            /* Arrange */
            String param1 = "";
            PostMessageRequester param2 = (PostMessageRequester) Reflector.getInstance("com.kayako.sdk.messenger.message.PostMessageRequester");
            Reflector.setField(param2, "mAttachmentFiles", null);
            Reflector.setField(param2, "mHelpDeskUrl", param1);
            Reflector.setField(param2, "mFingerprintAuth", null);
            Reflector.setField(param2, "mConversationId", null);
            Reflector.setField(param2, "mBodyParams", null);
            /* Act */
            retval = param2.getAttachmentFiles();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getBodyParameters() throws Throwable {
        Map<String, String> retval;
        {
            /* Arrange */
            String param1 = "";
            PostMessageRequester param2 = (PostMessageRequester) Reflector.getInstance("com.kayako.sdk.messenger.message.PostMessageRequester");
            Reflector.setField(param2, "mAttachmentFiles", null);
            Reflector.setField(param2, "mHelpDeskUrl", param1);
            Reflector.setField(param2, "mFingerprintAuth", null);
            Reflector.setField(param2, "mConversationId", null);
            Reflector.setField(param2, "mBodyParams", null);
            /* Act */
            retval = param2.getBodyParameters();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getHeaders() throws Throwable {
        Map<String, String> retval;
        {
            /* Arrange */
            FingerprintAuth param0 = (FingerprintAuth) Reflector.getInstance("com.kayako.sdk.auth.FingerprintAuth");
            param0.setFingerprintId(null);
            String param2 = "";
            PostMessageRequester param3 = (PostMessageRequester) Reflector.getInstance("com.kayako.sdk.messenger.message.PostMessageRequester");
            Reflector.setField(param3, "mAttachmentFiles", null);
            Reflector.setField(param3, "mHelpDeskUrl", param2);
            Reflector.setField(param3, "mFingerprintAuth", param0);
            Reflector.setField(param3, "mConversationId", null);
            Reflector.setField(param3, "mBodyParams", null);
            /* Act */
            retval = param3.getHeaders();
        }
        {
            /* Assert result */
            assertNotNull(retval);
            HashMap hashMap = new HashMap();
            hashMap.put("X-Fingerprint-ID", null);
            assertEquals(hashMap, retval);
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getHelpCenterUrl() throws Throwable {
        String retval;
        {
            /* Arrange */
            PostMessageRequester param0 = (PostMessageRequester) Reflector.getInstance("com.kayako.sdk.messenger.message.PostMessageRequester");
            Reflector.setField(param0, "mAttachmentFiles", null);
            Reflector.setField(param0, "mHelpDeskUrl", null);
            Reflector.setField(param0, "mFingerprintAuth", null);
            Reflector.setField(param0, "mConversationId", null);
            Reflector.setField(param0, "mBodyParams", null);
            /* Act */
            retval = param0.getHelpCenterUrl();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}