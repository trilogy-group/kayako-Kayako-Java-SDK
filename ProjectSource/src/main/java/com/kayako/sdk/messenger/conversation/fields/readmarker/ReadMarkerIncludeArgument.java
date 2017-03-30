package com.kayako.sdk.messenger.conversation.fields.readmarker;

import com.kayako.sdk.base.requester.IncludeArgument;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 15/03/17
 */
public class ReadMarkerIncludeArgument extends IncludeArgument {

    private static final String[] resources = new String[]{
            "readMarker"
    };


    public ReadMarkerIncludeArgument() {
        super(resources);
    }
}
