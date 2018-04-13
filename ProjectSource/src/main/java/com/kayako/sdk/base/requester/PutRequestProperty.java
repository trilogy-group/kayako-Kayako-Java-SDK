package com.kayako.sdk.base.requester;

import java.util.Map;

public abstract class PutRequestProperty extends AbstractRequestProperty {

  public PutRequestProperty(String endpointUrl, String mHelpCenterUrl,
      Map<String, String> queryParameters, Map<String, String> headers, IncludeArgument include,
      Map<String, String> bodyParameters) {
    super(endpointUrl, mHelpCenterUrl, queryParameters, headers, include, bodyParameters);
  }

  public METHOD getMethod() {
    return METHOD.PUT;
  }
}
