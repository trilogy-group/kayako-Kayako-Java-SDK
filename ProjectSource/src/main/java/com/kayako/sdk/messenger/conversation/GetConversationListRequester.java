package com.kayako.sdk.messenger.conversation;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.Requester;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class GetConversationListRequester implements Requester {

    private static final String INCLUDE = "userMinimal,team,caseStatus,casePriority";
    private static final String ENDPOINT = "api/v1/conversations";

    private String mHelpdeskUrl;
    private FingerprintAuth mFingerprintAuth;

    public GetConversationListRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth) {
        mHelpdeskUrl = helpdeskUrl;
        mFingerprintAuth = fingerprintAuth;
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
        return ENDPOINT;
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
