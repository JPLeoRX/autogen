package com.tekleo.autogen.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArgumentsTest {
    @Test
    public void test() {
        Arguments arguments = new Arguments("x", "y");
        String filled = arguments.getFilled();
        System.out.println(filled);
        assertTrue(filled.contains("x"));
        assertTrue(filled.contains("y"));
        assertEquals(1, arguments.getFilledAsLines().size());
    }
}
