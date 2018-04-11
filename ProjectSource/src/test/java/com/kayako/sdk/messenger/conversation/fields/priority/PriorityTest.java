package com.kayako.sdk.messenger.conversation.fields.priority;

import com.diffblue.deeptestutils.Reflector;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PriorityTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: Priority */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void init() throws Throwable {
        Priority instance;
        {
            /* Arrange */
            Long id = null;
            String label = null;
            int level = 0;
            Long createdAt = null;
            Long updatedAt = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new Priority(id, label, level, createdAt, updatedAt);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
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
            Priority param2 = (Priority) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.priority.Priority");
            param2.setUpdatedAt(null);
            param2.setLevel(0);
            param2.setId(null);
            param2.setLabel(param1);
            param2.setCreatedAt(null);
            /* Act */
            retval = param2.getCreatedAt();
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
            Priority param2 = (Priority) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.priority.Priority");
            param2.setUpdatedAt(null);
            param2.setLevel(0);
            param2.setId(null);
            param2.setLabel(param1);
            param2.setCreatedAt(null);
            /* Act */
            retval = param2.getId();
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
    public void getLabel() throws Throwable {
        String retval;
        {
            /* Arrange */
            Priority param0 = (Priority) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.priority.Priority");
            param0.setUpdatedAt(null);
            param0.setLevel(0);
            param0.setId(null);
            param0.setLabel(null);
            param0.setCreatedAt(null);
            /* Act */
            retval = param0.getLabel();
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
    public void getLevel() throws Throwable {
        int retval;
        {
            /* Arrange */
            String param1 = "";
            Priority param2 = (Priority) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.priority.Priority");
            param2.setUpdatedAt(null);
            param2.setLevel(0);
            param2.setId(null);
            param2.setLabel(param1);
            param2.setCreatedAt(null);
            /* Act */
            retval = param2.getLevel();
        }
        {
            /* Assert result */
            assertEquals(0, retval);
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
            Priority param2 = (Priority) Reflector.getInstance("com.kayako.sdk.messenger.conversation.fields.priority.Priority");
            param2.setUpdatedAt(null);
            param2.setLevel(0);
            param2.setId(null);
            param2.setLabel(param1);
            param2.setCreatedAt(null);
            /* Act */
            retval = param2.getUpdatedAt();
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
}