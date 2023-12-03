package de.qcademy.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class StringUtilsTest {

    @Test
    void testReverse() {
        // Test example
        StringUtils stringUtils = new StringUtils();
        String original = "JUnit";
        String reversed = stringUtils.reverse(original);
        assertThat("Reversed word should match the original.", reversed, equalTo("tinUJ"));
    }

    @Test
    void testCapitalize() {
        // Add your test
    }

    @Test
    void testConcatenate() {
        // Add your test
    }

    @Test
    void testSplitIntoWords() {
        // Add your test
    }

    @Test
    void testCreateWordMap() {
        // Add your test
    }
}