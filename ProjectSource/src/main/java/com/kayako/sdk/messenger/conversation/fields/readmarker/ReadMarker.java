package com.kayako.sdk.messenger.conversation.fields.readmarker;

import com.kayako.sdk.base.parser.Resource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 30/03/17
 */
public class ReadMarker implements Resource {

    private Long id;

    private Long lastReadPostId;

    private Long lastReadAt;

    private Integer unreadCount;

    public ReadMarker(Long id, Long lastReadPostId, Long lastReadAt, Integer unreadCount) {
        this.id = id;
        this.lastReadPostId = lastReadPostId;
        this.lastReadAt = lastReadAt;
        this.unreadCount = unreadCount;
    }

    public Long getId() {
        return id;
    }

    public Long getLastReadPostId() {
        return lastReadPostId;
    }

    public Long getLastReadAt() {
        return lastReadAt;
    }

    public Integer getUnreadCount() {
        return unreadCount;
    }
}
