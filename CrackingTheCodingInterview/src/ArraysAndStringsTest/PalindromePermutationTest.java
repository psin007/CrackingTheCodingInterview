package ArraysAndStringsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ArraysAndStrings.PalindromePermutation;

class PalindromePermutationTest {

	PalindromePermutation obj;
	
	@BeforeEach
	void init() {
		obj = new PalindromePermutation();
	}
	
	@Test
	void testPalindromePermutation() {
		assertEquals(true, obj.palindromePermutation("Tact Coa"));
	}

}
