package com.tekleo.autogen.template_engine;

import java.io.Serializable;
import java.util.Objects;

public class TemplateKey implements Serializable {
    private String strValue;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public TemplateKey(String strValue) {
        this.strValue = strValue;
    }

    public TemplateKey(TemplateKey key) {
        this(key.getStrValue());
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getStrValue() {
        return strValue;
    }

    public String getKey() {
        return "${" + getStrValue() + "}";
    }
    //------------------------------------------------------------------------------------------------------------------



    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateKey that = (TemplateKey) o;
        return Objects.equals(strValue, that.strValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strValue);
    }

    @Override
    public String toString() {
        return "TemplateKey{" +
                "strValue='" + strValue + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}
