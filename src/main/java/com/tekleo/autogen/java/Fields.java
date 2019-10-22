package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.TemplateObjects;

import java.util.Arrays;
import java.util.List;

public class Fields implements TemplateObjects {
    private List<Field> fields;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Fields(List<Field> fields) {
        this.fields = fields;
    }

    public Fields(Field ... fields) {
        this(Arrays.asList(fields));
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public List<Field> getFields() {
        return fields;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public List<Field> getTemplateObjects() {
        return fields;
    }

    @Override
    public String getDelimiter() {
        return "\n";
    }
    //------------------------------------------------------------------------------------------------------------------
}
