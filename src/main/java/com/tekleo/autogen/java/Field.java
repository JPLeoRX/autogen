package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.*;

import java.util.Arrays;
import java.util.List;

public class Field implements TemplateObject {
    private String visibility;
    private Variable variable;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Field(String visibility, Variable variable) {
        this.visibility = visibility;
        this.variable = variable;
    }

    public Field(Variable variable) {
        this("private", variable);
    }

    public Field(String visibility, String type, String name) {
        this(visibility, new Variable(type, name));
    }

    public Field(String type, String name) {
        this("private", type, name);
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
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
                new TemplateKeyValuePair("fieldVisibility", visibility),
                new TemplateKeyValuePair("fieldVariable", variable.getFilled())
        );
    }
    //------------------------------------------------------------------------------------------------------------------
}
