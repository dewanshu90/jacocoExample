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
	public void whenSingleCharacter_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("a"));
	}

	// @Test
	// public void whenPalindromeWord_thenAccept() {
	//     Palindrome palindromeTester = new Palindrome();
	//     assertTrue(palindromeTester.isPalindrome("madam"));
	// }

	// @Test
	// public void whenNonPalindromeWord_thenReject() {
	//     Palindrome palindromeTester = new Palindrome();
	// 	assertFalse(palindromeTester.isPalindrome("hello"));
	// }

	// @Test
	// public void whenPalindromeWithEvenLength_thenAccept() {
	//     Palindrome palindromeTester = new Palindrome();
	//     assertTrue(palindromeTester.isPalindrome("noon"));
	// }

	// @Test
	// public void whenCaseSensitivePalindrome_thenReject() {
	//     Palindrome palindromeTester = new Palindrome();
	//     assertFalse(palindromeTester.isPalindrome("Madam"));
	// }
}
