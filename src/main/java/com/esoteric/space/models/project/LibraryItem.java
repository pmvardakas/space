package com.esoteric.space.models.project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryItem implements Serializable {
    private long id;
    private String title;
    private String type;
    private List<File> files;
    private String description;
    private String externalUrl;
    private String completionDate;
    private String publishedBy;
    private String publishedDate;

    public LibraryItem() {
        this.id = -1;
        this.title = "N/A";
        this.type = "";

        this.files = new ArrayList<File>();
        this.files.add(new File());

        this.description = "";
        this.externalUrl = "";
        this.completionDate = "";
        this.publishedBy = "";
        this.publishedDate = "";
    }

    public LibraryItem(long id, String title, String type, List<File> files, String description, String externalUrl, String completionDate, String publishedBy, String publishedDate) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.files = files;
        this.description = description;
        this.externalUrl = externalUrl;
        this.completionDate = completionDate;
        this.publishedBy = publishedBy;
        this.publishedDate = publishedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryItem that = (LibraryItem) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(type, that.type) &&
                Objects.equals(files, that.files) &&
                Objects.equals(description, that.description) &&
                Objects.equals(externalUrl, that.externalUrl) &&
                Objects.equals(completionDate, that.completionDate) &&
                Objects.equals(publishedBy, that.publishedBy) &&
                Objects.equals(publishedDate, that.publishedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, type, files, description, externalUrl, completionDate, publishedBy, publishedDate);
    }
}
