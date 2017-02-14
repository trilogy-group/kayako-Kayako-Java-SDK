package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetConversationListPage4 extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations?_case=camel&include=userMinimal,team,caseStatus,casePriority&limit=5&offset=15";
    }

    @Override
    public int getStatusCode() {
        return 200;
    }

    @Override
    public String getBody() {
        return "{\n" +
                "    \"status\": 200,\n" +
                "    \"data\": [],\n" +
                "    \"resource\": \"conversation\",\n" +
                "    \"offset\": 15,\n" +
                "    \"limit\": 5,\n" +
                "    \"totalCount\": 15,\n" +
                "    \"firstUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=5\",\n" +
                "    \"previousUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=5&offset=10\",\n" +
                "    \"lastUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/conversations.json?_case=camel&include=userMinimal%2Cteam%2CcaseStatus%2CcasePriority&limit=5&offset=10\"\n" +
                "}";
    }
}
