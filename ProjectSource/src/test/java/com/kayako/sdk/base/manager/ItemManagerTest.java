package com.kayako.sdk.base.manager;

import com.google.gson.JsonParseException;
import com.kayako.sdk.ParserFactory;
import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.Resource;
import com.kayako.sdk.base.requester.ItemRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.error.ErrorCode;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.helpcenter.category.Category;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.fail;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 05/11/16
 */
public class ItemManagerTest {

    /*
    Test Cases to cover:
    1. Throw External Network Error (e1)
    2. Check if value is null (e2)
    3. Throw Internal Network Error (e3)
    4. Throw Internal Parse Error (e4)
    5. Throw Other Errors (e5) */


    /**
     * Throw Other Errors (e5)
     * <p>
     * Request is successfully made but failed to get data due to 404 Not Found.
     * Because the response json is invalid, there should be a JsonSyntaxException that throws Internal Error.
     */
    @Test
    public void testExternalNetworkError_AuthFail() {
        ItemRequester requester = new ItemRequester() {

            @Override
            public String getHelpCenterUrl() {
                return null;
            }

            @Override
            public String getInclude() {
                return null;
            }

            @Override
            public String getEndpointUrl() {
                return null;
            }

            @Override
            public Map<String, String> getQueryParameters() {
                return null;
            }

            @Override
            public Map<String, String> getHeaders() {
                return null;
            }

            Response response = new Response(401, "{\n" +
                    "  \"status\": 401,\n" +
                    "  \"errors\": [\n" +
                    "    {\n" +
                    "      \"code\": \"AUTHENTICATION_FAILED\",\n" +
                    "      \"message\": \"Used authentication credentials are invalid or signature verification failed\",\n" +
                    "      \"moreInfo\": \"https://developer.kayako.com/api/v1/reference/errors/AUTHENTICATION_FAILED\"\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"notifications\": [\n" +
                    "    {\n" +
                    "      \"type\": \"ERROR\",\n" +
                    "      \"message\": \"Email is unverified\",\n" +
                    "      \"sticky\": true\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}");

            @Override
            public Response request() throws IOException {
                return response;
            }

            @Override
            public void request(RequestCallback callback) {
                callback.onSuccess(response);
            }
        };

        ItemParser parser = new ItemParser() {
            @Override
            public Resource parseItem(String jsonOfResponse) throws NullPointerException {
                return new Resource() {
                };
            }

            @Override
            public boolean containsItem(String jsonOfResponse) {
                return false;
            }

            @Override
            public Resource parse(String jsonOfResource) throws NullPointerException {
                return null;
            }
        };

        try {
            new ItemManager<Category>(requester, parser).getItem();
        } catch (KayakoException e) {
            if (e.getCode() == ErrorCode.EXTERNAL_CLIENT_ERROR) {

                Assert.assertNotNull(e.getResponseMessages());
                Assert.assertNull(e.getThrowable());

                Assert.assertNotNull(e.getResponseMessages().getErrors());
                Assert.assertNotNull(e.getResponseMessages().getNotifications());
                Assert.assertTrue(e.getResponseMessages().getLogs().size() == 0);

                Assert.assertTrue(e.getResponseMessages().getErrors().get(0).code.equals("AUTHENTICATION_FAILED"));
                Assert.assertTrue(e.getResponseMessages().getErrors().get(0).message.equals("Used authentication credentials are invalid or signature verification failed"));
                Assert.assertTrue(e.getResponseMessages().getErrors().get(0).moreInfo.equals("https://developer.kayako.com/api/v1/reference/errors/AUTHENTICATION_FAILED"));

                Assert.assertTrue(e.getResponseMessages().getNotifications().get(0).type.equals("ERROR"));
                Assert.assertTrue(e.getResponseMessages().getNotifications().get(0).message.equals("Email is unverified"));
                Assert.assertTrue(e.getResponseMessages().getNotifications().get(0).sticky.equals(true));

                System.out.println(e.getResponseMessages().getErrors().get(0).message);
                System.out.println(e.getResponseMessages().getNotifications().get(0).message);
                e.printStackTrace();
            } else {
                e.printStackTrace();
                fail();
            }
        }
    }


    /**
     * Check if value is null (e2)
     */
    @Test
    public void testNullValueError() {
        ItemParser parser = new ItemParser() {
            @Override
            public Resource parseItem(String jsonOfResponse) throws NullPointerException {
                return null;
            }

            @Override
            public boolean containsItem(String jsonOfResponse) {
                return true;
            }

            @Override
            public Resource parse(String jsonOfResource) throws NullPointerException {
                return null;
            }
        };

        ItemRequester requester = new ItemRequester() {
            @Override
            public String getHelpCenterUrl() {
                return null;
            }

            @Override
            public String getInclude() {
                return null;
            }

            @Override
            public String getEndpointUrl() {
                return null;
            }

            @Override
            public Map<String, String> getQueryParameters() {
                return null;
            }

            @Override
            public Map<String, String> getHeaders() {
                return null;
            }

            @Override
            public Response request() throws IOException {
                return new Response(200, null);
            }

            @Override
            public void request(RequestCallback callback) {
                callback.onSuccess(new Response(200, null));
            }
        };

        try {
            new ItemManager(requester, parser).getItem();
        } catch (KayakoException e) {
            if (e.getCode() == ErrorCode.INTERNAL_UNABLE_TO_PARSE_RESPONSE) {
                Assert.assertNull(e.getResponseMessages());
                Assert.assertNotNull(e.getThrowable());
                e.printStackTrace();
            } else {
                e.printStackTrace();
                fail();
            }
        }
    }


    /**
     * Throw Internal Parse Error (e3)
     */
    @Test
    public void testInternalParseError() {
        ItemRequester requester = new ItemRequester() {
            @Override
            public String getHelpCenterUrl() {
                return null;
            }

            @Override
            public String getInclude() {
                return null;
            }

            @Override
            public String getEndpointUrl() {
                return null;
            }

            @Override
            public Map<String, String> getQueryParameters() {
                return null;
            }

            @Override
            public Map<String, String> getHeaders() {
                return null;
            }

            @Override
            public Response request() throws IOException {
                return new Response(200, null);
            }

            @Override
            public void request(RequestCallback callback) {
                callback.onSuccess(new Response(200, null));
            }
        };

        ItemParser parser = new ItemParser() {
            @Override
            public Resource parseItem(String jsonOfResponse) throws NullPointerException {
                throw new NullPointerException();
            }

            @Override
            public boolean containsItem(String jsonOfResponse) {
                return true;
            }

            @Override
            public Resource parse(String jsonOfResource) throws NullPointerException {
                throw new NullPointerException();
            }
        };

        try {
            new ItemManager<Category>(requester, parser).getItem();
        } catch (KayakoException e) {
            if (e.getCode() == ErrorCode.INTERNAL_UNABLE_TO_PARSE_RESPONSE) {
                Assert.assertNull(e.getResponseMessages());
                Assert.assertNotNull(e.getThrowable());
                e.printStackTrace();
            } else {
                e.printStackTrace();
                fail();
            }
        }
    }

    /**
     * Throw Internal Network Error (e4)
     */
    @Test
    public void testInternalNetworkError() {
        ItemRequester requesterThatThrowsIOException = new ItemRequester() {
            @Override
            public String getHelpCenterUrl() {
                return null;
            }

            @Override
            public String getInclude() {
                return null;
            }

            @Override
            public String getEndpointUrl() {
                return null;
            }

            @Override
            public Map<String, String> getQueryParameters() {
                return null;
            }

            @Override
            public Map<String, String> getHeaders() {
                return null;
            }

            @Override
            public Response request() throws IOException {
                throw new SSLHandshakeException("meh");
            }

            @Override
            public void request(RequestCallback callback) {
                callback.onFailure(new SSLHandshakeException("meh"));
            }
        };

        ItemParser<Category> categoryParser = ParserFactory.getCategoryItemParser(Locale.ENGLISH);

        try {
            new ItemManager<Category>(requesterThatThrowsIOException, categoryParser).getItem();
        } catch (KayakoException e) {
            if (e.getCode() == ErrorCode.INTERNAL_UNABLE_TO_CONNECT_TO_SERVER) {
                Assert.assertNull(e.getResponseMessages());
                Assert.assertNotNull(e.getThrowable());
                e.printStackTrace();
            } else {
                e.printStackTrace();
                fail();
            }
        }
    }

    /**
     * Throw Internal Network Error (e4)
     */
    @Test
    public void testInternalNetworkError_SocketTimeout() {
        ItemParser parser = new ItemParser() {
            @Override
            public Resource parseItem(String jsonOfResponse) throws NullPointerException {
                return null;
            }

            @Override
            public boolean containsItem(String jsonOfResponse) {
                return true;
            }

            @Override
            public Resource parse(String jsonOfResource) throws NullPointerException {
                return null;
            }
        };

        ItemRequester requester = new ItemRequester() {
            @Override
            public String getHelpCenterUrl() {
                return null;
            }

            @Override
            public String getInclude() {
                return null;
            }

            @Override
            public String getEndpointUrl() {
                return null;
            }

            @Override
            public Map<String, String> getQueryParameters() {
                return null;
            }

            @Override
            public Map<String, String> getHeaders() {
                return null;
            }

            @Override
            public Response request() throws IOException {
                throw new SocketTimeoutException();
            }

            @Override
            public void request(RequestCallback callback) {
                callback.onFailure(new SocketTimeoutException());
            }
        };

        try {
            new ItemManager(requester, parser).getItem();
        } catch (KayakoException e) {
            if (e.getCode() == ErrorCode.INTERNAL_UNABLE_TO_CONNECT_TO_SERVER) {
                Assert.assertNotNull(e.getThrowable());
                Assert.assertNull(e.getResponseMessages());
                e.printStackTrace();
            } else {
                e.printStackTrace();
                fail();
            }
        }

    }

    /**
     * Throw Other Errors (e5)
     */
    @Test
    public void testOtherError() {
        ItemRequester requester = new ItemRequester() {
            @Override
            public String getHelpCenterUrl() {
                return null;
            }

            @Override
            public String getInclude() {
                return null;
            }

            @Override
            public String getEndpointUrl() {
                return null;
            }

            @Override
            public Map<String, String> getQueryParameters() {
                return null;
            }

            @Override
            public Map<String, String> getHeaders() {
                return null;
            }

            @Override
            public Response request() throws IOException {
                return new Response(200, null);
            }

            @Override
            public void request(RequestCallback callback) {
                callback.onSuccess(new Response(200, null));
            }
        };

        ItemParser parser = new ItemParser() {
            @Override
            public Resource parseItem(String jsonOfResponse) throws NullPointerException {
                throw new JsonParseException("GARGH");
            }

            @Override
            public boolean containsItem(String jsonOfResponse) {
                return true;
            }

            @Override
            public Resource parse(String jsonOfResource) throws NullPointerException {
                throw new JsonParseException("GARGH");
            }
        };


        try {
            new ItemManager<Category>(requester, parser).getItem();
        } catch (KayakoException e) {
            if (e.getCode() == ErrorCode.OTHER) {
                Assert.assertNull(e.getResponseMessages());
                Assert.assertNotNull(e.getThrowable());
                e.printStackTrace();
            } else {
                e.printStackTrace();
                fail();
            }
        }
    }


    /**
     * Throw Other Errors (e5)
     * <p>
     * Request is successfully made but failed to get data due to 404 Not Found.
     * Because the response json is invalid, there should be a JsonSyntaxException that throws Internal Error.
     */
    @Test
    public void testInternalNetworkError_404_Not_Found() {
        ItemRequester requester = new ItemRequester() {

            @Override
            public String getHelpCenterUrl() {
                return null;
            }

            @Override
            public String getInclude() {
                return null;
            }

            @Override
            public String getEndpointUrl() {
                return null;
            }

            @Override
            public Map<String, String> getQueryParameters() {
                return null;
            }

            @Override
            public Map<String, String> getHeaders() {
                return null;
            }

            Response response = new Response(404, "Invalid response json");

            @Override
            public Response request() throws IOException {
                return response;
            }

            @Override
            public void request(RequestCallback callback) {
                callback.onSuccess(response);
            }
        };

        ItemParser parser = new ItemParser() {
            @Override
            public Resource parseItem(String jsonOfResponse) throws NullPointerException {
                return null;
            }

            @Override
            public boolean containsItem(String jsonOfResponse) {
                return true;
            }

            @Override
            public Resource parse(String jsonOfResource) throws NullPointerException {
                return null;
            }
        };

        try {
            new ItemManager<Category>(requester, parser).getItem();
        } catch (KayakoException e) {
            if (e.getCode() == ErrorCode.OTHER) { // Will NOT be 404 -> EXTERNAL_CLIENT_ERROR

                Assert.assertNull(e.getResponseMessages()); // External Error does not contain response messages
                Assert.assertNotNull(e.getThrowable()); // Contains the JsonSyntaxException

                e.printStackTrace();
            } else {
                e.printStackTrace();
                fail();
            }
        }
    }

}