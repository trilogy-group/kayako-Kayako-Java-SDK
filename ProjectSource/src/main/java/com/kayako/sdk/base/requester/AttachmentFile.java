package com.kayako.sdk.base.requester;

import java.io.File;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class AttachmentFile {

    private String fileName;
    private String contentType;
    private File file;

    public AttachmentFile(File file, String contentType, String fileName) {
        if (file == null) {
            throw new IllegalArgumentException("Can not be null");
        }
        this.file = file;
        this.contentType = contentType;
        this.fileName = fileName;
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
