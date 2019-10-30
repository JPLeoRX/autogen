package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.*;

import java.util.Arrays;
import java.util.List;

public class Field implements TemplateObject {
    private List<String> annotations;
    private String visibility;
    private Variable variable;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Field(List<String> annotations, String visibility, Variable variable) {
        this.annotations = annotations;
        this.visibility = visibility;
        this.variable = variable;
    }

    public Field(String visibility, Variable variable) {
        this(null, visibility, variable);
    }

    public Field(Variable variable) {
        this(null, "private", variable);
    }

    public Field(List<String> annotations, String visibility, String type, String name) {
        this(annotations, visibility, new Variable(type, name));
    }

    public Field(String visibility, String type, String name) {
        this(null, visibility, type, name);
    }

    public Field(String type, String name) {
        this(null, "private", type, name);
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public List<String> getAnnotations() {
        return annotations;
    }

    public String getVisibility() {
        return visibility;
    }

    public Variable getVariable() {
        return variable;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public Template getTemplate() {
        return new Template("field.template");
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                annotations == null ? new TemplateKeyValuePair("fieldAnnotations", "") : new TemplateKeyValuePair("fieldAnnotations", String.join(" ", annotations)),
                new TemplateKeyValuePair("fieldVisibility", visibility),
                new TemplateKeyValuePair("fieldVariable", variable.getFilled())
        );
    }

    @Override
    public String getFilled() {
        return TemplateObject.super.getFilled().replace("  ", " ");
    }
    //------------------------------------------------------------------------------------------------------------------
}
