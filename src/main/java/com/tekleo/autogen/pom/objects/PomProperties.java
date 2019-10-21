package com.tekleo.autogen.pom.objects;

import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;

import java.util.Arrays;
import java.util.List;

public class PomProperties implements TemplateObject {
    private List<PomProperty> properties;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public PomProperties(List<PomProperty> properties) {
        this.properties = properties;
    }

    public PomProperties(PomProperty ... properties) {
        this(Arrays.asList(properties));
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public Template getTemplate() {
        throw new RuntimeException();
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        throw new RuntimeException();
    }

    @Override
    public String getFilled() {
        String s = "";
        for (PomProperty property : properties)
            s = s + property.getFilled() + "\n";
        return s.trim();
    }
    //------------------------------------------------------------------------------------------------------------------
}
