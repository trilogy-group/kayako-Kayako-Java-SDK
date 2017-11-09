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
public class GetMessageRequester extends GetRequestProperty {

    private static final String ENDPOINT = "api/v1/conversations/%d/messages/%d";

    private String mHelpDeskUrl;
    private FingerprintAuth mFingerprintAuth;
    private Long mConversationId;
    private Long mMessageId;

    public GetMessageRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, long conversationId, long messageId) {
        mHelpDeskUrl = helpdeskUrl;
        mFingerprintAuth = fingerprintAuth;
        mConversationId = conversationId;
        mMessageId = messageId;
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
        return String.format(ENDPOINT, mConversationId, mMessageId);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return mFingerprintAuth.getHeaders();
    }
}
