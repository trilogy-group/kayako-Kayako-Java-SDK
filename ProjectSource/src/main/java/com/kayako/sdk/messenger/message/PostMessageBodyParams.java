package com.kayako.sdk.messenger.message;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 16/02/17
 */
public class PostMessageBodyParams {

    private String contents;
    private MessageSourceType type;
    private String clientId;

    public PostMessageBodyParams(String contents, MessageSourceType type, String clientId) {
        if (contents == null) {
            throw new IllegalStateException("Contents shouldn't be null");
        }

        this.contents = contents;
        this.type = type;
        this.clientId = clientId;
    }

    public PostMessageBodyParams(String contents, MessageSourceType type) {
        if (contents == null) {
            throw new IllegalStateException("Contents shouldn't be null");
        }

        this.contents = contents;
        this.type = type;
    }

    public String getContents() {
        return contents;
    }

    public MessageSourceType getType() {
        return type;
    }

    public String getClientId() {
        return clientId;
    }
}
