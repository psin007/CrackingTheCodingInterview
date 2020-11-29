package ArraysAndStringsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ArraysAndStrings.StringCompression;

class StringCompressionTest {
	
	StringCompression obj;
	
	@BeforeEach
	void init() {
		obj = new StringCompression();
	}

	@Test
	void testCompressString() {
		assertEquals("a2b4c5",obj.compressString("aabbbbccccc"));
		assertEquals("abc",obj.compressString("abc"));
		assertEquals("a",obj.compressString("a"));
		assertEquals("aa",obj.compressString("aa"));
		assertEquals("a6",obj.compressString("aaaaaa"));
	}

}
