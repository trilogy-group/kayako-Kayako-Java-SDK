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

    public PostConversationBodyParams(String name, String email, String subject, String contents) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.contents = contents;
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
}
