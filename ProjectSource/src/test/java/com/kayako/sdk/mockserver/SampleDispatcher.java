package com.kayako.sdk.mockserver;

import com.kayako.sdk.mockserver.base.ISampleResponse;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.RecordedRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/02/17
 */
public class SampleDispatcher extends Dispatcher {

    private List<ISampleResponse> responses = new ArrayList<>();

    public SampleDispatcher(ISampleResponse newResponse) {
        responses.add(newResponse);
    }

    public SampleDispatcher(List<ISampleResponse> newResponses) {
        responses.addAll(newResponses);
    }

    @Override
    public MockResponse dispatch(RecordedRequest request) throws InterruptedException {
        for (ISampleResponse sampleResponse : responses) {
            if (isRequestMatching(sampleResponse, request)) {
                return MockResponseUtils.generateMockResponse(sampleResponse);
            }
        }

        throw new AssertionError("No sample response found that matches");
    }

    private static boolean isRequestMatching(ISampleResponse sampleResponse, RecordedRequest request) {
        return request.getPath().contains(sampleResponse.getPath())
                && request.getMethod().equals(sampleResponse.getMethod())
                && areQueryParametersMatching(sampleResponse, request);
    }

    private static boolean areQueryParametersMatching(ISampleResponse sampleResponse, RecordedRequest request) {
        String path = request.getPath();
        for (String key : sampleResponse.getQueryParameters().keySet()) {
            if (!path.contains(key + "=" + sampleResponse.getQueryParameters().get(key))) {
                return false;
            }
        }
        return true;
    }
}
