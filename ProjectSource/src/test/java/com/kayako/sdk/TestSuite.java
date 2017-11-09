package com.kayako.sdk;

import com.kayako.sdk.base.manager.ItemManager;
import com.kayako.sdk.base.manager.ItemManagerTest;
import com.kayako.sdk.base.manager.ListManagerTest;
import com.kayako.sdk.error.response.ErrorListParserTest;
import com.kayako.sdk.error.response.LogListParserTest;
import com.kayako.sdk.error.response.NotificationListParserTest;
import com.kayako.sdk.helpcenter.HelpCenterTest;
import com.kayako.sdk.messenger.MessengerTest;
import com.kayako.sdk.utils.IsoTimeFormatUtilsTest;
import com.kayako.sdk.utils.ParserUtilsTest;
import com.kayako.sdk.utils.RequesterUtilsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MessengerTest.class,
        HelpCenterTest.class,

        ItemManagerTest.class,
        ListManagerTest.class,

        NotificationListParserTest.class,
        LogListParserTest.class,
        ErrorListParserTest.class,

        IsoTimeFormatUtilsTest.class,
        ParserUtilsTest.class,
        RequesterUtilsTest.class

})

// TODO: Maybe create a test suite for each package? and link to the via here?
public class TestSuite {
}
