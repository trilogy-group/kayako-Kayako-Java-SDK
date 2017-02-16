package com.kayako.sdk.messenger.message;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 16/02/17
 */
public class PostMessageBodyParams {

    private String contents;
    private MessageSourceType type;

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
}
