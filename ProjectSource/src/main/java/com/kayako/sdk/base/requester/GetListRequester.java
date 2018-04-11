package com.kayako.sdk.base.requester;

import java.util.HashMap;
import java.util.Map;

public abstract class GetListRequester extends GetRequestProperty {

  private final String ENDPOINT;
  private final String ARG_ID;
  private final String ARG_OFFSET = "offset";
  private final String ARG_LIMIT = "limit";

  private long mId;
  private String mHelpCenterUrl;
  private Map<String, String> mQueryParams;

  public GetListRequester(String endpoint, String argId, String helpCenterUrl, long id, int offset,
      int limit) {
    this.ENDPOINT = endpoint;
    this.ARG_ID = argId;
    this.mId = id;
    this.mHelpCenterUrl = helpCenterUrl;
    this.mQueryParams = new HashMap<String, String>();
    this.mQueryParams.put(ARG_ID, String.valueOf(this.mId));
    this.mQueryParams.put(ARG_OFFSET, String.valueOf(offset));
    this.mQueryParams.put(ARG_LIMIT, String.valueOf(limit));
  }

  @Override
  public String getHelpCenterUrl() {
    return mHelpCenterUrl;
  }

  @Override
  public String getEndpointUrl() {
    return ENDPOINT;
  }

  @Override
  public Map<String, String> getQueryParameters() {
    return mQueryParams;
  }

  @Override
  public Map<String, String> getHeaders() {
    return null;
  }

  @Override
  public IncludeArgument getInclude() {
    return null;
  }

}
