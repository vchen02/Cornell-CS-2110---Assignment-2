import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TestFunStrings {

	@Test
	public void test() {
		testContainsOne();
	}
	
	private void testContainsOne() {
		
		assertTrue(FunWithStrings.containsOne("abbb", "bb"));
		assertTrue(FunWithStrings.containsOne("Google", "Go"));
		assertTrue(FunWithStrings.containsOne("oo_Yahoo_Yahoo_", "hoo_Y"));
		
		assertFalse(FunWithStrings.containsOne("ab", "bb"));
		assertFalse(FunWithStrings.containsOne("abbbb", "bb"));
		assertFalse(FunWithStrings.containsOne("mommom","mom" ));
		assertFalse(FunWithStrings.containsOne("abcdefgabc", "abc"));
	}
	
	private void testfixName() {
		assertEquals("Gries, David", FunWithStrings.fixName("    David Gries"));
		assertEquals("James, Doug", FunWithStrings.fixName("Doug       James "));
		assertEquals("Chen, Victor", FunWithStrings.fixName("   Victor Chen   "));
		assertEquals("Chen, Victor", FunWithStrings.fixName("   Victor, Chen   "));
		assertEquals("Chen, Victor", FunWithStrings.fixName("   Victor middle Chen   "));
		assertEquals("x, Victor", FunWithStrings.fixName("Victor Chen   x"));
	}
}
