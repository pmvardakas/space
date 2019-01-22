package com.esoteric.space.utilities.serialization;

import com.esoteric.space.models.project.File;
import com.esoteric.space.models.project.Library;
import com.esoteric.space.models.project.LibraryItem;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryDeserializer extends JsonDeserializer<Library> {

    @Override
    public Library deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectCodec oc = p.getCodec();
        JsonNode node = oc.readTree(p);
        Library library = new Library();

        if (!node.has("library")) {
            List<LibraryItem> list = new ArrayList<LibraryItem>();
            LibraryItem item = new LibraryItem();
            list.add(item);

            library.setLibraryItem(list);
        } else {

            List<LibraryItem> list = new ArrayList<LibraryItem>();
            if (node.isArray()) {
                for (Iterator<JsonNode> i = node.iterator(); i.hasNext(); ) {
                    list.add(mapNodeToLibraryItem(i.next()));
                }
            }

            if (node.isObject()) {
                list.add(mapNodeToLibraryItem(node));
            }

            library.setLibraryItem(list);
        }

        return library;
    }

    private LibraryItem mapNodeToLibraryItem(JsonNode node) {
        LibraryItem item = new LibraryItem();

        if (node.has("id")) {
            item.setId((node.get("id")).longValue());
        }
        if (node.has("title")) {
            item.setTitle(node.get("title").asText(""));
        }
        if (node.has("type")) {
            item.setType(node.get("type").asText(""));
        }
        if (node.has("description")) {
            item.setDescription(node.get("description").asText(""));
        }
        if (node.has("externalUrl")) {
            item.setExternalUrl(node.get("externalUrl").asText(""));
        }
        if (node.has("completionDate")) {
            item.setCompletionDate(node.get("completionDate").asText(""));
        }
        if (node.has("publishedBy")) {
            item.setPublishedBy(node.get("publishedBy").asText(""));
        }
        if (node.has("publishedDate")) {
            item.setPublishedDate(node.get("publishedDate").asText(""));
        }

        if (node.has("files")) {
            item.setFiles(mapNodeToFileList(node));
        }

        return item;
    }

    private List<File> mapNodeToFileList(JsonNode node) {
        List<File> files = new ArrayList<File>();

        JsonNode filesNode = node.get("files");
        if (filesNode.isArray()) {
            for (JsonNode fileNode : filesNode.findValues("file")) {
                File file = new File();
                if (fileNode.has("id")) {
                    file.setId(fileNode.get("id").longValue());
                }

                if (fileNode.has("url")) {
                    file.setUrl(fileNode.get("url").asText(""));
                }

                if (fileNode.has("size")) {
                    file.setSize(fileNode.get("size").asText(""));
                }

                files.add(file);
            }
        } else if (filesNode.isObject()) {
            JsonNode fileNode = filesNode.get("file");

            File file = new File();
            if (fileNode.has("id")) {
                file.setId(fileNode.get("id").longValue());
            }

            if (fileNode.has("url")) {
                file.setUrl(fileNode.get("url").asText(""));
            }

            if (fileNode.has("size")) {
                file.setSize(fileNode.get("size").asText(""));
            }

            files.add(file);
        }

        return files;
    }
}
