package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;

import java.util.Arrays;
import java.util.List;

public class Variable implements TemplateObject {
    private String type;
    private String name;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Variable(String type, String name) {
        this.type = type;
        this.name = name;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public Template getTemplate() {
        return new Template("variable.template");
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair("variableType", type),
                new TemplateKeyValuePair("variableName", name)
        );
    }
    //------------------------------------------------------------------------------------------------------------------
}
