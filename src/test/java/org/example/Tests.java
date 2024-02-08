package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Tests {

    @Test
    public void testAdd() {
        assertEquals(30, Main.add(10, 20));
    }
}
