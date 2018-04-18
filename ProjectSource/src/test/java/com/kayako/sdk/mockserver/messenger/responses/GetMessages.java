package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public class GetMessages extends SampleResponse {

  private static final String METHOD = "GET";
  private static final String REQUEST_URL =
      "https://kayako-mobile-testing.kayako.com/api/v1/conversations/20/messages?_case=camel&include=userMinimal&limit=0&offset=0";
  private static final int STATUS_CODE = 200;

  private static final String MESSAGE_FILE = "messages";
  private static final String CONTENTS_FILE = "message";
  private static final int CONTENTS_LENGTH = 9;

  public GetMessages() {
    super(METHOD, REQUEST_URL, STATUS_CODE,
        MessageLoader.readFile(MESSAGE_FILE, CONTENTS_FILE, CONTENTS_LENGTH));
  }

}
