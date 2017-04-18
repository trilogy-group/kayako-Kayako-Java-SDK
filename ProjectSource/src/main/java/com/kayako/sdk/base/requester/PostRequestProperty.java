package com.kayako.sdk.base.requester;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 09/02/17
 */
public abstract class PostRequestProperty extends GetRequestProperty {

    public abstract Map<String, String> getBodyParameters();

    public List<AttachmentFile> getAttachmentFiles() {
        return Collections.emptyList();
    }

    public METHOD getMethod() {
        return METHOD.POST;
    }
}
