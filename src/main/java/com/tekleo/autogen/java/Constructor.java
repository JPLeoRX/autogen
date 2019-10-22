package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;

import java.util.Arrays;
import java.util.List;

public class Constructor implements TemplateObject {
    private String visibility;
    private String className;
    private Parameters parameters;
    private ConstructorAssignments assignments;

    public Constructor(String visibility, String className, Parameters parameters, ConstructorAssignments assignments) {
        this.visibility = visibility;
        this.className = className;
        this.parameters = parameters;
        this.assignments = assignments;
    }

    public Constructor(String visibility, String className) {
        this(visibility, className, new Parameters(), new ConstructorAssignments());
    }

    public Constructor(String visibility, String className, Parameters parameters) {
        this(visibility, className, parameters, new ConstructorAssignments(parameters));
    }

    public Constructor(String visibility, String className, Fields fields) {
        this(visibility, className, new Parameters(fields));
    }

    public Constructor(String className, Fields fields) {
        this("public", className, fields);
    }

    @Override
    public Template getTemplate() {
        return new Template("constructor.template");
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair("visibility", visibility),
                new TemplateKeyValuePair("className", className),
                new TemplateKeyValuePair("parameters", parameters.getFilled()),
                new TemplateKeyValuePair("assignments", assignments.getFilledWithHeading("\t"))
        );
    }
}
