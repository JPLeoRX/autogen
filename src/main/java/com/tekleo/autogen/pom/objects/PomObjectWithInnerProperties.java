package com.tekleo.autogen.pom.objects;

import com.tekleo.autogen.pom.PomTemplateKeys;
import com.tekleo.autogen.pom.PomTemplates;
import com.tekleo.autogen.template_engine.Template;
import com.tekleo.autogen.template_engine.TemplateKeyValuePair;
import com.tekleo.autogen.template_engine.TemplateObject;
import com.tekleo.autogen.template_engine.TemplateValue;

import java.util.Arrays;
import java.util.List;

public interface PomObjectWithInnerProperties extends TemplateObject {
    String getName();

    List<PomProperty> getPropertiesList();

    default PomProperties getProperties() {
        return new PomProperties(getPropertiesList());
    }

    default String getPropertiesFilledAsValue() {
        return "\n" + getProperties().getFilledWithHeading("\t") + "\n";
    }

    @Override
    default Template getTemplate() {
        return PomTemplates.PROPERTY;
    }

    @Override
    default List<TemplateKeyValuePair> getKeyValuePairs() {
        return Arrays.asList(
                new TemplateKeyValuePair(PomTemplateKeys.PROPERTY_KEY, new TemplateValue(getName())),
                new TemplateKeyValuePair(PomTemplateKeys.PROPERTY_VALUE, new TemplateValue(getPropertiesFilledAsValue()))
        );
    }
}
