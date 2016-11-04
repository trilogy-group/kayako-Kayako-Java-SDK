package com.kayako.sdk.helpcenter.category;


import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.base.requester.ListRequester;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class CategoryManager {

    private ListRequester requester;
    private ListParser parser;

    public CategoryManager(ListRequester requester, ListParser parser) {
        this.parser = parser;
        this.requester = requester;
    }

    public List<Category> getCategories() {
        try {
            // Make Request
            Response response = requester.request();

            // Parse Json Response
            return parser.parse(response.body);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getCategories(final ListCallback<Category> callback) {
        // Make Request
        requester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                List<Category> categories = parser.parse(response.body);

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
