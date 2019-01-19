
package com.esoteric.space.models.project;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "files",
    "id",
    "title",
    "type",
    "publishedBy",
    "publishedDate",
    "externalUrl"
})
public class LibraryItem implements Serializable
{

    @JsonProperty("description")
    private String description;
    @JsonProperty("files")
    private String files;
    @JsonProperty("id")
    private long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("type")
    private String type;
    @JsonProperty("publishedBy")
    private String publishedBy;
    @JsonProperty("publishedDate")
    private String publishedDate;
    @JsonProperty("externalUrl")
    private String externalUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4466097509678376902L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LibraryItem() {
    }

    /**
     * 
     * @param id
     * @param files
     * @param title
     * @param publishedBy
     * @param description
     * @param publishedDate
     * @param type
     * @param externalUrl
     */
    public LibraryItem(String description, String files, long id, String title, String type, String publishedBy, String publishedDate, String externalUrl) {
        super();
        this.description = description;
        this.files = files;
        this.id = id;
        this.title = title;
        this.type = type;
        this.publishedBy = publishedBy;
        this.publishedDate = publishedDate;
        this.externalUrl = externalUrl;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("files")
    public String getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(String files) {
        this.files = files;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("publishedBy")
    public String getPublishedBy() {
        return publishedBy;
    }

    @JsonProperty("publishedBy")
    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    @JsonProperty("publishedDate")
    public String getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("publishedDate")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("externalUrl")
    public String getExternalUrl() {
        return externalUrl;
    }

    @JsonProperty("externalUrl")
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(files).append(title).append(additionalProperties).append(publishedBy).append(description).append(publishedDate).append(type).append(externalUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LibraryItem) == false) {
            return false;
        }
        LibraryItem rhs = ((LibraryItem) other);
        return new EqualsBuilder().append(id, rhs.id).append(files, rhs.files).append(title, rhs.title).append(additionalProperties, rhs.additionalProperties).append(publishedBy, rhs.publishedBy).append(description, rhs.description).append(publishedDate, rhs.publishedDate).append(type, rhs.type).append(externalUrl, rhs.externalUrl).isEquals();
    }

}
