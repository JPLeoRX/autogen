package com.tekleo.autogen.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExtendsTest {
    @Test
    public void test() {
        Extends e = new Extends("BaseApiImpl");
        System.out.println(e.getFilled());
    }
}
