package com.example;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calculator;

    // This method is executed once before all tests.
    @BeforeAll
    static void setupAll() {
        System.out.println("Setup for all tests");
    }

    // This method is executed before each test.
    @BeforeEach
    void setup() {
        // Initialize a new Calculator instance before each test.
        calculator = new Calculator();
        System.out.println("Setup for each test");
    }

    // A simple test to verify the add method.
    @Test
    void testAdd() {
        System.out.println("Executing testAdd");
        // Verify that the addition result is correct.
        Assertions.assertEquals(5, calculator.add(2, 3));
    }

    // A simple test to verify the subtract method.
    @Test
    void testSubtract() {
        System.out.println("Executing testSubtract");
        // Verify that the subtraction result is correct.
        Assertions.assertEquals(1, calculator.subtract(3, 2));
    }

    // This method is executed after each test.
    @AfterEach
    void teardown() {
        // Clean up resources after each test.
        calculator = null;
        System.out.println("Teardown after each test");
    }

    // This method is executed once after all tests.
    @AfterAll
    static void teardownAll() {
        System.out.println("Teardown after all tests");
    }
}
