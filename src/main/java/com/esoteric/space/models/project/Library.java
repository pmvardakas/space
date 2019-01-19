
package com.esoteric.space.models.project;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "libraryItem"
})
public class Library implements Serializable
{

    @JsonProperty("libraryItem")
    private List<LibraryItem> libraryItem = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9171628810738076825L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Library() {
    }

    /**
     * 
     * @param libraryItem
     */
    public Library(List<LibraryItem> libraryItem) {
        super();
        this.libraryItem = libraryItem;
    }

    @JsonProperty("libraryItem")
    public List<LibraryItem> getLibraryItem() {
        return libraryItem;
    }

    @JsonProperty("libraryItem")
    public void setLibraryItem(List<LibraryItem> libraryItem) {
        this.libraryItem = libraryItem;
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
        return new HashCodeBuilder().append(additionalProperties).append(libraryItem).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Library) == false) {
            return false;
        }
        Library rhs = ((Library) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(libraryItem, rhs.libraryItem).isEquals();
    }

}
