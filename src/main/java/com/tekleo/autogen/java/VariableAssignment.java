package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;

import java.util.Arrays;
import java.util.List;

public class VariableAssignment implements TemplateObject {
    private String nameA;
    private String nameB;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public VariableAssignment(String nameA, String nameB) {
        this.nameA = nameA;
        this.nameB = nameB;
    }

    public VariableAssignment(Variable variableA, Variable variableB) {
        this(variableA.getName(), variableB.getName());
        if (!variableA.getType().equals(variableB.getType()))
            throw new IllegalArgumentException();
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getNameA() {
        return nameA;
    }

    public String getNameB() {
        return nameB;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public Template getTemplate() {
        return new Template("variable-assignment.template");
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair("variableNameA", nameA),
                new TemplateKeyValuePair("variableNameB", nameB)
        );
    }
    //------------------------------------------------------------------------------------------------------------------
}
