package com.kayako.sdk.messenger.conversation.fields.readmarker;

import com.diffblue.deeptestutils.Reflector;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ReadMarkerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: ReadMarker */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        ReadMarker instance;
        {
            /* Arrange */
            Long id = null;
            Long lastReadPostId = null;
            Long lastReadAt = null;
            Integer unreadCount = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new ReadMarker(id, lastReadPostId, lastReadAt, unreadCount);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
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
            ReadMarker param0 = (ReadMarker) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.readmarker.ReadMarker");
            Reflector.setField(param0, "unreadCount", null);
            Reflector.setField(param0, "lastReadAt", null);
            Reflector.setField(param0, "lastReadPostId", null);
            Reflector.setField(param0, "id", null);
            /* Act */
            retval = param0.getId();
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
    public void getLastReadAt() throws Throwable {
        Long retval;
        {
            /* Arrange */
            ReadMarker param0 = (ReadMarker) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.readmarker.ReadMarker");
            Reflector.setField(param0, "unreadCount", null);
            Reflector.setField(param0, "lastReadAt", null);
            Reflector.setField(param0, "lastReadPostId", null);
            Reflector.setField(param0, "id", null);
            /* Act */
            retval = param0.getLastReadAt();
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
    public void getLastReadPostId() throws Throwable {
        Long retval;
        {
            /* Arrange */
            ReadMarker param0 = (ReadMarker) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.readmarker.ReadMarker");
            Reflector.setField(param0, "unreadCount", null);
            Reflector.setField(param0, "lastReadAt", null);
            Reflector.setField(param0, "lastReadPostId", null);
            Reflector.setField(param0, "id", null);
            /* Act */
            retval = param0.getLastReadPostId();
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
    public void getUnreadCount() throws Throwable {
        Integer retval;
        {
            /* Arrange */
            ReadMarker param0 = (ReadMarker) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.readmarker.ReadMarker");
            Reflector.setField(param0, "unreadCount", null);
            Reflector.setField(param0, "lastReadAt", null);
            Reflector.setField(param0, "lastReadPostId", null);
            Reflector.setField(param0, "id", null);
            /* Act */
            retval = param0.getUnreadCount();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}