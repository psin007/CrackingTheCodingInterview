package ArraysAndStringsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ArraysAndStrings.CheckPermutationBySortingString;

class CheckPermutationBySortingStringTest {
	
	CheckPermutationBySortingString obj;
	
	@BeforeEach
	void init() {
		obj = new CheckPermutationBySortingString();
	}

	@Test
	void testSortString() {
		assertEquals("abcdefghijklmnopqrstuvwxyz",obj.sortString("asdfghjklpoiuytrewqzxcvbnm"));
	}

	@Test
	void testPermutation() {
		assertEquals(true,obj.permutation("",""));
		assertEquals(true,obj.permutation("pooja20","02ojopa"));
	}
}
