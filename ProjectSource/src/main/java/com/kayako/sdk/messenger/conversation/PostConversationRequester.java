package com.kayako.sdk.messenger.conversation;

import java.util.HashMap;
import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.AttachmentFile;
import com.kayako.sdk.base.requester.PostRequestProperty;

public class PostConversationRequester extends PostRequestProperty {

  public PostConversationRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth,
      PostConversationBodyParams bodyParams) {

    super("api/v1/conversations", helpdeskUrl, null, fingerprintAuth.getHeaders(),
        new ConversationIncludeArgument(), bodyParams.getBodyParameters(),
        new HashMap<String, AttachmentFile>());
  }
}
