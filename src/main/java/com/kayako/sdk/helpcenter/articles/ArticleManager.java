package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.helpcenter.base.ListParser;
import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.helpcenter.section.Section;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class ArticleManager {

    private Requester mRequester;
    private ListParser mParser;

    private ArticleManager() {
    }

    public ArticleManager(Requester requester, ListParser<Article> parser) {
        mRequester = requester;
        mParser = parser;
    }

    public List<Article> getArticles(String url) {
        String jsonResponse = null;
        try {
            jsonResponse = mRequester.request(url);

            List<Article> articleList = mParser.parse(jsonResponse);
            return articleList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
