package com.kayako.sdk.messenger.rating;

import com.kayako.sdk.base.parser.Resource;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 01/05/17
 */
public class Rating implements Resource {

    private Long id;

    private SCORE score;

    private String comment;

    // Deliberately not adding the following elements:
    // > conversation
    // > creator

    private Long createdAt;

    private Long updatedAt;

    public Rating(Long id, SCORE score, String comment, Long createdAt, Long updatedAt) {
        this.id = id;
        this.score = score;
        this.comment = comment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public SCORE getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public enum SCORE {
        GOOD, BAD
    }
}
