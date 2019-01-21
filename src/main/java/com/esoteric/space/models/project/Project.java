package com.esoteric.space.models.project;

import com.esoteric.space.models.projects.Projects;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

public class Project implements Serializable {
    private long id;
    private String lastUpdated;
    private String title;
    private String acronym;
    private String status;
    private String description;
    private String benefits;
    private String startDate;
    private String endDate;
    private String executiveSummary;
    private String technologyMaturityStart;
    private String technologyMaturityCurrent;
    private String technologyMaturityEnd;
    private TechnologyAreas primaryTas;
    private String additionalTas;
    private Destinations destinations;
    private String supportedMissionType;
    private String responsibleProgram;
    private String responsibleMissionDirectorateOrOffice;
    private Organization leadOrganization;
    private Organizations supportingOrganizations;
    private Organizations coFundingPartners;
    private WorkLocations workLocations;
    private ProgramDirectors programDirectors;
    private ProgramManagers programManagers;
    private ProjectManagers projectManagers;
    private PrincipalInvestigators principalInvestigators;
    private CoInvestigators coInvestigators;
    private String website;
    private Library library;

    public Project() {
    }

    public Project(long id, String lastUpdated, String title, String acronym, String status, String description, String benefits, String startDate, String endDate, String executiveSummary, String technologyMaturityStart, String technologyMaturityCurrent, String technologyMaturityEnd, TechnologyAreas primaryTas, String additionalTas, Destinations destinations, String supportedMissionType, String responsibleProgram, String responsibleMissionDirectorateOrOffice, Organization leadOrganization, Organizations supportingOrganizations, Organizations coFundingPartners, WorkLocations workLocations, ProgramDirectors programDirectors, ProgramManagers programManagers, ProjectManagers projectManagers, PrincipalInvestigators principalInvestigators, CoInvestigators coInvestigators, String website, Library library) {
        this.id = id;
        this.lastUpdated = lastUpdated;
        this.title = title;
        this.acronym = acronym;
        this.status = status;
        this.description = description;
        this.benefits = benefits;
        this.startDate = startDate;
        this.endDate = endDate;
        this.executiveSummary = executiveSummary;
        this.technologyMaturityStart = technologyMaturityStart;
        this.technologyMaturityCurrent = technologyMaturityCurrent;
        this.technologyMaturityEnd = technologyMaturityEnd;
        this.primaryTas = primaryTas;
        this.additionalTas = additionalTas;
        this.destinations = destinations;
        this.supportedMissionType = supportedMissionType;
        this.responsibleProgram = responsibleProgram;
        this.responsibleMissionDirectorateOrOffice = responsibleMissionDirectorateOrOffice;
        this.leadOrganization = leadOrganization;
        this.supportingOrganizations = supportingOrganizations;
        this.coFundingPartners = coFundingPartners;
        this.workLocations = workLocations;
        this.programDirectors = programDirectors;
        this.programManagers = programManagers;
        this.projectManagers = projectManagers;
        this.principalInvestigators = principalInvestigators;
        this.coInvestigators = coInvestigators;
        this.website = website;
        this.library = library;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getExecutiveSummary() {
        return executiveSummary;
    }

    public void setExecutiveSummary(String executiveSummary) {
        this.executiveSummary = executiveSummary;
    }

    public String getTechnologyMaturityStart() {
        return technologyMaturityStart;
    }

    public void setTechnologyMaturityStart(String technologyMaturityStart) {
        this.technologyMaturityStart = technologyMaturityStart;
    }

    public String getTechnologyMaturityCurrent() {
        return technologyMaturityCurrent;
    }

    public void setTechnologyMaturityCurrent(String technologyMaturityCurrent) {
        this.technologyMaturityCurrent = technologyMaturityCurrent;
    }

    public String getTechnologyMaturityEnd() {
        return technologyMaturityEnd;
    }

    public void setTechnologyMaturityEnd(String technologyMaturityEnd) {
        this.technologyMaturityEnd = technologyMaturityEnd;
    }

    public TechnologyAreas getPrimaryTas() {
        return primaryTas;
    }

    public void setPrimaryTas(TechnologyAreas primaryTas) {
        this.primaryTas = primaryTas;
    }

    public String getAdditionalTas() {
        return additionalTas;
    }

    public void setAdditionalTas(String additionalTas) {
        this.additionalTas = additionalTas;
    }

    public Destinations getDestinations() {
        return destinations;
    }

    public void setDestinations(Destinations destinations) {
        this.destinations = destinations;
    }

    public String getSupportedMissionType() {
        return supportedMissionType;
    }

    public void setSupportedMissionType(String supportedMissionType) {
        this.supportedMissionType = supportedMissionType;
    }

    public String getResponsibleProgram() {
        return responsibleProgram;
    }

    public void setResponsibleProgram(String responsibleProgram) {
        this.responsibleProgram = responsibleProgram;
    }

    public String getResponsibleMissionDirectorateOrOffice() {
        return responsibleMissionDirectorateOrOffice;
    }

    public void setResponsibleMissionDirectorateOrOffice(String responsibleMissionDirectorateOrOffice) {
        this.responsibleMissionDirectorateOrOffice = responsibleMissionDirectorateOrOffice;
    }

    public Organization getLeadOrganization() {
        return leadOrganization;
    }

    public void setLeadOrganization(Organization leadOrganization) {
        this.leadOrganization = leadOrganization;
    }

    public Organizations getSupportingOrganizations() {
        return supportingOrganizations;
    }

    public void setSupportingOrganizations(Organizations supportingOrganizations) {
        this.supportingOrganizations = supportingOrganizations;
    }

    public Organizations getCoFundingPartners() {
        return coFundingPartners;
    }

    public void setCoFundingPartners(Organizations coFundingPartners) {
        this.coFundingPartners = coFundingPartners;
    }

    public WorkLocations getWorkLocations() {
        return workLocations;
    }

    public void setWorkLocations(WorkLocations workLocations) {
        this.workLocations = workLocations;
    }

    public ProgramDirectors getProgramDirectors() {
        return programDirectors;
    }

    public void setProgramDirectors(ProgramDirectors programDirectors) {
        this.programDirectors = programDirectors;
    }

    public ProgramManagers getProgramManagers() {
        return programManagers;
    }

    public void setProgramManagers(ProgramManagers programManagers) {
        this.programManagers = programManagers;
    }

    public ProjectManagers getProjectManagers() {
        return projectManagers;
    }

    public void setProjectManagers(ProjectManagers projectManagers) {
        this.projectManagers = projectManagers;
    }

    public PrincipalInvestigators getPrincipalInvestigators() {
        return principalInvestigators;
    }

    public void setPrincipalInvestigators(PrincipalInvestigators principalInvestigators) {
        this.principalInvestigators = principalInvestigators;
    }

    public CoInvestigators getCoInvestigators() {
        return coInvestigators;
    }

    public void setCoInvestigators(CoInvestigators coInvestigators) {
        this.coInvestigators = coInvestigators;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
