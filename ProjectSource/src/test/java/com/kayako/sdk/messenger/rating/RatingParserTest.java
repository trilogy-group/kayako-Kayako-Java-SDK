package com.kayako.sdk.messenger.rating;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 01/05/17
 */
public class RatingParserTest {

    final String json = "{\n" +
            "    \"id\": 2,\n" +
            "    \"score\": \"GOOD\",\n" +
            "    \"comment\": null,\n" +
            "    \"conversation\": {\n" +
            "      \"id\": 359,\n" +
            "      \"resourceType\": \"conversation\"\n" +
            "    },\n" +
            "    \"creator\": {\n" +
            "      \"id\": 22,\n" +
            "      \"resourceType\": \"userMinimal\"\n" +
            "    },\n" +
            "    \"createdAt\": \"2017-05-01T07:03:37+00:00\",\n" +
            "    \"updatedAt\": \"2017-05-01T07:03:37+00:00\"\n" +
            "  }";

    @Test
    public void parse() throws Exception {
        RatingParser ratingParser = new RatingParser();
        Rating rating = ratingParser.parse(json);
        Assert.assertEquals(2L, rating.getId().longValue());
        Assert.assertEquals(Rating.SCORE.GOOD, rating.getScore());
        Assert.assertEquals(null, rating.getComment());
    }

}