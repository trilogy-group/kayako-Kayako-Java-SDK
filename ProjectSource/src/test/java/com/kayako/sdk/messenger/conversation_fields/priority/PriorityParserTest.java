package com.kayako.sdk.messenger.conversation_fields.priority;

import com.kayako.sdk.messenger.conversation.fields.priority.Priority;
import com.kayako.sdk.messenger.conversation.fields.priority.PriorityParser;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class PriorityParserTest {

    String priorityJson1 = "{\n" +
            "      \"id\": 4,\n" +
            "      \"label\": \"Urgent\",\n" +
            "      \"level\": 4,\n" +
            "      \"createdAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"updatedAt\": \"2017-01-09T13:25:38+00:00\",\n" +
            "      \"resourceType\": \"casePriority\",\n" +
            "      \"resourceUrl\": \"https://kayako-mobile-testing.kayako.com/api/v1/cases/priorities/4\"\n" +
            "    }";

    @Test
    public void parse() throws Exception {
        parseJson(priorityJson1);
    }

    private static void parseJson(String priorityJson) {
        Priority priority = new PriorityParser().parse(priorityJson);

        Assert.assertNotNull(priority);
        Assert.assertEquals(4, priority.getId().longValue());
        Assert.assertEquals("Urgent", priority.getLabel());
        Assert.assertEquals(4, priority.getLevel());
        Assert.assertEquals(1483968338000L, priority.getCreatedAt().longValue());
        Assert.assertEquals(1483968338000L, priority.getUpdatedAt().longValue());
    }

}