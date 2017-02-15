package com.kayako.sdk.mockserver;

import com.kayako.sdk.mockserver.base.ISampleResponse;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Assert;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class MockResponseUtils {

    public static MockResponse generateMockResponse(ISampleResponse sampleResponse) {
        makeAssertions(sampleResponse);
        return new MockResponse()
                .setResponseCode(sampleResponse.getStatusCode())
                .setBody(sampleResponse.getBody());
    }

    private static void makeAssertions(ISampleResponse sampleResponse) {
        Assert.assertNotNull(sampleResponse.getBody());
        Assert.assertNotNull(sampleResponse.getMethod());
        Assert.assertNotNull(sampleResponse.getPath());
        Assert.assertNotNull(sampleResponse.getQueryParameters());
    }
}
