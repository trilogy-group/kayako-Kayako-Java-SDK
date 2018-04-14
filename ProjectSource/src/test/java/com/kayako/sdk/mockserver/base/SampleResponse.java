package com.kayako.sdk.mockserver.base;

public abstract class SampleResponse extends BaseSampleResponse {

  private final String method;
  private final String requestUrl;
  private final int statusCode;
  private final String body;

  public SampleResponse(String method, String requestUrl, int statusCode, String body) {
    this.method = method;
    this.requestUrl = requestUrl;
    this.statusCode = statusCode;
    this.body = body;
  }

  @Override
  public String getMethod() {
    return method;
  }

  @Override
  public String getRequestUrl() {
    return requestUrl;
  }

  @Override
  public int getStatusCode() {
    return statusCode;
  }

  @Override
  public String getBody() {
    return body;
  }

}
