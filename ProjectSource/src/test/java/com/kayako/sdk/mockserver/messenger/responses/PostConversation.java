package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class PostConversation extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "POST";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations?_case=camel&include=userMinimal,team,caseStatus,casePriority";
    }

    @Override
    public int getStatusCode() {
        return 201;
    }

    @Override
    public String getBody() {
        return "{\n" +
                "    \"status\": 201,\n" +
                "    \"data\": {\n" +
                "        \"id\": 35,\n" +
                "        \"uuid\": \"66422460-4871-5a41-90a7-f9d87b253bd5\",\n" +
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
                "        \"lastAgentReplier\": null,\n"+
                "        \"assignedTeam\": null,\n" +
                "        \"assignedAgent\": null,\n" +
                "        \"status\": null,\n" +
                "        \"isCompleted\": false,\n" +
                "        \"priority\": null,\n" +
                "        \"type\": null,\n" +
                "        \"readMarker\": null,\n" +
                "        \"customFields\": [],\n" +
                "        \"realtimeChannel\": \"presence-61485139915436ab6fc57ca6b1e0bc87f58649bc427077133b6e71a278c3e8a2@v1_cases_35\",\n" +
                "        \"lastRepliedAt\": \"2017-02-14T13:25:08+00:00\",\n" +
                "        \"createdAt\": \"2017-02-14T13:25:08+00:00\",\n" +
                "        \"updatedAt\": \"2017-02-14T13:25:08+00:00\",\n" +
                "        \"resourceType\": \"conversation\",\n" +
                "        \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations/35\"\n" +
                "    },\n" +
                "    \"resource\": \"conversation\"\n" +
                "}";
    }
}
