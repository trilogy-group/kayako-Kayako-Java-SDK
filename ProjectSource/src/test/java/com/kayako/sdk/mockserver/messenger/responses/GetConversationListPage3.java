package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public class GetConversationListPage3 extends SampleResponse {

  private static final String METHOD = "GET";
  private static final String REQUEST_URL =
      "https://kayako-mobile-testing.kayako.com/api/v1/conversations?_case=camel&include=userMinimal,team,caseStatus,casePriority&limit=7&offset=8";
  private static final int STATUS_CODE = 200;

  private static final String MESSAGE_FILE = "conversation_list3";
  private static final String CONTENTS_FILE = "conversation_list3";
  private static final int CONTENTS_LENGTH = 7;

  public GetConversationListPage3() {
    super(METHOD, REQUEST_URL, STATUS_CODE,
        MessageLoader.readFile(MESSAGE_FILE, CONTENTS_FILE, CONTENTS_LENGTH));
  }
}
