package com.kayako.sdk.auth;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class SessionAuth implements Auth {

    private static final String HEADER_SESSION_ID = "X-Session-ID";
    private static final String HEADER_USER_AGENT = "User-Agent";

    private String sessionId;
    private String userAgent;

    public SessionAuth(String sessionId, String userAgent) {
        this.sessionId = sessionId;
        this.userAgent = userAgent;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getUserAgent() {
        return userAgent;
    }

    @Override
    public Map<String, String> getHeaders() {
        Map<String, String> map = new HashMap<>();
        map.put(HEADER_SESSION_ID, sessionId);
        map.put(HEADER_USER_AGENT, userAgent);
        return map;
    }
}
