package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.requester.GetListRequester;
import com.kayako.sdk.base.requester.IncludeArgument;

public class GetArticleListRequester extends GetListRequester {

  public static final String ENDPOINT = "/api/v1/articles.json";

  public GetArticleListRequester(String helpCenterUrl, long sectionId, int offset, int limit) {
    super(ENDPOINT, "section_id", helpCenterUrl, sectionId, offset, limit);
  }

  @Override
  public IncludeArgument getInclude() {
    return new ArticleIncludeArgument();
  }
}
