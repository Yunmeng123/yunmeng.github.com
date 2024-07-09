package com.yaoming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testReverseString() {
        assertEquals("dcba", StringUtils.reverseString("abcd"));
        assertEquals("12321", StringUtils.reverseString("12321"));
        assertNull(StringUtils.reverseString(null));
        assertEquals("", StringUtils.reverseString(""));
    }
}
