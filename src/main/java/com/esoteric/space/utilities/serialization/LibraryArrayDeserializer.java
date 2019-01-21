package com.esoteric.space.utilities.serialization;

import com.esoteric.space.models.project.File;
import com.esoteric.space.models.project.LibraryItem;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.LongNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryArrayDeserializer extends JsonDeserializer<List<LibraryItem>> {

    @Override
    public List<LibraryItem> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectCodec oc = p.getCodec();
        JsonNode node = oc.readTree(p);
        List<LibraryItem> out = new ArrayList<LibraryItem>();

        if (node.isArray()) {
            out.addAll((List<LibraryItem>) p.readValuesAs(ArrayList.class));
        }

        if (node.isObject()) {
            long id = -1;
            String title = "";
            String type = "";
            List<File> files = new ArrayList<File>();
            String description = "";
            String externalUrl = "";
            String completionDate = "";
            String publishedBy = "";
            String publishedDate = "";

            if (node.has("id")) {
                id = ((IntNode) node.get("id")).longValue();
            }
            if (node.has("title")) {
                title = node.get("title").asText("");
            }
            if (node.has("type")) {
                type = node.get("type").asText("");
            }
            if (node.has("description")) {
                description = node.get("description").asText("");
            }
            if (node.has("externalUrl")) {
                externalUrl = node.get("externalUrl").asText("");
            }
            if (node.has("completionDate")) {
                completionDate = node.get("completionDate").asText("");
            }
            if (node.has("publishedBy")) {
                publishedBy = node.get("publishedBy").asText("");
            }
            if (node.has("publishedDate")) {
                publishedDate = node.get("publishedDate").asText("");
            }

            if (node.has("files")) {
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
            }

            LibraryItem item = new LibraryItem(id, title, type, files, description, externalUrl, completionDate, publishedBy, publishedDate);

            out.add(item);
        }

        return out;
    }
}
