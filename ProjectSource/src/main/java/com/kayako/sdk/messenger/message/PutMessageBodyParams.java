package com.kayako.sdk.messenger.message;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 31/03/17
 */
public class PutMessageBodyParams {

    private MessageStatus messageStatus;

    public PutMessageBodyParams(MessageStatus messageStatus) {
        if (messageStatus == null) {
            throw new IllegalArgumentException("MessageStatus can not be null");
        }
        this.messageStatus = messageStatus;
    }

    public MessageStatus getMessageStatus() {
        return messageStatus;
    }

    public enum MessageStatus {
        SEEN, DELIVERED
    }
}
