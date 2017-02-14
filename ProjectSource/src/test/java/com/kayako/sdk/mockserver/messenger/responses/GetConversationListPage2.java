package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetConversationListPage2 extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations?_case=camel&include=userMinimal,team,caseStatus,casePriority&limit=3&offset=5";
    }

    @Override
    public int getStatusCode() {
        return 200;
    }

    @Override
    public String getBody() {
        return "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 29,\n" +
                "            \"uuid\": \"4b74f907-0823-5d31-a213-062e884dfe34\",\n" +
                "            \"legacyId\": null,\n" +
                "            \"subject\": \"Fail this shall not\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"requester\": {\n" +
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"creator\": {\n" +
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"lastReplier\": {\n" +
                "                \"id\": 10,\n" +
                "                \"fullName\": \"Neil Mathew #2\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T13:55:21+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1487080521\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "            },\n" +
                "            \"assignedTeam\": {\n" +
                "                \"id\": 1,\n" +
                "                \"title\": \"General\",\n" +
                "                \"businesshour\": {\n" +
                "                    \"id\": 3,\n" +
                "                    \"resourceType\": \"businessHour\"\n" +
                "                },\n" +
                "                \"memberCount\": 10,\n" +
                "                \"createdAt\": \"2017-01-09T13:25:20+00:00\",\n" +
                "                \"updatedAt\": \"2017-01-09T13:25:20+00:00\",\n" +
                "                \"resourceType\": \"team\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/teams/1\"\n" +
                "            },\n" +
                "            \"assignedAgent\": null,\n" +
                "            \"status\": {\n" +
                "                \"id\": 1,\n" +
                "                \"label\": \"New\",\n" +
                "                \"type\": \"NEW\",\n" +
                "                \"sortOrder\": 1,\n" +
                "                \"isSlaActive\": true,\n" +
                "                \"isDeleted\": false,\n" +
                "                \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "                \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "                \"resourceType\": \"caseStatus\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/statuses/1\"\n" +
                "            },\n" +
                "            \"isCompleted\": false,\n" +
                "            \"priority\": null,\n" +
                "            \"type\": null,\n" +
                "            \"readMarker\": null,\n" +
                "            \"customFields\": [],\n" +
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_29\",\n" +
                "            \"lastRepliedAt\": \"2017-02-13T10:21:08+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T04:17:20+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T10:21:08+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/29\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 28,\n" +
                "            \"uuid\": \"45ea5d7b-702d-5235-86a3-01eda6473b8c\",\n" +
                "            \"legacyId\": null,\n" +
                "            \"subject\": \"Hello Hello\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"requester\": {\n" +
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"creator\": {\n" +
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"lastReplier\": {\n" +
                "                \"id\": 6,\n" +
                "                \"fullName\": \"Robin Malhotra\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T13:47:17+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1487080037\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/6\"\n" +
                "            },\n" +
                "            \"assignedTeam\": {\n" +
                "                \"id\": 1,\n" +
                "                \"title\": \"General\",\n" +
                "                \"businesshour\": {\n" +
                "                    \"id\": 3,\n" +
                "                    \"resourceType\": \"businessHour\"\n" +
                "                },\n" +
                "                \"memberCount\": 10,\n" +
                "                \"createdAt\": \"2017-01-09T13:25:20+00:00\",\n" +
                "                \"updatedAt\": \"2017-01-09T13:25:20+00:00\",\n" +
                "                \"resourceType\": \"team\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/teams/1\"\n" +
                "            },\n" +
                "            \"assignedAgent\": null,\n" +
                "            \"status\": {\n" +
                "                \"id\": 1,\n" +
                "                \"label\": \"New\",\n" +
                "                \"type\": \"NEW\",\n" +
                "                \"sortOrder\": 1,\n" +
                "                \"isSlaActive\": true,\n" +
                "                \"isDeleted\": false,\n" +
                "                \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "                \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "                \"resourceType\": \"caseStatus\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/statuses/1\"\n" +
                "            },\n" +
                "            \"isCompleted\": false,\n" +
                "            \"priority\": null,\n" +
                "            \"type\": null,\n" +
                "            \"readMarker\": null,\n" +
                "            \"customFields\": [],\n" +
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_28\",\n" +
                "            \"lastRepliedAt\": \"2017-02-10T14:01:26+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T04:04:54+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-10T14:01:26+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/28\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 27,\n" +
                "            \"uuid\": \"c6513b04-99f9-5fd5-aecd-6a24b47210fe\",\n" +
                "            \"legacyId\": null,\n" +
                "            \"subject\": \"Hello Hello\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"requester\": {\n" +
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"creator\": {\n" +
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"lastReplier\": {\n" +
                "                \"id\": 6,\n" +
                "                \"fullName\": \"Robin Malhotra\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T13:47:17+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1487080037\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/6\"\n" +
                "            },\n" +
                "            \"assignedTeam\": {\n" +
                "                \"id\": 1,\n" +
                "                \"title\": \"General\",\n" +
                "                \"businesshour\": {\n" +
                "                    \"id\": 3,\n" +
                "                    \"resourceType\": \"businessHour\"\n" +
                "                },\n" +
                "                \"memberCount\": 10,\n" +
                "                \"createdAt\": \"2017-01-09T13:25:20+00:00\",\n" +
                "                \"updatedAt\": \"2017-01-09T13:25:20+00:00\",\n" +
                "                \"resourceType\": \"team\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/teams/1\"\n" +
                "            },\n" +
                "            \"assignedAgent\": null,\n" +
                "            \"status\": {\n" +
                "                \"id\": 2,\n" +
                "                \"label\": \"Open\",\n" +
                "                \"type\": \"OPEN\",\n" +
                "                \"sortOrder\": 2,\n" +
                "                \"isSlaActive\": true,\n" +
                "                \"isDeleted\": false,\n" +
                "                \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "                \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "                \"resourceType\": \"caseStatus\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/statuses/2\"\n" +
                "            },\n" +
                "            \"isCompleted\": false,\n" +
                "            \"priority\": null,\n" +
                "            \"type\": null,\n" +
                "            \"readMarker\": null,\n" +
                "            \"customFields\": [],\n" +
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_27\",\n" +
                "            \"lastRepliedAt\": \"2017-02-10T14:02:24+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T04:04:06+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T04:47:14+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/27\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"conversation\",\n" +
                "    \"offset\": 5,\n" +
                "    \"limit\": 3,\n" +
                "    \"totalCount\": 15,\n" +
                "    \"firstUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=3\",\n" +
                "    \"previousUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=3&offset=2\",\n" +
                "    \"nextUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=3&offset=8\",\n" +
                "    \"lastUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=3&offset=12\"\n" +
                "}";
    }
}
