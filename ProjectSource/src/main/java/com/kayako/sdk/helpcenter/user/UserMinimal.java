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

    public UserMinimal(Long id, String fullName, String avatarUrl) {
        this.id = id;
        this.fullName = fullName;
        this.avatarUrl = avatarUrl;
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

}
