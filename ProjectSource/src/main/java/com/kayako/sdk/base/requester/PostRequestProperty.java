package com.kayako.sdk.base.requester;

import java.util.Collections;
import java.util.Map;

public abstract class PostRequestProperty extends AbstractRequestProperty {

  private final Map<String, AttachmentFile> attachmentFiles;

  public PostRequestProperty(String endpointUrl, String mHelpCenterUrl,
      Map<String, String> queryParameters, Map<String, String> headers, IncludeArgument include,
      Map<String, String> bodyParameters, Map<String, AttachmentFile> attachmentFiles) {
    super(endpointUrl, mHelpCenterUrl, queryParameters, headers, include, bodyParameters);
    this.attachmentFiles = attachmentFiles;
  }

  public Map<String, AttachmentFile> getAttachmentFiles() {
    return Collections.unmodifiableMap(attachmentFiles);
  }

  public METHOD getMethod() {
    return METHOD.POST;
  }
}
