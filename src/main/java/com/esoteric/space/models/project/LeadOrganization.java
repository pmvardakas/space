
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
    "acronym",
    "city",
    "name",
    "state",
    "type"
})
public class LeadOrganization implements Serializable
{

    @JsonProperty("acronym")
    private String acronym;
    @JsonProperty("city")
    private String city;
    @JsonProperty("name")
    private String name;
    @JsonProperty("state")
    private String state;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8242438072350789710L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LeadOrganization() {
    }

    /**
     * 
     * @param acronym
     * @param name
     * @param state
     * @param type
     * @param city
     */
    public LeadOrganization(String acronym, String city, String name, String state, String type) {
        super();
        this.acronym = acronym;
        this.city = city;
        this.name = name;
        this.state = state;
        this.type = type;
    }

    @JsonProperty("acronym")
    public String getAcronym() {
        return acronym;
    }

    @JsonProperty("acronym")
    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
        return new HashCodeBuilder().append(acronym).append(additionalProperties).append(name).append(state).append(type).append(city).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeadOrganization) == false) {
            return false;
        }
        LeadOrganization rhs = ((LeadOrganization) other);
        return new EqualsBuilder().append(acronym, rhs.acronym).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(state, rhs.state).append(type, rhs.type).append(city, rhs.city).isEquals();
    }

}
