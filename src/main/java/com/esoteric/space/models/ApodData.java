package com.esoteric.space.models;

import java.io.Serializable;
import java.util.Objects;

public class ApodData implements Serializable {
    private String copyright;
    private String date;
    private String explanation;
    private String hdurl;
    private String url;
    private String media_type;
    private String service_version;
    private String title;

    public ApodData() {
        this.copyright = "";
        this.date = "";
        this.explanation = "";
        this.hdurl = "";
        this.url = "";
        this.media_type = "";
        this.service_version = "";
        this.title = "";
    }

    public ApodData(String copyright, String date, String explanation, String hdurl, String url, String media_type, String service_version, String title) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.hdurl = hdurl;
        this.url = url;
        this.media_type = media_type;
        this.service_version = service_version;
        this.title = title;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getHdurl() {
        return hdurl;
    }

    public void setHdurl(String hdurl) {
        this.hdurl = hdurl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public String getService_version() {
        return service_version;
    }

    public void setService_version(String service_version) {
        this.service_version = service_version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApodData apodData = (ApodData) o;
        return Objects.equals(copyright, apodData.copyright) &&
                Objects.equals(date, apodData.date) &&
                Objects.equals(explanation, apodData.explanation) &&
                Objects.equals(hdurl, apodData.hdurl) &&
                Objects.equals(url, apodData.url) &&
                Objects.equals(media_type, apodData.media_type) &&
                Objects.equals(service_version, apodData.service_version) &&
                Objects.equals(title, apodData.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(copyright, date, explanation, hdurl, url, media_type, service_version, title);
    }
}
