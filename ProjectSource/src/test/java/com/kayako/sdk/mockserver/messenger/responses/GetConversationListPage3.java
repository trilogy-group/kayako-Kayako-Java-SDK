package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetConversationListPage3 extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations?_case=camel&include=userMinimal,team,caseStatus,casePriority&limit=7&offset=8";
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
                "            \"id\": 26,\n" +
                "            \"uuid\": \"ae275a5c-3697-5507-8c2b-311a6be95110\",\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_26\",\n" +
                "            \"lastRepliedAt\": \"2017-02-10T04:03:42+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T04:03:42+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-10T04:03:42+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/26\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 25,\n" +
                "            \"uuid\": \"77d8e16e-46e6-5bc1-a7a4-38332cf3eefc\",\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_25\",\n" +
                "            \"lastRepliedAt\": \"2017-02-10T04:03:05+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T04:03:05+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-10T04:03:05+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/25\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 24,\n" +
                "            \"uuid\": \"dcb74939-1b34-52be-878b-8e62b5386b15\",\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_24\",\n" +
                "            \"lastRepliedAt\": \"2017-02-13T06:45:28+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T04:02:54+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T06:45:29+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/24\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 23,\n" +
                "            \"uuid\": \"b6871f2c-543c-591d-b175-82b431c06035\",\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_23\",\n" +
                "            \"lastRepliedAt\": \"2017-02-10T04:00:55+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T04:00:55+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-10T04:00:55+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/23\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 22,\n" +
                "            \"uuid\": \"140a57f2-6151-5c3b-9518-fed0cbf8addf\",\n" +
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
                "                \"id\": 10,\n" +
                "                \"fullName\": \"Neil Mathew #2\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T13:55:21+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/9e3180e4-6967-5f62-93df-185beae50f93?1487080521\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/10\"\n" +
                "            },\n" +
                "            \"assignedTeam\": null,\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_22\",\n" +
                "            \"lastRepliedAt\": \"2017-02-13T06:45:28+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T03:59:41+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T08:18:38+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/22\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 21,\n" +
                "            \"uuid\": \"f37c6894-8c17-5193-9457-5defae7d68ca\",\n" +
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
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_21\",\n" +
                "            \"lastRepliedAt\": \"2017-02-13T06:43:02+00:00\",\n" +
                "            \"createdAt\": \"2017-02-10T03:53:47+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-13T06:43:02+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/21\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 20,\n" +
                "            \"uuid\": \"a420b635-0d77-5306-af8a-867744566acc\",\n" +
                "            \"legacyId\": null,\n" +
                "            \"subject\": \"Hey\",\n" +
                "            \"channel\": \"HELPCENTER\",\n" +
                "            \"requester\": {\n" +
                "                \"id\": 14,\n" +
                "                \"fullName\": \"John Doe\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
                "            },\n" +
                "            \"creator\": {\n" +
                "                \"id\": 14,\n" +
                "                \"fullName\": \"John Doe\",\n" +
                "                \"lastActiveAt\": null,\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/f19cebf8-6d34-51e3-89ec-42e072a6ad43?1486460502\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/14\"\n" +
                "            },\n" +
                "            \"lastReplier\": {\n" +
                "                \"id\": 1,\n" +
                "                \"fullName\": \"Kayako Mobile Testing\",\n" +
                "                \"lastActiveAt\": \"2017-02-14T14:27:06+00:00\",\n" +
                "                \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/1e4dd52f-6383-5e07-aed0-864c06d6b232?1487082426\",\n" +
                "                \"resourceType\": \"userMinimal\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/1\"\n" +
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
                "            \"priority\": {\n" +
                "                \"id\": 4,\n" +
                "                \"label\": \"Urgent\",\n" +
                "                \"level\": 4,\n" +
                "                \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "                \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "                \"resourceType\": \"casePriority\",\n" +
                "                \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/priorities/4\"\n" +
                "            },\n" +
                "            \"type\": null,\n" +
                "            \"readMarker\": null,\n" +
                "            \"customFields\": [],\n" +
                "            \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_20\",\n" +
                "            \"lastRepliedAt\": \"2017-02-07T10:40:22+00:00\",\n" +
                "            \"createdAt\": \"2017-02-07T09:41:42+00:00\",\n" +
                "            \"updatedAt\": \"2017-02-08T05:53:04+00:00\",\n" +
                "            \"resourceType\": \"conversation\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/20\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"resource\": \"conversation\",\n" +
                "    \"offset\": 8,\n" +
                "    \"limit\": 7,\n" +
                "    \"totalCount\": 15,\n" +
                "    \"firstUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=7\",\n" +
                "    \"previousUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=7&offset=1\",\n" +
                "    \"lastUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=7&offset=14\"\n" +
                "}";
    }
}
