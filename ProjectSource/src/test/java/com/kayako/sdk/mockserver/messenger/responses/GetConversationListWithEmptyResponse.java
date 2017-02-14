package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class GetConversationListWithEmptyResponse extends BaseSampleResponse {

    @Override
    public String getRequestUrl() {
        return "https://kayako-mobile-testing.kayako.com/api/v1/conversations?_case=camel&include=userMinimal,team,caseStatus,casePriority";
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
                "  \"status\": 200,\n" +
                "  \"data\": [],\n" +
                "  \"resource\": \"conversation\",\n" +
                "  \"offset\": 0,\n" +
                "  \"limit\": 10,\n" +
                "  \"total_count\": 0\n" +
                "}";
    }
}
