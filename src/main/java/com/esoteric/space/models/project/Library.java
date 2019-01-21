package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.LibraryArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class Library {
    @JsonDeserialize(using = LibraryArrayDeserializer.class)
    private List<LibraryItem> libraryItem;

    public Library() {
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
}
