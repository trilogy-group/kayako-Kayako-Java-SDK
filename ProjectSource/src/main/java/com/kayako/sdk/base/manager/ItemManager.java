package com.kayako.sdk.base.manager;

import com.kayako.sdk.base.callback.ItemCallback;
import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.Resource;
import com.kayako.sdk.base.requester.ItemRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.error.ErrorCode;
import com.kayako.sdk.error.KayakoException;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class ItemManager<T extends Resource> {

    private ItemRequester requester;
    private ItemParser<T> parser;

    public ItemManager(ItemRequester requester, ItemParser parser) {
        this.parser = parser;
        this.requester = requester;
    }

    public T getItem() {
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

    public void getItem(final ItemCallback<T> callback) {
        // Make Request
        requester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                T item = parser.parse(response.body);

                if (item != null) {
                    callback.onSuccess(item);
                } else {
                    callback.onFailure(new KayakoException(ErrorCode.INTERNAL_UNABLE_TO_PARSE_RESPONSE, "Invalid Response. Parsing failed.", null));
                }
            }

            public void onFailure(Throwable error) {
                callback.onFailure(new KayakoException(ErrorCode.INTERNAL_UNABLE_TO_CONNECT_TO_SERVER, "Unable to connect with server.", null));
            }
        });
    }
}
