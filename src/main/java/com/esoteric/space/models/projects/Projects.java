
package com.esoteric.space.models.projects;

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
    "projects",
    "totalCount"
})
public class Projects implements Serializable
{

    @JsonProperty("projects")
    private List<Project> projects = null;
    @JsonProperty("totalCount")
    private long totalCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2480916613214283052L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Projects() {
    }

    /**
     * 
     * @param projects
     * @param totalCount
     */
    public Projects(List<Project> projects, long totalCount) {
        super();
        this.projects = projects;
        this.totalCount = totalCount;
    }

    @JsonProperty("projects")
    public List<Project> getProjects() {
        return projects;
    }

    @JsonProperty("projects")
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @JsonProperty("totalCount")
    public long getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalCount")
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
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
        return new HashCodeBuilder().append(projects).append(totalCount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Projects) == false) {
            return false;
        }
        Projects rhs = ((Projects) other);
        return new EqualsBuilder().append(projects, rhs.projects).append(totalCount, rhs.totalCount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
