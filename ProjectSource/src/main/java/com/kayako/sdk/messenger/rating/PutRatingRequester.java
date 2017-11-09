package com.kayako.sdk.messenger.rating;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.base.requester.PutRequestProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 01/05/17
 */
public class PutRatingRequester extends PutRequestProperty {

    private static final String ENDPOINT = "api/v1/conversations/%s/ratings/%s";

    private static final String ARG_SCORE = "score";
    private static final String ARG_COMMENT = "comment";

    private String mHelpdeskUrl;
    private FingerprintAuth mFingerprintAuth;
    private Map<String, String> mBodyParams;
    private long mConversationId;
    private long mRatingId;

    public PutRatingRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, long conversationId, long ratingId, PostRatingBodyParams bodyParams) {
        mHelpdeskUrl = helpdeskUrl;
        mFingerprintAuth = fingerprintAuth;
        mConversationId = conversationId;
        mRatingId = ratingId;
        mBodyParams = new HashMap<>();
        mBodyParams.put(ARG_SCORE, bodyParams.getScore().name());
        if (bodyParams.getComment() != null) {
            mBodyParams.put(ARG_COMMENT, bodyParams.getComment());
        }
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpdeskUrl;
    }

    @Override
    public IncludeArgument getInclude() {
        return new RatingIncludeArgument();
    }

    @Override
    public String getEndpointUrl() {
        return String.format(ENDPOINT, mConversationId, mRatingId);
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
    public Map<String, String> getBodyParameters() {
        return mBodyParams;
    }
}
