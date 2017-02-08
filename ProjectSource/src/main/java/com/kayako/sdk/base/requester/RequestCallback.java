package com.kayako.sdk.base.requester;

public interface RequestCallback {
    void onSuccess(Response response);

    void onFailure(Throwable error);
}