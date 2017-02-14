package com.kayako.sdk.mockserver;

import com.kayako.sdk.mockserver.base.ISampleResponse;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.RecordedRequest;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 14/02/17
 */
public class MockResponseUtils {

    public static MockResponse generateMockResponse(ISampleResponse sampleResponse) {
        return new MockResponse()
                .setResponseCode(sampleResponse.getStatusCode())
                .setBody(sampleResponse.getBody());
    }
}
