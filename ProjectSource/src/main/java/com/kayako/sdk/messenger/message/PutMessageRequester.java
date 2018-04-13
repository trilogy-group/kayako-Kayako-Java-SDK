package com.kayako.sdk.messenger.message;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.PutRequestProperty;

public class PutMessageRequester extends PutRequestProperty {

  private static final String unformattedEndpoint = "api/v1/conversations/%s/messages/%s";

  public PutMessageRequester(String helpCenterUrl, FingerprintAuth fingerprintAuth,
      long conversationId, long messageId, PutMessageBodyParams putMessageBodyParams) {

    super(String.format(unformattedEndpoint, conversationId, messageId), helpCenterUrl, null,
        fingerprintAuth.getHeaders(), new EmptyIncludeArgument(),
        putMessageBodyParams.getBodyParameters());
  }
}
