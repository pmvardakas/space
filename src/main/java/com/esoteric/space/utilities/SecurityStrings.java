package com.esoteric.space.utilities;

import org.springframework.stereotype.Component;

@Component
public class SecurityStrings {

    private static final String API_KEY = "UM6VK8aWKJd305lIYWjDeONMIVcQ9C6kyiKhJ6K1";
    private static final String API_PREFIX = "api_key=";

    public SecurityStrings() {
        super();
    }

    public final String getApiKey() {
        return API_KEY;
    }

    public final String getApiPrefix() {
        return API_PREFIX;
    }
}
