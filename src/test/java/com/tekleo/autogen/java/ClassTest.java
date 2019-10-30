package com.tekleo.autogen.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ClassTest {
    @Test
    public void test() {
        Field f1 = new Field(Arrays.asList("@Id"), "private", "String", "name");
        Field f2 = new Field("long", "createdAt");

        Class c1 = new Class("Make", "BaseObject", Arrays.asList("MessageObject", "ApiObject"), new Fields(f1, f2));
        System.out.println(c1.getFilled());

        Class c2 = new Class("Make", "BaseObject", null, new Fields(f1, f2));
        System.out.println(c2.getFilled());

        Class c3 = new Class("Make", null, Arrays.asList("MessageObject", "ApiObject"), new Fields(f1, f2));
        System.out.println(c3.getFilled());

        Class c4 = new Class("Make", new Fields(f1, f2));
        System.out.println(c4.getFilled());
    }
}
