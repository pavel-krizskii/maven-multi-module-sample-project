package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveTests {

    @Test
    public void test1() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test2() {
        assertEquals("foobar", "foo" + "bar");
    }
}