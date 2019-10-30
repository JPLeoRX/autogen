package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;

import java.util.Arrays;
import java.util.List;

public class Class implements TemplateObject {
    private String className;
    private Extends anExtends;
    private Implements anImplements;
    private Fields fields;
    private Constructor constructor;

    public Class(String className, Extends anExtends, Implements anImplements, Fields fields, Constructor constructor) {
        this.className = className;
        this.anExtends = anExtends;
        this.anImplements = anImplements;
        this.fields = fields;
        this.constructor = constructor;
    }

    public Class(String className, String extendsParentClass, List<String> implementsParentClasses, Fields fields) {
        this(className, extendsParentClass == null ? null : new Extends(extendsParentClass), implementsParentClasses == null || implementsParentClasses.isEmpty() ? null : new Implements(implementsParentClasses), fields, new Constructor(className, fields));
    }

    public Class(String className, Fields fields) {
        this(className, null, null, fields);
    }

    @Override
    public Template getTemplate() {
        return new Template("class.template");
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair("className", className),
                anExtends == null ? new TemplateKeyValuePair("extends", "") : new TemplateKeyValuePair("extends", anExtends.getFilled()),
                anImplements == null ? new TemplateKeyValuePair("implements", "") : new TemplateKeyValuePair("implements", anImplements.getFilled()),
                new TemplateKeyValuePair("fields", fields.getFilledWithHeading("\t")),
                new TemplateKeyValuePair("constructor", constructor.getFilledWithHeading("\t"))
        );
    }

    @Override
    public String getFilled() {
        return TemplateObject.super.getFilled().replace("   ", " ").replace("  ", " ");
    }
}
