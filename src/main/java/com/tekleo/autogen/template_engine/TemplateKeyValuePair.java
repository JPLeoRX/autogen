package com.tekleo.autogen.template_engine;

import java.io.Serializable;
import java.util.Objects;

public class TemplateKeyValuePair implements Serializable {
    private TemplateKey key;
    private TemplateValue value;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public TemplateKeyValuePair(TemplateKey key, TemplateValue value) {
        this.key = key;
        this.value = value;
    }

    public TemplateKeyValuePair(String key, String value) {
        this(new TemplateKey(key), new TemplateValue(value));
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public TemplateKey getKey() {
        return key;
    }

    public String getKeyAsStr() {
        return getKey().getKey();
    }

    public TemplateValue getValue() {
        return value;
    }

    public String getValueAsStr() {
        return getValue().getValue();
    }
    //------------------------------------------------------------------------------------------------------------------



    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateKeyValuePair that = (TemplateKeyValuePair) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "TemplateKeyValuePair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}
