package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.TemplateObjects;

import java.util.Arrays;
import java.util.List;

public class Constructors implements TemplateObjects {
    private List<Constructor> fields;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Constructors(List<Constructor> fields) {
        this.fields = fields;
    }

    public Constructors(Constructor ... fields) {
        this(Arrays.asList(fields));
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public List<Constructor> getFields() {
        return fields;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public List<Constructor> getTemplateObjects() {
        return fields;
    }

    @Override
    public String getDelimiter() {
        return "\n\n";
    }
    //------------------------------------------------------------------------------------------------------------------
}
