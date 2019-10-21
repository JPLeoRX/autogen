package com.tekleo.autogen.template_engine;

import java.io.Serializable;
import java.util.List;

public interface TemplateObject extends Serializable {
    Template getTemplate();

    List<TemplateKeyValuePair> getKeyValuePairs();

    default String getFilled() {
        return TemplateEngine.fillWithKeyValuePairs(getTemplate(), getKeyValuePairs());
    }
}
