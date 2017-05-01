package com.kayako.sdk.messenger.rating;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 10/02/17
 */
public class PutRatingBodyParams extends PostRatingBodyParams {

    public PutRatingBodyParams(Rating.SCORE score) {
        super(score);
    }

    public PutRatingBodyParams(Rating.SCORE score, String comment) {
        super(score, comment);
    }
}
