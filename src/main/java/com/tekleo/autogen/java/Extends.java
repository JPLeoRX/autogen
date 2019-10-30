package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;

import java.util.Arrays;
import java.util.List;

public class Extends implements TemplateObject {
    private String parentClassName;

    public Extends(String parentClassName) {
        this.parentClassName = parentClassName;
    }

    @Override
    public Template getTemplate() {
        return new Template("extends.template");
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair("parentClassName", parentClassName)
        );
    }
}
