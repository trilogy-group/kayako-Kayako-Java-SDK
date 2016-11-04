package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.base.requester.ListRequester;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class ArticleManager {

    private ListRequester mRequester;
    private ListParser mParser;

    private ArticleManager() {
    }

    public ArticleManager(ListRequester requester, ListParser<Article> parser) {
        mRequester = requester;
        mParser = parser;
    }

    public List<Article> getArticles() {
        try {
            Response response = mRequester.request();

            List<Article> articleList = mParser.parse(response.body);
            return articleList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getArticles(final ListCallback<Article> callback) {
        // Make Request
        mRequester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                List<Article> articles = mParser.parse(response.body);

                if (articles != null) {
                    callback.onSuccess(articles);
                } else {
                    callback.onError(new NullPointerException("Invalid Response. Parsing failed."));
                }
            }

            public void onFailure(Throwable error) {
                callback.onError(error);
            }
        });
    }
}
