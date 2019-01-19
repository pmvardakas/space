
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
    "programDirector"
})
public class ProgramDirectors implements Serializable
{

    @JsonProperty("programDirector")
    private String programDirector;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2749257307937404905L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProgramDirectors() {
    }

    /**
     * 
     * @param programDirector
     */
    public ProgramDirectors(String programDirector) {
        super();
        this.programDirector = programDirector;
    }

    @JsonProperty("programDirector")
    public String getProgramDirector() {
        return programDirector;
    }

    @JsonProperty("programDirector")
    public void setProgramDirector(String programDirector) {
        this.programDirector = programDirector;
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
        return new HashCodeBuilder().append(programDirector).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramDirectors) == false) {
            return false;
        }
        ProgramDirectors rhs = ((ProgramDirectors) other);
        return new EqualsBuilder().append(programDirector, rhs.programDirector).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
