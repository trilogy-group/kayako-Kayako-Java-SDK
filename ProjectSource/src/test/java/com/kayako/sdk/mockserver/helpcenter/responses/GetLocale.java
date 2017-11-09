package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/02/17
 */
public class GetLocale extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "http://support.kayako.com//api/v1/locales/1?_case=camel&include=locale";
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
                "        \"id\": 1,\n" +
                "        \"locale\": \"en-us\",\n" +
                "        \"name\": \"English\",\n" +
                "        \"nativeName\": \"English (United States)\",\n" +
                "        \"region\": \"US\",\n" +
                "        \"nativeRegion\": \"United States\",\n" +
                "        \"script\": \"\",\n" +
                "        \"variant\": \"\",\n" +
                "        \"direction\": \"ltr\",\n" +
                "        \"isPublic\": true,\n" +
                "        \"isLocalised\": true,\n" +
                "        \"createdAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "        \"updatedAt\": \"2016-01-16T05:47:57+00:00\",\n" +
                "        \"resourceType\": \"locale\",\n" +
                "        \"resourceUrl\": \"https://support.kayako.com/api/v1/locales/1\"\n" +
                "    },\n" +
                "    \"resource\": \"locale\"\n" +
                "}";
    }
}
