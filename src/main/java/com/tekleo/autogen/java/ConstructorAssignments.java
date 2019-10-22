package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.TemplateObjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorAssignments implements TemplateObjects {
    private List<ConstructorAssignment> assignments;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public ConstructorAssignments(List<ConstructorAssignment> assignments) {
        this.assignments = assignments;
    }

    public ConstructorAssignments(ConstructorAssignment ... assignments) {
        this(Arrays.asList(assignments));
    }

    public ConstructorAssignments(Parameters parameters) {
        this(parameters.getVariables().stream().map(ConstructorAssignment::new).collect(Collectors.toList()));
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public List<ConstructorAssignment> getTemplateObjects() {
        return assignments;
    }

    @Override
    public String getDelimiter() {
        return "\n";
    }
    //------------------------------------------------------------------------------------------------------------------
}
