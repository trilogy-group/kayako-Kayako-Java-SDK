package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.SampleResponse;
import com.kayako.sdk.utils.MessageLoader;

public class GetSections extends SampleResponse {

  public GetSections() {
    super("GET",
        "http://support.kayako.com//api/v1/sections.json?_case=camel&include=localeField,category&limit=10&category_id=1&offset=0",
        200, MessageLoader.readFile("sections", "section", 10));
  }
}
