
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
    "principalInvestigator"
})
public class PrincipalInvestigators implements Serializable
{

    @JsonProperty("principalInvestigator")
    private String principalInvestigator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1627287175203865173L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PrincipalInvestigators() {
    }

    /**
     * 
     * @param principalInvestigator
     */
    public PrincipalInvestigators(String principalInvestigator) {
        super();
        this.principalInvestigator = principalInvestigator;
    }

    @JsonProperty("principalInvestigator")
    public String getPrincipalInvestigator() {
        return principalInvestigator;
    }

    @JsonProperty("principalInvestigator")
    public void setPrincipalInvestigator(String principalInvestigator) {
        this.principalInvestigator = principalInvestigator;
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
        return new HashCodeBuilder().append(additionalProperties).append(principalInvestigator).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrincipalInvestigators) == false) {
            return false;
        }
        PrincipalInvestigators rhs = ((PrincipalInvestigators) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(principalInvestigator, rhs.principalInvestigator).isEquals();
    }

}
