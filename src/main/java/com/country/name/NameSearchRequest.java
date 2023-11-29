package com.country.name;

import java.beans.ConstructorProperties;

public class NameSearchRequest {
    private String startsWith;
    private String endsWith;
    private String contains;
@ConstructorProperties({"prefix","suffix","contains"})
    public NameSearchRequest(String startsWith, String endsWith, String contains) {
        this.startsWith = startsWith;
        this.endsWith = endsWith;
        this.contains = contains;
    }

    public String getStartsWith() {
        return startsWith == null ? "": startsWith;
    }

    public void setStartsWith(String startsWith) {
        this.startsWith = startsWith;
    }

    public String getEndsWith() {
        return endsWith == null ? "": endsWith;
    }

    public void setEndsWith(String endsWith) {
        this.endsWith = endsWith;
    }

    public String getContains() {
        return contains == null ? "": contains;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }
}
