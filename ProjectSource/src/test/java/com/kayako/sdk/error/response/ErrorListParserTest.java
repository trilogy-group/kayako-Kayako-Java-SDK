package com.kayako.sdk.error.response;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 05/11/16
 */
public class ErrorListParserTest {

    // Test case that contains code, message, more_info
    String errorJson = "{\n" +
            "    \"status\": 405,\n" +
            "    \"errors\": [\n" +
            "        {\n" +
            "            \"code\": \"METHOD_NOT_SUPPORTED\",\n" +
            "            \"message\": \"HTTP method is not supported or is not allowed for the resource\",\n" +
            "            \"moreInfo\": \"https://developer.kayako.com/api/v1/reference/errors/METHOD_NOT_SUPPORTED\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    // Test case that contains additional field parameter
    String errorJson_hasParameter = "{\n" +
            "    \"status\": 400,\n" +
            "    \"errors\": [\n" +
            "        {\n" +
            "            \"code\": \"FIELD_REQUIRED\",\n" +
            "            \"parameter\": \"email\",\n" +
            "            \"message\": \"This action requires the field to be specified\",\n" +
            "            \"moreInfo\": \"https://developer.kayako.com/api/v1/reference/errors/FIELD_REQUIRED\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    // Test case that contains additional field parameters
    String errorJson_hasParameters = "{\n" +
            "    \"status\": 400,\n" +
            "    \"errors\": [\n" +
            "        {\n" +
            "            \"code\": \"ANY_FIELD_REQUIRED\",\n" +
            "            \"parameters\": [\n" +
            "                \"user_id\",\n" +
            "                \"organization_id\"\n" +
            "            ],\n" +
            "            \"message\": \"This action requires any of the related fields to be specified\",\n" +
            "            \"moreInfo\": \"https://developer.kayako.com/api/v1/reference/errors/ANY_FIELD_REQUIRED\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    // Test case that contains both errors and notifications and logs
    String errorJson_alongWithLogAndNotification = "{\n" +
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

    String errorJson_multipleItems = "{\n" +
            "    \"status\": 405,\n" +
            "    \"errors\": [\n" +
            "        {\n" +
            "            \"code\": \"METHOD_NOT_SUPPORTED\",\n" +
            "            \"message\": \"HTTP method is not supported or is not allowed for the resource\",\n" +
            "            \"moreInfo\": \"https://developer.kayako.com/api/v1/reference/errors/METHOD_NOT_SUPPORTED\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"METHOD_NOT_SUPPORTED\",\n" +
            "            \"message\": \"HTTP method is not supported or is not allowed for the resource\",\n" +
            "            \"moreInfo\": \"https://developer.kayako.com/api/v1/reference/errors/METHOD_NOT_SUPPORTED\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"code\": \"METHOD_NOT_SUPPORTED\",\n" +
            "            \"message\": \"HTTP method is not supported or is not allowed for the resource\",\n" +
            "            \"moreInfo\": \"https://developer.kayako.com/api/v1/reference/errors/METHOD_NOT_SUPPORTED\"\n" +
            "        }\n" +
            "    ]\n" +
            "}";


    @Test
    public void parseErrorItem() {
        List<Error> errors = new ErrorListParser().parseList(errorJson);
        for (Error error : errors) {
            validateErrorWithCoreFields(error);
        }
    }

    @Test
    public void parseMultipleErrorItems() {
        List<Error> errors = new ErrorListParser().parseList(errorJson_multipleItems);
        for (Error error : errors) {
            validateErrorWithCoreFields(error);
        }
    }

    @Test
    public void parseErrorAlongWithLogsNotifications() throws Exception {
        List<Error> errors = new ErrorListParser().parseList(errorJson_alongWithLogAndNotification);
        for (Error error : errors) {
            validateErrorWithCoreFields(error);
        }
    }

    @Test
    public void parseErrorWithParameterField() throws Exception {
        List<Error> errorList = new ErrorListParser().parseList(errorJson_hasParameter);
        for (Error error : errorList) {
            validateErrorWithParameterField(error);
        }
    }

    @Test
    public void parseErrorWithParametersField() throws Exception {
        List<Error> errorList = new ErrorListParser().parseList(errorJson_hasParameters);
        for (Error error : errorList) {
            validateErrorWithParametersField(error);
        }
    }

    private void validateErrorWithCoreFields(Error error) {
        assertNotNull(error.code);
        assertNotNull(error.message);
        assertNotNull(error.moreInfo);
    }

    private void validateErrorWithParameterField(Error error) {
        validateErrorWithCoreFields(error);
        assertNotNull(error.parameter);
    }

    private void validateErrorWithParametersField(Error error) {
        validateErrorWithCoreFields(error);
        assertNotNull(error.parameters);
        assertTrue("Parameters should contain at least 2 items", error.parameters.size() > 1);
    }

}