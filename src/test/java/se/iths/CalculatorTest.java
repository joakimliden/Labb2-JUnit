package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Testing assertEquals addition")
    void testAdd() {

        assertEquals(4, calculator.add(2, 2));
    }

    @RepeatedTest(100)
    void testSub() {

        assertEquals(4, calculator.sub(6, 2));
    }

    @Test
    void testMultiply() {

        assertNotNull(calculator.multiply(5, 5));
    }

    @Disabled
    void testDivide() {

        assertEquals(7, calculator.divide(21, 3));
    }



}
