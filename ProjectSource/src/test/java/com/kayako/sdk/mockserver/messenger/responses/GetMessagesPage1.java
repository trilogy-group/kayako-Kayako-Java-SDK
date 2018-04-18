package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public class GetMessagesPage1 extends SampleResponse {

  private static final String METHOD = "GET";
  private static final String REQUEST_URL =
      "https://kayako-mobile-testing.kayako.com/api/v1/conversations/22/messages?_case=camel&include=userMinimal&limit=5&offset=0";
  private static final int STATUS_CODE = 200;

  private static final String MESSAGE_FILE = "messages_page1";
  private static final String CONTENTS_FILE = "message_page1";
  private static final int CONTENTS_LENGTH = 5;

  public GetMessagesPage1() {
    super(METHOD, REQUEST_URL, STATUS_CODE,
        MessageLoader.readFile(MESSAGE_FILE, CONTENTS_FILE, CONTENTS_LENGTH));
  }

}
