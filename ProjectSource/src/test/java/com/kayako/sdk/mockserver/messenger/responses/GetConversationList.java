package com.kayako.sdk.mockserver.messenger.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public final class GetConversationList extends SampleResponse {

  public GetConversationList() {
    super("GET",
        "https://kayako-mobile-testing.kayako.com/api/v1/conversations?_case=camel&include=userMinimal,team,caseStatus,casePriority&limit=20&offset=0",
        200, MessageLoader.readFile("conversation_list", "conversation_list", 12));
  }
}
