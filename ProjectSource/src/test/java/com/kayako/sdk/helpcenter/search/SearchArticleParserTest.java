package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.base.parser.ResponseParser;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 26/08/16
 */
public class SearchArticleParserTest {
    @Test
    public void parse() throws Exception {
        String json = "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"uuid\": \"5cbc8bc2-5951-5aa2-aac8-ee57fff591f5\",\n" +
                "            \"title\": \"Handling chats with Kayako Desktop for Mac\",\n" +
                "            \"contents\": \"<p>Kayako Desktop provides you with a platform to interact with your site visitors and manage your support chats effectively. By connecting Kayako Desktop to your Kayako domain, you can manage live chat requests that come in through Kayako Messenger (or the chat widget on your support site, if you're using Kayako Classic).&nbsp;</p><p>Kayako Desktop provides your support team an all-in-one tool for offering real-time support, including live chat, simultaneous conversations, visitor monitoring, support for multiple Kayako instances, and much more.&nbsp;</p><p>Kayako Desktop comes in two flavors: one for Windows, one for Mac OS X. This article is about Kayako Desktop for Mac (KDFM).&nbsp;</p><p><em>NOTE: For help with Kayako Desktop for Windows, visit&nbsp;</em><a href=\\\"https://support.kayako.com/article/1174-handling-chats-with-kayako-desktop-for-windows\\\"><em>our KDFW</em><em>&nbsp;article</em></a>.</p><p>In this article, we'll give you an overview of how KDFM and Kayako work together, and then walk you through KDFM's capabilities step-by-step.&nbsp;</p><h2 id=\\\"understanding-kdfm\\\">Understanding how Kayako and KDFM work together</h2><p>Any agent that's going to be offering chat support will need to <a href=\\\"https://support.kayako.com/article/1117-installing-and-configuring-kayako-desktop\\\">install KDFM and connect it to their Kayako account</a>. From there, they'll be ready to accept chat requests from your site visitors.</p><p>Anytime a new chat request comes in, KDFM will send your team a notification. Once an agent accepts the chat, they can interact with the customer directly. They also have the option to join ongoing chats or initiate chats proactively, from the visitor list in KDFM's main window:</p><p><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/cdjSnveiox6ajFv9LJPGfLlXA3WSqF3s\\\" style=\\\"width: 561px; height: 265.792px;\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\"></p><p>Once a chat conversation is started, the entire conversation is added to a case in Kayako. If the customer has an open case already, the chat transcript will get added to that case. If they don't, Kayako will open a new case for them. You'll be able to see a complete record of the conversation, including any files sent back and forth, from the case timeline.</p><p><em>NOTE: If you're using Kayako Classic, you'll find a&nbsp;</em><em>'Chat History' page that logs every chat conversation your team has. You'll find it <em>in the staff control panel, under 'Live Support'.</em></em></p><p>Now that you have a sense for how KDFW and Kayako work together, let's look at some of the common tasks you'll be using KDFW for.</p><h2 id=\\\"monitoring\\\">Monitoring site visitors</h2><p>To monitor visitors to your support site:</p><ol><li>Log into Kayako Desktop for Mac.</li><li>The first screen you'll see is the 'Visitors' screen. As soon as a new visitor arrives on your support site, you'll see their IP address appear on a new row.</li><li>When a visitor has initiated a chat, their name will appear in the 'Full Name' column.</li><li>You can click the 'Wait Time' column heading to sort visitors by how long they've been waiting for a response.<br><em>NOTE: You can sort by any of the other column headers, as well.</em></li><li>For a different view of your site visitors, you can click the location icon to see each visitor's location plotted on a map.<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/U9sOIkMZkax95oOPskn7l86qJo05mqN0\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 264px;\\\"><br></li><li>Read on for instructions on how to initiate or accept chats with your visitors.</li></ol><h2 id=\\\"incoming\\\">Handling incoming chats from customers</h2><p>To pick up an incoming chat:</p><ol><li>When a site visitor clicks the 'Live Support' button on your support site, KDFM will display a notification.</li><li>Click the <strong>Accept</strong> button to accept and start chatting with the customer:<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/9wbVW7gUTstZ1CgQPQw3WMTbNZmeWwrU\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 300px;\\\"><br></li><li>If multiple customers have initiated chats, you can find them in the sidebar under the 'Incoming' heading.</li><li>Click a customer name to open a chat window.</li><li>Click the <strong>Accept</strong> button to start chatting.</li><li>From within the chat window, enter your message into the text area at the bottom and hit <strong>Enter</strong> to send it.</li><li>You can also share files with the customer by clicking the paperclip icon below the text area.<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/CEuq90ecyJQo8koddzqzWVB9s0E4Vpk7\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 241px;\\\" data-pin-nopin=\\\"true\\\"><br></li><li>From the window that appears, find the file you want to share and click <strong>Open</strong>.</li><li>At any point you can copy or save the chat transcript by clicking on the <strong>Actions</strong> dropdown in the upper-right.<br><em>NOTE: Remember that the chat will also be stored as a case in the agent area.</em></li><li>When the customer leaves the chat, the conversation will move down under the 'Archived Chats' heading in your sidebar.</li></ol><h2 id=\\\"initiating\\\">Initiating chats with customers</h2><p>To initiate a chat with a site visitor:</p><ol><li>In addition to accepting incoming chats, you can also proactively initiate a chat with any visitor on your site, from the 'Visitors' screen.</li><li>Select the visitor you want to chat with by clicking on their name.</li><li>Click the <strong>Actions</strong> dropdown and select one of the following:<ul><li><strong>Engage inline</strong> - Choose this option to pop up a full chat window on the page the visitor is currently viewing.</li><li><strong>Engage alert</strong> - Choose this option to display pop-up that reminds the visitor that they can chat with your support team.&nbsp;</li></ul></li><li>Once the visitor has accepted the chat, you'll be able to have a conversation with them as usual.</li></ol><h2 id=\\\"notifications\\\">Customizing your notifications settings</h2><p>To change your notification settings:</p><ol><li>From anywhere in KDFM, click the gear icon in the upper-right corner to open the 'Preferences' screen:<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/GCTUkFMuaOv0UUEqws6nYhAglLVqqK46\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 246px;\\\"><br></li><li>From the sidebar, click the <strong>Notifications</strong> menu item.</li><li>Here you'll see a list of all of the notifications that KDFM can send.</li><li>To disable a particular notification, uncheck the 'Enabled' box.</li><li>To change the notification sound for a particular event, click the <strong>[...]</strong> button.</li><li>Select the sound file you'd like to use and click the <strong>Open</strong> button.</li><li>When you've made your changes, click the <strong>Close</strong> button to leave the 'Preferences' screen.</li></ol><h2 id=\\\"status\\\">Changing your online status</h2><p>To change your account's online status:</p><ol><li>You can change your online status in two ways: manually or by adjusting the automatic settings.</li><li>To change your status manually, click the <strong>Online</strong> status dropdown from the toolbar:<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/SG4cXOY2dZkUHLFIXG3mw6B3LwvXhyOw\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 187px;\\\"><br></li><li>Select a status from the list to change your status.</li><li>When you're ready to come back online, you'll need to come back to this list and select it manually.</li><li>To modify KDFM's automatic status changes, click the gear icon to open the 'Preferences' screen.</li><li>From the sidebar, click the <strong>Chat</strong> menu item.</li><li>You'll see two options here:<ul><li><strong>Auto Busy when I'm chatting with [#] visitors</strong> - Enable this option if you want KDFM to set your status to 'Busy' automatically, whenever you're chatting with the specified number of customers.</li><li><strong>Auto Away when I'm idle for [#] minutes</strong> - Enable this option if you want KDFM to set your status to 'Away' automatically, whenever you're not interacting with KDFM for more than the specified number of minutes.</li></ul></li><li>When you've made your changes, click the <strong>Close</strong> button to leave the 'Preferences' screen.</li></ol><h2 id=\\\"settings\\\">Configuring other account settings</h2><p>To modify your other account settings:</p><ol><li>From anywhere in KDFM, click the gear icon in the upper-right corner to open the 'Preferences' screen.</li><li>Click the <strong>General</strong> menu item.</li><li>On this screen, you'll see several options:<ul><li><strong>Automatically launch Kayako Desktop at startup</strong> - Enable this option to launch KDFM whenever you start your computer.</li><li><strong>Automatically check for product updates</strong> - Enable this option to have KDFM check for updates regularly.</li><li><strong>Chat time interval, in seconds</strong> - Edit the value of this field to control how frequently KDFM checks with the server for new chat data.</li><li><strong>Data time interval, in seconds</strong> - Edit the value of this field to control how frequently KDFM requests updated site visitor and support agent data from the server.</li></ul></li><li>When you've made your changes, click the <strong>Close</strong> button to leave the 'Preferences' screen.</li></ol><p><br></p>\",\n" +
                "            \"link\": \"https://support.kayako.com/article/1173-handling-chats-with-kayako-desktop-for-mac\",\n" +
                "            \"original\": {\n" +
                "                \"id\": 1173,\n" +
                "                \"uuid\": \"5cbc8bc2-5951-5aa2-aac8-ee57fff591f5\",\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1573,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Handling chats with Kayako Desktop for Mac\",\n" +
                "                        \"createdAt\": \"2016-06-27T22:22:41+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-27T22:22:41+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1573\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1173-handling-chats-with-kayako-desktop-for-mac\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"contents\": [\n" +
                "                    {\n" +
                "                        \"id\": 1574,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"<p>Kayako Desktop provides you with a platform to interact with your site visitors and manage your support chats effectively. By connecting Kayako Desktop to your Kayako domain, you can manage live chat requests that come in through Kayako Messenger (or the chat widget on your support site, if you're using Kayako Classic).&nbsp;</p><p>Kayako Desktop provides your support team an all-in-one tool for offering real-time support, including live chat, simultaneous conversations, visitor monitoring, support for multiple Kayako instances, and much more.&nbsp;</p><p>Kayako Desktop comes in two flavors: one for Windows, one for Mac OS X. This article is about Kayako Desktop for Mac (KDFM).&nbsp;</p><p><em>NOTE: For help with Kayako Desktop for Windows, visit&nbsp;</em><a href=\\\"https://support.kayako.com/article/1174-handling-chats-with-kayako-desktop-for-windows\\\"><em>our KDFW</em><em>&nbsp;article</em></a>.</p><p>In this article, we'll give you an overview of how KDFM and Kayako work together, and then walk you through KDFM's capabilities step-by-step.&nbsp;</p><h2 id=\\\"understanding-kdfm\\\">Understanding how Kayako and KDFM work together</h2><p>Any agent that's going to be offering chat support will need to <a href=\\\"https://support.kayako.com/article/1117-installing-and-configuring-kayako-desktop\\\">install KDFM and connect it to their Kayako account</a>. From there, they'll be ready to accept chat requests from your site visitors.</p><p>Anytime a new chat request comes in, KDFM will send your team a notification. Once an agent accepts the chat, they can interact with the customer directly. They also have the option to join ongoing chats or initiate chats proactively, from the visitor list in KDFM's main window:</p><p><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/cdjSnveiox6ajFv9LJPGfLlXA3WSqF3s\\\" style=\\\"width: 561px; height: 265.792px;\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\"></p><p>Once a chat conversation is started, the entire conversation is added to a case in Kayako. If the customer has an open case already, the chat transcript will get added to that case. If they don't, Kayako will open a new case for them. You'll be able to see a complete record of the conversation, including any files sent back and forth, from the case timeline.</p><p><em>NOTE: If you're using Kayako Classic, you'll find a&nbsp;</em><em>'Chat History' page that logs every chat conversation your team has. You'll find it <em>in the staff control panel, under 'Live Support'.</em></em></p><p>Now that you have a sense for how KDFW and Kayako work together, let's look at some of the common tasks you'll be using KDFW for.</p><h2 id=\\\"monitoring\\\">Monitoring site visitors</h2><p>To monitor visitors to your support site:</p><ol><li>Log into Kayako Desktop for Mac.</li><li>The first screen you'll see is the 'Visitors' screen. As soon as a new visitor arrives on your support site, you'll see their IP address appear on a new row.</li><li>When a visitor has initiated a chat, their name will appear in the 'Full Name' column.</li><li>You can click the 'Wait Time' column heading to sort visitors by how long they've been waiting for a response.<br><em>NOTE: You can sort by any of the other column headers, as well.</em></li><li>For a different view of your site visitors, you can click the location icon to see each visitor's location plotted on a map.<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/U9sOIkMZkax95oOPskn7l86qJo05mqN0\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 264px;\\\"><br></li><li>Read on for instructions on how to initiate or accept chats with your visitors.</li></ol><h2 id=\\\"incoming\\\">Handling incoming chats from customers</h2><p>To pick up an incoming chat:</p><ol><li>When a site visitor clicks the 'Live Support' button on your support site, KDFM will display a notification.</li><li>Click the <strong>Accept</strong> button to accept and start chatting with the customer:<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/9wbVW7gUTstZ1CgQPQw3WMTbNZmeWwrU\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 300px;\\\"><br></li><li>If multiple customers have initiated chats, you can find them in the sidebar under the 'Incoming' heading.</li><li>Click a customer name to open a chat window.</li><li>Click the <strong>Accept</strong> button to start chatting.</li><li>From within the chat window, enter your message into the text area at the bottom and hit <strong>Enter</strong> to send it.</li><li>You can also share files with the customer by clicking the paperclip icon below the text area.<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/CEuq90ecyJQo8koddzqzWVB9s0E4Vpk7\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 241px;\\\" data-pin-nopin=\\\"true\\\"><br></li><li>From the window that appears, find the file you want to share and click <strong>Open</strong>.</li><li>At any point you can copy or save the chat transcript by clicking on the <strong>Actions</strong> dropdown in the upper-right.<br><em>NOTE: Remember that the chat will also be stored as a case in the agent area.</em></li><li>When the customer leaves the chat, the conversation will move down under the 'Archived Chats' heading in your sidebar.</li></ol><h2 id=\\\"initiating\\\">Initiating chats with customers</h2><p>To initiate a chat with a site visitor:</p><ol><li>In addition to accepting incoming chats, you can also proactively initiate a chat with any visitor on your site, from the 'Visitors' screen.</li><li>Select the visitor you want to chat with by clicking on their name.</li><li>Click the <strong>Actions</strong> dropdown and select one of the following:<ul><li><strong>Engage inline</strong> - Choose this option to pop up a full chat window on the page the visitor is currently viewing.</li><li><strong>Engage alert</strong> - Choose this option to display pop-up that reminds the visitor that they can chat with your support team.&nbsp;</li></ul></li><li>Once the visitor has accepted the chat, you'll be able to have a conversation with them as usual.</li></ol><h2 id=\\\"notifications\\\">Customizing your notifications settings</h2><p>To change your notification settings:</p><ol><li>From anywhere in KDFM, click the gear icon in the upper-right corner to open the 'Preferences' screen:<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/GCTUkFMuaOv0UUEqws6nYhAglLVqqK46\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 246px;\\\"><br></li><li>From the sidebar, click the <strong>Notifications</strong> menu item.</li><li>Here you'll see a list of all of the notifications that KDFM can send.</li><li>To disable a particular notification, uncheck the 'Enabled' box.</li><li>To change the notification sound for a particular event, click the <strong>[...]</strong> button.</li><li>Select the sound file you'd like to use and click the <strong>Open</strong> button.</li><li>When you've made your changes, click the <strong>Close</strong> button to leave the 'Preferences' screen.</li></ol><h2 id=\\\"status\\\">Changing your online status</h2><p>To change your account's online status:</p><ol><li>You can change your online status in two ways: manually or by adjusting the automatic settings.</li><li>To change your status manually, click the <strong>Online</strong> status dropdown from the toolbar:<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/SG4cXOY2dZkUHLFIXG3mw6B3LwvXhyOw\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" style=\\\"width: 187px;\\\"><br></li><li>Select a status from the list to change your status.</li><li>When you're ready to come back online, you'll need to come back to this list and select it manually.</li><li>To modify KDFM's automatic status changes, click the gear icon to open the 'Preferences' screen.</li><li>From the sidebar, click the <strong>Chat</strong> menu item.</li><li>You'll see two options here:<ul><li><strong>Auto Busy when I'm chatting with [#] visitors</strong> - Enable this option if you want KDFM to set your status to 'Busy' automatically, whenever you're chatting with the specified number of customers.</li><li><strong>Auto Away when I'm idle for [#] minutes</strong> - Enable this option if you want KDFM to set your status to 'Away' automatically, whenever you're not interacting with KDFM for more than the specified number of minutes.</li></ul></li><li>When you've made your changes, click the <strong>Close</strong> button to leave the 'Preferences' screen.</li></ol><h2 id=\\\"settings\\\">Configuring other account settings</h2><p>To modify your other account settings:</p><ol><li>From anywhere in KDFM, click the gear icon in the upper-right corner to open the 'Preferences' screen.</li><li>Click the <strong>General</strong> menu item.</li><li>On this screen, you'll see several options:<ul><li><strong>Automatically launch Kayako Desktop at startup</strong> - Enable this option to launch KDFM whenever you start your computer.</li><li><strong>Automatically check for product updates</strong> - Enable this option to have KDFM check for updates regularly.</li><li><strong>Chat time interval, in seconds</strong> - Edit the value of this field to control how frequently KDFM checks with the server for new chat data.</li><li><strong>Data time interval, in seconds</strong> - Edit the value of this field to control how frequently KDFM requests updated site visitor and support agent data from the server.</li></ul></li><li>When you've made your changes, click the <strong>Close</strong> button to leave the 'Preferences' screen.</li></ol><p><br></p>\",\n" +
                "                        \"createdAt\": \"2016-06-27T22:22:41+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-27T22:22:41+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1574\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"keywords\": \"kdfm, kayako desktop for mac, live chat, kayako desktop\",\n" +
                "                \"section\": {\n" +
                "                    \"id\": 245,\n" +
                "                    \"titles\": [\n" +
                "                        {\n" +
                "                            \"id\": 1507,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"Channels\",\n" +
                "                            \"createdAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                            \"updatedAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                            \"resourceType\": \"localeField\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1507\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"slugs\": [\n" +
                "                        {\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"245-channels\",\n" +
                "                            \"resourceType\": \"slug\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"descriptions\": [\n" +
                "                        {\n" +
                "                            \"id\": 1508,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"Communicate with customers via email, chat, and social media – all without ever leaving Kayako.\",\n" +
                "                            \"createdAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                            \"updatedAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                            \"resourceType\": \"localeField\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1508\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"visibility\": \"PUBLIC\",\n" +
                "                    \"category\": {\n" +
                "                        \"id\": 5,\n" +
                "                        \"titles\": [\n" +
                "                            {\n" +
                "                                \"id\": 1499,\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": \"User Guide\",\n" +
                "                                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resourceType\": \"localeField\",\n" +
                "                                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"slugs\": [\n" +
                "                            {\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": \"5-user-guide\",\n" +
                "                                \"resourceType\": \"slug\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"descriptions\": [\n" +
                "                            {\n" +
                "                                \"id\": 1500,\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": null,\n" +
                "                                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resourceType\": \"localeField\",\n" +
                "                                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"brand\": null,\n" +
                "                        \"displayOrder\": 1,\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                        \"resourceType\": \"category\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "                    },\n" +
                "                    \"agent\": {\n" +
                "                        \"id\": 389,\n" +
                "                        \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                        \"fullName\": \"Kelly O'Brien\",\n" +
                "                        \"role\": {\n" +
                "                            \"id\": 1,\n" +
                "                            \"title\": \"Administrator\",\n" +
                "                            \"response\": \"ADMIN\",\n" +
                "                            \"resourceType\": \"role\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                        },\n" +
                "                        \"teams\": [\n" +
                "                            {\n" +
                "                                \"id\": 16,\n" +
                "                                \"title\": \"Support\",\n" +
                "                                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                                \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                                \"resourceType\": \"teamMinimal\",\n" +
                "                                \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                        \"lastActivityAt\": null,\n" +
                "                        \"resourceType\": \"userMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                    },\n" +
                "                    \"articleOrderBy\": \"LATEST\",\n" +
                "                    \"totalArticles\": 8,\n" +
                "                    \"createdAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                    \"updatedAt\": \"2016-07-08T17:21:01+00:00\",\n" +
                "                    \"resourceType\": \"section\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/245\"\n" +
                "                },\n" +
                "                \"creator\": {\n" +
                "                    \"id\": 389,\n" +
                "                    \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                    \"fullName\": \"Kelly O'Brien\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 1,\n" +
                "                        \"title\": \"Administrator\",\n" +
                "                        \"response\": \"ADMIN\",\n" +
                "                        \"resourceType\": \"role\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 16,\n" +
                "                            \"title\": \"Support\",\n" +
                "                            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                            \"resourceType\": \"teamMinimal\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                    \"lastActivityAt\": null,\n" +
                "                    \"resourceType\": \"userMinimal\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                },\n" +
                "                \"author\": {\n" +
                "                    \"id\": 389,\n" +
                "                    \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                    \"fullName\": \"Kelly O'Brien\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 1,\n" +
                "                        \"title\": \"Administrator\",\n" +
                "                        \"response\": \"ADMIN\",\n" +
                "                        \"resourceType\": \"role\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 16,\n" +
                "                            \"title\": \"Support\",\n" +
                "                            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                            \"resourceType\": \"teamMinimal\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                    \"lastActivityAt\": null,\n" +
                "                    \"resourceType\": \"userMinimal\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                },\n" +
                "                \"attachments\": [],\n" +
                "                \"downloadAll\": null,\n" +
                "                \"status\": \"PUBLISHED\",\n" +
                "                \"upvoteCount\": 0,\n" +
                "                \"downvoteCount\": 0,\n" +
                "                \"views\": 562,\n" +
                "                \"rank\": 0,\n" +
                "                \"tags\": [],\n" +
                "                \"isFeatured\": false,\n" +
                "                \"allowComments\": true,\n" +
                "                \"totalComments\": 0,\n" +
                "                \"createdAt\": \"2016-06-27T22:22:41+00:00\",\n" +
                "                \"publishedAt\": \"2016-06-30T23:26:23+00:00\",\n" +
                "                \"updatedAt\": \"2016-06-30T23:26:23+00:00\",\n" +
                "                \"resourceType\": \"article\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/articles/1173\"\n" +
                "            },\n" +
                "            \"createdAt\": \"2016-06-27T22:22:41+00:00\",\n" +
                "            \"updatedAt\": \"2016-06-30T23:26:23+00:00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"uuid\": \"9d140515-2e94-508f-902b-7be4ed1e7779\",\n" +
                "            \"title\": \"Handling chats with Kayako Desktop for Windows\",\n" +
                "            \"contents\": \"<p>Kayako Desktop provides you with a platform to interact with your site visitors and manage your support chats effectively. By connecting Kayako Desktop to your Kayako domain, you can manage live chat requests that come in through Kayako Messenger (or the chat widget on your support site, if you're using Kayako Classic).&nbsp;</p><p><span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">Kayako Desktop provides your support team an all-in-one tool for offering real-time support, including live chat, simultaneous conversations, visitor monitoring, support for multiple Kayako instances, and much more.&nbsp;</span></p><p>Kayako Desktop comes in two flavors: one for Windows, one for Mac OS X. This article is about Kayako Desktop for Windows (KDFW).&nbsp;</p><p><em style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">NOTE: For help with Kayako Desktop for Mac, visit&nbsp;</em><a href=\\\"https://support.kayako.com/article/1173-handling-chats-with-kayako-desktop-for-mac\\\"><em style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">our KDFM</em><em>&nbsp;article</em></a>.</p><p><span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">In this article we'll give you an overview of how Kayako interacts with KDFW and then walk you through how to accept and join chat conversations.</span></p><p><span style=\\\"font-size: 20px; font-weight: 600; line-height: 1.1; text-align: initial; background-color: transparent;\\\">Understanding how Kayako and KDFW work together</span></p><p><span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">Any agent that's going to be offering chat support will need to&nbsp;</span><a href=\\\"https://support.kayako.com/article/1117-installing-and-configuring-kayako-desktop\\\">install KDFW and connect <span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">it to their Kayako account</span></a><span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">. From there, they'll be ready to accept chat requests from your site visitors.</span></p><p>Anytime a new chat request comes in, KDFW will send your team a notification. Once an agent accepts the chat, they can interact with the customer directly. They also have the option to join ongoing chats or initiate chats proactively, from the visitor list in KDFW's main window.&nbsp;</p><p><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/ajwgPUYPUitL72bMwDbw2N2VHyKYHzqH\\\" style=\\\"width: 670px; height: 249.83px;\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\"></p><p>Once a chat conversation is started, the entire conversation is added to a case in Kayako. If the customer has an open case already, the chat transcript will get added to that case. If they don't, Kayako will open a new case for them. You'll be able to see a complete record of the conversation, including any files sent back and forth, from the case timeline.</p><p><em>NOTE: If you're using Kayako Classic, you'll find a&nbsp;</em><em>'Chat History' page that logs every chat conversation your team has. You'll find it in the staff control panel, under 'Live Support'.</em></p><p>Now that you have a sense for how KDFW and Kayako work together, let's look at some of the common tasks you'll be using KDFW for.</p><h2 id=\\\"accepting_rejecting\\\">Accepting or rejecting a chat request</h2><p>When a customer initiates a chat, one of your support agents who's online in KDFW will receive a chat request pop-up:</p><p><img src=\\\"https://lh4.googleusercontent.com/gzAthOPr05BN76Kb5F5__uDSFkDskCbVeZu15tMF_aUSqHz2Jvje1MHJcC55gwy_Yr86x9uDzGaO8VqVbLgkzKwh84Tw2a5p6tLiiuzLFiz1jAg8Qro4GsiSGrfZYqyuoLw_wUfu\\\" height=\\\"99\\\" class=\\\"fr-dib fr-draggable\\\" style=\\\"width: 296px;\\\" data-pin-nopin=\\\"true\\\"></p><p>You can see the customer name (Adam) and chat subject in the pop-up.&nbsp;</p><p>If you click <strong>Accept</strong>, you'll start a conversation with the customer. If you click <strong>Decline</strong>, chat request will be routed to next available agent.</p><h2>Joining an ongoing chat</h2><p>In addition to accepting new chat requests, you can also join ongoing chats from the main KDFW tab.&nbsp;</p><p>To join an ongoing chat:</p><ol><li>Log into Kayako Desktop for Windows.</li><li>The first screen you'll see is the 'Visitors' screen. Find the chat you want to join and right-click.</li><li>&nbsp;Hover over the 'Join' option.<br><img src=\\\"https://lh3.googleusercontent.com/h1wUVe4j0LeXZkosZQXhVrn1-szOEKbxoDQDZra_qze-QqhepcSuSfPdJD7zqb_bPS_UfdGEn7BRONBfpvXypkZ8wqbGuB7TQB-0kmk59r64fqwetiPjW-NIQf2iwJkEOsYRA8Pi\\\" height=\\\"232\\\" class=\\\"fr-dib fr-draggable\\\" style=\\\"width: 581px;\\\"></li><li>From here, you have two options:&nbsp;<ul><li><strong>Join Chat</strong> — Click this option to join the chat and be visible to both the other agent and the customer.</li><li><strong>Join Chat as Observer</strong> — Click this option to join the chat as an observer, you will not be able to participate in the conversation and the only staff member will aware of your presence.</li></ul></li></ol><h2>Sending files from a chat window</h2><p>Are you in a chat with the customer and want to share a file on the fly? Don't worry, no channel-switching required. KDFW lets you send many different types of media. When you share a file with your customer, it will appear in their chat window, where they download it. Any files you send over KDFW are secured by the same measures that protect the rest of your Kayako account.</p><p dir=\\\"ltr\\\">Below, we'll go through the different types of files you can send.</p><h3 dir=\\\"ltr\\\">Sending an image</h3><ol><li>From your chat window, above the reply text box, click the <strong>Send an image&nbsp;</strong>button.<br><img src=\\\"https://kushaltrial.kayako.com/base/media/url/hiBJQ0y8jsW10XEpRW4UmGAegk2an7EP\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" class=\\\"fr-dib fr-draggable\\\"><em>NOTE: You'll can also send an image from the <strong>Push</strong> menu on the toolbar.&nbsp;</em></li><li>From the 'Push image' window, you'll have two options:<ul><li><strong>Upload an image from the local system</strong> — Choose this option to upload an image file from your computer.</li><li><strong>Send an online image</strong> — Choose this option to send an image to the customer using the URL for that image</li></ul></li><li>Add your image and click the <strong>OK&nbsp;</strong>button to send the image to your customer.&nbsp;</li></ol><h3>Sending a file</h3><ol><li>From your chat window, above the reply text box, click the <strong>Send a file&nbsp;</strong>button.<br><img src=\\\"https://kushaltrial.kayako.com/base/media/url/d3qewomUdzGHvue6JiiLUrmyD5p3KjLZ\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" class=\\\"fr-dib fr-draggable\\\"><em>NOTE: You'll can also send a file from the <strong>Push</strong> menu on the toolbar.&nbsp;</em></li><li>In the 'Push file' window, click <strong>Browse</strong>.</li><li>Find the file you'd like to send and click <strong>OK</strong>.</li><li>Click the <strong>OK</strong> button again to send the file.</li></ol><h3>Sending a code snippet</h3><ol><li>From your chat window, above the reply text box, click the <strong>Send example source code&nbsp;</strong>button.<img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/lxJPQIECJzJHp4SL3YJsCQmBr9NcqFnQ\\\" style=\\\"width: 546px; height: 138.982px;\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\"><em>NOTE: You'll can also send a code snippet from the <strong>Push</strong> menu on the toolbar.&nbsp;</em></li><li>In the 'Push code' window, paste the source code you'd like to send.</li><li>From the 'Language' drop-down, select the language respective to the source code you are sharing:<img src=\\\"https://kushaltrial.kayako.com/base/media/url/TpMpyTdrsSd0Hng52Tsd4UMkhLfISXdC\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" class=\\\"fr-dib fr-draggable\\\"></li><li>Click the <strong>OK</strong> button to send the code snippet.</li></ol><p>The customer will get the shared code in the chat window which can be copied to use further easily.</p><h3>Sending a hyperlink</h3><ol><li>From your chat window, above the reply text box, you'll see a <strong>Push URL&nbsp;</strong>text box:<img src=\\\"https://kushaltrial.kayako.com/base/media/url/7z4OcVNhOJdKQLEFfkKCUIJXBH6LTrgc\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" class=\\\"fr-dib fr-draggable\\\"><em>NOTE: You can also send a hyperlink from the <strong>Push&nbsp;</strong>menu on the toolbar.&nbsp;</em></li><li>Type or paste the URL you want to link your customer to.&nbsp;</li><li>Click the <strong>Send&nbsp;</strong>button to the right to send across a clickable hyperlink.</li></ol>\",\n" +
                "            \"link\": \"https://support.kayako.com/article/1174-handling-chats-with-kayako-desktop-for-windows\",\n" +
                "            \"original\": {\n" +
                "                \"id\": 1174,\n" +
                "                \"uuid\": \"9d140515-2e94-508f-902b-7be4ed1e7779\",\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1575,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Handling chats with Kayako Desktop for Windows\",\n" +
                "                        \"createdAt\": \"2016-06-27T22:23:33+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-27T22:23:33+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1575\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1174-handling-chats-with-kayako-desktop-for-windows\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"contents\": [\n" +
                "                    {\n" +
                "                        \"id\": 1576,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"<p>Kayako Desktop provides you with a platform to interact with your site visitors and manage your support chats effectively. By connecting Kayako Desktop to your Kayako domain, you can manage live chat requests that come in through Kayako Messenger (or the chat widget on your support site, if you're using Kayako Classic).&nbsp;</p><p><span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">Kayako Desktop provides your support team an all-in-one tool for offering real-time support, including live chat, simultaneous conversations, visitor monitoring, support for multiple Kayako instances, and much more.&nbsp;</span></p><p>Kayako Desktop comes in two flavors: one for Windows, one for Mac OS X. This article is about Kayako Desktop for Windows (KDFW).&nbsp;</p><p><em style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">NOTE: For help with Kayako Desktop for Mac, visit&nbsp;</em><a href=\\\"https://support.kayako.com/article/1173-handling-chats-with-kayako-desktop-for-mac\\\"><em style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">our KDFM</em><em>&nbsp;article</em></a>.</p><p><span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">In this article we'll give you an overview of how Kayako interacts with KDFW and then walk you through how to accept and join chat conversations.</span></p><p><span style=\\\"font-size: 20px; font-weight: 600; line-height: 1.1; text-align: initial; background-color: transparent;\\\">Understanding how Kayako and KDFW work together</span></p><p><span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">Any agent that's going to be offering chat support will need to&nbsp;</span><a href=\\\"https://support.kayako.com/article/1117-installing-and-configuring-kayako-desktop\\\">install KDFW and connect <span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">it to their Kayako account</span></a><span style=\\\"text-align: initial; line-height: 1.6; background-color: transparent;\\\">. From there, they'll be ready to accept chat requests from your site visitors.</span></p><p>Anytime a new chat request comes in, KDFW will send your team a notification. Once an agent accepts the chat, they can interact with the customer directly. They also have the option to join ongoing chats or initiate chats proactively, from the visitor list in KDFW's main window.&nbsp;</p><p><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/ajwgPUYPUitL72bMwDbw2N2VHyKYHzqH\\\" style=\\\"width: 670px; height: 249.83px;\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\"></p><p>Once a chat conversation is started, the entire conversation is added to a case in Kayako. If the customer has an open case already, the chat transcript will get added to that case. If they don't, Kayako will open a new case for them. You'll be able to see a complete record of the conversation, including any files sent back and forth, from the case timeline.</p><p><em>NOTE: If you're using Kayako Classic, you'll find a&nbsp;</em><em>'Chat History' page that logs every chat conversation your team has. You'll find it in the staff control panel, under 'Live Support'.</em></p><p>Now that you have a sense for how KDFW and Kayako work together, let's look at some of the common tasks you'll be using KDFW for.</p><h2 id=\\\"accepting_rejecting\\\">Accepting or rejecting a chat request</h2><p>When a customer initiates a chat, one of your support agents who's online in KDFW will receive a chat request pop-up:</p><p><img src=\\\"https://lh4.googleusercontent.com/gzAthOPr05BN76Kb5F5__uDSFkDskCbVeZu15tMF_aUSqHz2Jvje1MHJcC55gwy_Yr86x9uDzGaO8VqVbLgkzKwh84Tw2a5p6tLiiuzLFiz1jAg8Qro4GsiSGrfZYqyuoLw_wUfu\\\" height=\\\"99\\\" class=\\\"fr-dib fr-draggable\\\" style=\\\"width: 296px;\\\" data-pin-nopin=\\\"true\\\"></p><p>You can see the customer name (Adam) and chat subject in the pop-up.&nbsp;</p><p>If you click <strong>Accept</strong>, you'll start a conversation with the customer. If you click <strong>Decline</strong>, chat request will be routed to next available agent.</p><h2>Joining an ongoing chat</h2><p>In addition to accepting new chat requests, you can also join ongoing chats from the main KDFW tab.&nbsp;</p><p>To join an ongoing chat:</p><ol><li>Log into Kayako Desktop for Windows.</li><li>The first screen you'll see is the 'Visitors' screen. Find the chat you want to join and right-click.</li><li>&nbsp;Hover over the 'Join' option.<br><img src=\\\"https://lh3.googleusercontent.com/h1wUVe4j0LeXZkosZQXhVrn1-szOEKbxoDQDZra_qze-QqhepcSuSfPdJD7zqb_bPS_UfdGEn7BRONBfpvXypkZ8wqbGuB7TQB-0kmk59r64fqwetiPjW-NIQf2iwJkEOsYRA8Pi\\\" height=\\\"232\\\" class=\\\"fr-dib fr-draggable\\\" style=\\\"width: 581px;\\\"></li><li>From here, you have two options:&nbsp;<ul><li><strong>Join Chat</strong> — Click this option to join the chat and be visible to both the other agent and the customer.</li><li><strong>Join Chat as Observer</strong> — Click this option to join the chat as an observer, you will not be able to participate in the conversation and the only staff member will aware of your presence.</li></ul></li></ol><h2>Sending files from a chat window</h2><p>Are you in a chat with the customer and want to share a file on the fly? Don't worry, no channel-switching required. KDFW lets you send many different types of media. When you share a file with your customer, it will appear in their chat window, where they download it. Any files you send over KDFW are secured by the same measures that protect the rest of your Kayako account.</p><p dir=\\\"ltr\\\">Below, we'll go through the different types of files you can send.</p><h3 dir=\\\"ltr\\\">Sending an image</h3><ol><li>From your chat window, above the reply text box, click the <strong>Send an image&nbsp;</strong>button.<br><img src=\\\"https://kushaltrial.kayako.com/base/media/url/hiBJQ0y8jsW10XEpRW4UmGAegk2an7EP\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" class=\\\"fr-dib fr-draggable\\\"><em>NOTE: You'll can also send an image from the <strong>Push</strong> menu on the toolbar.&nbsp;</em></li><li>From the 'Push image' window, you'll have two options:<ul><li><strong>Upload an image from the local system</strong> — Choose this option to upload an image file from your computer.</li><li><strong>Send an online image</strong> — Choose this option to send an image to the customer using the URL for that image</li></ul></li><li>Add your image and click the <strong>OK&nbsp;</strong>button to send the image to your customer.&nbsp;</li></ol><h3>Sending a file</h3><ol><li>From your chat window, above the reply text box, click the <strong>Send a file&nbsp;</strong>button.<br><img src=\\\"https://kushaltrial.kayako.com/base/media/url/d3qewomUdzGHvue6JiiLUrmyD5p3KjLZ\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" class=\\\"fr-dib fr-draggable\\\"><em>NOTE: You'll can also send a file from the <strong>Push</strong> menu on the toolbar.&nbsp;</em></li><li>In the 'Push file' window, click <strong>Browse</strong>.</li><li>Find the file you'd like to send and click <strong>OK</strong>.</li><li>Click the <strong>OK</strong> button again to send the file.</li></ol><h3>Sending a code snippet</h3><ol><li>From your chat window, above the reply text box, click the <strong>Send example source code&nbsp;</strong>button.<img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/lxJPQIECJzJHp4SL3YJsCQmBr9NcqFnQ\\\" style=\\\"width: 546px; height: 138.982px;\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\"><em>NOTE: You'll can also send a code snippet from the <strong>Push</strong> menu on the toolbar.&nbsp;</em></li><li>In the 'Push code' window, paste the source code you'd like to send.</li><li>From the 'Language' drop-down, select the language respective to the source code you are sharing:<img src=\\\"https://kushaltrial.kayako.com/base/media/url/TpMpyTdrsSd0Hng52Tsd4UMkhLfISXdC\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" class=\\\"fr-dib fr-draggable\\\"></li><li>Click the <strong>OK</strong> button to send the code snippet.</li></ol><p>The customer will get the shared code in the chat window which can be copied to use further easily.</p><h3>Sending a hyperlink</h3><ol><li>From your chat window, above the reply text box, you'll see a <strong>Push URL&nbsp;</strong>text box:<img src=\\\"https://kushaltrial.kayako.com/base/media/url/7z4OcVNhOJdKQLEFfkKCUIJXBH6LTrgc\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" class=\\\"fr-dib fr-draggable\\\"><em>NOTE: You can also send a hyperlink from the <strong>Push&nbsp;</strong>menu on the toolbar.&nbsp;</em></li><li>Type or paste the URL you want to link your customer to.&nbsp;</li><li>Click the <strong>Send&nbsp;</strong>button to the right to send across a clickable hyperlink.</li></ol>\",\n" +
                "                        \"createdAt\": \"2016-06-27T22:23:33+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-27T22:23:33+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1576\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"keywords\": \"kdfw, kayako desktop for windows, live chat, kayako desktop\",\n" +
                "                \"section\": {\n" +
                "                    \"id\": 245,\n" +
                "                    \"titles\": [\n" +
                "                        {\n" +
                "                            \"id\": 1507,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"Channels\",\n" +
                "                            \"createdAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                            \"updatedAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                            \"resourceType\": \"localeField\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1507\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"slugs\": [\n" +
                "                        {\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"245-channels\",\n" +
                "                            \"resourceType\": \"slug\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"descriptions\": [\n" +
                "                        {\n" +
                "                            \"id\": 1508,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"Communicate with customers via email, chat, and social media – all without ever leaving Kayako.\",\n" +
                "                            \"createdAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                            \"updatedAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                            \"resourceType\": \"localeField\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1508\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"visibility\": \"PUBLIC\",\n" +
                "                    \"category\": {\n" +
                "                        \"id\": 5,\n" +
                "                        \"titles\": [\n" +
                "                            {\n" +
                "                                \"id\": 1499,\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": \"User Guide\",\n" +
                "                                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resourceType\": \"localeField\",\n" +
                "                                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"slugs\": [\n" +
                "                            {\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": \"5-user-guide\",\n" +
                "                                \"resourceType\": \"slug\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"descriptions\": [\n" +
                "                            {\n" +
                "                                \"id\": 1500,\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": null,\n" +
                "                                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resourceType\": \"localeField\",\n" +
                "                                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"brand\": null,\n" +
                "                        \"displayOrder\": 1,\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                        \"resourceType\": \"category\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "                    },\n" +
                "                    \"agent\": {\n" +
                "                        \"id\": 389,\n" +
                "                        \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                        \"fullName\": \"Kelly O'Brien\",\n" +
                "                        \"role\": {\n" +
                "                            \"id\": 1,\n" +
                "                            \"title\": \"Administrator\",\n" +
                "                            \"response\": \"ADMIN\",\n" +
                "                            \"resourceType\": \"role\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                        },\n" +
                "                        \"teams\": [\n" +
                "                            {\n" +
                "                                \"id\": 16,\n" +
                "                                \"title\": \"Support\",\n" +
                "                                \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                                \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                                \"resourceType\": \"teamMinimal\",\n" +
                "                                \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                        \"lastActivityAt\": null,\n" +
                "                        \"resourceType\": \"userMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                    },\n" +
                "                    \"articleOrderBy\": \"LATEST\",\n" +
                "                    \"totalArticles\": 8,\n" +
                "                    \"createdAt\": \"2016-06-23T14:39:29+00:00\",\n" +
                "                    \"updatedAt\": \"2016-07-08T17:21:01+00:00\",\n" +
                "                    \"resourceType\": \"section\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/245\"\n" +
                "                },\n" +
                "                \"creator\": {\n" +
                "                    \"id\": 389,\n" +
                "                    \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                    \"fullName\": \"Kelly O'Brien\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 1,\n" +
                "                        \"title\": \"Administrator\",\n" +
                "                        \"response\": \"ADMIN\",\n" +
                "                        \"resourceType\": \"role\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 16,\n" +
                "                            \"title\": \"Support\",\n" +
                "                            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                            \"resourceType\": \"teamMinimal\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                    \"lastActivityAt\": null,\n" +
                "                    \"resourceType\": \"userMinimal\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                },\n" +
                "                \"author\": {\n" +
                "                    \"id\": 389,\n" +
                "                    \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                    \"fullName\": \"Kelly O'Brien\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 1,\n" +
                "                        \"title\": \"Administrator\",\n" +
                "                        \"response\": \"ADMIN\",\n" +
                "                        \"resourceType\": \"role\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 16,\n" +
                "                            \"title\": \"Support\",\n" +
                "                            \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                            \"resourceType\": \"teamMinimal\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                    \"lastActivityAt\": null,\n" +
                "                    \"resourceType\": \"userMinimal\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                },\n" +
                "                \"attachments\": [],\n" +
                "                \"downloadAll\": null,\n" +
                "                \"status\": \"PUBLISHED\",\n" +
                "                \"upvoteCount\": 0,\n" +
                "                \"downvoteCount\": 0,\n" +
                "                \"views\": 667,\n" +
                "                \"rank\": 0,\n" +
                "                \"tags\": [],\n" +
                "                \"isFeatured\": false,\n" +
                "                \"allowComments\": true,\n" +
                "                \"totalComments\": 0,\n" +
                "                \"createdAt\": \"2016-06-27T22:23:32+00:00\",\n" +
                "                \"publishedAt\": \"2016-07-01T19:23:57+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-01T19:23:57+00:00\",\n" +
                "                \"resourceType\": \"article\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/articles/1174\"\n" +
                "            },\n" +
                "            \"createdAt\": \"2016-06-27T22:23:32+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-01T19:23:57+00:00\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"search\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 2,\n" +
                "    \"totalCount\": 230,\n" +
                "    \"nextUrl\": \"https://support.kayako.com/api/v1/helpcenter/search.json?_case=camel&in=articles&include=%2A&limit=2&offset=2&query=kayako\",\n" +
                "    \"lastUrl\": \"https://support.kayako.com/api/v1/helpcenter/search.json?_case=camel&in=articles&include=%2A&limit=2&offset=228&query=kayako\"\n" +
                "}";


        SearchArticleParser searchArticleParser = new SearchArticleParser(Locale.forLanguageTag("en-us"));
        List<SearchArticle> searchArticleList = new ResponseParser<>(searchArticleParser).parseList(json);

        for (SearchArticle searchArticle : searchArticleList) {
            System.out.println(searchArticle.getTitle() + " : " + searchArticle.getCategoryName() + " > " + searchArticle.getSectionName());
            assertNotNull(searchArticle.getTitle());
            assertNotNull(searchArticle.getCategoryName());
            assertNotNull(searchArticle.getSectionName());
            assertNotNull(searchArticle.getOriginalArticle());
            assertNotNull(searchArticle.getOriginalArticle().getSection());
            assertNotNull(searchArticle.getOriginalArticle().getSection().getCategory());
        }
    }

}