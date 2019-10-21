package com.tekleo.autogen.pom.objects;

import com.tekleo.autogen.pom.PomTemplateKeys;
import com.tekleo.autogen.pom.PomTemplates;
import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;
import com.tekleo.autogen.template_engine.TemplateValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PomDependency implements TemplateObject {
    private String groupId;
    private String artifactId;
    private String version;
    private String scope;

    public PomDependency(String groupId, String artifactId, String version, String scope) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.scope = scope;
    }

    private List<PomProperty> getPropertiesList() {
        ArrayList<PomProperty> list = new ArrayList<>(4);
        if (groupId != null)
            list.add(new PomProperty("groupId", groupId));
        if (artifactId != null)
            list.add(new PomProperty("artifactId", artifactId));
        if (version != null)
            list.add(new PomProperty("version", version));
        if (scope != null)
            list.add(new PomProperty("scope", scope));
        return list;
    }

    private PomProperties getProperties() {
        return new PomProperties(getPropertiesList());
    }

    @Override
    public Template getTemplate() {
        return PomTemplates.PROPERTY;
    }

    @Override
    public List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair(PomTemplateKeys.PROPERTY_KEY, new TemplateValue("dependency")),
                new TemplateKeyValuePair(PomTemplateKeys.PROPERTY_VALUE, new TemplateValue("\n" + getProperties().getFilledWithHeading("\t") + "\n"))
        );
    }
}
