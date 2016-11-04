package com.kayako.sdk.helpcenter.section;

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
public class SectionManager {

    private ListRequester mRequester;
    private ListParser mParser;

    private SectionManager() {
    }

    public SectionManager(ListRequester requester, ListParser<Section> parser) {
        mRequester = requester;
        mParser = parser;
    }

    public List<Section> getSections() {
        try {
            Response response = mRequester.request();

            List<Section> sectionList = mParser.parse(response.body);
            return sectionList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getSections(final ListCallback<Section> callback) {
        // Make Request
        mRequester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                List<Section> sections = mParser.parse(response.body);

                if (sections != null) {
                    callback.onSuccess(sections);
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
