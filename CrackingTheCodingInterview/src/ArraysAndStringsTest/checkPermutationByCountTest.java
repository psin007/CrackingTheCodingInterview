package ArraysAndStringsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ArraysAndStrings.checkPermutationByCount;

class checkPermutationByCountTest {

	checkPermutationByCount obj;
	
	@BeforeEach
	void init() {
		obj = new checkPermutationByCount();
	}
	
	@Test
	void testPermutation() {
		assertEquals(true,obj.permutation("",""));
		assertEquals(true,obj.permutation("pooja20","02ojopa"));
	}

}

