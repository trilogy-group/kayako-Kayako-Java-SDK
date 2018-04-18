package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public class GetConversationListPage2 extends SampleResponse {

  private static final String METHOD = "GET";
  private static final String REQUEST_URL =
      "https://kayako-mobile-testing.kayako.com/api/v1/conversations?_case=camel&include=userMinimal,team,caseStatus,casePriority&limit=3&offset=5";
  private static final int STATUS_CODE = 200;

  private static final String MESSAGE_FILE = "conversation_list2";
  private static final String CONTENTS_FILE = "conversation_list2";
  private static final int CONTENTS_LENGTH = 3;

  public GetConversationListPage2() {
    super(METHOD, REQUEST_URL, STATUS_CODE,
        MessageLoader.readFile(MESSAGE_FILE, CONTENTS_FILE, CONTENTS_LENGTH));
  }

}
