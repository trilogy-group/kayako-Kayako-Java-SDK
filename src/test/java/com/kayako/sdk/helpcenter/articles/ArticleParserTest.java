package com.kayako.sdk.helpcenter.articles;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 25/08/16
 */
public class ArticleParserTest {

    @Test
    public void parse() throws Exception {

        String jsonSample = "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 1145,\n" +
                "            \"uuid\": \"ab6f0c10-ade3-5898-bb0a-37fd808f5b07\",\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1503,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Starting out with Kayako\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1503\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"1145-starting-out-with-kayako\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"contents\": [\n" +
                "                {\n" +
                "                    \"id\": 1504,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"<p>Welcome to Kayako! We're so happy to have you here! To help you start serving your customers using Kayako, we've put together this guide to walk you through the basics of getting up and running. Each step below will link off to an article with detailed explanations and instructions for that particular task.</p><p>And of course, if you run into any questions, hit us up from the Messenger pop-up below, the Help Center search above, or the <strong>Start a conversation&nbsp;</strong>link right next door. We're here (and there and everywhere) for you!</p><h2>Step 1: Take a tour of the Kayako interface</h2><p>The Kayako interface is made up of three areas:</p><ul><li><strong>Help center</strong> — Located, by default, at 'http://<em>yourcompany</em>.kayako.com', the help center is your public-facing support site. From the help center, customers can start conversations with your team, as well as checking in ongoing ones. They can edit their user profiles. They can read, rate, and comment on support articles. Your team will be able to add, edit, and organize your self-service content directly from the help center. In addition, they can customize the look and feel of the help center with the built in template customization panel. For a closer look, check out <a href=\\\"https://support.kayako.com/article/1179-exploring-the-help-center\\\" target=\\\"_blank\\\">our help center overview article</a>.<br><br></li><li><strong>Agent area</strong> — Kayako's agent area, accessible by adding '/agent' to your help center URL, is where your support team will spend most of their time. This is where your agents can view the support queue, respond to cases, view user and organization profiles, and more. Take a tour with our <a href=\\\"https://support.kayako.com/article/1178-navigating-the-agent-area\\\" target=\\\"_blank\\\">agent area overview article</a>.<br><br></li><li><strong>Admin area</strong> — The admin area will be accessible to users with administrator privileges. You can get there by selecting 'Administration' from under your username on the agent area toolbar or by adding '/admin' to the end of your help center URL. The admin area is home to all of Kayako's configuration options. From here, you'll be able to build and customize virtually every aspect of the Kayako experience for your staff and your customers. For a rundown of all the features you'll find here, head over to <a href=\\\"https://support.kayako.com/article/1177-getting-acquainted-with-the-admin-area\\\" target=\\\"_blank\\\">our admin area overview article</a>.</li></ul><h2>Step 2: Create your teams</h2><p>Once you've oriented yourself in the Kayako interface, it's a good time to start building out your teams. Maybe all of your support agents are trained to handle any type of support conversation — great, you can probably stick with a single team. But what if you offer three types of support: customer service, technical support, and sales. Creating a different team in Kayako for each group gives you a lot more control over case visibility, assignments, and automations.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1156-grouping-staff-users-into-teams\\\">our article about setting up teams</a>.</p><h2>Step 3: Add user accounts for your staff</h2><p>After you've built out your team structure, you'll want to start adding your agents. Each agent will need their own user account, which will let them log in to the agent area and start viewing and responding to cases.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1180-creating-user-accounts\\\" target=\\\"_blank\\\">our article about creating user accounts</a>.</p><h2>Step 4: Add some self-service content</h2><p>Since self-service is your support team's first line of defense, now is a good time to get some content up onto your help center. Kayako includes a set of frictionless content management tools, allowing you to add, edit, and reorganize your self-service content right from the help center.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1165-help-center-content\\\" target=\\\"_blank\\\">our article about managing help center content</a>.</p><h2>Step 5: Brand your help center</h2><p>To ensure that your customers have a seamless support experience, it's important to line up the look of your help center with your company branding. Configuring a custom help center domain is a good place to start, but you can also add your own logo, color scheme, and even detailed CSS styling to fine tune the help center's look and feel.</p><p>Learn more about customizing your customers' support experience by reading our article on brands <em>(coming soon!)</em> as well as <a href=\\\"https://support.kayako.com/article/1166-help-center-customization\\\">our article on fine tuning the look and feel of your help center</a>.</p><h2>Step 6: Set up support channels</h2><p>Now that you've got support agents waiting and an attractive support site ready to go, you'll want to make it easy for your customers to reach out — from wherever they happen to be. Kayako makes it easy for your customers to start conversations not only from the Help Center itself, but also via email, Messenger, Twitter, and Facebook.</p><p>Learn how to set up support channels by reading our articles on <a href=\\\"https://support.kayako.com/article/1147-configuring-email-support\\\">configuring email accounts</a>, <a href=\\\"https://support.kayako.com/article/1171-enabling-kayako-messenger\\\">enabling live support with Messenger</a>, <a href=\\\"https://support.kayako.com/article/1148-setting-up-twitter-support\\\">setting up Twitter support</a>, and <a href=\\\"https://support.kayako.com/article/1149-adding-facebook-support\\\">connecting to Facebook pages</a>.</p><h2>Step 7: Fine tune your case views</h2><p>As your agents start to field cases, it's useful to give them lots of ways to slice and dice the support queue. Maybe they need to see only the cases assigned to their team, only the cases from a particular organization, or only the cases that at a particular priority level. Customizing case views lets you filter cases however you want.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1150-adding-and-editing-views\\\" target=\\\"_blank\\\">our article about customizing case views</a>.</p><h2>Step 8: Customize your case forms</h2><p>Not all conversations are created equal. Let's say Customer A writes in to renew their subscription to your product, and Customer B writes in for help troubleshooting an error they've encounter. The questions you're going to ask Customer A will be quite different from those you ask Customer B.</p><p>The easiest way to handle that is to create multiple case forms, which control what information you track for different types of cases. For customers looking to renew a subscription, you might just ask for their name, email address, and subscription tier, whereas a troubleshooting form might include some custom fields to capture information on the customer's software environment and product version.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1152-customizing-case-forms\\\">our article about customizing case forms</a> and <a href=\\\"https://support.kayako.com/article/1151-adding-custom-fields-for-cases-users-and-organizations\\\" target=\\\"_blank\\\">our article about creating custom fields</a>.</p><h2>Step 9: Polish up your notification emails</h2><p>Kayako comes with a handful of automated notification emails built in. But you'll probably want to take a pass at editing these emails to suit your organization's particular needs. You can stick with minor changes to tone and content, or you can create multiple sets of notification emails tailored to different teams, cases, or customers.</p><p>Learn more in our article about editing automated notification emails <em>(coming soon!)</em>.</p><h2>Step 10: Set your team's business hours</h2><p>As a first step toward building automations, it's a good idea to tell Kayako what days and hours your support team is on the clock. Once you have your business hours set, you can make sure your SLAs and other automations are only active when your team is active.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1160-setting-your-team-s-working-hours\\\">our article about setting your business hours</a>.</p><h2>Step 11: Establish service level agreements (SLAs)</h2><p>Service level agreements let you define reply and resolution deadlines for your cases. Kayako comes with a default set of SLAs built-in, but you can create multiple SLAs tailored to suit the needs of different support channels, different case types, different customers — really any subset of cases you like. Once you have your deadlines set, you can use automations to build escalations for overdue cases.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1158-establishing-slas-and-escalations\\\" target=\\\"_blank\\\">our article about establishing SLAs and escalations</a>.</p><h2>Step 12: Start in on some workflow automations</h2><p>If you've dipped your toes into the automation pool with SLAs, you'll have seen a glimpse of how powerful they can be. A good next step is to start building out some workflow automations that assign cases to certain teams or agents, add tags to cases that meet certain criteria, or just usher cases smoothly through your team's workflow.</p><p>Learn more in our article about building workflow automations <em>(coming soon!)</em>.</p><h2>Step 13: Get your team ready to start handling cases</h2><p>Once you've got some moving pieces set up on the back end, you can get your team started with actually replying to and updating cases. Looking at each case, you'll see that they represent the intersection of many of the different functions you've played with above. Cases combine a unified timeline of your interactions with the customer, on any channel, with a powerful toolbar that lets you reply to, assign, categorize, and otherwise move the case along.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1168-responding-to-cases\\\">our article about responding to support cases</a>.&nbsp;</p><h2>Step 14: Learn more</h2><p>All of the above is only the tip of the Kayako iceberg. Use the search bar to track down information about other Kayako features, or <a href=\\\"https://support.kayako.com/request/new\\\" target=\\\"_blank\\\">reach out to our support team directly</a> — we're always happy to help.</p>\",\n" +
                "                    \"createdAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1504\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"keywords\": null,\n" +
                "            \"section\": {\n" +
                "                \"id\": 243,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1501,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Getting started\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1501\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"243-getting-started\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 1502,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"If you're new to Kayako, this is the place to be. Let's get you up and running!\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1502\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"visibility\": \"PUBLIC\",\n" +
                "                \"category\": {\n" +
                "                    \"id\": 5,\n" +
                "                    \"titles\": [\n" +
                "                        {\n" +
                "                            \"id\": 1499,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"User Guide\",\n" +
                "                            \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                            \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                            \"resourceType\": \"localeField\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"slugs\": [\n" +
                "                        {\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"5-user-guide\",\n" +
                "                            \"resourceType\": \"slug\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"descriptions\": [\n" +
                "                        {\n" +
                "                            \"id\": 1500,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": null,\n" +
                "                            \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                            \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                            \"resourceType\": \"localeField\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"brand\": null,\n" +
                "                    \"displayOrder\": 1,\n" +
                "                    \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                    \"resourceType\": \"category\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "                },\n" +
                "                \"agent\": {\n" +
                "                    \"id\": 389,\n" +
                "                    \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                    \"fullName\": \"Kelly O'Brien\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 1,\n" +
                "                        \"title\": \"Administrator\",\n" +
                "                        \"type\": \"ADMIN\",\n" +
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
                "                \"articleOrderBy\": \"LATEST\",\n" +
                "                \"totalArticles\": 5,\n" +
                "                \"createdAt\": \"2016-06-23T14:13:00+00:00\",\n" +
                "                \"updatedAt\": \"2016-08-12T18:56:41+00:00\",\n" +
                "                \"resourceType\": \"section\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/243\"\n" +
                "            },\n" +
                "            \"creator\": {\n" +
                "                \"id\": 389,\n" +
                "                \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                \"fullName\": \"Kelly O'Brien\",\n" +
                "                \"role\": {\n" +
                "                    \"id\": 1,\n" +
                "                    \"title\": \"Administrator\",\n" +
                "                    \"type\": \"ADMIN\",\n" +
                "                    \"resourceType\": \"role\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                },\n" +
                "                \"teams\": [\n" +
                "                    {\n" +
                "                        \"id\": 16,\n" +
                "                        \"title\": \"Support\",\n" +
                "                        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                        \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                        \"resourceType\": \"teamMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                \"lastActivityAt\": null,\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "            },\n" +
                "            \"author\": {\n" +
                "                \"id\": 389,\n" +
                "                \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                \"fullName\": \"Kelly O'Brien\",\n" +
                "                \"role\": {\n" +
                "                    \"id\": 1,\n" +
                "                    \"title\": \"Administrator\",\n" +
                "                    \"type\": \"ADMIN\",\n" +
                "                    \"resourceType\": \"role\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                },\n" +
                "                \"teams\": [\n" +
                "                    {\n" +
                "                        \"id\": 16,\n" +
                "                        \"title\": \"Support\",\n" +
                "                        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                        \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                        \"resourceType\": \"teamMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                \"lastActivityAt\": null,\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"status\": \"PUBLISHED\",\n" +
                "            \"upvoteCount\": 1,\n" +
                "            \"downvoteCount\": 0,\n" +
                "            \"views\": 2610,\n" +
                "            \"rank\": 0,\n" +
                "            \"tags\": [],\n" +
                "            \"isFeatured\": true,\n" +
                "            \"allowComments\": true,\n" +
                "            \"totalComments\": 0,\n" +
                "            \"createdAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "            \"publishedAt\": \"2016-06-23T14:14:35+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-03T00:00:48+00:00\",\n" +
                "            \"resourceType\": \"article\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/articles/1145\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 1179,\n" +
                "            \"uuid\": \"704dcb1d-23a6-5e81-a18c-79a36836ea24\",\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"id\": 1589,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"Exploring the Help Center\",\n" +
                "                    \"createdAt\": \"2016-06-30T16:13:55+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-30T16:13:55+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1589\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"slugs\": [\n" +
                "                {\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"1179-exploring-the-help-center\",\n" +
                "                    \"resourceType\": \"slug\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"contents\": [\n" +
                "                {\n" +
                "                    \"id\": 1590,\n" +
                "                    \"locale\": \"en-us\",\n" +
                "                    \"translation\": \"<p>Your Help Center is the first line of support for your customers. They can search for answers in your self-service content, chat with your support team via Messenger, and start and monitor their conversations with your support team. Customers can also update their user profiles from the Help Center.</p><p>Anyone that contributes to your self-service content will also be spending a lot of time in the Help Center. The content editing tools are built right in, so if you come across an article that needs a change, you can open it for editing, on the spot. You'll also be able to customize the look and feel of the Help Center. Whether you just want to add your own logo and color scheme or dig into the templates to overhaul the way the Help Center is displayed, you'll find all those options here.</p><p>In this article, we'll highlight some of the key features of the Help Center and link off to other areas of the user guide, so you can get started using them.</p><h2>Getting started with Help Center features</h2><p>Your Help Center is the first stop for your customers when they have a question. Any visitor to the Help Center can search your self-service content or start a conversation with your team. Once <a href=\\\"https://support.kayako.com/article/1182-signing-into-your-kayako\\\">they sign in to the Help Center</a> they can also track and update their open cases, make changes to their user profiles, and comment on articles. By default, the Help Center is located at 'http://<em>yourcompany</em>.kayako.com', but you can customize the location by <a href=\\\"https://support.kayako.com/article/1155-brands\\\">defining a custom domain in your Help Center's brand</a>.</p><p>Wherever it lives, though, the Help Center really has three main sections you'll be concerned with:</p><ul><li><p><strong>User menu</strong> — In addition to the search bar and Messenger, the user menu is where most of your customers' options live.<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/bCMLJMlKImfU6JIDtIFLwS0uSRPunHgO\\\" style=\\\"width: 430px; height: 199.233px;\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\">Any visitor to the Help Center, logged in or not, can click the <strong>Start a conversation</strong> link, fill out the<a href=\\\"https://support.kayako.com/article/1152-customizing-case-forms\\\">&nbsp;form</a>, and open a new case in Kayako. Once a user is logged in, they'll also be able to see and respond to any open cases they have, as well as update their profile from this menu.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1180-creating-user-accounts\\\">our user guide article about user accounts</a>.</p></li><li><p><strong>Self-service content</strong> — Your self-service content lives below the search bar, and your team will be editing and organizing your content directly from the Help Center interface.<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/75ANOIGxBq6u1j4TuUJIWhKOXUECLWhT\\\" style=\\\"width: 658px; height: 256.242px;\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\">You can add and delete categories, sections, and articles. You can edit existing articles, as well as moving them to new categories and sections. You can also moderate and reply to customer comments on individual articles.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1165-help-center-content\\\">our article about managing your Help Center content.</a></p></li><li><p><strong>Customization tools</strong> — To deliver a seamlessly branded experience to your customers, you have full control over the look and feel of your Help Center, thanks to the customization panel.<br><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/bT4iDnWxrNiCHJ0Ufy9xXslTCQSRXFIp\\\" style=\\\"width: 602px; height: 495.73px;\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\">You can start with just a logo and a custom font or color scheme, or you can dig into the page templates themselves. From there you can customize every detail of how your Help Center appears to your customers.</p><p>Learn more in <a href=\\\"https://support.kayako.com/article/1166-help-center-customization\\\">our article about customizing the appearance of your Help Center</a>.</p></li></ul>\",\n" +
                "                    \"createdAt\": \"2016-06-30T16:13:55+00:00\",\n" +
                "                    \"updatedAt\": \"2016-06-30T16:13:55+00:00\",\n" +
                "                    \"resourceType\": \"localeField\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1590\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"keywords\": null,\n" +
                "            \"section\": {\n" +
                "                \"id\": 243,\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1501,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Getting started\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1501\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"243-getting-started\",\n" +
                "                        \"resourceType\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"descriptions\": [\n" +
                "                    {\n" +
                "                        \"id\": 1502,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"If you're new to Kayako, this is the place to be. Let's get you up and running!\",\n" +
                "                        \"createdAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                        \"updatedAt\": \"2016-06-23T14:13:01+00:00\",\n" +
                "                        \"resourceType\": \"localeField\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1502\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"visibility\": \"PUBLIC\",\n" +
                "                \"category\": {\n" +
                "                    \"id\": 5,\n" +
                "                    \"titles\": [\n" +
                "                        {\n" +
                "                            \"id\": 1499,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"User Guide\",\n" +
                "                            \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                            \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                            \"resourceType\": \"localeField\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"slugs\": [\n" +
                "                        {\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"5-user-guide\",\n" +
                "                            \"resourceType\": \"slug\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"descriptions\": [\n" +
                "                        {\n" +
                "                            \"id\": 1500,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": null,\n" +
                "                            \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                            \"updatedAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                            \"resourceType\": \"localeField\",\n" +
                "                            \"resourceUrl\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"brand\": null,\n" +
                "                    \"displayOrder\": 1,\n" +
                "                    \"createdAt\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                    \"updatedAt\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                    \"resourceType\": \"category\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "                },\n" +
                "                \"agent\": {\n" +
                "                    \"id\": 389,\n" +
                "                    \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                    \"fullName\": \"Kelly O'Brien\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 1,\n" +
                "                        \"title\": \"Administrator\",\n" +
                "                        \"type\": \"ADMIN\",\n" +
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
                "                \"articleOrderBy\": \"LATEST\",\n" +
                "                \"totalArticles\": 5,\n" +
                "                \"createdAt\": \"2016-06-23T14:13:00+00:00\",\n" +
                "                \"updatedAt\": \"2016-08-12T18:56:41+00:00\",\n" +
                "                \"resourceType\": \"section\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/sections/243\"\n" +
                "            },\n" +
                "            \"creator\": {\n" +
                "                \"id\": 389,\n" +
                "                \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                \"fullName\": \"Kelly O'Brien\",\n" +
                "                \"role\": {\n" +
                "                    \"id\": 1,\n" +
                "                    \"title\": \"Administrator\",\n" +
                "                    \"type\": \"ADMIN\",\n" +
                "                    \"resourceType\": \"role\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                },\n" +
                "                \"teams\": [\n" +
                "                    {\n" +
                "                        \"id\": 16,\n" +
                "                        \"title\": \"Support\",\n" +
                "                        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                        \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                        \"resourceType\": \"teamMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                \"lastActivityAt\": null,\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "            },\n" +
                "            \"author\": {\n" +
                "                \"id\": 389,\n" +
                "                \"uuid\": \"74658251-3717-43c9-8653-410e7ca2e449\",\n" +
                "                \"fullName\": \"Kelly O'Brien\",\n" +
                "                \"role\": {\n" +
                "                    \"id\": 1,\n" +
                "                    \"title\": \"Administrator\",\n" +
                "                    \"type\": \"ADMIN\",\n" +
                "                    \"resourceType\": \"role\",\n" +
                "                    \"resourceUrl\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                },\n" +
                "                \"teams\": [\n" +
                "                    {\n" +
                "                        \"id\": 16,\n" +
                "                        \"title\": \"Support\",\n" +
                "                        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                        \"updatedAt\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                        \"resourceType\": \"teamMinimal\",\n" +
                "                        \"resourceUrl\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                \"lastActivityAt\": null,\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "            },\n" +
                "            \"attachments\": [],\n" +
                "            \"downloadAll\": null,\n" +
                "            \"status\": \"PUBLISHED\",\n" +
                "            \"upvoteCount\": 0,\n" +
                "            \"downvoteCount\": 0,\n" +
                "            \"views\": 1496,\n" +
                "            \"rank\": 0,\n" +
                "            \"tags\": [],\n" +
                "            \"isFeatured\": false,\n" +
                "            \"allowComments\": true,\n" +
                "            \"totalComments\": 0,\n" +
                "            \"createdAt\": \"2016-06-30T16:13:55+00:00\",\n" +
                "            \"publishedAt\": \"2016-06-30T23:20:05+00:00\",\n" +
                "            \"updatedAt\": \"2016-07-03T00:01:25+00:00\",\n" +
                "            \"resourceType\": \"article\",\n" +
                "            \"resourceUrl\": \"https://support.kayako.com/api/v1/articles/1179\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"article\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 2,\n" +
                "    \"totalCount\": 5,\n" +
                "    \"nextUrl\": \"https://support.kayako.com/api/v1/articles.json?_case=camel&include=%2A&limit=2&offset=2&sectionId=243\",\n" +
                "    \"lastUrl\": \"https://support.kayako.com/api/v1/articles.json?_case=camel&include=%2A&limit=2&offset=4&sectionId=243\"\n" +
                "}";

        Locale locale = Locale.forLanguageTag("en-us");
        ArticleParser articleParser = new ArticleParser(locale);
        List<Article> articleList = articleParser.parse(jsonSample);

        assertTrue("There should be 2 articles parsed", articleList.size() == 2);
        for (Article article : articleList) {
            validateArticle(article);
        }
    }

    private void validateArticle(Article article) {
        Assert.assertNotNull(article.getId());
        Assert.assertNotNull(article.getTitle());
        Assert.assertNotNull(article.getAuthor());
        System.out.println(article.getId() + ":" + article.getTitle());
        System.out.println("Author:" + article.getAuthor().getFullName());
    }
}