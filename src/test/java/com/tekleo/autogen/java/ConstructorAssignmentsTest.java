package com.tekleo.autogen.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorAssignmentsTest {
    @Test
    public void test() {
        ConstructorAssignment assignment1 = new ConstructorAssignment("x");
        ConstructorAssignment assignment2 = new ConstructorAssignment("y");
        ConstructorAssignments assignments = new ConstructorAssignments(assignment1, assignment2);
        String filled = assignments.getFilled();
        System.out.println(filled);
        assertTrue(filled.contains("this.x = x;"));
        assertTrue(filled.contains("this.y = y;"));
        assertEquals(2, assignments.getFilledAsLines().size());
    }
}
