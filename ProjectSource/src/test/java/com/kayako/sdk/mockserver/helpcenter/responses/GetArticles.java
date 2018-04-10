package com.kayako.sdk.mockserver.helpcenter.responses;

import com.kayako.sdk.mockserver.base.BaseSampleResponse;
import com.kayako.sdk.utils.MessageLoader;

/**
 * @date 15/02/17
 */
public class GetArticles extends BaseSampleResponse {
    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getRequestUrl() {
        return "http://support.kayako.com//api/v1/articles.json?_case=camel&include=localeField,category,section,userMinimal&limit=10&section_id=243&offset=0";
    }

    @Override
    public int getStatusCode() {
        return 200;
    }

    @Override
    public String getBody() {
        return MessageLoader.readFile("articles", "article", 5);
    }
}
