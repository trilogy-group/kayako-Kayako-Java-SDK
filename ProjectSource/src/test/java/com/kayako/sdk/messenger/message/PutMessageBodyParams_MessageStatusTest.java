package com.kayako.sdk.messenger.message;

import com.diffblue.deeptestutils.Reflector;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Constructor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PutMessageBodyParams_MessageStatusTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: PutMessageBodyParams_MessageStatus */
    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void clinit() throws Throwable {
        Object constructed;
        {
            /* Act */
            /* Using constructor to test static initializer */
            constructed = Reflector.getInstance("com.kayako.sdk.messenger.message.PutMessageBodyParams$MessageStatus");
            assertNotNull(constructed);
        /* Method return type is void, or not expected to return */
        }
    }



    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   * conditional line 12 branch to line 15
   */
    @Test
    public void init() throws Throwable {
        Object instance;
        {
            /* Arrange */
            Object param0 = Reflector.getInstance("com.kayako.sdk.messenger.message.PutMessageBodyParams$MessageStatus");
            Reflector.setField(param0, "name", null);
            Reflector.setField(param0, "ordinal", 0);
            Object messageStatus = param0;
            /* Act */
            /* Creating object to test constructor */
            Class<?> c = Reflector.forName("com.kayako.sdk.messenger.message.PutMessageBodyParams");
            Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.kayako.sdk.messenger.message.PutMessageBodyParams$MessageStatus"));
            ctor.setAccessible(true);
            instance = ctor.newInstance(messageStatus);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
   * Test generated by Diffblue Deeptest.
   * This test case covers the entire function.
   */
    @Test
    public void getMessageStatus() throws Throwable {
        Object retval;
        {
            /* Arrange */
            PutMessageBodyParams param0 = (PutMessageBodyParams) Reflector.getInstance("com.kayako.sdk.messenger.message.PutMessageBodyParams");
            Reflector.setField(param0, "messageStatus", null);
            /* Act */
            retval = param0.getMessageStatus();
        }
        {
            /* Assert result */
            assertEquals(null, retval);
        }
    }
}
