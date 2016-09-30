package com.kayako.sdk.helpcenter.category;


import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.helpcenter.base.ListParser;
import com.kayako.sdk.helpcenter.base.Requester;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class CategoryManager {

    private Requester requester;
    private ListParser parser;

    public CategoryManager(Requester requester, ListParser parser) {
        this.parser = parser;
        this.requester = requester;
    }

    public List<Category> getCategories(String url) {
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

    public void getCategories(String url, final ListCallback<Category> callback) {
        // Make Request
        requester.request(url, new Requester.RequestCallback() {
            public void onSuccess(String jsonResponse) {
                List<Category> categories = parser.parse(jsonResponse);

                if (categories != null) {
                    callback.onSuccess(categories);
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
