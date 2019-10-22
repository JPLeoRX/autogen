package com.tekleo.autogen.java;

public class ConstructorAssignment extends VariableAssignment {
    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public ConstructorAssignment(String name) {
        super("this." + name, name);
    }

    public ConstructorAssignment(Variable variable) {
        this(variable.getName());
    }

    public ConstructorAssignment(Field field) {
        this(field.getVariable());
    }
    //------------------------------------------------------------------------------------------------------------------
}
