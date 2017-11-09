package com.kayako.sdk.utils;

import java.util.UUID;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public class FingerprintUtils {

    // Fingerprint Id is UUID v4
    public static final String generateUUIDv4() {
        return UUID.randomUUID().toString();
    }
}
