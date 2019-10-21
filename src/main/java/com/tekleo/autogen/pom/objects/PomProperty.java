package com.tekleo.autogen.pom.objects;

import com.tekleo.autogen.pom.PomTemplateKeys;
import com.tekleo.autogen.pom.PomTemplates;
import com.tekleo.autogen.template_engine.*;

import java.util.Arrays;
import java.util.List;

public class PomProperty implements TemplateObject {
    private String key;
    private String value;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public PomProperty(String key, String value) {
        this.key = key;
        this.value = value;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public Template getTemplate() {
        return PomTemplates.PROPERTY;
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair(PomTemplateKeys.PROPERTY_KEY, new TemplateValue(key)),
                new TemplateKeyValuePair(PomTemplateKeys.PROPERTY_VALUE, new TemplateValue(value))
        );
    }
    //------------------------------------------------------------------------------------------------------------------
}
