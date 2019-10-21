package com.tekleo.autogen.declare;

public class DeclarationField {
    private String name;
    private String typeDO;
    private String typeBO;
    private String typeAO;
    private String typeMP;

    public DeclarationField(String name, String typeDO, String typeBO, String typeAO, String typeMP) {
        this.name = name;
        this.typeDO = typeDO;
        this.typeBO = typeBO;
        this.typeAO = typeAO;
        this.typeMP = typeMP;
    }

    public String getName() {
        return name;
    }

    public String getTypeDO() {
        return typeDO;
    }

    public String getTypeBO() {
        return typeBO;
    }

    public String getTypeAO() {
        return typeAO;
    }

    public String getTypeMP() {
        return typeMP;
    }
}
