package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public class GetLocales extends SampleResponse {

  private static final String METHOD = "GET";
  private static final String REQUEST_URL =
      "http://support.kayako.com//api/v1/locales.json?_case=camel&include=locale";
  private static final int STATUS_CODE = 200;

  private static final String MESSAGE_FILE = "locales";
  private static final String CONTENTS_FILE = "locale";
  private static final int CONTENTS_LENGTH = 44;

  public GetLocales() {
    super(METHOD, REQUEST_URL, STATUS_CODE,
        MessageLoader.readFile(MESSAGE_FILE, CONTENTS_FILE, CONTENTS_LENGTH));
  }

}
