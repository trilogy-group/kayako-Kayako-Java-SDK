package com.kayako.sdk.utils;

import okhttp3.*;
import okhttp3.internal.Util;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class RequesterUtils {

    // TODO: Document - what does each function do?

    public static final long CONNECTION_TIMEOUT_IN_SECONDS = 30;
    public static final long WRITE_TIMEOUT_IN_SECONDS = 30;
    public static final long READ_TIMEOUT_IN_SECONDS = 30;

    private static String combineUrl(String helpDeskUrl, String apiEndpoint) {
        return String.format("%s/%s", helpDeskUrl, apiEndpoint);
    }

    /**
     * @param url
     * @param includeResources Resources mentioned as a comma separated
     * @param queryParams
     * @return
     */
    private static HttpUrl createHttpUrl(String url, String includeResources, Map<String, String> queryParams) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();

        urlBuilder.addQueryParameter("_case", "camel");
        urlBuilder.addQueryParameter("include", includeResources);
        if (queryParams != null && !queryParams.isEmpty()) {
            for (String key : queryParams.keySet()) {
                urlBuilder.addQueryParameter(key, queryParams.get(key));
            }
        }

        return urlBuilder.build();
    }

    private static OkHttpClient createHttpClient_forceHttp1() {
        List<Protocol> protocolHttp1 = Util.immutableList(Protocol.HTTP_1_1);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(CONNECTION_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .writeTimeout(WRITE_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .readTimeout(READ_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .protocols(protocolHttp1)
                .build();

        return okHttpClient;
    }

    private static OkHttpClient createHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(CONNECTION_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .writeTimeout(WRITE_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .readTimeout(READ_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS)
                .build();

        return okHttpClient;
    }

    public static String get(String helpDeskUrl, String apiEndpoint, String includeResources, Map<String, String> headers, Map<String, String> queryParams) throws IOException {
        HttpUrl httpUrl = createHttpUrl(combineUrl(helpDeskUrl, apiEndpoint), includeResources, queryParams);

        // TODO: This function should be public for the classes in this sdk to use. But, this shouldn't be available to the user.

        Request.Builder requestBuilder = new Request.Builder().url(httpUrl).get();

        // Add headers if available
        if (headers != null && !headers.isEmpty()) {
            for (String key : headers.keySet()) {
                requestBuilder.addHeader(key, headers.get(key));
            }
        }
        Request request = requestBuilder.build();

        // TODO: Should we create a new Http Client each time?
        Response response = createHttpClient().newCall(request).execute();
        return response.body().string();
    }

}
