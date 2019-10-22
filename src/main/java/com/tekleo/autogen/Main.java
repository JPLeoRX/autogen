package com.tekleo.autogen;

import com.tekleo.autogen.java.*;

public class Main {
    public static void main(String[] args) {
//        PomProperty p1 = new PomProperty("java.version", "1.8");
//        PomProperty p2 = new PomProperty("spring-cloud.version", "Greenwich.SR2");
//
//        PomProperties all = new PomProperties(p1, p2);
//        System.out.println(all.getFilled());
//
//        PomDependency dependency = new PomDependency("com.what2drive", "common-id", "1.0-SNAPSHOT", null, null);
//        System.out.println(dependency.getFilled());

        Variable v1 = new Variable("String", "name");
        Variable v2 = new Variable("long", "createdAt");

        VariableAssignment variableAssignment = new VariableAssignment("name", "nameA");
        System.out.println(variableAssignment.getFilled());

        ConstructorAssignment constructorAssignment = new ConstructorAssignment("name");
        System.out.println(constructorAssignment.getFilled());

        Field f1 = new Field(v1);
        Field f2 = new Field(v2);

        Parameters parameters = new Parameters(v1, v2);
        System.out.println(parameters.getFilled());

        Fields fields = new Fields(f1, f2);
        System.out.println(fields.getFilled());
    }
}
