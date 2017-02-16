package com.kayako.sdk.messenger.conversation;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.GetRequestProperty;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class GetConversationRequester extends GetRequestProperty {

    private static final String INCLUDE = "userMinimal,team,caseStatus,casePriority";
    private static final String ENDPOINT = "api/v1/conversations/%s";

    private String mHelpdeskUrl;
    private FingerprintAuth mFingerprintAuth;
    private Long mConversationId;

    public GetConversationRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, long conversationId) {
        mHelpdeskUrl = helpdeskUrl;
        mFingerprintAuth = fingerprintAuth;
        mConversationId = conversationId;
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpdeskUrl;
    }

    @Override
    public String getInclude() {
        return INCLUDE;
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

}
