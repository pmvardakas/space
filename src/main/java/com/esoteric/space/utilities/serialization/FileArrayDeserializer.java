package com.esoteric.space.utilities.serialization;

import com.esoteric.space.models.project.File;
import com.esoteric.space.models.project.LibraryItem;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.IntNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileArrayDeserializer extends JsonDeserializer<List<File>> {
    Logger logger = LoggerFactory.getLogger(FileArrayDeserializer.class);

    @Override
    public List<File> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectCodec oc = p.getCodec();
        JsonNode node = oc.readTree(p);
        List<File> out = new ArrayList<File>();

        if (node.isArray()) {
            out.addAll((List<File>) p.readValuesAs(ArrayList.class));
        }

        if (node.isObject()) {
            long id = -1;
            String url = "";
            String size = "";

            if (node.has("id")) {
                id = ((IntNode) node.get("id")).longValue();
            }
            if (node.has("url")) {
                url = node.get("url").asText("");
            }
            if (node.has("size")) {
                size = node.get("size").asText("");
            }

            File item = new File(id, url, size);

            out.add(item);
        }

        return out;
    }
}
