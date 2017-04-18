package com.kayako.sdk.base.requester;

import java.io.File;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class AttachmentFile {

    private String paramKey;
    private String fileName;
    private String contentType;
    private File file;

    public AttachmentFile(String paramKey, File file, String contentType, String fileName) {
        if (paramKey == null || file == null) {
            throw new IllegalArgumentException("Can not be null");
        }
        this.paramKey = paramKey;
        this.file = file;
        this.contentType = contentType;
        this.fileName = fileName;
    }

    public String getParamKey() {
        return paramKey;
    }

    public File getFile() {
        return file;
    }

    public String getFileName() {
        return fileName;
    }

    public String getContentType() {
        return contentType;
    }
}
