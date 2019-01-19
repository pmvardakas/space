
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
    "benefits",
    "programDirectors",
    "responsibleProgram",
    "supportedMissionType",
    "endDate",
    "primaryTas",
    "programManagers",
    "description",
    "technologyMaturityCurrent",
    "title",
    "leadOrganization",
    "technologyMaturityEnd",
    "additionalTas",
    "lastUpdated",
    "library",
    "technologyMaturityStart",
    "responsibleMissionDirectorateOrOffice",
    "id",
    "website",
    "acronym",
    "destinations",
    "coFundingPartners",
    "projectManagers",
    "principalInvestigators",
    "startDate",
    "status"
})
public class ProjectContainer implements Serializable
{

    @JsonProperty("benefits")
    private String benefits;
    @JsonProperty("programDirectors")
    private ProgramDirectors programDirectors;
    @JsonProperty("responsibleProgram")
    private String responsibleProgram;
    @JsonProperty("supportedMissionType")
    private String supportedMissionType;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("primaryTas")
    private PrimaryTas primaryTas;
    @JsonProperty("programManagers")
    private ProgramManagers programManagers;
    @JsonProperty("description")
    private String description;
    @JsonProperty("technologyMaturityCurrent")
    private long technologyMaturityCurrent;
    @JsonProperty("title")
    private String title;
    @JsonProperty("leadOrganization")
    private LeadOrganization leadOrganization;
    @JsonProperty("technologyMaturityEnd")
    private long technologyMaturityEnd;
    @JsonProperty("additionalTas")
    private AdditionalTas additionalTas;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("library")
    private Library library;
    @JsonProperty("technologyMaturityStart")
    private long technologyMaturityStart;
    @JsonProperty("responsibleMissionDirectorateOrOffice")
    private String responsibleMissionDirectorateOrOffice;
    @JsonProperty("id")
    private long id;
    @JsonProperty("website")
    private String website;
    @JsonProperty("acronym")
    private String acronym;
    @JsonProperty("destinations")
    private Destinations destinations;
    @JsonProperty("coFundingPartners")
    private CoFundingPartners coFundingPartners;
    @JsonProperty("projectManagers")
    private ProjectManagers projectManagers;
    @JsonProperty("principalInvestigators")
    private PrincipalInvestigators principalInvestigators;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("status")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3990029537960366848L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProjectContainer() {
    }

    /**
     * 
     * @param startDate
     * @param destinations
     * @param programDirectors
     * @param coFundingPartners
     * @param endDate
     * @param supportedMissionType
     * @param id
     * @param title
     * @param technologyMaturityCurrent
     * @param description
     * @param principalInvestigators
     * @param programManagers
     * @param additionalTas
     * @param primaryTas
     * @param leadOrganization
     * @param responsibleProgram
     * @param acronym
     * @param status
     * @param website
     * @param technologyMaturityEnd
     * @param lastUpdated
     * @param responsibleMissionDirectorateOrOffice
     * @param technologyMaturityStart
     * @param library
     * @param benefits
     * @param projectManagers
     */
    public ProjectContainer(String benefits, ProgramDirectors programDirectors, String responsibleProgram, String supportedMissionType, String endDate, PrimaryTas primaryTas, ProgramManagers programManagers, String description, long technologyMaturityCurrent, String title, LeadOrganization leadOrganization, long technologyMaturityEnd, AdditionalTas additionalTas, String lastUpdated, Library library, long technologyMaturityStart, String responsibleMissionDirectorateOrOffice, long id, String website, String acronym, Destinations destinations, CoFundingPartners coFundingPartners, ProjectManagers projectManagers, PrincipalInvestigators principalInvestigators, String startDate, String status) {
        super();
        this.benefits = benefits;
        this.programDirectors = programDirectors;
        this.responsibleProgram = responsibleProgram;
        this.supportedMissionType = supportedMissionType;
        this.endDate = endDate;
        this.primaryTas = primaryTas;
        this.programManagers = programManagers;
        this.description = description;
        this.technologyMaturityCurrent = technologyMaturityCurrent;
        this.title = title;
        this.leadOrganization = leadOrganization;
        this.technologyMaturityEnd = technologyMaturityEnd;
        this.additionalTas = additionalTas;
        this.lastUpdated = lastUpdated;
        this.library = library;
        this.technologyMaturityStart = technologyMaturityStart;
        this.responsibleMissionDirectorateOrOffice = responsibleMissionDirectorateOrOffice;
        this.id = id;
        this.website = website;
        this.acronym = acronym;
        this.destinations = destinations;
        this.coFundingPartners = coFundingPartners;
        this.projectManagers = projectManagers;
        this.principalInvestigators = principalInvestigators;
        this.startDate = startDate;
        this.status = status;
    }

    @JsonProperty("benefits")
    public String getBenefits() {
        return benefits;
    }

    @JsonProperty("benefits")
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    @JsonProperty("programDirectors")
    public ProgramDirectors getProgramDirectors() {
        return programDirectors;
    }

    @JsonProperty("programDirectors")
    public void setProgramDirectors(ProgramDirectors programDirectors) {
        this.programDirectors = programDirectors;
    }

    @JsonProperty("responsibleProgram")
    public String getResponsibleProgram() {
        return responsibleProgram;
    }

    @JsonProperty("responsibleProgram")
    public void setResponsibleProgram(String responsibleProgram) {
        this.responsibleProgram = responsibleProgram;
    }

    @JsonProperty("supportedMissionType")
    public String getSupportedMissionType() {
        return supportedMissionType;
    }

    @JsonProperty("supportedMissionType")
    public void setSupportedMissionType(String supportedMissionType) {
        this.supportedMissionType = supportedMissionType;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("primaryTas")
    public PrimaryTas getPrimaryTas() {
        return primaryTas;
    }

    @JsonProperty("primaryTas")
    public void setPrimaryTas(PrimaryTas primaryTas) {
        this.primaryTas = primaryTas;
    }

    @JsonProperty("programManagers")
    public ProgramManagers getProgramManagers() {
        return programManagers;
    }

    @JsonProperty("programManagers")
    public void setProgramManagers(ProgramManagers programManagers) {
        this.programManagers = programManagers;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("technologyMaturityCurrent")
    public long getTechnologyMaturityCurrent() {
        return technologyMaturityCurrent;
    }

    @JsonProperty("technologyMaturityCurrent")
    public void setTechnologyMaturityCurrent(long technologyMaturityCurrent) {
        this.technologyMaturityCurrent = technologyMaturityCurrent;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("leadOrganization")
    public LeadOrganization getLeadOrganization() {
        return leadOrganization;
    }

    @JsonProperty("leadOrganization")
    public void setLeadOrganization(LeadOrganization leadOrganization) {
        this.leadOrganization = leadOrganization;
    }

    @JsonProperty("technologyMaturityEnd")
    public long getTechnologyMaturityEnd() {
        return technologyMaturityEnd;
    }

    @JsonProperty("technologyMaturityEnd")
    public void setTechnologyMaturityEnd(long technologyMaturityEnd) {
        this.technologyMaturityEnd = technologyMaturityEnd;
    }

    @JsonProperty("additionalTas")
    public AdditionalTas getAdditionalTas() {
        return additionalTas;
    }

    @JsonProperty("additionalTas")
    public void setAdditionalTas(AdditionalTas additionalTas) {
        this.additionalTas = additionalTas;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("library")
    public Library getLibrary() {
        return library;
    }

    @JsonProperty("library")
    public void setLibrary(Library library) {
        this.library = library;
    }

    @JsonProperty("technologyMaturityStart")
    public long getTechnologyMaturityStart() {
        return technologyMaturityStart;
    }

    @JsonProperty("technologyMaturityStart")
    public void setTechnologyMaturityStart(long technologyMaturityStart) {
        this.technologyMaturityStart = technologyMaturityStart;
    }

    @JsonProperty("responsibleMissionDirectorateOrOffice")
    public String getResponsibleMissionDirectorateOrOffice() {
        return responsibleMissionDirectorateOrOffice;
    }

    @JsonProperty("responsibleMissionDirectorateOrOffice")
    public void setResponsibleMissionDirectorateOrOffice(String responsibleMissionDirectorateOrOffice) {
        this.responsibleMissionDirectorateOrOffice = responsibleMissionDirectorateOrOffice;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("acronym")
    public String getAcronym() {
        return acronym;
    }

    @JsonProperty("acronym")
    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @JsonProperty("destinations")
    public Destinations getDestinations() {
        return destinations;
    }

    @JsonProperty("destinations")
    public void setDestinations(Destinations destinations) {
        this.destinations = destinations;
    }

    @JsonProperty("coFundingPartners")
    public CoFundingPartners getCoFundingPartners() {
        return coFundingPartners;
    }

    @JsonProperty("coFundingPartners")
    public void setCoFundingPartners(CoFundingPartners coFundingPartners) {
        this.coFundingPartners = coFundingPartners;
    }

    @JsonProperty("projectManagers")
    public ProjectManagers getProjectManagers() {
        return projectManagers;
    }

    @JsonProperty("projectManagers")
    public void setProjectManagers(ProjectManagers projectManagers) {
        this.projectManagers = projectManagers;
    }

    @JsonProperty("principalInvestigators")
    public PrincipalInvestigators getPrincipalInvestigators() {
        return principalInvestigators;
    }

    @JsonProperty("principalInvestigators")
    public void setPrincipalInvestigators(PrincipalInvestigators principalInvestigators) {
        this.principalInvestigators = principalInvestigators;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
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
        return new HashCodeBuilder().append(startDate).append(destinations).append(programDirectors).append(coFundingPartners).append(endDate).append(id).append(supportedMissionType).append(title).append(technologyMaturityCurrent).append(description).append(principalInvestigators).append(programManagers).append(additionalTas).append(primaryTas).append(leadOrganization).append(acronym).append(responsibleProgram).append(status).append(website).append(lastUpdated).append(technologyMaturityEnd).append(responsibleMissionDirectorateOrOffice).append(technologyMaturityStart).append(additionalProperties).append(library).append(benefits).append(projectManagers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectContainer) == false) {
            return false;
        }
        ProjectContainer rhs = ((ProjectContainer) other);
        return new EqualsBuilder().append(startDate, rhs.startDate).append(destinations, rhs.destinations).append(programDirectors, rhs.programDirectors).append(coFundingPartners, rhs.coFundingPartners).append(endDate, rhs.endDate).append(id, rhs.id).append(supportedMissionType, rhs.supportedMissionType).append(title, rhs.title).append(technologyMaturityCurrent, rhs.technologyMaturityCurrent).append(description, rhs.description).append(principalInvestigators, rhs.principalInvestigators).append(programManagers, rhs.programManagers).append(additionalTas, rhs.additionalTas).append(primaryTas, rhs.primaryTas).append(leadOrganization, rhs.leadOrganization).append(acronym, rhs.acronym).append(responsibleProgram, rhs.responsibleProgram).append(status, rhs.status).append(website, rhs.website).append(lastUpdated, rhs.lastUpdated).append(technologyMaturityEnd, rhs.technologyMaturityEnd).append(responsibleMissionDirectorateOrOffice, rhs.responsibleMissionDirectorateOrOffice).append(technologyMaturityStart, rhs.technologyMaturityStart).append(additionalProperties, rhs.additionalProperties).append(library, rhs.library).append(benefits, rhs.benefits).append(projectManagers, rhs.projectManagers).isEquals();
    }

}
