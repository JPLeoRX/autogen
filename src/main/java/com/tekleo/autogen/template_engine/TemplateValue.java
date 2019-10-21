package com.tekleo.autogen.template_engine;

import java.io.Serializable;
import java.util.Objects;

public class TemplateValue implements Serializable {
    private String strValue;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public TemplateValue(String strValue) {
        this.strValue = strValue;
    }

    public TemplateValue(TemplateValue value) {
        this(value.getStrValue());
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getStrValue() {
        return strValue;
    }

    public String getValue() {
        return strValue;
    }
    //------------------------------------------------------------------------------------------------------------------



    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateValue that = (TemplateValue) o;
        return Objects.equals(strValue, that.strValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strValue);
    }

    @Override
    public String toString() {
        return "TemplateValue{" +
                "strValue='" + strValue + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}
