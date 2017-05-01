package com.kayako.sdk.messenger.rating;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 10/02/17
 */
public class PostRatingBodyParams {

    // Mandatory Fields
    private Rating.SCORE score;

    // Optional Fields
    private String comment;

    public PostRatingBodyParams(Rating.SCORE score) {
        this.score = score;

        if (score == null) {
            throw new IllegalStateException("Mandatory field can not be null");
        }
    }

    public PostRatingBodyParams(Rating.SCORE score, String comment) {
        this.score = score;
        this.comment = comment;

        if (score == null) {
            throw new IllegalStateException("Mandatory field can not be null");
        }
    }

    public Rating.SCORE getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }
}
