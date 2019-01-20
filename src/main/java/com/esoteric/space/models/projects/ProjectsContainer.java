
package com.esoteric.space.models.projects;

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
    "projects"
})
public class ProjectsContainer implements Serializable
{

    @JsonProperty("projects")
    private Projects projects;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4590150669542061695L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProjectsContainer() {
    }

    /**
     * 
     * @param projects
     */
    public ProjectsContainer(Projects projects) {
        super();
        this.projects = projects;
    }

    @JsonProperty("projects")
    public Projects getProjects() {
        return projects;
    }

    @JsonProperty("projects")
    public void setProjects(Projects projects) {
        this.projects = projects;
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
        return new HashCodeBuilder().append(projects).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectsContainer) == false) {
            return false;
        }
        ProjectsContainer rhs = ((ProjectsContainer) other);
        return new EqualsBuilder().append(projects, rhs.projects).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
