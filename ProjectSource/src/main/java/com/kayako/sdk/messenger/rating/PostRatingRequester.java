package com.kayako.sdk.messenger.rating;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.base.requester.PostRequestProperty;
import com.kayako.sdk.messenger.conversation.ConversationIncludeArgument;
import com.kayako.sdk.messenger.conversation.PostConversationBodyParams;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class PostRatingRequester extends PostRequestProperty {

    private static final String ENDPOINT = "api/v1/conversations/%s/ratings.json";

    private static final String ARG_SCORE = "score";
    private static final String ARG_COMMENT = "comment";

    private String mHelpdeskUrl;
    private FingerprintAuth mFingerprintAuth;
    private Map<String, String> mBodyParams;
    private long mConversationId;

    public PostRatingRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, long conversationId, PostRatingBodyParams bodyParams) {
        mHelpdeskUrl = helpdeskUrl;
        mFingerprintAuth = fingerprintAuth;
        mConversationId = conversationId;
        mBodyParams = new HashMap<>();
        mBodyParams.put(ARG_SCORE, bodyParams.getScore().name());
        if (bodyParams.getScore() != null) {
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
    public Map<String, String> getBodyParameters() {
        return mBodyParams;
    }
}
