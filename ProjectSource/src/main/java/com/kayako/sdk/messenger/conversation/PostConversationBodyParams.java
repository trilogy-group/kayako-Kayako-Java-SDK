package com.kayako.sdk.messenger.conversation;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 10/02/17
 */
public class PostConversationBodyParams {

    // Mandatory Fields
    private String name;
    private String email;
    private String subject;
    private String contents;
    private SourceType source;
    private String clientId;

    public PostConversationBodyParams(String name, String email, String subject, String contents, SourceType source) {
        if (name == null || email == null || subject == null || contents == null || source == null) {
            throw new IllegalArgumentException("Mandatory fields can not be null ");
        }

        this.name = name;
        this.email = email;
        this.subject = subject;
        this.contents = contents;
        this.source = source;
    }

    public PostConversationBodyParams(String name, String email, String subject, String contents, SourceType source, String clientId) {
        if (name == null || email == null || subject == null || contents == null || source == null) {
            throw new IllegalArgumentException("Mandatory fields can not be null ");
        }

        this.name = name;
        this.email = email;
        this.subject = subject;
        this.contents = contents;
        this.clientId = clientId;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public String getContents() {
        return contents;
    }

    public String getClientId() {
        return clientId;
    }

    public String getSource() {
        return source.name();
    }

    public enum SourceType {
        HELPCENTER, MESSENGER, API
    }
}
