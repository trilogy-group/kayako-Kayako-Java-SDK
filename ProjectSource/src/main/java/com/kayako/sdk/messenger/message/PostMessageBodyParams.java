package com.kayako.sdk.messenger.message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.kayako.sdk.base.requester.AttachmentFile;

public class PostMessageBodyParams {

  private static final String PARM_CONTENTS = "contents";
  private static final String PARM_SOURCE = "source";
  private static final String PARM_CLIENT_ID = "client_id";
  private static final String PARM_FILE = "files";

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

    bodyParameters.put(PARM_CONTENTS, contents);
    if (type != null) {
      bodyParameters.put(PARM_SOURCE, type.toString());
    }
    if (clientId != null) {
      bodyParameters.put(PARM_CLIENT_ID, clientId);
    }
    return bodyParameters;
  }

  public Map<String, AttachmentFile> getAttachmentFiles() {
    Map<String, AttachmentFile> attachmentFiles = new HashMap<>();

    if(attachmentFileList == null) {
        return attachmentFiles;
    }

    for (AttachmentFile attachmentFile : attachmentFileList) {
      attachmentFiles.put(PARM_FILE, attachmentFile);
    }
    return attachmentFiles;
  }

}
