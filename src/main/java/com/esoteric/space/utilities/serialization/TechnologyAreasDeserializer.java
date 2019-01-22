package com.esoteric.space.utilities.serialization;

import com.esoteric.space.models.project.File;
import com.esoteric.space.models.project.LibraryItem;
import com.esoteric.space.models.project.TechnologyArea;
import com.esoteric.space.models.project.TechnologyAreas;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TechnologyAreasDeserializer extends JsonDeserializer<TechnologyAreas> {

    @Override
    public TechnologyAreas deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectCodec oc = p.getCodec();
        JsonNode node = oc.readTree(p);
        TechnologyAreas out = new TechnologyAreas();
        List<TechnologyArea> list = new ArrayList<>();

        if (!node.has("technologyAreas")) {
            TechnologyArea techArea = new TechnologyArea();
            list.add(techArea);
        } else {
            JsonNode technologyAreasNode = node.get("technologyAreas");
            if (technologyAreasNode.isArray()) {
                for (Iterator<JsonNode> i = technologyAreasNode.iterator(); i.hasNext(); ) {
                    list.add(mapNodeToTechnologyArea(i.next()));
                }
            }

            if (technologyAreasNode.isObject()) {
                list.add(mapNodeToTechnologyArea(technologyAreasNode));
            }
        }

        out.setTechnologyAreas(list);

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
