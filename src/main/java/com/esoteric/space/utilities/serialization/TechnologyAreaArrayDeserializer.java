package com.esoteric.space.utilities.serialization;

import com.esoteric.space.models.project.File;
import com.esoteric.space.models.project.LibraryItem;
import com.esoteric.space.models.project.TechnologyArea;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TechnologyAreaArrayDeserializer extends JsonDeserializer<List<TechnologyArea>> {

    @Override
    public List<TechnologyArea> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectCodec oc = p.getCodec();
        JsonNode node = oc.readTree(p);
        List<TechnologyArea> out = new ArrayList<TechnologyArea>();

        if (node.isArray()) {
            for (Iterator<JsonNode> i = node.iterator(); i.hasNext(); ) {
                out.add(mapNodeToTechnologyArea(i.next()));
            }
        }

        if (node.isObject()) {
            out.add(mapNodeToTechnologyArea(node));
        }

        return out;
    }

    private TechnologyArea mapNodeToTechnologyArea(JsonNode node) {
        TechnologyArea item = new TechnologyArea();

        if (node.has("id")) {
            item.setId((node.get("id")).longValue());
        }
        if (node.has("code")) {
            item.setCode(node.get("code").asText(""));
        }
        if (node.has("name")) {
            item.setName(node.get("name").asText(""));
        }

        return item;
    }
}
