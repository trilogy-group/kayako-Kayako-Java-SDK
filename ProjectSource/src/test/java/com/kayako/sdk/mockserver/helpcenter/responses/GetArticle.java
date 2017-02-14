package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/02/17
 */
public class GetArticle extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "http://support.kayako.com//api/v1/articles/1145?_case=camel&include=localeField,category,section,userMinimal";
    }

    @Override
    public int getStatusCode() {
        return 200;
    }

    @Override
    public String getBody() {
        return "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": {\n" +
                "        \"id\": 1145,\n" +
                "        \"uuid\": \"ab6f0c10-ade3-5898-bb0a-37fd808f5b07\",\n" +
                "        \"titles\": [\n" +
                "            {\n" +
                "                \"id\": 1503,\n" +
                "                \"locale\": \"en-us\",\n" +
                "                \"translation\": \"Starting out with Kayako\",\n" +
                "                \"createdAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "                \"updatedAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "                \"resourceType\": \"localeField\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1503\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"slugs\": [\n" +
                "            {\n" +
                "                \"locale\": \"en-us\",\n" +
                "                \"translation\": \"1145-starting-out-with-kayako\",\n" +
                "                \"resourceType\": \"slug\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"contents\": [\n" +
                "            {\n" +
                "                \"id\": 1504,\n" +
                "                \"locale\": \"en-us\",\n" +
                "                \"translation\": \"<p>Welcome to Kayako! We&#39;re so happy to have you here! To help\\n  you start serving your customers using Kayako, we&#39;ve put together\\n  this guide to walk you through the basics of getting up and\\n  running. Each step below will walk you through the basics, and\\n  then link off to an article with detailed explanations and\\n  instructions for that particular task.</p>\\n  <p><span style=\\\"background-color: transparent; text-align: initial;\\\">We&#39;ve\\n  charted the following course to help you get started helping your\\n  customers as quickly and smoothly as possible: </span></p>\\n  <ul>\\n    <li>\\n      <a href=\\\"#tour\\\" rel=\\\"nofollow\\\">Step 1: Take a tour of the\\n      Kayako interface</a>\\n    </li>\\n    <li>\\n      <a href=\\\"#staff\\\" rel=\\\"nofollow\\\">Step 2: Add user accounts for\\n      your staff</a>\\n    </li>\\n    <li>\\n      <a href=\\\"#channels\\\" rel=\\\"nofollow\\\">Step 3: Set up your\\n      support channels</a>\\n    </li>\\n    <li>\\n      <a href=\\\"#conversation_replies\\\" rel=\\\"nofollow\\\">Step 4: Get\\n      your team ready to start handling conversations</a>\\n    </li>\\n    <li>\\n      <a href=\\\"#views\\\" rel=\\\"nofollow\\\">Step 5: Fine tune your\\n      views</a>\\n    </li>\\n    <li>\\n      <a href=\\\"#help_center\\\" rel=\\\"nofollow\\\">Step 6: Add content to\\n      your Help Center</a>\\n    </li>\\n    <li>\\n      <a href=\\\"#next_steps\\\" rel=\\\"nofollow\\\">Step 7: Explore your\\n      next steps</a> \\n    </li>\\n  </ul>\\n  <h2 id=\\\"tour\\\">Step 1: Take a tour of the Kayako interface</h2>\\n  <p>To get oriented in Kayako, we recommend starting out with this\\n  video tour. We&#39;ll take you quickly through each area of the\\n  interface and introduce some key features. </p>\\n  <p><iframe src=\\\"//fast.wistia.net/embed/iframe/cr5rohub5k\\\" title=\\\"Wistia video player\\\" class=\\\"wistia_embed\\\" name=\\\"wistia_embed\\\" allowfullscreen=\\\"allowfullscreen\\\" width=\\\"600\\\" height=\\\"337\\\" id=\\\"wistia_embed\\\"></iframe></p>\\n  <script src=\\\"//fast.wistia.net/assets/external/E-v1.js\\\">\\n  </script>\\n  <p>You can find more detail on each area of Kayako in our\\n  overview articles about the <a href=\\\"https://support.kayako.com/article/1178-navigating-the-agent-area\\\" rel=\\\"nofollow\\\">\\n  agent area</a>, the <a href=\\\"https://support.kayako.com/article/1177-getting-acquainted-with-the-admin-area\\\" rel=\\\"nofollow\\\">\\n  admin area</a>, and the <a href=\\\"https://support.kayako.com/article/1179-exploring-the-help-center\\\" rel=\\\"nofollow\\\">\\n  Help Center</a>.</p>\\n  <h2 id=\\\"staff\\\">Step 2: Add user accounts for your staff</h2>\\n  <p>After you&#39;ve taken a look around, it&#39;s a good idea to start\\n   adding user accounts for your agents. Each agent will need\\n  their  own user account, which will let them log in to the\\n  agent area  and start viewing and responding to\\n  conversations. You can  quickly add staff users from the\\n  admin area, by clicking <strong>Team Directory </strong>on\\n  the sidebar. </p>\\n  <p><em>NOTE: The number of agent accounts you&#39;ll be able to add\\n   depends on how many seats your subscription\\n  includes.</em></p>\\n  <p>Learn more in <a href=\\\"https://support.kayako.com/article/1180-adding-and-editing-user-accounts-in-kayako\\\" rel=\\\"nofollow\\\">our article about creating user accounts</a>.</p>\\n  <h2 id=\\\"channels\\\">Step 3: Set up your email, real-time, and\\n   social support channels</h2>\\n  <p>Next step is to get Kayako ready to take questions from your\\n   customers—no matter what their preferred method of\\n  communication.  By default, your customers can start up a\\n  new conversation from  your Help Center, but you&#39;ll likely\\n  also want to: </p>\\n  <ul>\\n    <li>\\n      <strong>Add one or more email addresses</strong> that Kayako\\n       will use to receive and send messages. Learn more in\\n      our  article on <a href=\\\"https://support.kayako.com/article/1147-configuring-email-support\\\" rel=\\\"nofollow\\\">configuring email accounts</a>.\\n    </li>\\n    <li>\\n      <strong>Enable Kayako Messenger</strong>—our real-time\\n       support tool—on your Help Center. Learn more in our\\n      article  on <a href=\\\"https://support.kayako.com/article/1171-enabling-kayako-messenger\\\" rel=\\\"nofollow\\\">enabling live support with Messenger</a>.\\n    </li>\\n    <li>\\n      <strong>Connect your social media accounts</strong> to offer\\n       support via Twitter or Facebook. Learn more in our\\n      articles  on <a href=\\\"https://support.kayako.com/article/1148-setting-up-twitter-support\\\" rel=\\\"nofollow\\\">setting up Twitter support</a> and <a href=\\\"https://support.kayako.com/article/1149-adding-facebook-support\\\" rel=\\\"nofollow\\\">connecting to Facebook pages</a>.\\n    </li>\\n  </ul>\\n  <h2 id=\\\"conversation_replies\\\">Step 4: Get your team ready to\\n   start handling conversations</h2>\\n  <p>Once you have a support channel or two set up, it&#39;s time to\\n   get your team started with actually replying to and\\n  updating  conversations. Each conversation combines a\\n  unified timeline of  your interactions with the customer, on\\n  any channel, with a  powerful toolbar that lets you reply\\n  to, assign, categorize, and  otherwise move the conversation\\n  along.</p>\\n  <p>Help your team get started with <a href=\\\"https://support.kayako.com/article/1168-responding-to-customer-conversations\\\" rel=\\\"nofollow\\\">our article about responding to support\\n   conversations</a>. </p>\\n  <h2 id=\\\"views\\\">Step 5: Fine tune your views</h2>\\n  <p>As your queue starts to get busier, it&#39;s useful to give your\\n   support team lots of ways to slice and dice their workload.\\n  Maybe  they need to see only the conversations assigned to\\n  their team,  only the conversations from a particular\\n  organization, or only  the conversations set to a particular\\n  priority level. Customizing  views lets you filter\\n  conversations however you want.</p>\\n  <p>Learn more in <a href=\\\"https://support.kayako.com/article/1150-adding-and-editing-views\\\" rel=\\\"nofollow\\\">our article about customizing views</a>.</p>\\n  <h2 id=\\\"help_center\\\">Step 6: Add content to your Help Center</h2>\\n  <p>Since self-service is a valuable resource for your support\\n   team, now is a good time to get some content up onto your\\n  Help  Center. Kayako includes a set of frictionless content\\n  management  tools, allowing you to add, edit, and organize\\n  your self-service  content right from the Help Center.</p>\\n  <p>Learn more in <a href=\\\"https://support.kayako.com/article/1165-help-center-content\\\" rel=\\\"nofollow\\\">our article about managing Help Center\\n   content</a>.</p>\\n  <h2 id=\\\"conversation_replies\\\"><span style=\\\"background-color: transparent; text-align: initial;\\\">Step 7:\\n   Explore your next steps</span></h2>\\n  <p>Now that you&#39;ve got the basics down, why not dive a little\\n   deeper and explore some of Kayako&#39;s more powerful features?\\n  Here  are a few things you might try out next : </p>\\n  <ul>\\n    <li>\\n      <a href=\\\"https://support.kayako.com/article/1156-grouping-staff-users-into-teams\\\" rel=\\\"nofollow\\\">Organize your staff into functional teams</a>\\n    </li>\\n    <li>\\n      <a href=\\\"https://support.kayako.com/article/1152-building-forms-for-different-conversation-types\\\" rel=\\\"nofollow\\\">Customize your forms</a>\\n    </li>\\n    <li>\\n      <a href=\\\"https://support.kayako.com/article/1167-understanding-automation-in-kayako\\\" rel=\\\"nofollow\\\">Learn how automation works in Kayako</a>\\n    </li>\\n    <li>\\n      <a href=\\\"https://support.kayako.com/article/1158-establishing-slas-and-escalations\\\" rel=\\\"nofollow\\\">Set up SLAs and escalations</a>\\n    </li>\\n    <li>\\n      <a href=\\\"https://support.kayako.com/article/1166-customizing-the-appearance-of-your-help-center\\\" rel=\\\"nofollow\\\">Customize the appearance of your Help\\n       Center</a>\\n    </li>\\n  </ul>\\n  <p>Of course, if at any point you run into a question, we&#39;d love\\n   to hear from you! Hit us up from the Messenger pop-up\\n  below, the  Help Center search above, or the <strong>Start a\\n   conversation </strong>link up top. </p>\\n  <p><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/LEOtjC8WJy8OU6tISHcyS45dhRmM8dCk\\\" style=\\\"width: 624px; height: 346.816px;\\\"></p>\",\n" +
                "                \"createdAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "                \"updatedAt\": \"2017-02-03T17:12:30+00:00\",\n" +
                "                \"resourceType\": \"localeField\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1504\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"keywords\": null,\n" +
                "        \"section\": {\n" +
                "            \"id\": 243,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1501,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Getting started\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1501\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"243-getting-started\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"descriptions\": [\n" +
                "                {\n" +
                "                    \"id\": 1502,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"If you're new to Kayako, this is the place to be. Let's get you up and running!\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1502\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"visibility\": \"PUBLIC\",\n" +
                "            \"category\": {\n" +
                "                \"id\": 5,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1499,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"User Guide\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"5-user-guide\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 1500,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": null,\n" +
                "                        \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"brand\": null,\n" +
                "                \"displayOrder\": 1,\n" +
                "                \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                \"resourceType\": \"category\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "            },\n" +
                "            \"agent\": {\n" +
                "                \"id\": 389,\n" +
                "                \"fullName\": \"Kelly O'Brien\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T00:33:28+00:00\",\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1487032408\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "            },\n" +
                "            \"articleOrderBy\": \"LATEST\",\n" +
                "            \"totalArticles\": 5,\n" +
                "            \"createdAt\": \"2016-06-23T14:13:00+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-03T17:08:52+00:00\",\n" +
                "            \"resourceType\": \"section\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/243\"\n" +
                "        },\n" +
                "        \"creator\": {\n" +
                "            \"id\": 389,\n" +
                "            \"fullName\": \"Kelly O'Brien\",\n" +
                "            \"lastActiveAt\": \"2017-02-14T00:33:28+00:00\",\n" +
                "            \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1487032408\",\n" +
                "            \"resourceType\": \"userMinimal\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "        },\n" +
                "        \"author\": {\n" +
                "            \"id\": 389,\n" +
                "            \"fullName\": \"Kelly O'Brien\",\n" +
                "            \"lastActiveAt\": \"2017-02-14T00:33:28+00:00\",\n" +
                "            \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1487032408\",\n" +
                "            \"resourceType\": \"userMinimal\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "        },\n" +
                "        \"attachments\": [],\n" +
                "        \"downloadAll\": null,\n" +
                "        \"status\": \"PUBLISHED\",\n" +
                "        \"upvoteCount\": 2,\n" +
                "        \"downvoteCount\": 0,\n" +
                "        \"views\": 12366,\n" +
                "        \"rank\": 0,\n" +
                "        \"tags\": [],\n" +
                "        \"isFeatured\": true,\n" +
                "        \"allowComments\": false,\n" +
                "        \"totalComments\": 0,\n" +
                "        \"createdAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "        \"publishedAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "        \"updatedAt\": \"2017-02-03T17:12:31+00:00\",\n" +
                "        \"resourceType\": \"article\",\n" +
                "        \"resourceUrl\": \"https://support.kayako.com/api/v1/articles/1145\"\n" +
                "    },\n" +
                "    \"resource\": \"article\"\n" +
                "}\n";
    }
}
