package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.LibraryArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library implements Serializable {
    @JsonDeserialize(using = LibraryArrayDeserializer.class)
    private List<LibraryItem> libraryItem;

    public Library() {
        this.libraryItem = new ArrayList<LibraryItem>();
        this.libraryItem.add(new LibraryItem());
    }

    public Library(List<LibraryItem> libraryItem) {
        this.libraryItem = libraryItem;
    }

    public List<LibraryItem> getLibraryItem() {
        return libraryItem;
    }

    public void setLibraryItem(List<LibraryItem> libraryItem) {
        this.libraryItem = libraryItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(libraryItem, library.libraryItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libraryItem);
    }
}
