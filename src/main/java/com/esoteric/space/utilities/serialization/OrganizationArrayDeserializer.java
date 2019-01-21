package com.esoteric.space.utilities.serialization;

import com.esoteric.space.models.project.Organization;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrganizationArrayDeserializer extends JsonDeserializer<List<Organization>> {

    @Override
    public List<Organization> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectCodec oc = p.getCodec();
        JsonNode node = oc.readTree(p);
        List<Organization> out = new ArrayList<Organization>();

        if (node.isArray()) {
            for (Iterator<JsonNode> i = node.iterator(); i.hasNext(); ) {
                out.add(mapNodeToOrganization(i.next()));
            }
        }

        if (node.isObject()) {
            out.add(mapNodeToOrganization(node));
        }

        return out;
    }

    private Organization mapNodeToOrganization(JsonNode node) {
        Organization item = new Organization();

        if (node.has("name")) {
            item.setName((node.get("name")).asText(""));
        }
        if (node.has("acronym")) {
            item.setAcronym(node.get("acronym").asText(""));
        }
        if (node.has("city")) {
            item.setCity(node.get("city").asText(""));
        }
        if (node.has("state")) {
            item.setState(node.get("state").asText(""));
        }

        return item;
    }
}
