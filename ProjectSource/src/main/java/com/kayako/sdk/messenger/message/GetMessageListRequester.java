package com.kayako.sdk.messenger.message;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.GetRequestProperty;
import com.kayako.sdk.base.requester.IncludeArgument;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/02/17
 */
public class GetMessageListRequester extends GetRequestProperty {

    private static final String ENDPOINT = "api/v1/conversations/%s/messages";
    private static final String ARG_OFFSET = "offset";
    private static final String ARG_LIMIT = "limit";

    private String mHelpDeskUrl;
    private FingerprintAuth mFingerprintAuth;
    private Long mConversationId;
    private Map<String, String> mQueryParameters;

    public GetMessageListRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, Long conversationId, int offset, int limit) {
        mHelpDeskUrl = helpdeskUrl;
        mFingerprintAuth = fingerprintAuth;
        mConversationId = conversationId;
        mQueryParameters = new HashMap<>();
        mQueryParameters.put(ARG_OFFSET, String.valueOf(offset));
        mQueryParameters.put(ARG_LIMIT, String.valueOf(limit));
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpDeskUrl;
    }

    @Override
    public IncludeArgument getInclude() {
        return new MessageIncludeArgument();
    }

    @Override
    public String getEndpointUrl() {
        return String.format(ENDPOINT, mConversationId);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return mQueryParameters;
    }

    @Override
    public Map<String, String> getHeaders() {
        return mFingerprintAuth.getHeaders();
    }
}
