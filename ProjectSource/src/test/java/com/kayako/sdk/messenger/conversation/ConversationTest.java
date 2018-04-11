package com.kayako.sdk.messenger.conversation;

import com.diffblue.deeptestutils.Reflector;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import com.kayako.sdk.messenger.conversation.fields.ChannelType;
import com.kayako.sdk.messenger.conversation.fields.priority.Priority;
import com.kayako.sdk.messenger.conversation.fields.readmarker.ReadMarker;
import com.kayako.sdk.messenger.conversation.fields.status.Status;
import com.kayako.sdk.messenger.conversation.fields.team.Team;
import com.kayako.sdk.messenger.message.MessageStatus;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConversationTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Conversation */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        Conversation instance;
        {
            /* Arrange */
            Long id = null;
            String uuid = null;
            String legacyId = null;
            String subject = null;
            ChannelType channel = null;
            UserMinimal requester = null;
            UserMinimal creator = null;
            UserMinimal lastReplier = null;
            UserMinimal lastAgentReplier = null;
            Team assignedTeam = null;
            Status status = null;
            Boolean isClosed = null;
            ReadMarker readMarker = null;
            Priority priority = null;
            String realtimeChannel = null;
            Long lastRepliedAt = null;
            Long createdAt = null;
            Long updatedAt = null;
            String lastMessagePreview = null;
            MessageStatus lastMessageStatus = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new Conversation(id, uuid, legacyId, subject, channel, requester, creator, lastReplier, lastAgentReplier, assignedTeam, status, isClosed, readMarker, priority, realtimeChannel, lastRepliedAt, createdAt, updatedAt, lastMessagePreview, lastMessageStatus);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void getAssignedTeam() throws Throwable {
        Team retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getAssignedTeam();
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
    public void getChannel() throws Throwable {
        ChannelType retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            String param7 = "";
            String param9 = "";
            Conversation param10 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param10.setUpdatedAt(null);
            param10.setCreatedAt(null);
            param10.setLastRepliedAt(null);
            Reflector.setField(param10, "lastMessagePreview", param1);
            param10.setPriority(null);
            Reflector.setField(param10, "lastMessageStatus", null);
            param10.setUuid(param9);
            param10.setId(null);
            param10.setAssignedTeam(null);
            param10.setStatus(null);
            param10.setSubject(param5);
            param10.setChannel(null);
            param10.setIsClosed(null);
            param10.setLegacyId(param7);
            param10.setRequester(null);
            param10.setCreator(null);
            param10.setReadMarker(null);
            param10.setRealtimeChannel(param3);
            param10.setLastAgentReplier(null);
            param10.setLastReplier(null);
            /* Act */
            retval = param10.getChannel();
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
    public void getCreatedAt() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getCreatedAt();
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
    public void getCreator() throws Throwable {
        UserMinimal retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getCreator();
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
    public void getId() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getId();
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
    public void getLastAgentReplier() throws Throwable {
        UserMinimal retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getLastAgentReplier();
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
    public void getLastMessagePreview() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            ChannelType param2 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param2, "name", null);
            Reflector.setField(param2, "ordinal", 0);
            String param4 = "";
            String param6 = "";
            String param8 = "";
            Conversation param9 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param9.setUpdatedAt(null);
            param9.setCreatedAt(null);
            param9.setLastRepliedAt(null);
            Reflector.setField(param9, "lastMessagePreview", null);
            param9.setPriority(null);
            Reflector.setField(param9, "lastMessageStatus", null);
            param9.setUuid(param8);
            param9.setId(null);
            param9.setAssignedTeam(null);
            param9.setStatus(null);
            param9.setSubject(param4);
            param9.setChannel(param2);
            param9.setIsClosed(null);
            param9.setLegacyId(param6);
            param9.setRequester(null);
            param9.setCreator(null);
            param9.setReadMarker(null);
            param9.setRealtimeChannel(param1);
            param9.setLastAgentReplier(null);
            param9.setLastReplier(null);
            /* Act */
            retval = param9.getLastMessagePreview();
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
    public void getLastMessageStatus() throws Throwable {
        MessageStatus retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getLastMessageStatus();
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
    public void getLastRepliedAt() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            String param7 = "";
            String param9 = "";
            Conversation param10 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param10.setUpdatedAt(null);
            param10.setCreatedAt(null);
            param10.setLastRepliedAt(null);
            Reflector.setField(param10, "lastMessagePreview", param1);
            param10.setPriority(null);
            Reflector.setField(param10, "lastMessageStatus", null);
            param10.setUuid(param9);
            param10.setId(null);
            param10.setAssignedTeam(null);
            param10.setStatus(null);
            param10.setSubject(param5);
            param10.setChannel(null);
            param10.setIsClosed(null);
            param10.setLegacyId(param7);
            param10.setRequester(null);
            param10.setCreator(null);
            param10.setReadMarker(null);
            param10.setRealtimeChannel(param3);
            param10.setLastAgentReplier(null);
            param10.setLastReplier(null);
            /* Act */
            retval = param10.getLastRepliedAt();
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
    public void getLastReplier() throws Throwable {
        UserMinimal retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getLastReplier();
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
    public void getLegacyId() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            Conversation param9 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param9.setUpdatedAt(null);
            param9.setCreatedAt(null);
            param9.setLastRepliedAt(null);
            Reflector.setField(param9, "lastMessagePreview", param1);
            param9.setPriority(null);
            Reflector.setField(param9, "lastMessageStatus", null);
            param9.setUuid(param8);
            param9.setId(null);
            param9.setAssignedTeam(null);
            param9.setStatus(null);
            param9.setSubject(param6);
            param9.setChannel(param4);
            param9.setIsClosed(null);
            param9.setLegacyId(null);
            param9.setRequester(null);
            param9.setCreator(null);
            param9.setReadMarker(null);
            param9.setRealtimeChannel(param3);
            param9.setLastAgentReplier(null);
            param9.setLastReplier(null);
            /* Act */
            retval = param9.getLegacyId();
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
    public void getPriority() throws Throwable {
        Priority retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getPriority();
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
    public void getReadMarker() throws Throwable {
        ReadMarker retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getReadMarker();
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
    public void getRealtimeChannel() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            String param7 = "";
            Conversation param8 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param8.setUpdatedAt(null);
            param8.setCreatedAt(null);
            param8.setLastRepliedAt(null);
            Reflector.setField(param8, "lastMessagePreview", param1);
            param8.setPriority(null);
            Reflector.setField(param8, "lastMessageStatus", null);
            param8.setUuid(param7);
            param8.setId(null);
            param8.setAssignedTeam(null);
            param8.setStatus(null);
            param8.setSubject(param3);
            param8.setChannel(null);
            param8.setIsClosed(null);
            param8.setLegacyId(param5);
            param8.setRequester(null);
            param8.setCreator(null);
            param8.setReadMarker(null);
            param8.setRealtimeChannel(null);
            param8.setLastAgentReplier(null);
            param8.setLastReplier(null);
            /* Act */
            retval = param8.getRealtimeChannel();
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
    public void getRequester() throws Throwable {
        UserMinimal retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getRequester();
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
    public void getStatus() throws Throwable {
        Status retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.getStatus();
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
    public void getSubject() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            Conversation param9 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param9.setUpdatedAt(null);
            param9.setCreatedAt(null);
            param9.setLastRepliedAt(null);
            Reflector.setField(param9, "lastMessagePreview", param1);
            param9.setPriority(null);
            Reflector.setField(param9, "lastMessageStatus", null);
            param9.setUuid(param8);
            param9.setId(null);
            param9.setAssignedTeam(null);
            param9.setStatus(null);
            param9.setSubject(null);
            param9.setChannel(param4);
            param9.setIsClosed(null);
            param9.setLegacyId(param6);
            param9.setRequester(null);
            param9.setCreator(null);
            param9.setReadMarker(null);
            param9.setRealtimeChannel(param3);
            param9.setLastAgentReplier(null);
            param9.setLastReplier(null);
            /* Act */
            retval = param9.getSubject();
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
    public void getUpdatedAt() throws Throwable {
        Long retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            String param5 = "";
            String param7 = "";
            String param9 = "";
            Conversation param10 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param10.setUpdatedAt(null);
            param10.setCreatedAt(null);
            param10.setLastRepliedAt(null);
            Reflector.setField(param10, "lastMessagePreview", param1);
            param10.setPriority(null);
            Reflector.setField(param10, "lastMessageStatus", null);
            param10.setUuid(param9);
            param10.setId(null);
            param10.setAssignedTeam(null);
            param10.setStatus(null);
            param10.setSubject(param5);
            param10.setChannel(null);
            param10.setIsClosed(null);
            param10.setLegacyId(param7);
            param10.setRequester(null);
            param10.setCreator(null);
            param10.setReadMarker(null);
            param10.setRealtimeChannel(param3);
            param10.setLastAgentReplier(null);
            param10.setLastReplier(null);
            /* Act */
            retval = param10.getUpdatedAt();
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
    public void getUuid() throws Throwable {
        String retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            Conversation param9 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param9.setUpdatedAt(null);
            param9.setCreatedAt(null);
            param9.setLastRepliedAt(null);
            Reflector.setField(param9, "lastMessagePreview", param1);
            param9.setPriority(null);
            Reflector.setField(param9, "lastMessageStatus", null);
            param9.setUuid(null);
            param9.setId(null);
            param9.setAssignedTeam(null);
            param9.setStatus(null);
            param9.setSubject(param6);
            param9.setChannel(param4);
            param9.setIsClosed(null);
            param9.setLegacyId(param8);
            param9.setRequester(null);
            param9.setCreator(null);
            param9.setReadMarker(null);
            param9.setRealtimeChannel(param3);
            param9.setLastAgentReplier(null);
            param9.setLastReplier(null);
            /* Act */
            retval = param9.getUuid();
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
    public void isClosed() throws Throwable {
        Boolean retval;
        {
            /* Arrange */
            String param1 = "";
            String param3 = "";
            ChannelType param4 = (ChannelType) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.ChannelType");
            Reflector.setField(param4, "name", null);
            Reflector.setField(param4, "ordinal", 0);
            String param6 = "";
            String param8 = "";
            String param10 = "";
            Conversation param11 = (Conversation) Reflector.getInstance("com.kayako.sdk.messenger.conversation.Conversation");
            param11.setUpdatedAt(null);
            param11.setCreatedAt(null);
            param11.setLastRepliedAt(null);
            Reflector.setField(param11, "lastMessagePreview", param1);
            param11.setPriority(null);
            Reflector.setField(param11, "lastMessageStatus", null);
            param11.setUuid(param10);
            param11.setId(null);
            param11.setAssignedTeam(null);
            param11.setStatus(null);
            param11.setSubject(param6);
            param11.setChannel(param4);
            param11.setIsClosed(null);
            param11.setLegacyId(param8);
            param11.setRequester(null);
            param11.setCreator(null);
            param11.setReadMarker(null);
            param11.setRealtimeChannel(param3);
            param11.setLastAgentReplier(null);
            param11.setLastReplier(null);
            /* Act */
            retval = param11.isClosed();
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
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
}