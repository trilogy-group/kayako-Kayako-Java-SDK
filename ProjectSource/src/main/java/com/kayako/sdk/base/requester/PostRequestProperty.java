package com.kayako.sdk.base.requester;

import java.util.Map;

public abstract class PostRequestProperty extends AbstractRequestProperty {

  Map<String, AttachmentFile> attachmentFiles;

  public PostRequestProperty(String endpointUrl, String mHelpCenterUrl,
      Map<String, String> queryParameters, Map<String, String> headers, IncludeArgument include,
      Map<String, String> bodyParameters, Map<String, AttachmentFile> attachmentFiles) {
    super(endpointUrl, mHelpCenterUrl, queryParameters, headers, include, bodyParameters);
    this.attachmentFiles = attachmentFiles;
  }

  public Map<String, AttachmentFile> getAttachmentFiles() {
    return attachmentFiles;
  }

  public METHOD getMethod() {
    return METHOD.POST;
  }
}
