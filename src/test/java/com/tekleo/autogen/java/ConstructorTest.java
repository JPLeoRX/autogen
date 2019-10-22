package com.tekleo.autogen.java;

import org.junit.Test;

public class ConstructorTest {
    @Test
    public void testEmpty() {
        Constructor constructor = new Constructor("public", "Make");
        System.out.println(constructor.getFilled());
    }

    @Test
    public void test1() {
        Constructor constructor = new Constructor(
                "public",
                "Make",
                new Parameters(new Variable("String", "name"), new Variable("long", "createdAt")),
                new ConstructorAssignments(new ConstructorAssignment("name"), new ConstructorAssignment("createdAt"))
        );

        System.out.println(constructor.getFilled());
    }

    @Test
    public void test2() {
        Constructor constructor = new Constructor(
                "public",
                "Make",
                new Parameters(new Variable("String", "name"), new Variable("long", "createdAt"))
        );

        System.out.println(constructor.getFilled());
    }

    @Test
    public void test3() {
        Constructor constructor = new Constructor(
                "public",
                "Make",
                new Fields(new Field(new Variable("String", "name")), new Field(new Variable("long", "createdAt")))
        );

        System.out.println(constructor.getFilled());
    }

}
