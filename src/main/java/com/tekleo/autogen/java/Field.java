package com.tekleo.autogen.java;

public class Field {
    private String visibility;
    private String type;
    private String name;

    public Field(String visibility, String type, String name) {
        this.visibility = visibility;
        this.type = type;
        this.name = name;
    }

    public Field(String type, String name) {
        this("private", type, name);
    }

    public String getVisibility() {
        return visibility;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getFilled() {
        return getVisibility() + " " + getType() + " " + getName() + ";";
    }
}
