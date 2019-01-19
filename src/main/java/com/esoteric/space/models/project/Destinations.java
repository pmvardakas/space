
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
    "destination"
})
public class Destinations implements Serializable
{

    @JsonProperty("destination")
    private List<String> destination = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4746353977846968750L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Destinations() {
    }

    /**
     * 
     * @param destination
     */
    public Destinations(List<String> destination) {
        super();
        this.destination = destination;
    }

    @JsonProperty("destination")
    public List<String> getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(List<String> destination) {
        this.destination = destination;
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
        return new HashCodeBuilder().append(additionalProperties).append(destination).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Destinations) == false) {
            return false;
        }
        Destinations rhs = ((Destinations) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(destination, rhs.destination).isEquals();
    }

}
