package com.kayako.sdk.helpcenter.section;

import com.kayako.sdk.helpcenter.base.ListParser;
import com.kayako.sdk.helpcenter.base.Requester;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class SectionManager {

    private Requester mRequester;
    private ListParser mParser;

    private SectionManager() {
    }

    public SectionManager(Requester requester, ListParser<Section> parser) {
        mRequester = requester;
        mParser = parser;
    }

    public List<Section> getSections(String url) {
        String jsonResponse = null;
        try {
            jsonResponse = mRequester.request(url);

            List<Section> sectionList = mParser.parse(jsonResponse);
            return sectionList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
