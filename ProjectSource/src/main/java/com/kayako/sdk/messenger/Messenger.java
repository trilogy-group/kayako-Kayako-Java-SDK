package com.kayako.sdk.messenger;

import com.kayako.sdk.auth.FingerprintAuth;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class Messenger {

    private String mHelpDeskUrl;
    private FingerprintAuth mFingerprintAuth;

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
     * @param fingerprintAuth
     */
    public Messenger(String helpDeskUrl, FingerprintAuth fingerprintAuth) {
        mHelpDeskUrl = helpDeskUrl;
        mFingerprintAuth = fingerprintAuth;
    }

    /**
     * This is useful when you'd like to save the fingerprint auth for multiple requests using the same authentication
     *
     * @return
     */
    public FingerprintAuth getFingerprintAuth() {
        return mFingerprintAuth;
    }

    // TODO: GET List Conversations
    // TODO: GET List Messages
    // TODO: POST Conversation
    // TODO: POST Message

}
