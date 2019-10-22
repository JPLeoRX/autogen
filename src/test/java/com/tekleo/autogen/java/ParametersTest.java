package com.tekleo.autogen.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParametersTest {
    @Test
    public void test() {
        Variable assignment1 = new Variable("String", "x");
        Variable assignment2 = new Variable("int", "y");
        Parameters parameters = new Parameters(assignment1, assignment2);
        String filled = parameters.getFilled();
        System.out.println(filled);
        assertTrue(filled.contains("String x"));
        assertTrue(filled.contains("int y"));
        assertEquals(1, parameters.getFilledAsLines().size());
    }
}
