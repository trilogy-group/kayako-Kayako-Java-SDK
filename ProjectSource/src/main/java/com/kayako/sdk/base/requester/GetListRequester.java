package com.kayako.sdk.base.requester;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class GetListRequester extends GetRequestProperty {

  private final String endpoint;
  private final String argId;

  private static final String ARG_OFFSET = "offset";
  private static final String ARG_LIMIT = "limit";

  private long mId;
  private String mHelpCenterUrl;
  private Map<String, String> mQueryParams;

  public GetListRequester(String endpoint, String argId, String helpCenterUrl, long id, int offset,
      int limit) {

    this.endpoint = endpoint;
    this.argId = argId;
    mId = id;
    mHelpCenterUrl = helpCenterUrl;
    mQueryParams = new HashMap<String, String>();
    mQueryParams.put(this.argId, String.valueOf(this.mId));
    mQueryParams.put(ARG_OFFSET, String.valueOf(offset));
    mQueryParams.put(ARG_LIMIT, String.valueOf(limit));
  }

  @Override
  public String getHelpCenterUrl() {
    return mHelpCenterUrl;
  }

  @Override
  public String getEndpointUrl() {
    return endpoint;
  }

  @Override
  public Map<String, String> getQueryParameters() {
    return mQueryParams;
  }

  @Override
  public Map<String, String> getHeaders() {
    return Collections.emptyMap();
  }

  @Override
  public IncludeArgument getInclude() {
    return null;
  }

}
