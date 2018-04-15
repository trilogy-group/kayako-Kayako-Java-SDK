package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public class GetSearchArticles extends SampleResponse {

  private static final String METHOD = "GET";
  private static final String REQUEST_URL =
      "http://support.kayako.com//api/v1/helpcenter/search?_case=camel&include=localeField,category,section,article,userMinimal&limit=10&query=kayako&offset=0&in=articles";
  private static final int STATUS_CODE = 200;

  private static final String MESSAGE_FILE = "search_articles";
  private static final String CONTENTS_FILE = "search_article";
  private static final int CONTENTS_LENGTH = 9;

  public GetSearchArticles() {
    super(METHOD, REQUEST_URL, STATUS_CODE,
        MessageLoader.readFile(MESSAGE_FILE, CONTENTS_FILE, CONTENTS_LENGTH));
  }
}
