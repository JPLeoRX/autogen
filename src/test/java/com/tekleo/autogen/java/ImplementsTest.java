package com.tekleo.autogen.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementsTest {
    @Test
    public void test() {
        Implements i = new Implements("ApiObject", "Serializable");
        System.out.println(i.getFilled());
    }
}
