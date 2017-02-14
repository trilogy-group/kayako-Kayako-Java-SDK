package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetConversationListPage1 extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations?_case=camel&include=userMinimal,team,caseStatus,casePriority&limit=5&offset=0";
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
                "            \"id\": 35,\n" +
                "            \"uuid\": \"66422460-4871-5a41-90a7-f9d87b253bd5\",\n" +
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
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"assignedTeam\": null,\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_35\",\n" +
                "            \"lastRepliedAt\": \"2017-02-14T13:25:08+00:00\",\n" +
                "            \"createdAt\": \"2017-02-14T13:25:08+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-14T13:25:08+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/35\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 34,\n" +
                "            \"uuid\": \"eb27ae83-1b8b-5dde-8219-c9d79f9cf234\",\n" +
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
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"assignedTeam\": null,\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_34\",\n" +
                "            \"lastRepliedAt\": \"2017-02-14T10:41:47+00:00\",\n" +
                "            \"createdAt\": \"2017-02-14T10:41:47+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-14T10:41:47+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/34\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 33,\n" +
                "            \"uuid\": \"084c3bac-c2ab-506c-bf27-1437739903d6\",\n" +
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
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"assignedTeam\": null,\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_33\",\n" +
                "            \"lastRepliedAt\": \"2017-02-14T10:21:01+00:00\",\n" +
                "            \"createdAt\": \"2017-02-14T10:21:01+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-14T10:21:01+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/33\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 32,\n" +
                "            \"uuid\": \"451d3353-d7f4-5c01-9887-16bde410f437\",\n" +
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
                "                \"id\": 15,\n" +
                "                \"fullName\": \"John Doe 2\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "            },\n" +
                "            \"assignedTeam\": null,\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_32\",\n" +
                "            \"lastRepliedAt\": \"2017-02-13T10:34:28+00:00\",\n" +
                "            \"createdAt\": \"2017-02-13T10:34:28+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T10:34:28+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/32\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 30,\n" +
                "            \"uuid\": \"a37db5e8-5dbd-5513-baeb-fdfb2d74aee2\",\n" +
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
                "                \"lastActiveAt\": \"2017-02-14T12:52:56+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/22e238af-5bcd-5159-a4ac-e7f016821151?1487076776\",\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_30\",\n" +
                "            \"lastRepliedAt\": \"2017-02-10T14:00:02+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T04:17:48+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-10T14:00:02+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/30\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"conversation\",\n" +
                "    \"offset\": 0,\n" +
                "    \"limit\": 5,\n" +
                "    \"totalCount\": 15,\n" +
                "    \"nextUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=5&offset=5\",\n" +
                "    \"lastUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=5&offset=10\"\n" +
                "}\n";
    }
}
