package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;  //the test method is present inside this api or package

class CalcTest {

    @Test  //applied over methods to mark methods as test
    //this @test annotated method can be public , protected , default
    //default behaviour is success 
    void testAddition() {
        Calc calcu = new Calc();
        assertEquals(2, calcu.divide(6, 3));  // ✅ actual assertion
    } 
}
