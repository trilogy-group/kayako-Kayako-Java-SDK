package com.kayako.sdk.messenger.conversation.fields.team;

import com.kayako.sdk.base.parser.ComparableResource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class Team extends ComparableResource {

    private Long id;

    private String title;

    private Integer memberCount;

    private Long createdAt;

    private Long updatedAt;

    public Team(Long id, String title, Integer memberCount, Long createdAt, Long updatedAt) {
        this.id = id;
        this.title = title;
        this.memberCount = memberCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String getIdentifier() {
        return String.valueOf(id);
    }

}
