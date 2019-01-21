package com.esoteric.space.utilities.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringArrayDeserializer extends JsonDeserializer<List<String>> {

    @Override
    public List<String> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        if (p.hasToken(JsonToken.VALUE_NULL)) {
            return new ArrayList<String>();
        } else if (p.hasToken(JsonToken.VALUE_STRING)) {
            List<String> strings = new ArrayList<String>();
            strings.add(p.getText());

            return strings;
        } else {
            JsonToken t = p.getCurrentToken();
            if (t == JsonToken.START_ARRAY) {
                return (List<String>) p.readValueAs(ArrayList.class);
            } else {
                throw new IOException(ctxt.handleUnexpectedToken(this.getClass(), p).toString());
            }
        }
    }
}
