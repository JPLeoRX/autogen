package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.TemplateObjects;

import java.util.Arrays;
import java.util.List;

public class VariableAssignments implements TemplateObjects {
    private List<VariableAssignment> assignments;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public VariableAssignments(List<VariableAssignment> assignments) {
        this.assignments = assignments;
    }

    public VariableAssignments(VariableAssignment ... assignments) {
        this(Arrays.asList(assignments));
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public List<VariableAssignment> getTemplateObjects() {
        return assignments;
    }

    @Override
    public String getDelimiter() {
        return "\n";
    }
    //------------------------------------------------------------------------------------------------------------------
}
