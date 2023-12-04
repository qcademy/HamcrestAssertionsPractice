package de.qcademy.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


class MathOperationsTest {

    @Test
    void testAdd() {
        // Test example
        MathOperations calculator = new MathOperations();
        int expectedSum = 42;
        int actualSum = calculator.add(20, 22);
        assertThat("Addition should give the expected result.", actualSum, equalTo(expectedSum));
    }

    @Test
    void testDivide() {
        // Add your test
    }

    @Test
    void testSubtract() {
        // Add your test
    }

    @Test
    void testMultiply() {
        // Add your test
    }

    @Test
    void testSquare() {
        // Add your test
    }

    @Test
    void testIsEven() {
        // Add your test
    }

    // Add more tests below if necessary
}