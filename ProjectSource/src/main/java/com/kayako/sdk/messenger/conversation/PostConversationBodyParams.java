package com.kayako.sdk.messenger.conversation;

import java.util.HashMap;
import java.util.Map;

public class PostConversationBodyParams {

  // Mandatory Fields
  private String name;
  private String email;
  private String subject;
  private String contents;
  private SourceType source;
  private String clientId;

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

  public Map<String, String> getBodyParameters() {
    Map<String, String> bodyParameters = new HashMap<>();

    bodyParameters.put("name", name);
    bodyParameters.put("email", email);
    bodyParameters.put("subject", subject);
    bodyParameters.put("contents", contents);
    bodyParameters.put("source", source.name());
    if (clientId != null) {
      bodyParameters.put("client_id", clientId);
    }
    return bodyParameters;
  }

}
