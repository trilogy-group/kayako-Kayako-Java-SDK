package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.helpcenter.base.ListParser;
import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.helpcenter.category.Category;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 26/08/16
 */
public class SearchArticleManager {

    private Requester requester;
    private ListParser parser;

    public SearchArticleManager(Requester requester, ListParser parser) {
        this.parser = parser;
        this.requester = requester;
    }

    public List<SearchArticle> getSearchArticles(String url) {
        try {
            // Make Request
            String jsonResponse = requester.request(url);

            // Parse Json Response
            return parser.parse(jsonResponse);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
