package com.kayako.sdk.helpcenter.search;

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
                "            \"uuid\": \"d8c475b7-e5c6-5c9e-b44c-15f72a4d5ba2\",\n" +
                "            \"title\": \"Connecting Kayako to other apps with Zapier\",\n" +
                "            \"contents\": \"<p><a href=\\\"https://zapier.com\\\" target=\\\"_blank\\\">Zapier</a> (pronounced zap-e-er) is an app integration service that lets you connect <a href=\\\"https://zapier.com/app/explore\\\" target=\\\"_blank\\\">hundreds of apps</a> (such as Slack, Salesforce, Atlassian JIRA, and Trello) to each other.&nbsp;</p><p>Zapier is the best way to integrate Kayako with different apps and services to create powerful workflows that span multiple apps, all without touching any code.</p><p>We've built a powerful integration with Zapier, leveraging all of their platform's great features. For example, we've added support for dynamic fields, so you can pick properties (such as case priorities and user roles) from your Kayako account in Zapier, and you can reference and update values in custom case, user and organization fields.</p><p><img class=\\\"fr-dib fr-draggable\\\" src=\\\"https://support.kayako.com/base/media/url/gQ4ah9m16ycD7MTJ3SBOBI8wWVmtYgjS\\\" data-status=\\\"201\\\" data-data=\\\"[object Object]\\\" data-resource=\\\"media\\\" data-total_count=\\\"1\\\" data-logs=\\\"[object Object]\\\"></p><h2>How Zapier works</h2><p>You can connect Kayako and other apps to Zapier. Once connected, you can create automation recipes called <strong>zaps</strong>.&nbsp;</p><p>A zap can be made up of the following:</p><ul><li>A <strong>trigger</strong> — something that happens in an app that you want to be the start of a zap's workflow.</li><li>An <strong>action</strong> — <br><em>NOTE:&nbsp;</em><em>If it has trouble connecting, check the email and password you entered when connecting the account.</em></li><li>Now you've connected Kayako to Zapier and have tested it successfully, you can continue building your first zap. <a href=\\\"https://zapier.com/help/creating-zap/\\\" target=\\\"_blank\\\">Check out Zapier's detailed guide on creating a zap</a>.</li></ol><h2>Power user tip: Run code on Zapier</h2><p>Even though a big selling point of Zapier is the ability to integrate apps without touching any code, Zapier lets you run custom Javascript and Python code on Zapier as part of a zap. This lets you build extraordinarily powerful workflows using Zapier, all in the cloud. For example, you can transform data and interact with more complex APIs that Zapier doesn't support out of the box, such as your own backend systems.</p>\",\n" +
                "            \"link\": \"https://support.kayako.com/article/1169-connecting-kayako-to-other-apps-with-zapier\",\n" +
                "            \"original\": {\n" +
                "                \"id\": 1169,\n" +
                "                \"uuid\": \"d8c475b7-e5c6-5c9e-b44c-15f72a4d5ba2\",\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1565,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Connecting Kayako to other apps with Zapier\",\n" +
                "                        \"created_at\": \"2016-06-27T15:02:34+00:00\",\n" +
                "                        \"updated_at\": \"2016-06-27T15:02:34+00:00\",\n" +
                "                        \"resource_type\": \"locale_field\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1565\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1169-connecting-kayako-to-other-apps-with-zapier\",\n" +
                "                        \"resource_type\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"contents\": [\n" +
                "                    {\n" +
                "                        \"id\": 1566,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"<p><a href=\\\"https://zapier.com\\\" target=\\\"_blank\\\">Zapier</a> (pronounced zap-e-er) is an app integration service that lets you connect <a href=\\\"https://zapier.com/app/explore\\\" target=\\\"_blank\\\">hundreds of apps</a> (such as Slack, Salesforce, Atlassian JIRA, and Trello) to each other.&nbsp;</p><p>Zapier is the best way to integrate Kayako with different apps and services to create powerful workflows that span multiple apps, all without touching any code.</p><p>We've built a powerful integration with Zapier, leveraging all of their platform's great features. For example, we've added support for dynamic fields, so you can pick properties (such as case priorities and user roles) from your Kayako account in Zascript and Python code on Zapier as part of a zap. This lets you build extraordinarily powerful workflows using Zapier, all in the cloud. For example, you can transform data and interact with more complex APIs that Zapier doesn't support out of the box, such as your own backend systems.</p>\",\n" +
                "                        \"created_at\": \"2016-06-27T15:02:34+00:00\",\n" +
                "                        \"updated_at\": \"2016-06-27T15:02:34+00:00\",\n" +
                "                        \"resource_type\": \"locale_field\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1566\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"keywords\": \"api integration integrations apps\",\n" +
                "                \"section\": {\n" +
                "                    \"id\": 249,\n" +
                "                    \"titles\": [\n" +
                "                        {\n" +
                "                            \"id\": 1515,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"Integrations\",\n" +
                "                            \"created_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                            \"updated_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                            \"resource_type\": \"locale_field\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1515\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"slugs\": [\n" +
                "                        {\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"249-integrations\",\n" +
                "                            \"resource_type\": \"slug\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"descriptions\": [\n" +
                "                        {\n" +
                "                            \"id\": 1516,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"No Kayako is an island. Integrate with all your (other) favorite tools to power up your support.\",\n" +
                "                            \"created_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                            \"updated_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                            \"resource_type\": \"locale_field\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1516\"\n" +
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
                "                                \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resource_type\": \"locale_field\",\n" +
                "                                \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"slugs\": [\n" +
                "                            {\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": \"5-user-guide\",\n" +
                "                                \"resource_type\": \"slug\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"descriptions\": [\n" +
                "                            {\n" +
                "                                \"id\": 1500,\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": null,\n" +
                "                                \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resource_type\": \"locale_field\",\n" +
                "                                \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"brand\": null,\n" +
                "                        \"display_order\": 1,\n" +
                "                        \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updated_at\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                        \"resource_type\": \"category\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "                    },\n" +
                "                    \"agent\": {\n" +
                "                        \"id\": 389,\n" +
                "                        \"full_name\": \"Kelly O'Brien\",\n" +
                "                        \"role\": {\n" +
                "                            \"id\": 1,\n" +
                "                            \"title\": \"Administrator\",\n" +
                "                            \"type\": \"ADMIN\",\n" +
                "                            \"resource_type\": \"role\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                        },\n" +
                "                        \"teams\": [\n" +
                "                            {\n" +
                "                                \"id\": 16,\n" +
                "                                \"title\": \"Support\",\n" +
                "                                \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                                \"updated_at\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                                \"resource_type\": \"team_minimal\",\n" +
                "                                \"resource_url\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                        \"last_activity_at\": null,\n" +
                "                        \"resource_type\": \"user_minimal\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                    },\n" +
                "                    \"article_order_by\": \"LATEST\",\n" +
                "                    \"total_articles\": 3,\n" +
                "                    \"created_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"updated_at\": \"2016-07-04T12:21:21+00:00\",\n" +
                "                    \"resource_type\": \"section\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/sections/249\"\n" +
                "                },\n" +
                "                \"creator\": {\n" +
                "                    \"id\": 389,\n" +
                "                    \"full_name\": \"Kelly O'Brien\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 1,\n" +
                "                        \"title\": \"Administrator\",\n" +
                "                        \"type\": \"ADMIN\",\n" +
                "                        \"resource_type\": \"role\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 16,\n" +
                "                            \"title\": \"Support\",\n" +
                "                            \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updated_at\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                            \"resource_type\": \"team_minimal\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                    \"last_activity_at\": null,\n" +
                "                    \"resource_type\": \"user_minimal\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                },\n" +
                "                \"author\": {\n" +
                "                    \"id\": 22,\n" +
                "                    \"full_name\": \"Jamie Edwards\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 5,\n" +
                "                        \"title\": \"Owner\",\n" +
                "                        \"type\": \"OWNER\",\n" +
                "                        \"resource_type\": \"role\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/roles/5\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 46,\n" +
                "                            \"title\": \"Hello\",\n" +
                "                            \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updated_at\": \"2016-01-16T12:58:38+00:00\",\n" +
                "                            \"resource_type\": \"team_minimal\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/teams/46\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/e020e878-f992-4f8e-b1bf-d51708d5459a?1470042534\",\n" +
                "                    \"last_activity_at\": null,\n" +
                "                    \"resource_type\": \"user_minimal\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/users/22\"\n" +
                "                },\n" +
                "                \"attachments\": [],\n" +
                "                \"download_all\": null,\n" +
                "                \"status\": \"PUBLISHED\",\n" +
                "                \"upvote_count\": 1,\n" +
                "                \"downvote_count\": 0,\n" +
                "                \"views\": 3445,\n" +
                "                \"rank\": 0,\n" +
                "                \"tags\": [],\n" +
                "                \"is_featured\": true,\n" +
                "                \"allow_comments\": true,\n" +
                "                \"total_comments\": 0,\n" +
                "                \"created_at\": \"2016-06-27T15:02:33+00:00\",\n" +
                "                \"published_at\": \"2016-07-03T00:14:14+00:00\",\n" +
                "                \"updated_at\": \"2016-07-03T00:15:52+00:00\",\n" +
                "                \"resource_type\": \"article\",\n" +
                "                \"resource_url\": \"https://support.kayako.com/api/v1/articles/1169\"\n" +
                "            },\n" +
                "            \"created_at\": \"2016-06-27T15:02:33+00:00\",\n" +
                "            \"updated_at\": \"2016-07-03T00:15:52+00:00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"uuid\": \"50cb2386-c680-52a1-aaed-2c9a454ca32b\",\n" +
                "            \"title\": \"Updates in the week of 2016-07-04\",\n" +
                "            \"contents\": \"<p>Welcome to the first update roundup for the new Kayako (\\n<a href=\\\"https://kayako.atlassian.net/wiki/display/DOCS/Release+notes\\\" rel=\\\"nofollow\\\">Kayako Classic release notes are available\\nhere</a>). We update Kayako almost every day. Each week, we&#39;ll\\nsummarize what&#39;s new, what changed and what we fixed in this\\nsection.</p>\\n<h2>\\n<strong>New stuff</strong>\\n</h2>\\n<ul>\\n<li>\\n<a href=\\\"https://www.kayako.com/blog/kayako-launches-unified-customer-service-platform/\\\" rel=\\\"nofollow\\\">The launch of the new Kayako</a> \uD83C\uDF89</li>\\n</ul>\\n<h2>\\n<span>Fixes and other updates</span>\\n</h2>\\n<ul>\\n<li>Lots of Internet Explorer glitches fixed in the agent area</li>\\n<li>Fixed an issue where special characters in Help Center titles\\nwere being shown as HTML entities</li>\\n<li>Fixed an issue where some customers were prevented from\\nupdating a brand in the admin area</li>\\n<li>Fixed a problem where new case reply updates were not pushed to\\nZapier</li>\\n<li>Fixed a problem where cases that have breached an SLA target\\nwere not being pulled into case views with a &#39;SLA:\\nBreached&#39; criteria</li>\\n<li>✉️ Improvements to email notification templates </li>\\n<li>✉️  Improvements to how we show loading indicators when\\nupdating a case</li>\\n<li>⏳ DKIM now live for custom mail addresses added to Kayako ( \\n<a href=\\\"https://support.kayako.com/article/1197-protecting-your-emails-from-spam-filters\\\" rel=\\\"nofollow\\\">learn more about configuring SPF and DKIM</a>)</li>\\n</ul>\",\n" +
                "            \"link\": \"https://support.kayako.com/article/1196-updates-in-the-week-of-2016-07-04\",\n" +
                "            \"original\": {\n" +
                "                \"id\": 1196,\n" +
                "                \"uuid\": \"50cb2386-c680-52a1-aaed-2c9a454ca32b\",\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1625,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Updates in the week of 2016-07-04\",\n" +
                "                        \"created_at\": \"2016-07-08T16:13:00+00:00\",\n" +
                "                        \"updated_at\": \"2016-07-08T16:13:00+00:00\",\n" +
                "                        \"resource_type\": \"locale_field\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1625\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1196-updates-in-the-week-of-2016-07-04\",\n" +
                "                        \"resource_type\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"contents\": [\n" +
                "                    {\n" +
                "                        \"id\": 1626,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"<p>Welcome to the first update roundup for the new Kayako (\\n<a href=\\\"https://kayako.atlassian.net/wiki/display/DOCS/Release+notes\\\" rel=\\\"nofollow\\\">Kayako Classic release notes are available\\nhere</a>). We update Kayako almost every day. Each week, we&#39;ll\\nsummarize what&#39;s new, what changed and what we fixed in this\\nsection.</p>\\n<h2>\\n<strong>New stuff</strong>\\n</h2>\\n<ul>\\n<li>\\n<a href=\\\"https://www.kayako.com/blog/kayako-launches-unified-customer-service-platform/\\\" rel=\\\"nofollow\\\">The launch of the new Kayako</a> \uD83C\uDF89</li>\\n</ul>\\n<h2>\\n<span>Fixes and other updates</span>\\n</h2>\\n<ul>\\n<li>Lots of Internet Explorer glitches fixed in the agent area</li>\\n<li>Fixed an issue where special characters in Help Center titles\\nwere being shown as HTML entities</li>\\n<li>Fixed an issue where some customers were prevented from\\nupdating a brand in the admin area</li>\\n<li>Fixed a problem where new case reply updates were not pushed to\\nZapier</li>\\n<li>Fixed a problem where cases that have breached an SLA target\\nwere not being pulled into case views with a &#39;SLA:\\nBreached&#39; criteria</li>\\n<li>✉️ Improvements to email notification templates </li>\\n<li>✉️  Improvements to how we show loading indicators when\\nupdating a case</li>\\n<li>⏳ DKIM now live for custom mail addresses added to Kayako ( \\n<a href=\\\"https://support.kayako.com/article/1197-protecting-your-emails-from-spam-filters\\\" rel=\\\"nofollow\\\">learn more about configuring SPF and DKIM</a>)</li>\\n</ul>\",\n" +
                "                        \"created_at\": \"2016-07-08T16:13:01+00:00\",\n" +
                "                        \"updated_at\": \"2016-07-08T16:13:01+00:00\",\n" +
                "                        \"resource_type\": \"locale_field\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1626\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"keywords\": null,\n" +
                "                \"section\": {\n" +
                "                    \"id\": 252,\n" +
                "                    \"titles\": [\n" +
                "                        {\n" +
                "                            \"id\": 1623,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"Release notes\",\n" +
                "                            \"created_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                            \"updated_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                            \"resource_type\": \"locale_field\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1623\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"slugs\": [\n" +
                "                        {\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"252-release-notes\",\n" +
                "                            \"resource_type\": \"slug\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"descriptions\": [\n" +
                "                        {\n" +
                "                            \"id\": 1624,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"Weekly summaries of improvements, new features and fixes in each release.\",\n" +
                "                            \"created_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                            \"updated_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                            \"resource_type\": \"locale_field\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1624\"\n" +
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
                "                                \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resource_type\": \"locale_field\",\n" +
                "                                \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"slugs\": [\n" +
                "                            {\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": \"5-user-guide\",\n" +
                "                                \"resource_type\": \"slug\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"descriptions\": [\n" +
                "                            {\n" +
                "                                \"id\": 1500,\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": null,\n" +
                "                                \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resource_type\": \"locale_field\",\n" +
                "                                \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"brand\": null,\n" +
                "                        \"display_order\": 1,\n" +
                "                        \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updated_at\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                        \"resource_type\": \"category\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "                    },\n" +
                "                    \"agent\": {\n" +
                "                        \"id\": 22,\n" +
                "                        \"full_name\": \"Jamie Edwards\",\n" +
                "                        \"role\": {\n" +
                "                            \"id\": 5,\n" +
                "                            \"title\": \"Owner\",\n" +
                "                            \"type\": \"OWNER\",\n" +
                "                            \"resource_type\": \"role\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/roles/5\"\n" +
                "                        },\n" +
                "                        \"teams\": [\n" +
                "                            {\n" +
                "                                \"id\": 46,\n" +
                "                                \"title\": \"Hello\",\n" +
                "                                \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                                \"updated_at\": \"2016-01-16T12:58:38+00:00\",\n" +
                "                                \"resource_type\": \"team_minimal\",\n" +
                "                                \"resource_url\": \"https://support.kayako.com/api/v1/teams/46\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"avatar\": \"https://support.kayako.com/avatar/get/e020e878-f992-4f8e-b1bf-d51708d5459a?1470042534\",\n" +
                "                        \"last_activity_at\": null,\n" +
                "                        \"resource_type\": \"user_minimal\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/users/22\"\n" +
                "                    },\n" +
                "                    \"article_order_by\": \"LATEST\",\n" +
                "                    \"total_articles\": 7,\n" +
                "                    \"created_at\": \"2016-07-08T15:30:20+00:00\",\n" +
                "                    \"updated_at\": \"2016-08-19T14:04:16+00:00\",\n" +
                "                    \"resource_type\": \"section\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/sections/252\"\n" +
                "                },\n" +
                "                \"creator\": {\n" +
                "                    \"id\": 22,\n" +
                "                    \"full_name\": \"Jamie Edwards\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 5,\n" +
                "                        \"title\": \"Owner\",\n" +
                "                        \"type\": \"OWNER\",\n" +
                "                        \"resource_type\": \"role\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/roles/5\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 46,\n" +
                "                            \"title\": \"Hello\",\n" +
                "                            \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updated_at\": \"2016-01-16T12:58:38+00:00\",\n" +
                "                            \"resource_type\": \"team_minimal\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/teams/46\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/e020e878-f992-4f8e-b1bf-d51708d5459a?1470042534\",\n" +
                "                    \"last_activity_at\": null,\n" +
                "                    \"resource_type\": \"user_minimal\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/users/22\"\n" +
                "                },\n" +
                "                \"author\": {\n" +
                "                    \"id\": 22,\n" +
                "                    \"full_name\": \"Jamie Edwards\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 5,\n" +
                "                        \"title\": \"Owner\",\n" +
                "                        \"type\": \"OWNER\",\n" +
                "                        \"resource_type\": \"role\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/roles/5\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 46,\n" +
                "                            \"title\": \"Hello\",\n" +
                "                            \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updated_at\": \"2016-01-16T12:58:38+00:00\",\n" +
                "                            \"resource_type\": \"team_minimal\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/teams/46\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/e020e878-f992-4f8e-b1bf-d51708d5459a?1470042534\",\n" +
                "                    \"last_activity_at\": null,\n" +
                "                    \"resource_type\": \"user_minimal\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/users/22\"\n" +
                "                },\n" +
                "                \"attachments\": [],\n" +
                "                \"download_all\": null,\n" +
                "                \"status\": \"PUBLISHED\",\n" +
                "                \"upvote_count\": 3,\n" +
                "                \"downvote_count\": 0,\n" +
                "                \"views\": 859,\n" +
                "                \"rank\": 0,\n" +
                "                \"tags\": [],\n" +
                "                \"is_featured\": false,\n" +
                "                \"allow_comments\": true,\n" +
                "                \"total_comments\": 0,\n" +
                "                \"created_at\": \"2016-07-08T16:13:00+00:00\",\n" +
                "                \"published_at\": \"2016-07-08T16:13:00+00:00\",\n" +
                "                \"updated_at\": \"2016-07-11T20:58:55+00:00\",\n" +
                "                \"resource_type\": \"article\",\n" +
                "                \"resource_url\": \"https://support.kayako.com/api/v1/articles/1196\"\n" +
                "            },\n" +
                "            \"created_at\": \"2016-07-08T16:13:00+00:00\",\n" +
                "            \"updated_at\": \"2016-07-11T20:58:55+00:00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"uuid\": \"50d5939f-245e-57f7-a5b5-efc07a41bc57\",\n" +
                "            \"title\": \"Using webhooks to include customer events from other apps in\\nyour Kayako timelines\",\n" +
                "            \"contents\": \"<p>Along with our \\n<a href=\\\"https://support.kayako.com/article/1169-zapier\\\" rel=\\\"nofollow\\\">Zapier</a> integration and the full \\n<a href=\\\"https://developer.kayako.com/\\\" rel=\\\"nofollow\\\">Kayako\\nAPI</a>, webhooks offer another way to capture customer events in\\nexternal apps and display them on Kayako case and user timelines.\\nEach webhook consists of a label, a description, and an\\nauto-generated API token. You can then take that label and token to\\nany of your favorite APIs and use it as a destination to send\\nnotifications about customer activity. </p>\\n<p>Any information that comes in about a customer via a webhook is\\nthen displayed on the user&#39;s timeline, and the case timeline\\nfor any open cases the user has. Webhooks are a powerful way to\\ngive your team that much more context about what your customers are\\ngetting up. </p>\\n<p>In this article we&#39;ll look at what webhooks are used for,\\nwalk you through creating one in Kayako, and point you to some\\nresources for using them with your favorite external\\nAPIs. </p>\\n<h2>Understanding how to use webhooks</h2>\\n<p>Let&#39;s look at an example. Say you use \\n<a href=\\\"https://www.zuora.com/\\\" rel=\\\"nofollow\\\">Zuora</a> to handle\\nyour billing, and you want to send a notification to Kayako anytime\\na customer&#39;s payment doesn&#39;t go through. To make that\\neasier, you can create a new webhook within Kayako, which will give\\nZuora&#39;s API a place to send its billing\\nnotifications. </p>\\n<p>Although you can accomplish the same thing using the \\n<a href=\\\"https://developer.kayako.com/\\\" rel=\\\"nofollow\\\">Kayako\\nAPI</a> proper, webhooks have two distinct advantages: </p>\\n<ul>\\n<li>\\n<strong>They&#39;re more secure.</strong> With a regular API call,\\nyou have to authenticate using your username and password, which\\ngives the external system access to any part of the Kayako API.\\nWith a webhook, you authenticate using a token instead, which\\nexposes only that particular corner of the API to the external\\nsystem.</li>\\n<li>\\n<strong>They&#39;re easier to get started with.</strong> If\\nyou&#39;re new to working with APIs, webhooks are a great place to\\nstart. Each webhook is a mini-exercise in how APIs talk to each\\nother. </li>\\n</ul>\\n<p>There are two elements to using webhooks with Kayako. First,\\nyou&#39;ll need to create a new webhook from the admin area. Then,\\nyou&#39;ll need to tell your external API to send event information\\nto your new webhook. Let&#39;s have a look in detail. </p>\\n<h2>Creating a new webhook</h2>\\n<p>A webhook, in Kayako, is basically just a way to define an\\naccess point that an external API can use to push information into\\nKayako. Building a webhook consists of giving it a label — which\\nthe external API will use to identify it — and adding a description\\nso you know what it&#39;s for. When you save your webhook, Kayako\\nwill automatically generate a token that the external API can use\\nto authenticate itself before it sends any information. </p>\\n<p>\\n<em>NOTE: To create webhooks in Kayako, you will need</em>  \\n<a href=\\\"https://support.kayako.com/article/1183-assigning-user-roles-to-control-access\\\" rel=\\\"nofollow\\\">\\n<em>an administrator account</em> </a> \\n<em>with the &#39;Manage channels&#39; permission.</em></p>\\n<p>To add a new webhook: </p>\\n<ol>\\n<li>Sign in to Kayako and go to the admin area. </li>\\n<li>Click \\n<strong>Webhook </strong>on the sidebar. </li>\\n<li>Click the \\n<strong>New webhook </strong>button.</li>\\n<li>Add a \\n<strong>Label</strong> for your webhook. This is how the external\\nAPI will identify the webhook later. </li>\\n<li>Add a \\n<strong>Description </strong>for your webhook. This is just\\nfor you and your team, to help you keep track of what each webhook\\nyou create is for. </li>\\n<li>Click the \\n<strong>Save </strong>button. </li>\\n<li>You&#39;ll see the page reload and a \\n<strong>Webhook token </strong>appear. The external API will\\nneed this token to get access to your new webhook. When you&#39;re\\nbuilding your API call, come back here and click the \\n<strong>Copy to clipboard </strong>button to copy the\\ntoken. </li>\\n</ol>\\n<p>And that&#39;s it! You&#39;re new webhook is ready to go. Read\\non to learn more about pushing information to it from external\\nAPIs. </p>\\n<h2>Using your new webhook with an external API</h2>\\n<p>\\n<em>We&#39;ll be adding lots more detail here soon, but for now, if\\nyou&#39;re looking to use your new webhook with an external API,\\nour developer docs about using webhooks should be\\nhelpful:</em> \\n<a href=\\\"https://developer.kayako.com/api/v1/event/events/#Incoming-webhook\\\" rel=\\\"nofollow\\\">https://developer.kayako.com/api/v1/event/events/#Incoming-webhook</a></p>\",\n" +
                "            \"link\": \"https://support.kayako.com/article/1170-using-webhooks-to-include-customer-events-from-other-apps-in-your-kayako-timelines\",\n" +
                "            \"original\": {\n" +
                "                \"id\": 1170,\n" +
                "                \"uuid\": \"50d5939f-245e-57f7-a5b5-efc07a41bc57\",\n" +
                "                \"titles\": [\n" +
                "                    {\n" +
                "                        \"id\": 1567,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"Using webhooks to include customer events from other apps in\\nyour Kayako timelines\",\n" +
                "                        \"created_at\": \"2016-06-27T15:02:54+00:00\",\n" +
                "                        \"updated_at\": \"2016-06-27T15:02:54+00:00\",\n" +
                "                        \"resource_type\": \"locale_field\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1567\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"slugs\": [\n" +
                "                    {\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"1170-using-webhooks-to-include-customer-events-from-other-apps-in-your-kayako-timelines\",\n" +
                "                        \"resource_type\": \"slug\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"contents\": [\n" +
                "                    {\n" +
                "                        \"id\": 1568,\n" +
                "                        \"locale\": \"en-us\",\n" +
                "                        \"translation\": \"<p>Along with our \\n<a href=\\\"https://support.kayako.com/article/1169-zapier\\\" rel=\\\"nofollow\\\">Zapier</a> integration and the full \\n<a href=\\\"https://developer.kayako.com/\\\" rel=\\\"nofollow\\\">Kayako\\nAPI</a>, webhooks offer another way to capture customer events in\\nexternal apps and display them on Kayako case and user timelines.\\nEach webhook consists of a label, a description, and an\\nauto-generated API token. You can then take that label and token to\\nany of your favorite APIs and use it as a destination to send\\nnotifications about customer activity. </p>\\n<p>Any information that comes in about a customer via a webhook is\\nthen displayed on the user&#39;s timeline, and the case timeline\\nfor any open cases the user has. Webhooks are a powerful way to\\ngive your team that much more context about what your customers are\\ngetting up. </p>\\n<p>In this article we&#39;ll look at what webhooks are used for,\\nwalk you through creating one in Kayako, and point you to some\\nresources for using them with your favorite external\\nAPIs. </p>\\n<h2>Understanding how to use webhooks</h2>\\n<p>Let&#39;s look at an example. Say you use \\n<a href=\\\"https://www.zuora.com/\\\" rel=\\\"nofollow\\\">Zuora</a> to handle\\nyour billing, and you want to send a notification to Kayako anytime\\na customer&#39;s payment doesn&#39;t go through. To make that\\neasier, you can create a new webhook within Kayako, which will give\\nZuora&#39;s API a place to send its billing\\nnotifications. </p>\\n<p>Although you can accomplish the same thing using the \\n<a href=\\\"https://developer.kayako.com/\\\" rel=\\\"nofollow\\\">Kayako\\nAPI</a> proper, webhooks have two distinct advantages: </p>\\n<ul>\\n<li>\\n<strong>They&#39;re more secure.</strong> With a regular API call,\\nyou have to authenticate using your username and password, which\\ngives the external system access to any part of the Kayako API.\\nWith a webhook, you authenticate using a token instead, which\\nexposes only that particular corner of the API to the external\\nsystem.</li>\\n<li>\\n<strong>They&#39;re easier to get started with.</strong> If\\nyou&#39;re new to working with APIs, webhooks are a great place to\\nstart. Each webhook is a mini-exercise in how APIs talk to each\\nother. </li>\\n</ul>\\n<p>There are two elements to using webhooks with Kayako. First,\\nyou&#39;ll need to create a new webhook from the admin area. Then,\\nyou&#39;ll need to tell your external API to send event information\\nto your new webhook. Let&#39;s have a look in detail. </p>\\n<h2>Creating a new webhook</h2>\\n<p>A webhook, in Kayako, is basically just a way to define an\\naccess point that an external API can use to push information into\\nKayako. Building a webhook consists of giving it a label — which\\nthe external API will use to identify it — and adding a description\\nso you know what it&#39;s for. When you save your webhook, Kayako\\nwill automatically generate a token that the external API can use\\nto authenticate itself before it sends any information. </p>\\n<p>\\n<em>NOTE: To create webhooks in Kayako, you will need</em>  \\n<a href=\\\"https://support.kayako.com/article/1183-assigning-user-roles-to-control-access\\\" rel=\\\"nofollow\\\">\\n<em>an administrator account</em> </a> \\n<em>with the &#39;Manage channels&#39; permission.</em></p>\\n<p>To add a new webhook: </p>\\n<ol>\\n<li>Sign in to Kayako and go to the admin area. </li>\\n<li>Click \\n<strong>Webhook </strong>on the sidebar. </li>\\n<li>Click the \\n<strong>New webhook </strong>button.</li>\\n<li>Add a \\n<strong>Label</strong> for your webhook. This is how the external\\nAPI will identify the webhook later. </li>\\n<li>Add a \\n<strong>Description </strong>for your webhook. This is just\\nfor you and your team, to help you keep track of what each webhook\\nyou create is for. </li>\\n<li>Click the \\n<strong>Save </strong>button. </li>\\n<li>You&#39;ll see the page reload and a \\n<strong>Webhook token </strong>appear. The external API will\\nneed this token to get access to your new webhook. When you&#39;re\\nbuilding your API call, come back here and click the \\n<strong>Copy to clipboard </strong>button to copy the\\ntoken. </li>\\n</ol>\\n<p>And that&#39;s it! You&#39;re new webhook is ready to go. Read\\non to learn more about pushing information to it from external\\nAPIs. </p>\\n<h2>Using your new webhook with an external API</h2>\\n<p>\\n<em>We&#39;ll be adding lots more detail here soon, but for now, if\\nyou&#39;re looking to use your new webhook with an external API,\\nour developer docs about using webhooks should be\\nhelpful:</em> \\n<a href=\\\"https://developer.kayako.com/api/v1/event/events/#Incoming-webhook\\\" rel=\\\"nofollow\\\">https://developer.kayako.com/api/v1/event/events/#Incoming-webhook</a></p>\",\n" +
                "                        \"created_at\": \"2016-06-27T15:02:54+00:00\",\n" +
                "                        \"updated_at\": \"2016-06-27T15:02:54+00:00\",\n" +
                "                        \"resource_type\": \"locale_field\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1568\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"keywords\": null,\n" +
                "                \"section\": {\n" +
                "                    \"id\": 249,\n" +
                "                    \"titles\": [\n" +
                "                        {\n" +
                "                            \"id\": 1515,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"Integrations\",\n" +
                "                            \"created_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                            \"updated_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                            \"resource_type\": \"locale_field\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1515\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"slugs\": [\n" +
                "                        {\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"249-integrations\",\n" +
                "                            \"resource_type\": \"slug\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"descriptions\": [\n" +
                "                        {\n" +
                "                            \"id\": 1516,\n" +
                "                            \"locale\": \"en-us\",\n" +
                "                            \"translation\": \"No Kayako is an island. Integrate with all your (other) favorite tools to power up your support.\",\n" +
                "                            \"created_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                            \"updated_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                            \"resource_type\": \"locale_field\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1516\"\n" +
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
                "                                \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resource_type\": \"locale_field\",\n" +
                "                                \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1499\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"slugs\": [\n" +
                "                            {\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": \"5-user-guide\",\n" +
                "                                \"resource_type\": \"slug\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"descriptions\": [\n" +
                "                            {\n" +
                "                                \"id\": 1500,\n" +
                "                                \"locale\": \"en-us\",\n" +
                "                                \"translation\": null,\n" +
                "                                \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"updated_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                                \"resource_type\": \"locale_field\",\n" +
                "                                \"resource_url\": \"https://support.kayako.com/api/v1/locale/fields/1500\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"brand\": null,\n" +
                "                        \"display_order\": 1,\n" +
                "                        \"created_at\": \"2016-06-23T14:12:20+00:00\",\n" +
                "                        \"updated_at\": \"2016-07-04T12:08:24+00:00\",\n" +
                "                        \"resource_type\": \"category\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/categories/5\"\n" +
                "                    },\n" +
                "                    \"agent\": {\n" +
                "                        \"id\": 389,\n" +
                "                        \"full_name\": \"Kelly O'Brien\",\n" +
                "                        \"role\": {\n" +
                "                            \"id\": 1,\n" +
                "                            \"title\": \"Administrator\",\n" +
                "                            \"type\": \"ADMIN\",\n" +
                "                            \"resource_type\": \"role\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                        },\n" +
                "                        \"teams\": [\n" +
                "                            {\n" +
                "                                \"id\": 16,\n" +
                "                                \"title\": \"Support\",\n" +
                "                                \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                                \"updated_at\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                                \"resource_type\": \"team_minimal\",\n" +
                "                                \"resource_url\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                        \"last_activity_at\": null,\n" +
                "                        \"resource_type\": \"user_minimal\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                    },\n" +
                "                    \"article_order_by\": \"LATEST\",\n" +
                "                    \"total_articles\": 3,\n" +
                "                    \"created_at\": \"2016-06-23T14:40:49+00:00\",\n" +
                "                    \"updated_at\": \"2016-07-04T12:21:21+00:00\",\n" +
                "                    \"resource_type\": \"section\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/sections/249\"\n" +
                "                },\n" +
                "                \"creator\": {\n" +
                "                    \"id\": 389,\n" +
                "                    \"full_name\": \"Kelly O'Brien\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 1,\n" +
                "                        \"title\": \"Administrator\",\n" +
                "                        \"type\": \"ADMIN\",\n" +
                "                        \"resource_type\": \"role\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 16,\n" +
                "                            \"title\": \"Support\",\n" +
                "                            \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updated_at\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                            \"resource_type\": \"team_minimal\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                    \"last_activity_at\": null,\n" +
                "                    \"resource_type\": \"user_minimal\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                },\n" +
                "                \"author\": {\n" +
                "                    \"id\": 389,\n" +
                "                    \"full_name\": \"Kelly O'Brien\",\n" +
                "                    \"role\": {\n" +
                "                        \"id\": 1,\n" +
                "                        \"title\": \"Administrator\",\n" +
                "                        \"type\": \"ADMIN\",\n" +
                "                        \"resource_type\": \"role\",\n" +
                "                        \"resource_url\": \"https://support.kayako.com/api/v1/roles/1\"\n" +
                "                    },\n" +
                "                    \"teams\": [\n" +
                "                        {\n" +
                "                            \"id\": 16,\n" +
                "                            \"title\": \"Support\",\n" +
                "                            \"created_at\": \"2016-01-16T05:47:57+00:00\",\n" +
                "                            \"updated_at\": \"2016-03-30T11:40:31+00:00\",\n" +
                "                            \"resource_type\": \"team_minimal\",\n" +
                "                            \"resource_url\": \"https://support.kayako.com/api/v1/teams/16\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"avatar\": \"https://support.kayako.com/avatar/get/74658251-3717-43c9-8653-410e7ca2e449?1466605783\",\n" +
                "                    \"last_activity_at\": null,\n" +
                "                    \"resource_type\": \"user_minimal\",\n" +
                "                    \"resource_url\": \"https://support.kayako.com/api/v1/users/389\"\n" +
                "                },\n" +
                "                \"attachments\": [],\n" +
                "                \"download_all\": null,\n" +
                "                \"status\": \"PUBLISHED\",\n" +
                "                \"upvote_count\": 1,\n" +
                "                \"downvote_count\": 0,\n" +
                "                \"views\": 1136,\n" +
                "                \"rank\": 0,\n" +
                "                \"tags\": [],\n" +
                "                \"is_featured\": false,\n" +
                "                \"allow_comments\": true,\n" +
                "                \"total_comments\": 0,\n" +
                "                \"created_at\": \"2016-06-27T15:02:54+00:00\",\n" +
                "                \"published_at\": \"2016-07-04T02:44:07+00:00\",\n" +
                "                \"updated_at\": \"2016-07-04T02:45:06+00:00\",\n" +
                "                \"resource_type\": \"article\",\n" +
                "                \"resource_url\": \"https://support.kayako.com/api/v1/articles/1170\"\n" +
                "            },\n" +
                "            \"created_at\": \"2016-06-27T15:02:54+00:00\",\n" +
                "            \"updated_at\": \"2016-07-04T02:45:06+00:00\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"search\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 10,\n" +
                "    \"total_count\": 3\n" +
                "}";


        SearchArticleParser searchArticleParser = new SearchArticleParser(Locale.forLanguageTag("en-us"));
        List<SearchArticle> searchArticleList = searchArticleParser.parse(json);

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