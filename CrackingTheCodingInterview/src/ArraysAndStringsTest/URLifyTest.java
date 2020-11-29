package ArraysAndStringsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ArraysAndStrings.URLify;

class URLifyTest {
	URLify obj;
	
	@BeforeEach
	void init() {
		obj = new URLify();
	}
	

	@Test
	void testURLify() {
		assertEquals("Mr%20John%20Smith",obj.urlify("Mr John Smith    ",13));
	}

}
