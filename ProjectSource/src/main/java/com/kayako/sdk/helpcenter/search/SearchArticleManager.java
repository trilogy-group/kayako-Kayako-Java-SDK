package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.base.requester.ListRequester;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 26/08/16
 */
public class SearchArticleManager {

    private ListRequester mRequester;
    private ListParser mParser;

    public SearchArticleManager(ListRequester requester, ListParser parser) {
        this.mParser = parser;
        this.mRequester = requester;
    }

    public List<SearchArticle> getSearchArticles() {
        try {
            // Make Request
            Response response = mRequester.request();

            // Parse Json Response
            return mParser.parse(response.body);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getSearchArticles(final ListCallback<SearchArticle> callback) {
        // Make Request
        mRequester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                List<SearchArticle> searchArticles = mParser.parse(response.body);

                if (searchArticles != null) {
                    callback.onSuccess(searchArticles);
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
