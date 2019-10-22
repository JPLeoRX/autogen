package com.tekleo.autogen.template_engine;

import java.util.List;
import java.util.stream.Collectors;

public interface TemplateObjects<T extends TemplateObject> extends TemplateObject {
    List<T> getTemplateObjects();

    String getDelimiter();

    default Template getTemplate() {
        return null;
    }

    default List<TemplateKeyValuePair> getKeyValuePairs() {
        return null;
    }

    @Override
    default String getFilled() {
        return String.join(getDelimiter(), getTemplateObjects().stream().map(t -> t.getFilled()).collect(Collectors.toList()));
    }
}
