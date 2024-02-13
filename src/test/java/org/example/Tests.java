package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {

    @Test
    public void testMain() {
        assertEquals("Hello World", new Messenger().Message());

    }
}
