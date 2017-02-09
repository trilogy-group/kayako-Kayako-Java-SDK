package com.kayako.sdk.auth;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class FingerprintAuth implements Auth {

    private static final String HEADER_FINGERPRINT_ID = "X-Fingerprint-ID";

    private String fingerprintId;

    public FingerprintAuth(String fingerprintId) {
        this.fingerprintId = fingerprintId;
    }

    public String getFingerprintId() {
        return fingerprintId;
    }

    public void setFingerprintId(String fingerprintId) {
        this.fingerprintId = fingerprintId;
    }

    @Override
    public Map<String, String> getHeaders() {
        Map<String, String> map = new HashMap<>();
        map.put(HEADER_FINGERPRINT_ID, fingerprintId);
        return map;
    }
}
