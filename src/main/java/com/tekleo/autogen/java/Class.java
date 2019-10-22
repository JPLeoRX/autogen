package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;

import java.util.Arrays;
import java.util.List;

public class Class implements TemplateObject {
    private String className;
    private Fields fields;
    private Constructor constructor;

    public Class(String className, Fields fields, Constructor constructor) {
        this.className = className;
        this.fields = fields;
        this.constructor = constructor;
    }

    public Class(String className, Fields fields) {
        this(className, fields, new Constructor(className, fields));
    }

    @Override
    public Template getTemplate() {
        return new Template("class.template");
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair("className", className),
                new TemplateKeyValuePair("fields", fields.getFilledWithHeading("\t")),
                new TemplateKeyValuePair("constructor", constructor.getFilledWithHeading("\t"))
        );
    }
}
