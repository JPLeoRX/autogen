package com.tekleo.autogen.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassTest {
    @Test
    public void test() {
        Field f1 = new Field("String", "name");
        Field f2 = new Field("long", "createdAt");

        Class c = new Class("Make", new Fields(f1, f2));
        System.out.println(c.getFilled());
    }
}
