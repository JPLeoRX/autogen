package com.tekleo.autogen.template_engine;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface TemplateObject extends Serializable {
    Template getTemplate();

    List<TemplateKeyValuePair> getKeyValuePairs();

    default String getFilled() {
        return TemplateEngine.fillWithKeyValuePairs(getTemplate(), getKeyValuePairs());
    }

    default List<String> getFilledAsLines() {
        return Arrays.asList(getFilled().split("\n"));
    }

    default String getFilledWithHeadingAndTailing(String heading, String tailing) {
        return String.join("\n", getFilledAsLines().stream().map(line -> heading + line + tailing).collect(Collectors.toList()));
    }

    default String getFilledWithHeading(String heading) {
        return getFilledWithHeadingAndTailing(heading, "");
    }

    default String getFilledWithTailing(String tailing) {
        return getFilledWithHeadingAndTailing("", tailing);
    }
}
