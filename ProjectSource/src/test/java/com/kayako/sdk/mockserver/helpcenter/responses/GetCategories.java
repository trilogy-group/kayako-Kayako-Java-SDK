package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public class GetCategories extends SampleResponse {

  private static final String METHOD = "GET";
  private static final String REQUEST_URL =
      "http://support.kayako.com//api/v1/categories.json?_case=camel&include=localeField&limit=10&offset=0";
  private static final int STATUS_CODE = 200;

  private static final String MESSAGE_FILE = "categories";
  private static final String CONTENTS_FILE = "category";
  private static final int CONTENTS_LENGTH = 3;

  public GetCategories() {
    super(METHOD, REQUEST_URL, STATUS_CODE,
        MessageLoader.readFile(MESSAGE_FILE, CONTENTS_FILE, CONTENTS_LENGTH));
  }
}
