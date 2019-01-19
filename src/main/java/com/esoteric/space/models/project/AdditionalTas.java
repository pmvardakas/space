
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
public class AdditionalTas implements Serializable
{

    @JsonProperty("technologyAreas")
    private List<TechnologyAreaContainer> technologyAreas = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8906387179384690350L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AdditionalTas() {
    }

    /**
     * 
     * @param technologyAreas
     */
    public AdditionalTas(List<TechnologyAreaContainer> technologyAreas) {
        super();
        this.technologyAreas = technologyAreas;
    }

    @JsonProperty("technologyAreas")
    public List<TechnologyAreaContainer> getTechnologyAreas() {
        return technologyAreas;
    }

    @JsonProperty("technologyAreas")
    public void setTechnologyAreas(List<TechnologyAreaContainer> technologyAreas) {
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
        if ((other instanceof AdditionalTas) == false) {
            return false;
        }
        AdditionalTas rhs = ((AdditionalTas) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(technologyAreas, rhs.technologyAreas).isEquals();
    }

}
