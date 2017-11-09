package com.kayako.sdk.messenger.attachment;

import com.kayako.sdk.base.parser.Resource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 19/04/17
 * <p>
 * NOTE: Thumbnail is not a resource from the API perspective
 */
public class Thumbnail implements Resource {

    private String name;
    private Long size;
    private Long width;
    private Long height;
    private String type;
    private String url;
    private Long createdAt;

    public Thumbnail(String name, Long size, Long width, Long height, String type, String url, Long createdAt) {
        this.name = name;
        this.size = size;
        this.width = width;
        this.height = height;
        this.type = type;
        this.url = url;
        this.createdAt = createdAt;
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

    public Long getCreatedAt() {
        return createdAt;
    }
}