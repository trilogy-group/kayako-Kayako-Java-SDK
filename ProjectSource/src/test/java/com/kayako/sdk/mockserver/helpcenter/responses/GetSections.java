package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public class GetSections extends SampleResponse {

  private static final String METHOD = "GET";
  private static final String REQUEST_URL =
      "http://support.kayako.com//api/v1/sections.json?_case=camel&include=localeField,category&limit=10&category_id=1&offset=0";
  private static final int STATUS_CODE = 200;

  private static final String MESSAGE_FILE = "sections";
  private static final String CONTENTS_FILE = "section";
  private static final int CONTENTS_LENGTH = 10;

  public GetSections() {
    super(METHOD, REQUEST_URL, STATUS_CODE,
        MessageLoader.readFile(MESSAGE_FILE, CONTENTS_FILE, CONTENTS_LENGTH));
  }
}
