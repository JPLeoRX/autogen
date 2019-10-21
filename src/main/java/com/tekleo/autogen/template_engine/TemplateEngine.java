package com.tekleo.autogen.template_engine;

import java.util.Arrays;
import java.util.List;

public final class TemplateEngine {
    private TemplateEngine() { }

    public static String fillWithKeyValuePairs(Template template, TemplateKeyValuePair ... pairs) {
        return fillWithKeyValuePairs(template, Arrays.asList(pairs));
    }

    public static String fillWithKeyValuePairs(Template template, List<TemplateKeyValuePair> pairs) {
        return fillWithKeyValuePairs(template.getText(), pairs);
    }

    public static String fillWithKeyValuePairs(String templateText, List<TemplateKeyValuePair> pairs) {
        for (TemplateKeyValuePair pair : pairs)
            templateText = fillWithKeyValuePair(templateText, pair);
        return templateText.trim();
    }

    public static String fillWithKeyValuePair(String templateText, TemplateKeyValuePair pair) {
        while (templateText.contains(pair.getKeyAsStr()))
            templateText = templateText.replace(pair.getKeyAsStr(), pair.getValueAsStr());
        return templateText.trim();
    }
}
