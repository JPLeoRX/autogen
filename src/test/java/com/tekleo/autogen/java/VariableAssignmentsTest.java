package com.tekleo.autogen.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class VariableAssignmentsTest {
    @Test
    public void test() {
        VariableAssignment assignment1 = new VariableAssignment("x", "1");
        VariableAssignment assignment2 = new VariableAssignment("y", "x");
        VariableAssignments assignments = new VariableAssignments(assignment1, assignment2);
        String filled = assignments.getFilled();
        System.out.println(filled);
        assertTrue(filled.contains("x = 1;"));
        assertTrue(filled.contains("y = x;"));
        assertEquals(2, assignments.getFilledAsLines().size());
    }
}
