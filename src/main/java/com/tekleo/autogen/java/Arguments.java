package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.TemplateObjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arguments implements TemplateObjects {
    private List<String> argumentsList;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Arguments(List<String> arguments) {
        this.argumentsList = arguments;
    }

    public Arguments(String ... arguments) {
        this(Arrays.asList(arguments));
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public List<String> getArgumentsList() {
        return argumentsList;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public List<String> getTemplateObjects() {
        return argumentsList;
    }

    @Override
    public String getDelimiter() {
        return ", ";
    }

    @Override
    public String getFilled() {
        return String.join(getDelimiter(), getTemplateObjects());
    }
    //------------------------------------------------------------------------------------------------------------------
}
