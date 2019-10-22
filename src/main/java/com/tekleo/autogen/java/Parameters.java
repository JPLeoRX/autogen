package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.TemplateObjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Parameters implements TemplateObjects {
    private List<Variable> variables;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Parameters(List<Variable> variables) {
        this.variables = variables;
    }

    public Parameters(Variable ... variables) {
        this(Arrays.asList(variables));
    }

    public Parameters(Fields fields) {
        this(fields.getFields().stream().map(Field::getVariable).collect(Collectors.toList()));
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public List<Variable> getVariables() {
        return variables;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public List<Variable> getTemplateObjects() {
        return variables;
    }

    @Override
    public String getDelimiter() {
        return ", ";
    }
    //------------------------------------------------------------------------------------------------------------------
}
