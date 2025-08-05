package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveAndNegativeTests {

    @Test
    public void positive() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void positive2() {
    }

    @Test
    public void negative() {
        assertEquals("", "foo" + "bar");
    }
}