package com.kayako.sdk.utils;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Restrict all classes using OkHttp library here.
 *
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 18/08/16
 */
public class RequesterUtilsTest {

    @Test
    public void get_ensureRequestArgumentsAreSent() throws Exception {

        // Start Mock Server and get server URL

        MockWebServer server = new MockWebServer();
        server.enqueue(new MockResponse().setBody("hello, world!"));
        server.start();
        String serverUrl = server.url("/").toString();

        // Set up Request

        final String ENDPOINT = "/path/to/something";
        final String INCLUDE_VALUE = "something,something";

        // Query Parameters
        Map<String, String> defaultQueryParameters = new HashMap();
        defaultQueryParameters.put("_case", "camel");
        defaultQueryParameters.put("include", INCLUDE_VALUE);

        Map<String, String> otherQueryParameters = new HashMap();
        otherQueryParameters.put("sortBy", "ASC");
        otherQueryParameters.put("sectionId", "2");

        Map<String, String> allQueryParameters = new HashMap();
        allQueryParameters.putAll(defaultQueryParameters);
        allQueryParameters.putAll(otherQueryParameters);

        // Headers

        Map<String, String> headers = new HashMap();
        headers.put("X-Session-Id", "boogabooga");
        headers.put("X-OTP", "123456");

        RequesterUtils.getSync(serverUrl, ENDPOINT, INCLUDE_VALUE, headers, otherQueryParameters);

        // Test Request

        RecordedRequest recordedRequest1 = server.takeRequest();
        validateRequestHasSetParameters(recordedRequest1, allQueryParameters, headers);
    }

    private void validateRequestHasSetParameters(RecordedRequest recordedRequest1, Map<String, String> expectedQueryParameters, Map<String, String> expectedHeaders) {
        String urlPath = recordedRequest1.getPath();

        // Check URL Path
        System.out.println("Path: " + urlPath); // recordedRequest1.getHeaders

        String query = urlPath.substring(urlPath.indexOf("?") + 1); // Starting from ? (not including)
        String[] queryParameters = query.split("&");

        int countOfActualQueryParameters = queryParameters.length;
        int countOfExpectedQueryParameters = expectedQueryParameters.size();

        System.out.println("Count of Expected Query Parameters:" + countOfExpectedQueryParameters);
        System.out.println("Count of Actual Query Parameters:" + countOfActualQueryParameters);

        Assert.assertTrue(countOfActualQueryParameters == countOfExpectedQueryParameters);

        for (String queryParameter : queryParameters) {
            String[] keyValue = queryParameter.split("=");
            String key = keyValue[0];

            System.out.println("------");
            System.out.println("Query Parameter Name:" + key);

            String actualQueryParameterValue = keyValue[1];
            String expectedQueryParameterValue = expectedQueryParameters.get(key);

            System.out.println("Expected Value:" + expectedQueryParameterValue);
            System.out.println("Actual Value:" + actualQueryParameterValue);

            Assert.assertNotNull(actualQueryParameterValue);
            Assert.assertTrue(expectedQueryParameterValue.equals(actualQueryParameterValue));
        }

        // Check Header

        for (String expectedHeader : expectedHeaders.keySet()) {
            String expectedHeaderValue = expectedHeaders.get(expectedHeader);
            String actualHeaderValue = recordedRequest1.getHeader(expectedHeader);

            System.out.println("------");
            System.out.println("Header Name:" + expectedHeader);
            System.out.println("Expected Value:" + expectedHeaderValue);
            System.out.println("Actual Value:" + actualHeaderValue);

            Assert.assertNotNull(actualHeaderValue);
            Assert.assertTrue(expectedHeaderValue.equals(actualHeaderValue));
        }
    }
}