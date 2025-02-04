package org.example.utils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeValidatorTest {

    @Test
    public void whenValidPalindrome_mustReturnTrue(){
        final String palindrome = "osso";

        final boolean isPalindrome = PalindromeValidator.validate(palindrome);

        assertTrue(isPalindrome);
    }

    @Test
    public void whenInvalidPalindrome_mustReturnTrue(){
        final String palindrome = "oito";

        final boolean isPalindrome = PalindromeValidator.validate(palindrome);

        assertFalse(isPalindrome);
    }

}