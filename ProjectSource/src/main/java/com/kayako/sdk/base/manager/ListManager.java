package com.kayako.sdk.base.manager;

import com.kayako.sdk.base.parser.ListParser;
import com.kayako.sdk.base.parser.Resource;
import com.kayako.sdk.base.requester.ListRequester;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.error.ErrorCode;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.helpcenter.base.ListCallback;
import com.kayako.sdk.utils.ExceptionUtils;

import java.io.IOException;
import java.util.List;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class ListManager<T extends Resource> {

    private ListRequester requester;
    private ListParser<T> parser;

    public ListManager(ListRequester requester, ListParser<T> parser) {
        this.parser = parser;
        this.requester = requester;
    }

    public List<T> getList() throws KayakoException {
        try {
            // Make Request
            Response response = requester.request();

            // Throw External Network Error (e1)
            if (response.statusCode < 200 || response.statusCode > 299) {
                throw ExceptionUtils.generateExternalKayakoException(response.statusCode, response.body);
            }

            // Parse Json Response
            List<T> list = parser.parseList(response.body);

            // Check if value is null (e2)
            if (list == null) {
                throw new NullPointerException();
            }

            // Return list
            return list;

        } catch (IOException e) {
            // Throw Internal Network Error (e3)
            throw ExceptionUtils.generateInternalKayakoException(ErrorCode.INTERNAL_UNABLE_TO_CONNECT_TO_SERVER, e);
        } catch (NullPointerException e) {
            // Throw Internal Parse Error (e4)
            throw ExceptionUtils.generateInternalKayakoException(ErrorCode.INTERNAL_UNABLE_TO_PARSE_RESPONSE, e);
        } catch (KayakoException e) {
            // Don't Catch KayakoExceptions
            throw e;
        } catch (Exception e) {
            // Throw Other error (e5)
            throw ExceptionUtils.generateInternalKayakoException(ErrorCode.OTHER, e);
        }
    }

    public void getList(final com.kayako.sdk.base.callback.ListCallback<T> callback) {
        // Make Request
        requester.request(new RequestCallback() {
            public void onSuccess(Response response) {

                // Throw External Network Error (e1)
                if (response.statusCode < 200 || response.statusCode > 299) {
                    callback.onFailure(ExceptionUtils.generateExternalKayakoException(response.statusCode, response.body));
                }

                try {
                    // Parse Json Response
                    List<T> list = parser.parseList(response.body);

                    // Check if value is null (e2)
                    if (list == null) {
                        throw new NullPointerException();
                    }

                    // Return list
                    callback.onSuccess(list);

                } catch (NullPointerException e) {
                    // Throw Internal Parse Error (e4)
                    callback.onFailure(ExceptionUtils.generateInternalKayakoException(ErrorCode.INTERNAL_UNABLE_TO_PARSE_RESPONSE, e));
                } catch (Exception e) {
                    // Throw Other error (e5)
                    callback.onFailure(ExceptionUtils.generateInternalKayakoException(ErrorCode.OTHER, e));
                }
            }

            public void onFailure(Throwable error) {
                // Throw Internal Network Error (e3)
                callback.onFailure(ExceptionUtils.generateInternalKayakoException(ErrorCode.INTERNAL_UNABLE_TO_CONNECT_TO_SERVER, error));
            }
        });
    }

    @Deprecated
    public void getList(final ListCallback<T> callback) {
        // Make Request
        requester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                try {
                    List<T> items = parser.parseList(response.body);

                    if (items != null) {
                        callback.onSuccess(items);
                    } else {
                        callback.onError(new NullPointerException("Invalid Response. Parsing failed."));
                    }
                } catch (Exception e) {
                    callback.onError(e);
                }
            }

            public void onFailure(Throwable error) {
                callback.onError(error);
            }
        });
    }


}
