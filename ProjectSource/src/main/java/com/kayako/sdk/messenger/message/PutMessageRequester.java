package com.kayako.sdk.messenger.message;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 31/03/17
 */
public class PutMessageRequester extends PutRequestProperty {

    private static final String ENDPOINT = "api/v1/conversations/%s/messages/%s";
    private static final String ARG_MESSAGE_STATUS = "message_status";

    private long mConversationId;
    private long mMessageId;
    private String mHelpCenterUrl;
    private FingerprintAuth mFingerprintAuth;
    private Map<String, String> mBodyParams;

    public PutMessageRequester(String helpCenterUrl, FingerprintAuth fingerprintAuth, long conversationId, long messageId, PutMessageBodyParams putMessageBodyParams) {
        mHelpCenterUrl = helpCenterUrl;
        mFingerprintAuth = fingerprintAuth;
        mConversationId = conversationId;
        mMessageId = messageId;

        mBodyParams = new HashMap<>();
        mBodyParams.put(ARG_MESSAGE_STATUS, putMessageBodyParams.getMessageStatus().name());
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpCenterUrl;
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

    @Override
    public IncludeArgument getInclude() {
        return new EmptyIncludeArgument();
    }

    @Override
    public Map<String, String> getBodyParameters() {
        return mBodyParams;
    }
}
