package com.kayako.sdk.base.manager;

import com.kayako.sdk.base.callback.ItemCallback;
import com.kayako.sdk.base.parser.ItemParser;
import com.kayako.sdk.base.parser.Resource;
import com.kayako.sdk.base.requester.RequestCallback;
import com.kayako.sdk.base.requester.Requester;
import com.kayako.sdk.base.requester.Response;
import com.kayako.sdk.error.ErrorCode;
import com.kayako.sdk.error.KayakoException;
import com.kayako.sdk.utils.ExceptionUtils;

import java.io.IOException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 11/08/16
 */
public class ItemManager<T extends Resource> {

    private Requester requester;
    private ItemParser<T> parser;

    public ItemManager(Requester requester, ItemParser parser) {
        this.parser = parser;
        this.requester = requester;
    }

    public T getItem() throws KayakoException {
        try {
            // Make Request
            Response response = requester.request();

            // Throw External Network Error (e1)
            if (response.statusCode < 200 || response.statusCode > 299) {
                throw ExceptionUtils.generateExternalKayakoException(response.statusCode, response.body);
            }

            // Parse Json Response
            T item = parser.parseItem(response.body);

            // Check if value is null (e2)
            if (item == null) {
                throw new IllegalArgumentException("item can not be null!");
            }

            return item;
        } catch (IOException e) {
            // Throw Internal Network Error (e3)
            throw ExceptionUtils.generateInternalKayakoException(ErrorCode.INTERNAL_UNABLE_TO_CONNECT_TO_SERVER, e);
        } catch (NullPointerException | IllegalArgumentException e) {
            // Throw Internal Parse Error (e4)
            throw ExceptionUtils.generateInternalKayakoException(ErrorCode.INTERNAL_UNABLE_TO_PARSE_RESPONSE, e);
        } catch (KayakoException e) {
            // Don't Catch KayakoExceptions
            throw e;
        } catch (Exception e) {
            // Throw Other Errors (e5)
            throw ExceptionUtils.generateInternalKayakoException(ErrorCode.OTHER, e);
        }
    }

    public void getItem(final ItemCallback<T> callback) {
        // Make Request
        requester.request(new RequestCallback() {
            public void onSuccess(Response response) {
                try {
                    // Throw External Network Error (e1)
                    if (response.statusCode < 200 || response.statusCode > 299) {
                        callback.onFailure(ExceptionUtils.generateExternalKayakoException(response.statusCode, response.body));
                    }

                    // Parse Json Response
                    T item = parser.parseItem(response.body);

                    // Check if value is null (e2)
                    if (item == null) {
                        throw new IllegalArgumentException("item can not be null");
                    }

                    callback.onSuccess(item);

                } catch (NullPointerException | IllegalArgumentException e) {
                    // Throw Internal Parse Error (e4)
                    callback.onFailure(ExceptionUtils.generateInternalKayakoException(ErrorCode.INTERNAL_UNABLE_TO_PARSE_RESPONSE, e));
                } catch (Exception e) {
                    // Throw Other Errors (e5)
                    callback.onFailure(ExceptionUtils.generateInternalKayakoException(ErrorCode.OTHER, e));
                }
            }

            public void onFailure(Throwable error) {
                // Throw Internal Network Error (e3)
                callback.onFailure(ExceptionUtils.generateInternalKayakoException(ErrorCode.INTERNAL_UNABLE_TO_CONNECT_TO_SERVER, error));
            }
        });
    }
}
