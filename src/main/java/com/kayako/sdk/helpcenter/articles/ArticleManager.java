package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.helpcenter.base.KayakoError;
import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.helpcenter.base.ListParser;
import com.kayako.sdk.helpcenter.base.Requester;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.section.SectionManager;

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

    public void getArticles(String url, final Callback callback) {
        // Make Request
        mRequester.request(url, new Requester.RequestCallback() {
            public void onSuccess(String jsonResponse) {
                List<Article> articles = mParser.parse(jsonResponse);

                if (articles != null) {
                    callback.onSuccess(articles);
                } else {
                    callback.onError(KayakoError.INVALID_RESPONSE);
                }
            }

            public void onFailure(KayakoError error) {
                callback.onError(error);
            }
        });
    }

    public interface Callback extends ListCallback<Article> {
    }

}
