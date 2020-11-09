package se.iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    Calculator calculator = new Calculator();

    @Test
    void testAdd() {

        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void testSub() {

        assertEquals(4, calculator.sub(6, 2));
    }

    @Test
    void testMultiply() {

        assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    void testDivide() {

        assertEquals(7, calculator.divide(21, 3));
    }



}
