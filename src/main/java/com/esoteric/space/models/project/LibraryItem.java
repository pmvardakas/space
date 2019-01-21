package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.FileArrayDeserializer;
import com.esoteric.space.utilities.serialization.LibraryArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class LibraryItem {
    private long id;
    private String title;
    private String type;

    @JsonDeserialize(using = FileArrayDeserializer.class)
    private List<File> files;
    private String description;
    private String externalUrl;
    private String completionDate;
    private String publishedBy;
    private String publishedDate;

    public LibraryItem() {
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
}
