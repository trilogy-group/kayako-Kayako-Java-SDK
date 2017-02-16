package com.kayako.sdk.messenger.conversation;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.GetRequestProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class GetConversationListRequester extends GetRequestProperty {

    private static final String INCLUDE = "userMinimal,team,caseStatus,casePriority";
    private static final String ENDPOINT = "api/v1/conversations";

    private static final String ARG_OFFSET = "offset";
    private static final String ARG_LIMIT = "limit";

    private String mHelpdeskUrl;
    private FingerprintAuth mFingerprintAuth;
    private Map<String, String> mQueryParameters;

    public GetConversationListRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, int offset, int limit) {
        mHelpdeskUrl = helpdeskUrl;
        mFingerprintAuth = fingerprintAuth;
        mQueryParameters = new HashMap<>();
        mQueryParameters.put(ARG_OFFSET, String.valueOf(offset));
        mQueryParameters.put(ARG_LIMIT, String.valueOf(limit));
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
        return mQueryParameters;
    }

    @Override
    public Map<String, String> getHeaders() {
        return mFingerprintAuth.getHeaders();
    }

}
