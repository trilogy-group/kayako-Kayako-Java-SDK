package com.kayako.sdk.helpcenter.locale;

import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.helpcenter.base.ListParser;
import com.kayako.sdk.helpcenter.base.Requester;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class LocaleManager {

    private Requester mRequester;
    private ListParser<Locale> mParser;

    private LocaleManager() {
    }

    public LocaleManager(Requester requester, ListParser<Locale> parser) {
        mRequester = requester;
        mParser = parser;
    }

    public List<Locale> getLocales(String url) {
        String jsonResponse = null;
        try {
            jsonResponse = mRequester.request(url);

            List<Locale> locales = mParser.parse(jsonResponse);
            return locales;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getLocales(String url, final Callback callback) {
        // Make Request
        mRequester.request(url, new Requester.RequestCallback() {
            public void onSuccess(String jsonResponse) {
                List<Locale> locales = mParser.parse(jsonResponse);

                if (locales != null) {
                    callback.onSuccess(locales);
                } else {
                    callback.onError(KayakoError.INVALID_RESPONSE);
                }
            }

            public void onFailure(KayakoError error) {
                callback.onError(error);
            }
        });
    }

    public interface Callback extends ListCallback<Locale> {
    }

}
