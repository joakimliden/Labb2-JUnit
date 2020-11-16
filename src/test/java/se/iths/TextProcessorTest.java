package se.iths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextProcessorTest {

    public static TextProcessor tp = new TextProcessor();

    @ParameterizedTest
    @ValueSource(strings = {"TestaSkiten!"})
    void testReverseString(String str) {
    assertEquals(new StringBuilder(str).reverse().toString(), tp.reverseString(str));
    }

    @Test
    @DisplayName("Test Reversing String")
    void testReverseString2() {

        String test = "?etevleh i daV";
        assertEquals(test, tp.reverseString("Vad i helvete?"));
    }

    @Test
    @AfterEach
    void testUpperString() {
        String str = "lower to upper";
        assertEquals("LOWER TO UPPER", tp.upperString(str));
    }

    @Test
    void testLowerString() {
        assertEquals("hello", tp.lowerString("HeLLo"));

    }

}

