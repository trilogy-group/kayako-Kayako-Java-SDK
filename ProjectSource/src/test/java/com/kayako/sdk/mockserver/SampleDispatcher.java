package com.kayako.sdk.mockserver;

import com.kayako.sdk.mockserver.base.ISampleResponse;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.RecordedRequest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
            if (key.equals("include")) {
                boolean areIncludeArgumentsMatching = areIncludeArgumentsMatching(
                        extractIncludeValueFromUrl(request.getPath()),
                        sampleResponse.getQueryParameters().get(key));
                if (!areIncludeArgumentsMatching) {
                    return false;
                }
            } else if (!path.contains(key + "=" + sampleResponse.getQueryParameters().get(key))) {
                return false;
            }
        }
        return true;
    }

    private static String extractIncludeValueFromUrl(String url) {
        final String BEGINNING = "include=";
        final String ENDING = "&";

        url = url + "&";
        int positionInclude = url.indexOf(BEGINNING) + BEGINNING.length();
        int positionIncludeEnd = url.indexOf(ENDING, positionInclude);

        return url.substring(positionInclude, positionIncludeEnd);
    }

    private static boolean areIncludeArgumentsMatching(String requestedIncludeString, String requiredIncludeString) {
        if (requiredIncludeString == null || requiredIncludeString.length() == 0) {
            return true;
        }

        List<String> requestedIncludeResources = new ArrayList<>();
        if (requestedIncludeString.contains(",")) {
            for (String a : requestedIncludeString.split(",")) {
                requestedIncludeResources.add(a);
            }
        } else {
            requestedIncludeResources.add(requestedIncludeString);
        }

        List<String> requiredIncludeResources = new ArrayList<>();
        if (requestedIncludeString.contains(",")) {
            for (String a : requiredIncludeString.split(",")) {
                requiredIncludeResources.add(a);
            }
        } else {
            requestedIncludeResources.add(requiredIncludeString);
        }

        return requestedIncludeResources.containsAll(requiredIncludeResources);
    }
}
