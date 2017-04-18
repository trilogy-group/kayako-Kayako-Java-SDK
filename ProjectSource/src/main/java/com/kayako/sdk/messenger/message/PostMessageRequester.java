package com.kayako.sdk.messenger.message;

import com.kayako.sdk.auth.FingerprintAuth;
import com.kayako.sdk.base.requester.AttachmentFile;
import com.kayako.sdk.base.requester.GetRequestProperty;
import com.kayako.sdk.base.requester.IncludeArgument;
import com.kayako.sdk.base.requester.PostRequestProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/02/17
 */
public class PostMessageRequester extends PostRequestProperty {

    private static final String ENDPOINT = "api/v1/conversations/%s/messages";

    private static final String ARG_CONTENTS = "contents";
    private static final String ARG_SOURCE = "source";
    private static final String ARG_CLIENT_ID = "client_id";

    private String mHelpDeskUrl;
    private FingerprintAuth mFingerprintAuth;
    private Long mConversationId;
    private Map<String, String> mBodyParams;
    private List<AttachmentFile> mAttachmentFiles;

    public PostMessageRequester(String helpdeskUrl, FingerprintAuth fingerprintAuth, Long conversationId, PostMessageBodyParams bodyParams) {
        mHelpDeskUrl = helpdeskUrl;
        mFingerprintAuth = fingerprintAuth;
        mConversationId = conversationId;

        mBodyParams = new HashMap<>();
        mBodyParams.put(ARG_CONTENTS, bodyParams.getContents());
        if (bodyParams.getType() != null) {
            mBodyParams.put(ARG_SOURCE, bodyParams.getType().toString());
        }
        if (bodyParams.getClientId() != null) {
            mBodyParams.put(ARG_CLIENT_ID, bodyParams.getClientId());
        }

        mAttachmentFiles = bodyParams.getAttachmentFileList();
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

    @Override
    public List<AttachmentFile> getAttachmentFiles() {
        return mAttachmentFiles;
    }
}
