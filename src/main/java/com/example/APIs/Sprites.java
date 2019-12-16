package com.example.APIs;

import java.util.HashMap;
import java.util.Map;

public class Sprites {

    private String normal;
    private String animated;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getAnimated() {
        return animated;
    }

    public void setAnimated(String animated) {
        this.animated = animated;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
