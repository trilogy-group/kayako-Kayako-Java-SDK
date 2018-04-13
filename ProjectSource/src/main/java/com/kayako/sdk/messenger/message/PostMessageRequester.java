package com.kayako.sdk.messenger.message;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.PostRequestProperty;

public class PostMessageRequester extends PostRequestProperty {

  private static final String unformattedEndpoint = "api/v1/conversations/%s/messages";

  public PostMessageRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth,
      Long conversationId, PostMessageBodyParams bodyParams) {

    super(String.format(unformattedEndpoint, conversationId), helpdeskUrl, null,
        fingerprintAuth.getHeaders(), new MessageIncludeArgument(), bodyParams.getBodyParameters(),
        bodyParams.getAttachmentFiles());
  }
}
