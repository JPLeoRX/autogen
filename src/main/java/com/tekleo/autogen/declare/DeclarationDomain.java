package com.tekleo.autogen.declare;

import java.util.List;

public class DeclarationDomain {
    private String domainName;
    private List<DeclarationField> fields;

    public DeclarationDomain(String domainName, List<DeclarationField> fields) {
        this.domainName = domainName;
        this.fields = fields;
    }

    public String getDomainName() {
        return domainName;
    }

    public List<DeclarationField> getFields() {
        return fields;
    }
}
