
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
    "projectManager"
})
public class ProjectManagers implements Serializable
{

    @JsonProperty("projectManager")
    private String projectManager;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3506839177099179756L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProjectManagers() {
    }

    /**
     * 
     * @param projectManager
     */
    public ProjectManagers(String projectManager) {
        super();
        this.projectManager = projectManager;
    }

    @JsonProperty("projectManager")
    public String getProjectManager() {
        return projectManager;
    }

    @JsonProperty("projectManager")
    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
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
        return new HashCodeBuilder().append(additionalProperties).append(projectManager).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectManagers) == false) {
            return false;
        }
        ProjectManagers rhs = ((ProjectManagers) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(projectManager, rhs.projectManager).isEquals();
    }

}
