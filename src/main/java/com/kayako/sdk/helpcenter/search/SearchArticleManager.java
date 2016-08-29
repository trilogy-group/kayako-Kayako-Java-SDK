package com.kayako.sdk.helpcenter.search;

import com.kayako.sdk.helpcenter.base.KayakoError;
import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.helpcenter.base.ListParser;
import com.kayako.sdk.helpcenter.base.Requester;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 26/08/16
 */
public class SearchArticleManager {

    private Requester mRequester;
    private ListParser mParser;

    public SearchArticleManager(Requester requester, ListParser parser) {
        this.mParser = parser;
        this.mRequester = requester;
    }

    public List<SearchArticle> getSearchArticles(String url) {
        try {
            // Make Request
            String jsonResponse = mRequester.request(url);

            // Parse Json Response
            return mParser.parse(jsonResponse);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getSearchArticles(String url, final Callback callback) {
        // Make Request
        mRequester.request(url, new Requester.RequestCallback() {
            public void onSuccess(String jsonResponse) {
                List<SearchArticle> searchArticles = mParser.parse(jsonResponse);

                if (searchArticles != null) {
                    callback.onSuccess(searchArticles);
                } else {
                    callback.onError(KayakoError.INVALID_RESPONSE);
                }
            }

            public void onFailure(KayakoError error) {
                callback.onError(error);
            }
        });

    }

    public interface Callback extends ListCallback<SearchArticle> {
    }
}
