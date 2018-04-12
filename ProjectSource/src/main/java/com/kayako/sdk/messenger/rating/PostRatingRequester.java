package com.kayako.sdk.messenger.rating;

import java.util.Collections;
import java.util.HashMap;
import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.AttachmentFile;
import com.kayako.sdk.base.requester.PostRequestProperty;

public class PostRatingRequester extends PostRequestProperty {

  private static final String unformattedEndpoint = "api/v1/conversations/%s/ratings.json";

  public PostRatingRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth,
      long conversationId, PostRatingBodyParams bodyParams) {

    super(String.format(unformattedEndpoint, conversationId), helpdeskUrl, null,
        fingerprintAuth.getHeaders(), new RatingIncludeArgument(), bodyParams.getBodyParameters(),
        Collections.<String, AttachmentFile>emptyMap());
  }
}
