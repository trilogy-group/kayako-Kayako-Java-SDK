package com.kayako.sdk.messenger.conversation;

import java.util.HashMap;
import java.util.Map;

public class PostConversationBodyParams {

  private static final String PARM_NAME = "name";
  private static final String PARM_EMAIL = "email";
  private static final String PARM_SUBJECT = "subject";
  private static final String PARM_CONTENTS = "contents";
  private static final String PARM_SOURCE = "source";
  private static final String PARM_CLIENT_ID = "client_id";

  // Mandatory Fields
  private final String name, email, subject, contents;
  private String clientId;
  private final SourceType source;

  public PostConversationBodyParams(String name, String email, String subject, String contents,
      SourceType source) {
    if (name == null || email == null || subject == null || contents == null || source == null) {
      throw new IllegalArgumentException("Mandatory fields can not be null ");
    }

    this.name = name;
    this.email = email;
    this.subject = subject;
    this.contents = contents;
    this.source = source;
  }

  public PostConversationBodyParams(String name, String email, String subject, String contents,
      SourceType source, String clientId) {
    this(name, email, subject, contents, source);
    this.clientId = clientId;
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

  public Map<String, String> getBodyParameters() {
    Map<String, String> bodyParameters = new HashMap<>();

    bodyParameters.put(PARM_NAME, name);
    bodyParameters.put(PARM_EMAIL, email);
    bodyParameters.put(PARM_SUBJECT, subject);
    bodyParameters.put(PARM_CONTENTS, contents);
    bodyParameters.put(PARM_SOURCE, source.name());
    if (clientId != null) {
      bodyParameters.put(PARM_CLIENT_ID, clientId);
    }
    return bodyParameters;
  }

}
