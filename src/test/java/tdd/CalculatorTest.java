package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Denne test tjekker om 2 tal bliver plusset sammen")
    void testAdd(){
        int expected = 7;
        int actual = calc.add(4,3);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Denne test tjekker om 2 tal trækkes fra hinanden")
    void testSubtract(){
        int expected = 3;
        int actual = calc.subtract(7,4);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Denne test tjekker om 2 tal ganges med hinanden")
    void testMultiply(){
        int expected = 42;
        int actual = calc.multiply(7, 6);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Denne test tjekker om 2 tal divideres med hinanden")
    void testDivide(){
        int expected = 7;
        int actual = calc.divide(49,7);
        assertEquals(expected,actual);
    }



}