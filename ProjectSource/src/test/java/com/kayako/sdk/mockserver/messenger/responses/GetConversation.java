package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetConversation extends BaseSampleResponse {

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations/23?_case=camel&include=userMinimal,team,caseStatus,casePriority";
    }

    @Override
    public String getMethod() {
        return "GET";
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
                "        \"id\": 23,\n" +
                "        \"uuid\": \"b6871f2c-543c-591d-b175-82b431c06035\",\n" +
                "        \"legacyId\": null,\n" +
                "        \"subject\": \"Hello Hello\",\n" +
                "        \"channel\": \"HELPCENTER\",\n" +
                "        \"requester\": {\n" +
                "            \"id\": 15,\n" +
                "            \"fullName\": \"John Doe 2\",\n" +
                "            \"lastActiveAt\": null,\n" +
                "            \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "            \"resourceType\": \"userMinimal\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"creator\": {\n" +
                "            \"id\": 15,\n" +
                "            \"fullName\": \"John Doe 2\",\n" +
                "            \"lastActiveAt\": null,\n" +
                "            \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "            \"resourceType\": \"userMinimal\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"lastReplier\": {\n" +
                "            \"id\": 15,\n" +
                "            \"fullName\": \"John Doe 2\",\n" +
                "            \"lastActiveAt\": null,\n" +
                "            \"avatar\": \"https://kayako-mobile-testing.kayako.com/avatar/get/fd9d91e4-b576-5f17-9aae-6b16a3dcffbc?1486698827\",\n" +
                "            \"resourceType\": \"userMinimal\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/users/15\"\n" +
                "        },\n" +
                "        \"assignedTeam\": null,\n" +
                "        \"assignedAgent\": null,\n" +
                "        \"status\": {\n" +
                "            \"id\": 1,\n" +
                "            \"label\": \"New\",\n" +
                "            \"type\": \"NEW\",\n" +
                "            \"sortOrder\": 1,\n" +
                "            \"isSlaActive\": true,\n" +
                "            \"isDeleted\": false,\n" +
                "            \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "            \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
                "            \"resourceType\": \"caseStatus\",\n" +
                "            \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/statuses/1\"\n" +
                "        },\n" +
                "        \"isCompleted\": false,\n" +
                "        \"priority\": null,\n" +
                "        \"type\": null,\n" +
                "        \"readMarker\": null,\n" +
                "        \"customFields\": [],\n" +
                "        \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_23\",\n" +
                "        \"lastRepliedAt\": \"2017-02-10T04:00:55+00:00\",\n" +
                "        \"createdAt\": \"2017-02-10T04:00:55+00:00\",\n" +
                "        \"updatedAt\": \"2017-02-10T04:00:55+00:00\",\n" +
                "        \"resourceType\": \"conversation\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/23\"\n" +
                "    },\n" +
                "    \"resource\": \"conversation\"\n" +
                "}";
    }
}
