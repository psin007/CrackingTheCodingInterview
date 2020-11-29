package ArraysAndStringsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ArraysAndStrings.OneAway;

class OneAwayTest {
	
	OneAway obj;
	
	@BeforeEach
	void init() {
		obj = new OneAway();
	}
	

	@Test
	void testoneAway() {
		assertEquals(true, obj.oneAway("pale", "ple"));
		assertEquals(true, obj.oneAway("pales", "pale"));
		assertEquals(true, obj.oneAway("pale", "bale"));
		assertEquals(false, obj.oneAway("pale", "bae"));
		assertEquals(false, obj.oneAway("pale", "bae%2"));
		assertEquals(false, obj.oneAway("pale", "feiufhewfh^4"));
		assertEquals(true, obj.oneAway("pale", "spale"));
		assertEquals(true, obj.oneAway("pale", "pales"));

		
	}
	
	@Test
	void testCheckReplace() {
		assertEquals(true,obj.checkReplace("pale", "bale"));
		assertEquals(true, obj.checkReplace("pale", "palz"));
		assertEquals(false,obj.checkReplace("pale", "alep"));
	}
	
	@Test
	void testCheckInsert() {
		assertEquals(true,obj.checkInsert("pales", "pale"));
		assertEquals(true,obj.checkInsert("spale", "pale"));
		assertEquals(true,obj.checkInsert("pasle", "pale"));
		assertEquals(false,obj.checkInsert("pale", "pajes"));
		assertEquals(false,obj.checkInsert("pale", "jopal"));
	}
	
	@Test
	void testCheckRemove() {
		assertEquals(true,obj.checkInsert("pales", "pale"));
		assertEquals(true,obj.checkInsert("spale", "pale"));
		assertEquals(true,obj.checkInsert("pasle", "pale"));
		assertEquals(false,obj.checkInsert("pajes", "pale"));
		assertEquals(false,obj.checkInsert("jopal", "pale"));
	}

}
