package com.tekleo.autogen.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorsTest {
    @Test
    public void test() {
        Constructor c1 = new Constructor(
                "public",
                "Make",
                new Fields(new Field(new Variable("String", "name")), new Field(new Variable("long", "createdAt")))
        );

        Constructor c2 = new Constructor(
                "public",
                "Make"
        );

        Constructors constructors = new Constructors(c1, c2);

        System.out.println(constructors.getFilled());
    }
}
