package com.kayako.sdk.messenger;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class Messenger {

    private String mHelpDeskUrl;
    private String mFingerprint;

    /**
     * Create a Messenger instance for a new user - generating a new Fingerprint Id
     *
     * @param helpDeskUrl
     */
    public Messenger(String helpDeskUrl) {
        mHelpDeskUrl = helpDeskUrl;
    }

    /**
     * Create a Messenger instance for an existing user - using the existing Fingerprint Id
     *
     * @param helpDeskUrl
     * @param fingerprintId
     */
    public Messenger(String helpDeskUrl, String fingerprintId) {
        mHelpDeskUrl = helpDeskUrl;
        mFingerprint = fingerprintId;
    }

    public String getFingerprintId() {
        return mFingerprint;
    }

    // TODO: GET List Conversations
    // TODO: GET List Messages
    // TODO: POST Conversation
    // TODO: POST Message

}
