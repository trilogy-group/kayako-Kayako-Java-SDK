package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.helpcenter.base.Resource;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.user.UserMinimal;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class Article implements Resource {

    private long id;

    private String uuid;

    private String title;

    private String contents;

    private Section section;

    private UserMinimal author;

    private long lastUpdated;

    private long lastPosted;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public UserMinimal getAuthor() {
        return author;
    }

    public void setAuthor(UserMinimal author) {
        this.author = author;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public long getLastPosted() {
        return lastPosted;
    }

    public void setLastPosted(long lastPosted) {
        this.lastPosted = lastPosted;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", section=" + section +
                ", author=" + author +
                ", lastUpdated=" + lastUpdated +
                ", lastPosted=" + lastPosted +
                '}';
    }
}
