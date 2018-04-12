package com.kayako.sdk.messenger.rating;

import java.util.HashMap;
import java.util.Map;

public class PostRatingBodyParams {

  private static final String PARM_SCORE = "score";
  private static final String PARM_COMMENT = "comment";

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

  public Map<String, String> getBodyParameters() {
    Map<String, String> bodyParameters = new HashMap<>();

    bodyParameters.put(PARM_SCORE, score.name());
    if (comment != null) {
      bodyParameters.put(PARM_COMMENT, comment);
    }
    return bodyParameters;
  }

}
