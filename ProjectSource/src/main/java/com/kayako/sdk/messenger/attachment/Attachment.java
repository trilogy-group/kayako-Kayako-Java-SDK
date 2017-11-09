package com.kayako.sdk.messenger.attachment;

import com.kayako.sdk.base.parser.Resource;

import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 */
public class Attachment implements Resource{

    private Long id;
    private String name;
    private Long size;
    private Long width;
    private Long height;
    private String type;
    private String url;
    private String urlDownload;
    private List<Thumbnail> thumbnails;
    private Long createdAt;

    public Attachment(Long id, String name, Long size, Long width, Long height, String type, String url, String urlDownload, List<Thumbnail> thumbnails, Long createdAt) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.width = width;
        this.height = height;
        this.type = type;
        this.url = url;
        this.urlDownload = urlDownload;
        this.thumbnails = thumbnails;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getSize() {
        return size;
    }

    public Long getWidth() {
        return width;
    }

    public Long getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlDownload() {
        return urlDownload;
    }

    public List<Thumbnail> getThumbnails() {
        return thumbnails;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
}
