package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.helpcenter.base.ListCallback;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class LocaleManager {

    private ListRequester mRequester;
    private ListParser<Locale> mParser;

    private LocaleManager() {
    }

    public LocaleManager(ListRequester requester, ListParser<Locale> parser) {
        mRequester = requester;
        mParser = parser;
    }

    public List<Locale> getLocales() {
        try {
            Response response = mRequester.request();

            List<Locale> locales = mParser.parse(response.body);
            return locales;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getLocales(final ListCallback<Locale> callback) {
        // Make Request
        mRequester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                List<Locale> locales = mParser.parse(response.body);

                if (locales != null) {
                    callback.onSuccess(locales);
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
