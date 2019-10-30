package com.tekleo.autogen.java;

import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;

import java.util.Arrays;
import java.util.List;

public class Implements implements TemplateObject {
    private List<String> parentClassNames;

    public Implements(List<String> parentClassNames) {
        this.parentClassNames = parentClassNames;
    }

    public Implements(String ... parentClassNames) {
        this(Arrays.asList(parentClassNames));
    }

    @Override
    public Template getTemplate() {
        return new Template("implements.template");
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair("parentClassNames", String.join(", ", parentClassNames))
        );
    }
}
