
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
    "programManager"
})
public class ProgramManagers implements Serializable
{

    @JsonProperty("programManager")
    private List<String> programManager = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7598064711317965324L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProgramManagers() {
    }

    /**
     * 
     * @param programManager
     */
    public ProgramManagers(List<String> programManager) {
        super();
        this.programManager = programManager;
    }

    @JsonProperty("programManager")
    public List<String> getProgramManager() {
        return programManager;
    }

    @JsonProperty("programManager")
    public void setProgramManager(List<String> programManager) {
        this.programManager = programManager;
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
        return new HashCodeBuilder().append(programManager).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramManagers) == false) {
            return false;
        }
        ProgramManagers rhs = ((ProgramManagers) other);
        return new EqualsBuilder().append(programManager, rhs.programManager).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
