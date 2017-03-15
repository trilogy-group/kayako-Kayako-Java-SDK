package com.kayako.sdk.messenger.conversationstarter;

import com.kayako.sdk.auth.Auth;
import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.GetRequestProperty;
import com.kayako.sdk.base.requester.IncludeArgument;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class GetConversationStarterRequester extends GetRequestProperty {

    private static final String ENDPOINT = "api/v1/conversations/starter";
    private String mHelpdeskUrl;
    private Auth mAuth;

    /**
     * Using fingerprintAuth to retrieve Last Active Conversations too
     *
     * @param helpdeskUrl
     * @param auth
     */
    public GetConversationStarterRequester(String helpdeskUrl, Auth auth) {
        mHelpdeskUrl = helpdeskUrl;
        mAuth = auth;
    }

    /**
     * This API can be used without authentication too
     *
     * @param helpdeskUrl
     */
    public GetConversationStarterRequester(String helpdeskUrl) {
        mHelpdeskUrl = helpdeskUrl;
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpdeskUrl;
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
        if (mAuth != null) {
            return mAuth.getHeaders();
        } else {
            return null;
        }
    }

    @Override
    public IncludeArgument getInclude() {
        return new ConversationStarterIncludeArgument();
    }
}
