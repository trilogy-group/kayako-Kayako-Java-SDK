package com.kayako.sdk.base.manager;

import com.diffblue.deeptestutils.Reflector;
import com.kayako.sdk.base.callback.EmptyCallback;
import com.kayako.sdk.base.requester.Requester;
import java.lang.reflect.Constructor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EmptyManager_1Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /* testedClasses: EmptyManager_1 */
    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void comkayakosdkbasemanagerEmptyManager$1init() throws Throwable {
        Object instance;
        {
            /* Arrange */
            EmptyManager arg1a = null;
            EmptyCallback arg2a = null;
            /* Act */
            /* Creating object to test constructor */
            Class<?> c = Reflector.forName("com.kayako.sdk.base.manager.EmptyManager$1");
            Constructor<?> ctor = c.getDeclaredConstructor(Reflector.forName("com.kayako.sdk.base.manager.EmptyManager"), Reflector.forName("com.kayako.sdk.base.callback.EmptyCallback"));
            ctor.setAccessible(true);
            instance = ctor.newInstance(arg1a, arg2a);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }

    /*
     * Test generated by Diffblue Deeptest.
     * This test case covers the entire function.
     */
    @Test
    public void comkayakosdkbasemanagerEmptyManagerinit() throws Throwable {
        EmptyManager instance;
        {
            /* Arrange */
            Requester requester = null;
            /* Act */
            /* Creating object to test constructor */
            instance = new EmptyManager(requester);
            assertNotNull(instance);
        /* Method return type is void, or not expected to return */
        }
    }
}