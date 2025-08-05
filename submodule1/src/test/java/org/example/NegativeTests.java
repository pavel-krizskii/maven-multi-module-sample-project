package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NegativeTests {

    @Test
    public void test1() {
        assertEquals(3, 1 + 1);
    }

    @Test
    public void test2() {
        assertEquals("", "foo" + "bar");
    }
}