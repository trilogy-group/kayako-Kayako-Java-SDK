package com.kayako.sdk.messenger.message;

import com.kayako.sdk.base.parser.Resource;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import com.kayako.sdk.messenger.conversation.fields.ChannelType;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 13/02/17
 */
public class Message implements Resource {

    private Long id;

    private String uuid;

    private String clientId;

    private String subject;

    private ChannelType channel;

    private String contentText;

    private String contentHtml;

    private UserMinimal creator;

    // TODO: Implement attachments[],downloadAll,source
    // TODO: Ask someone reason behind metadata?
    // TODO: Ask someone why source is mentioned in Resource Fields (which is similar to Channel)?

    private MessageStatus messageStatus;

    private Long messageStatusUpdatedAt;

    private Long createdAt;

    private Long updatedAt;

    public Message(Long id, String uuid, String clientId, String subject, ChannelType channel, String contentText, String contentHtml, UserMinimal creator, MessageStatus messageStatus, Long messageStatusUpdatedAt, Long createdAt, Long updatedAt) {
        this.id = id;
        this.uuid = uuid;
        this.clientId = clientId;
        this.subject = subject;
        this.channel = channel;
        this.contentText = contentText;
        this.contentHtml = contentHtml;
        this.creator = creator;
        this.messageStatus = messageStatus;
        this.messageStatusUpdatedAt = messageStatusUpdatedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public String getClientId() {
        return clientId;
    }

    public String getSubject() {
        return subject;
    }

    public ChannelType getChannel() {
        return channel;
    }

    public String getContentText() {
        return contentText;
    }

    public String getContentHtml() {
        return contentHtml;
    }

    public UserMinimal getCreator() {
        return creator;
    }

    public MessageStatus getMessageStatus() {
        return messageStatus;
    }

    public Long getMessageStatusUpdatedAt() {
        return messageStatusUpdatedAt;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
}


