
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
    "technologyAreas"
})
public class PrimaryTas implements Serializable
{

    @JsonProperty("technologyAreas")
    private List<TechnologyArea> technologyAreas = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5175132637283939803L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PrimaryTas() {
    }

    /**
     * 
     * @param technologyAreas
     */
    public PrimaryTas(List<TechnologyArea> technologyAreas) {
        super();
        this.technologyAreas = technologyAreas;
    }

    @JsonProperty("technologyAreas")
    public List<TechnologyArea> getTechnologyAreas() {
        return technologyAreas;
    }

    @JsonProperty("technologyAreas")
    public void setTechnologyAreas(List<TechnologyArea> technologyAreas) {
        this.technologyAreas = technologyAreas;
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
        return new HashCodeBuilder().append(additionalProperties).append(technologyAreas).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrimaryTas) == false) {
            return false;
        }
        PrimaryTas rhs = ((PrimaryTas) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(technologyAreas, rhs.technologyAreas).isEquals();
    }

}
