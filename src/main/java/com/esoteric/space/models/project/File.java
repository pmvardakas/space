package com.esoteric.space.models.project;

import java.io.Serializable;
import java.util.Objects;

public class File implements Serializable {
    private long id;
    private String url;
    private String size;

    public File() {
        this.id = -1;
        this.url = "";
        this.size = "";
    }

    public File(long id, String url, String size) {
        this.id = id;
        this.url = url;
        this.size = size;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return id == file.id &&
                Objects.equals(url, file.url) &&
                Objects.equals(size, file.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, size);
    }
}
