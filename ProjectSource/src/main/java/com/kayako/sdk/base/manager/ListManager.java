package com.kayako.sdk.base.manager;

import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.base.parser.Resource;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.error.ErrorCode;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.helpcenter.base.ListCallback;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class ListManager<T extends Resource> {

    private ListRequester requester;
    private ListParser<T> parser;

    public ListManager(ListRequester requester, ListParser<T> parser) {
        this.parser = parser;
        this.requester = requester;
    }

    public List<T> getList() {
        try {
            // Make Request
            Response response = requester.request();

            // TODO: Error handling

            // Parse Json Response
            return parser.parse(response.body);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getList(final com.kayako.sdk.base.callback.ListCallback<T> callback) {
        // Make Request
        requester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                List<T> categories = parser.parse(response.body);

                if (categories != null) {
                    callback.onSuccess(categories);
                } else {
                    callback.onFailure(new KayakoException(ErrorCode.INTERNAL_UNABLE_TO_PARSE_RESPONSE, "Invalid Response. Parsing failed.", null));
                }
            }

            public void onFailure(Throwable error) {
                callback.onFailure(new KayakoException(ErrorCode.INTERNAL_UNABLE_TO_CONNECT_TO_SERVER, "Unable to connect with server.", null));
            }
        });
    }

    @Deprecated
    public void getList(final ListCallback<T> callback) {
        // Make Request
        requester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                List<T> items = parser.parse(response.body);

                if (items != null) {
                    callback.onSuccess(items);
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
