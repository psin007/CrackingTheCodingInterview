package ArraysAndStringsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ArraysAndStrings.IsUnique;

class IsUniqueTest {
	IsUnique obj;
	
	@BeforeEach
	void init() {
		obj = new IsUnique();
	}

	@Test
	void testAllUnique() {
		assertEquals(false, obj.allUnique("abcdefzsifegcdvhxbsgvyecdhbjxsygcedhbjxnksvygchebxdknyghjerkcdyguhjekcfd*47389328747823jxhkjs"));
		assertEquals(true,obj.allUnique("!@#$%^&*()"));
		assertEquals(false, obj.allUnique("       "));
		assertEquals(true,obj.allUnique("avsdwghj*(^%$#@!1234567890"));
	}

}
