package com.kayako.sdk.mockserver;

import com.kayako.sdk.utils.LogUtils;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/02/17
 */
public class MockWebServerHelper {

    private MockWebServer mockWebServer;

    public MockWebServerHelper() {
    }

    public String getMockedUrl() {
        return mockWebServer.url("/").toString();
    }

    public void callOnSetup() throws IOException {
        LogUtils.setShowLogs(true);
        mockWebServer = new MockWebServer();
        mockWebServer.start();
    }

    /**
     * Add a dispatcher to conditionally return different responses
     *
     * @param dispatcher
     */
    public void setDispatcher(Dispatcher dispatcher) {
        mockWebServer.setDispatcher(dispatcher);
    }

    /**
     * Ensures the next request returns the mocked response
     *
     * @param response
     */
    public void enqueue(MockResponse response) {
        mockWebServer.enqueue(response);
    }

    public RecordedRequest getLastRequestMade() throws InterruptedException {
        return mockWebServer.takeRequest();
    }

    public void callOnTearDown() throws IOException {
        mockWebServer.shutdown();
        mockWebServer = null;
    }

}