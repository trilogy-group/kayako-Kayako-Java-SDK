package com.kayako.sdk.messenger.message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.kayako.sdk.base.requester.AttachmentFile;

public class PostMessageBodyParams {

  private String contents;
  private MessageSourceType type;
  private String clientId;
  private List<AttachmentFile> attachmentFileList;

  public PostMessageBodyParams(String contents, MessageSourceType type, String clientId,
      List<AttachmentFile> attachmentFileList) {
    this.contents = contents;
    this.type = type;
    this.clientId = clientId;
    this.attachmentFileList = attachmentFileList;
  }

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

  public List<AttachmentFile> getAttachmentFileList() {
    return attachmentFileList;
  }

  public Map<String, String> getBodyParameters() {
    Map<String, String> bodyParameters = new HashMap<>();

    bodyParameters.put("contents", contents);
    if (type != null) {
      bodyParameters.put("source", type.toString());
    }
    if (clientId != null) {
      bodyParameters.put("client_id", clientId);
    }
    return bodyParameters;
  }

  public Map<String, AttachmentFile> getAttachmentFiles() {
    Map<String, AttachmentFile> attachmentFiles = new HashMap<>();

    if(attachmentFileList == null) {
        return attachmentFiles;
    }

    for (AttachmentFile attachmentFile : attachmentFileList) {
      attachmentFiles.put("files", attachmentFile);
    }
    return attachmentFiles;
  }

}
