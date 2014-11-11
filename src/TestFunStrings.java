import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import junit.framework.AssertionFailedError;

import org.junit.Test;


public class TestFunStrings {

	@Test
	public void test() {
		testContainsOne();
		testfixName();
		testgetInitials();
		testreplaceAllVowels();
		testdecompress();
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
		assertEquals("Chen, Victor,", FunWithStrings.fixName("   Victor, Chen   "));
		assertEquals("Chen, Victor", FunWithStrings.fixName("   Victor middle Chen   "));
		assertEquals("x, Victor", FunWithStrings.fixName("Victor Chen   x"));
	}
	
	private void testgetInitials() {
		assertEquals("DJG", FunWithStrings.getInitials("    David Joseph Gries"));
		assertEquals("DJ", FunWithStrings.getInitials("Doug James"));
		assertEquals("BG", FunWithStrings.getInitials(" Bill      Gates"));
		assertEquals("BXG", FunWithStrings.getInitials(" Bill x Gates"));
		assertEquals("BGM", FunWithStrings.getInitials(" B  Gates Microsoft"));
		assertEquals("VZC", FunWithStrings.getInitials("   Victor  Zhi  Chen   "));
		assertEquals("VZH", FunWithStrings.getInitials("   Victor  Zhi Huan Chen   "));
	}
	
	private void testreplaceAllVowels() {
		assertEquals("M*n*cr*ft", FunWithStrings.replaceVowels("Minecraft"));
		assertEquals("Al*n T*r*ng", FunWithStrings.replaceVowels("Alan Turing"));
		assertEquals("M*cr*s*ft", FunWithStrings.replaceVowels("Microsoft"));
		assertEquals("V*ct*r Zh* HU*N ChEn", FunWithStrings.replaceVowels("Victor Zhi HUaN ChEn"));
	}
	
	private void testdecompress() {
		assertEquals("bbbcbbbbbxx", FunWithStrings.decompress("b3c1b5x2a0"));
		assertEquals("Google", FunWithStrings.decompress("G1o2g1l1e1"));
		assertEquals("BooYeeeeAhh", FunWithStrings.decompress("B1o2Y1e4A1h2"));
	}
	
}