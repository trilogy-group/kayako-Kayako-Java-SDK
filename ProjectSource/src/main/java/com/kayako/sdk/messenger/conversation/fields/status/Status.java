package com.kayako.sdk.messenger.conversation.fields.status;

import com.kayako.sdk.base.parser.ComparableResource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class Status extends ComparableResource {

    private Long id;

    private String label;

    private Integer sortOrder;

    private Type type;

    private Boolean isSlaActive;

    private Boolean isDeleted;

    private Long createdAt;

    private Long updatedAt;

    public enum Type {
        NEW, OPEN, PENDING, COMPLETED, CLOSED, CUSTOM
    }

    public Status(Long id, String label, Integer sortOrder, Type type, Boolean isSlaActive, Boolean isDeleted, Long createdAt, Long updatedAt) {
        this.id = id;
        this.label = label;
        this.sortOrder = sortOrder;
        this.type = type;
        this.isSlaActive = isSlaActive;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Boolean isSlaActive() {
        return isSlaActive;
    }

    public void setSlaActive(Boolean slaActive) {
        isSlaActive = slaActive;
    }

    public Boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
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
