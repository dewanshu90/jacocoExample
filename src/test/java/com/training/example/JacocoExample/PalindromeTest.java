package com.training.example.JacocoExample;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PalindromeTest {

	@Test
	public void whenEmptyString_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	}

	@Test
	public void testSingleCharacterString_ReturnsTrue() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("a"));
	}
	
	@Test
	public void testPalindromeEvenLength_ReturnsTrue() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("abba"));
	}
	
	@Test
	public void testPalindromeOddLength_ReturnsTrue() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("madam"));
	}
	
	@Test
	public void testNonPalindrome_ReturnsFalse() {
	    Palindrome palindromeTester = new Palindrome();
	    assertFalse(palindromeTester.isPalindrome("hello"));
	}
	
	@Test
	public void testCaseSensitiveNonPalindrome_ReturnsFalse() {
	    Palindrome palindromeTester = new Palindrome();
	    assertFalse(palindromeTester.isPalindrome("Madam"));
	}
	
}
