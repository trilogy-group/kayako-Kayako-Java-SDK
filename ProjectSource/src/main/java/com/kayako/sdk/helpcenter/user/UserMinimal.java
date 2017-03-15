package com.kayako.sdk.helpcenter.user;

import com.kayako.sdk.base.parser.Resource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 12/09/16
 */
public class UserMinimal implements Resource {
    private Long id;
    private String fullName;
    private String avatarUrl;
    private Long lastActiveAt;
    private Long lastSeenAt;

    public UserMinimal(Long id, String fullName, String avatarUrl, Long lastActiveAt, Long lastSeenAt) {
        this.id = id;
        this.fullName = fullName;
        this.avatarUrl = avatarUrl;
        this.lastActiveAt = lastActiveAt;
        this.lastSeenAt = lastSeenAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String full_name) {
        this.fullName = full_name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Long getLastActiveAt() {
        return lastActiveAt;
    }

    public void setLastActiveAt(Long lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
    }

    public Long getLastSeenAt() {
        return lastSeenAt;
    }

    public void setLastSeenAt(Long lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }
}
