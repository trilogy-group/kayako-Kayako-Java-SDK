package com.kayako.sdk.messenger.conversation;

import com.kayako.sdk.base.parser.ComparableResource;
import com.kayako.sdk.helpcenter.user.UserMinimal;
import com.kayako.sdk.messenger.conversation.fields.ChannelType;
import com.kayako.sdk.messenger.conversation.fields.priority.Priority;
import com.kayako.sdk.messenger.conversation.fields.readmarker.ReadMarker;
import com.kayako.sdk.messenger.conversation.fields.status.Status;
import com.kayako.sdk.messenger.conversation.fields.team.Team;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class Conversation extends ComparableResource {

    private Long id;

    private String uuid;

    private String legacyId;

    private String subject;

    private ChannelType channel;

    private UserMinimal requester;

    private UserMinimal creator;

    private UserMinimal lastReplier;

    private Team assignedTeam;

    // TODO: TOM-1473
    // "assigned_agent": null,

    private Status status;

    private Boolean isCompleted;

    private Priority priority;

    private String realtimeChannel;

    private ReadMarker readMarker;

    // TODO:
    // "type": null,
    // "read_marker": null,
    // "custom_fields": [],

    private Long lastRepliedAt;

    private Long createdAt;

    private Long updatedAt;

    public Conversation(Long id, String uuid, String legacyId, String subject, ChannelType channel, UserMinimal requester, UserMinimal creator, UserMinimal lastReplier, Team assignedTeam, Status status, Boolean isCompleted, ReadMarker readMarker, Priority priority, String realtimeChannel, Long lastRepliedAt, Long createdAt, Long updatedAt) {
        this.id = id;
        this.uuid = uuid;
        this.legacyId = legacyId;
        this.subject = subject;
        this.channel = channel;
        this.requester = requester;
        this.creator = creator;
        this.lastReplier = lastReplier;
        this.assignedTeam = assignedTeam;
        this.status = status;
        this.isCompleted = isCompleted;
        this.priority = priority;
        this.realtimeChannel = realtimeChannel;
        this.readMarker = readMarker;
        this.lastRepliedAt = lastRepliedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLegacyId() {
        return legacyId;
    }

    public void setLegacyId(String legacyId) {
        this.legacyId = legacyId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ChannelType getChannel() {
        return channel;
    }

    public void setChannel(ChannelType channel) {
        this.channel = channel;
    }

    public UserMinimal getRequester() {
        return requester;
    }

    public void setRequester(UserMinimal requester) {
        this.requester = requester;
    }

    public UserMinimal getCreator() {
        return creator;
    }

    public void setCreator(UserMinimal creator) {
        this.creator = creator;
    }

    public UserMinimal getLastReplier() {
        return lastReplier;
    }

    public void setLastReplier(UserMinimal lastReplier) {
        this.lastReplier = lastReplier;
    }

    public Team getAssignedTeam() {
        return assignedTeam;
    }

    public void setAssignedTeam(Team assignedTeam) {
        this.assignedTeam = assignedTeam;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getRealtimeChannel() {
        return realtimeChannel;
    }

    public void setRealtimeChannel(String realtimeChannel) {
        this.realtimeChannel = realtimeChannel;
    }

    public Long getLastRepliedAt() {
        return lastRepliedAt;
    }

    public void setLastRepliedAt(Long lastRepliedAt) {
        this.lastRepliedAt = lastRepliedAt;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ReadMarker getReadMarker() {
        return readMarker;
    }

    public void setReadMarker(ReadMarker readMarker) {
        this.readMarker = readMarker;
    }

    @Override
    public String getIdentifier() {
        return String.valueOf(id);
    }

}


