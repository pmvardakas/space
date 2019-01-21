package com.esoteric.space.utilities.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArrayDeserializer extends JsonDeserializer<List<String>> {

    @Override
    public List<String> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectCodec oc = p.getCodec();
        JsonNode node = oc.readTree(p);
        List<String> out = new ArrayList<String>();

        if (node.isObject()) {
            out.add(node.asText(""));
        }

        if (node.isTextual()) {
            out.add(node.asText(""));
        }

        if (node.isArray()) {
            for (Iterator<JsonNode> i = node.iterator(); i.hasNext(); ) {
                out.add(i.next().asText(""));
            }
        }

        System.out.println("");

        return out;
    }
}
