package com.kayako.sdk.utils;

import com.kayako.sdk.base.requester.*;
import okhttp3.*;
import okhttp3.Response;
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

    public static final long CONNECTION_TIMEOUT_IN_SECONDS = 30;
    public static final long WRITE_TIMEOUT_IN_SECONDS = 30;
    public static final long READ_TIMEOUT_IN_SECONDS = 30;

    public static OkHttpClient mOkHttpClient;

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
        if (includeResources != null && includeResources.length() > 0) {
            urlBuilder.addQueryParameter("include", includeResources);
        }
        if (queryParams != null && !queryParams.isEmpty()) {
            for (String key : queryParams.keySet()) {
                urlBuilder.addQueryParameter(key, queryParams.get(key));
            }
        }

        LogUtils.logError(RequesterUtils.class, "URL: " + urlBuilder.build());

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

    private static OkHttpClient getHttpClient() {
        if (mOkHttpClient == null) {
            return mOkHttpClient = createHttpClient();
        } else {
            return mOkHttpClient;
        }
    }

    private static Request createGetRequest(String helpDeskUrl, String apiEndpoint, String includeResources, Map<String, String> headers, Map<String, String> queryParams) {
        HttpUrl httpUrl = createHttpUrl(combineUrl(helpDeskUrl, apiEndpoint), includeResources, queryParams);
        Request.Builder requestBuilder = new Request.Builder().url(httpUrl).get();

        // Add headers if available
        if (headers != null && !headers.isEmpty()) {
            for (String key : headers.keySet()) {
                requestBuilder.addHeader(key, headers.get(key));
            }
        }
        Request request = requestBuilder.build();
        return request;
    }


    private static Request createPutRequest(String helpDeskUrl, String apiEndpoint, String includeResources, Map<String, String> headers, Map<String, String> queryParams, Map<String, String> bodyParams) {
        HttpUrl httpUrl = createHttpUrl(combineUrl(helpDeskUrl, apiEndpoint), includeResources, queryParams);

        // Add body params
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MultipartBody.FORM);
        for (String key : bodyParams.keySet()) {
            builder.addFormDataPart(key, bodyParams.get(key));
        }

        Request.Builder requestBuilder = new Request.Builder().url(httpUrl).put(builder.build());

        // Add headers if available
        if (headers != null && !headers.isEmpty()) {
            for (String key : headers.keySet()) {
                requestBuilder.addHeader(key, headers.get(key));
            }
        }
        Request request = requestBuilder.build();
        return request;
    }

    private static Request createPostRequest(String helpDeskUrl, String apiEndpoint, String includeResources, Map<String, String> headers, Map<String, String> queryParams, Map<String, String> bodyParams, Map<String, AttachmentFile> attachmentFiles) {
        // TODO: Handle attachments
        HttpUrl httpUrl = createHttpUrl(combineUrl(helpDeskUrl, apiEndpoint), includeResources, queryParams);

        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MultipartBody.FORM);

        // Add body params
        for (String key : bodyParams.keySet()) {
            builder.addFormDataPart(key, bodyParams.get(key));
        }

        // Add attachments
        if (attachmentFiles != null) {
            for (String attachmentParamKey : attachmentFiles.keySet()) {
                builder.addFormDataPart(
                        attachmentParamKey,
                        attachmentFiles.get(attachmentParamKey).getFileName(),
                        RequestBody.create(
                                MediaType.parse(attachmentFiles.get(attachmentParamKey).getContentType()),
                                attachmentFiles.get(attachmentParamKey).getFile()
                        ));
            }
        }

        Request.Builder requestBuilder = new Request.Builder().url(httpUrl).post(builder.build());

        // Add headers if available
        if (headers != null && !headers.isEmpty()) {
            for (String key : headers.keySet()) {
                requestBuilder.addHeader(key, headers.get(key));
            }
        }

        Request request = requestBuilder.build();
        return request;
    }

    private static void showLogs(String requestMethod, String requestUrl, int responseCode, String responseBody) throws IOException {
        boolean debug = true;
        if (!debug) {
            return;
        }

        LogUtils.logError(RequesterUtils.class, "METHOD: " + requestMethod);
        LogUtils.logError(RequesterUtils.class, "URL: " + requestUrl);
        LogUtils.logError(RequesterUtils.class, "STATUS: " + responseCode);
        LogUtils.logError(RequesterUtils.class, "BODY: " + responseBody);
    }

    private static com.kayako.sdk.base.requester.Response performSync(Request request) throws IOException {
        Response response = getHttpClient().newCall(request).execute();
        String responseBodyString = response.body().string(); // .string() can only be called once, hence stored in a variable
        showLogs(request.method(), request.url().toString(), response.code(), responseBodyString);
        return new com.kayako.sdk.base.requester.Response(response.code(), responseBodyString);
    }

    private static void performAsync(Request request, final RequestCallback callback) {
        getHttpClient().newCall(request).enqueue(new Callback() {
            public void onFailure(Call call, IOException e) {
                if (callback != null) {
                    callback.onFailure(e);
                }
            }

            public void onResponse(Call call, Response response) throws IOException {
                if (callback != null) {
                    callback.onSuccess(new com.kayako.sdk.base.requester.Response(response.code(), response.body().string()));
                }
            }
        });
    }

    public static com.kayako.sdk.base.requester.Response getSync(String helpDeskUrl, String apiEndpoint, String includeResources, Map<String, String> headers, Map<String, String> queryParams) throws IOException {
        Request request = createGetRequest(helpDeskUrl, apiEndpoint, includeResources, headers, queryParams);
        return performSync(request);
    }

    public static void getAsync(String helpDeskUrl, String apiEndpoint, String includeResources, Map<String, String> headers, Map<String, String> queryParams, final RequestCallback callback) {
        Request request = createGetRequest(helpDeskUrl, apiEndpoint, includeResources, headers, queryParams);
        performAsync(request, callback);
    }

    public static com.kayako.sdk.base.requester.Response postSync(String helpDeskUrl, String apiEndpoint, String includeResources, Map<String, String> headers, Map<String, String> queryParams, Map<String, String> bodyParams, Map<String,AttachmentFile> attachmentFiles) throws IOException {
        Request request = createPostRequest(helpDeskUrl, apiEndpoint, includeResources, headers, queryParams, bodyParams, attachmentFiles);
        return performSync(request);
    }

    public static void postAsync(String helpDeskUrl, String apiEndpoint, String includeResources, Map<String, String> headers, Map<String, String> queryParams, Map<String, String> bodyParams, Map<String,AttachmentFile> attachmentFiles, final RequestCallback callback) {
        Request request = createPostRequest(helpDeskUrl, apiEndpoint, includeResources, headers, queryParams, bodyParams, attachmentFiles);
        performAsync(request, callback);
    }

    public static com.kayako.sdk.base.requester.Response putSync(String helpCenterUrl, String endpointUrl, String includeResources, Map<String, String> headers, Map<String, String> queryParameters, Map<String, String> bodyParameters) throws IOException {
        Request request = createPutRequest(helpCenterUrl, endpointUrl, includeResources, headers, queryParameters, bodyParameters);
        return performSync(request);
    }

    public static void putAsync(String helpCenterUrl, String endpointUrl, String includeResources, Map<String, String> headers, Map<String, String> queryParameters, Map<String, String> bodyParameters, final RequestCallback callback) {
        Request request = createPutRequest(helpCenterUrl, endpointUrl, includeResources, headers, queryParameters, bodyParameters);
        performAsync(request, callback);
    }

    // TODO: deleteAsync
}
