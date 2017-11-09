package com.kayako.sdk.messenger.conversation;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.base.requester.PostRequestProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class PostConversationRequester extends PostRequestProperty {

    private static final String ENDPOINT = "api/v1/conversations";

    private static final String ARG_NAME = "name";
    private static final String ARG_EMAIL = "email";
    private static final String ARG_SUBJECT = "subject";
    private static final String ARG_CONTENTS = "contents";
    private static final String ARG_CLIENT_ID = "client_id";
    private static final String ARG_SOURCE = "source";
    private static final String ARG_FILES = "files"; // TODO:

    private String mHelpdeskUrl;
    private FingerprintAuth mFingerprintAuth;
    private Map<String, String> mBodyParams;

    public PostConversationRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, PostConversationBodyParams bodyParams) {
        mHelpdeskUrl = helpdeskUrl;
        mFingerprintAuth = fingerprintAuth;
        mBodyParams = new HashMap<>();
        mBodyParams.put(ARG_NAME, bodyParams.getName());
        mBodyParams.put(ARG_EMAIL, bodyParams.getEmail());
        mBodyParams.put(ARG_SUBJECT, bodyParams.getSubject());
        mBodyParams.put(ARG_CONTENTS, bodyParams.getContents());
        mBodyParams.put(ARG_SOURCE, bodyParams.getSource());
        if (bodyParams.getClientId() != null) {
            mBodyParams.put(ARG_CLIENT_ID, bodyParams.getClientId());
        }
    }

    @Override
    public String getHelpCenterUrl() {
        return mHelpdeskUrl;
    }

    @Override
    public IncludeArgument getInclude() {
        return new ConversationIncludeArgument();
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

    @Override
    public Map<String, String> getBodyParameters() {
        return mBodyParams;
    }
}
