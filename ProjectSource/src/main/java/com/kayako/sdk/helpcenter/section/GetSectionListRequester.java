package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.base.requester.GetListRequester;
import com.kayako.sdk.base.requester.IncludeArgument;

public class GetSectionListRequester extends GetListRequester {

  public static final String ENDPOINT = "/api/v1/sections.json";

  public GetSectionListRequester(String helpCenterUrl, long categoryId, int offset, int limit) {
    super(ENDPOINT, "category_id", helpCenterUrl, categoryId, offset, limit);
  }

  @Override
  public IncludeArgument getInclude() {
    return new SectionIncludeArgument();
  }
}
