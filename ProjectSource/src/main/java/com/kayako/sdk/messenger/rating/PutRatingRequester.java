package com.kayako.sdk.messenger.rating;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.PutRequestProperty;

public class PutRatingRequester extends PutRequestProperty {

  private static final String unformattedEndpoint = "api/v1/conversations/%s/ratings/%s";

  public PutRatingRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth,
      long conversationId, long ratingId, PostRatingBodyParams bodyParams) {

    super(String.format(unformattedEndpoint, conversationId, ratingId), helpdeskUrl, null,
        fingerprintAuth.getHeaders(), new RatingIncludeArgument(), bodyParams.getBodyParameters());
  }
}
