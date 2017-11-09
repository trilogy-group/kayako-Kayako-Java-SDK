package com.kayako.sdk.helpcenter.articles;

import com.kayako.sdk.base.parser.ComparableResource;
import com.kayako.sdk.helpcenter.section.Section;
import com.kayako.sdk.helpcenter.user.UserMinimal;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 24/08/16
 */
public class Article extends ComparableResource {

    private Long id;

    private String uuid;

    private String title;

    private String contents;

    private Section section;

    private UserMinimal author;

    private Long lastUpdated;

    private Long lastPosted;

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

    public Long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Long getLastPosted() {
        return lastPosted;
    }

    public void setLastPosted(Long lastPosted) {
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

    @Override
    public String getIdentifier() {
        return String.valueOf(id);
    }
}
