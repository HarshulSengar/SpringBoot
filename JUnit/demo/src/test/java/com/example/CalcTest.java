package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalcTest {

    @Test
    void testAddition() {
        Calc calcu = new Calc();
        assertEquals(2, calcu.divide(6, 3));  // ✅ actual assertion
    }
}
