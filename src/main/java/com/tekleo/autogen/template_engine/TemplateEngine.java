package com.tekleo.autogen.template_engine;

public final class TemplateEngine {
    private TemplateEngine() { }

    public static String fillWithKeyValuePair(String templateText, TemplateKeyValuePair pair) {
        while (templateText.contains(pair.getKeyAsStr()))
            templateText = templateText.replace(pair.getKeyAsStr(), pair.getValueAsStr());
        return templateText;
    }
}
