package ArraysAndStringsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ArraysAndStrings.StringCompressionOptimal;

class StringCompressionOptimalTest {
	
	StringCompressionOptimal obj;
	
	@BeforeEach
	void init() {
		obj = new StringCompressionOptimal();
	}

	@Test
	void testStringCompression() {
		assertEquals("a2b4c5",obj.stringCompression("aabbbbccccc"));
		assertEquals("abc",obj.stringCompression("abc"));
		assertEquals("a",obj.stringCompression("a"));
		assertEquals("aa",obj.stringCompression("aa"));
		assertEquals("a6",obj.stringCompression("aaaaaa"));
	}

}
