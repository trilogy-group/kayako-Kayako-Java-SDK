package com.kayako.sdk.messenger.rating;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.GetRequestProperty;
import com.kayako.sdk.base.requester.IncludeArgument;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 01/05/17
 */
public class GetRatingListRequester extends GetRequestProperty {

    private static final String ENDPOINT = "api/v1/conversations/%s/ratings.json";

    private String mHelpdeskUrl;
    private FingerprintAuth mFingerprintAuth;
    private long mConversationId;

    public GetRatingListRequester(String mHelpdeskUrl, FingerprintAuth mFingerprintAuth, long mConversationId) {
        this.mHelpdeskUrl = mHelpdeskUrl;
        this.mFingerprintAuth = mFingerprintAuth;
        this.mConversationId = mConversationId;
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpdeskUrl;
    }

    @Override
    public String getEndpointUrl() {
        return String.format(ENDPOINT, mConversationId);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return mFingerprintAuth.getHeaders();
    }

    @Override
    public IncludeArgument getInclude() {
        return new RatingIncludeArgument();
    }
}
