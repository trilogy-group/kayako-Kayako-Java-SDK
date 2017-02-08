package com.kayako.sdk.error.response;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 05/11/16
 */
public class LogListParserTest {

    // Test case that contains both errors and notifications and logs
    private final String jsonWithOtherResponseMessages = "{\n" +
            "    \"status\": 403,\n" +
            "    \"errors\": [\n" +
            "        {\n" +
            "            \"code\": \"OTP_EXPECTED\",\n" +
            "            \"message\": \"To complete authentication you need to provide the one-time password\",\n" +
            "            \"moreInfo\": \"https://developer.kayako.com/api/v1/reference/errors/OTP_EXPECTED\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"logs\": [\n" +
            "        {\n" +
            "            \"level\": \"ERROR\",\n" +
            "            \"message\": \"Unhandled exception caught: Novo\\\\Library\\\\Exception\\\\InvalidArgument in __src/library/REST/Resource/Assembler/Assembler.php:423\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"notifications\": [\n" +
            "        {\n" +
            "            \"type\": \"INFO\",\n" +
            "            \"message\": \"Two-factor authentication is enabled for your account\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"auth_token\": \"dPQBJfPG5cGYd6MMPtowGz93x3uSN7Vc7yBw3JrKL5owqfowKFda4mezGefo5QDmRnxyV2\"\n" +
            "}";


    @Test
    public void parseJson_alongWithLogAndNotification() throws Exception {
        LogListParser logListParser = new LogListParser();
        List<Log> logs = logListParser.parseList(jsonWithOtherResponseMessages);

        assertTrue("Only one log", logs.size() == 1);
        Log log = logs.get(0);

        validateLog(log);
    }

    private void validateLog(Log log) {
        assertNotNull(log.message);
        assertNotNull(log.level);
        log.level.equals("ERROR");
        log.message.equals("Unhandled exception caught: Novo\\\\Library\\\\Exception\\\\InvalidArgument in __src/library/REST/Resource/Assembler/Assembler.php:423");
    }
}