package com.kayako.sdk.base.requester;

import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public interface PostRequestProperty extends GetRequestProperty {

    Map<String, String> getBodyParameters();

    // TODO: get File Attachments
}
