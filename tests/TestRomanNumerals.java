import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*  */
/* There is a problem if we test to add IIII it counts it as 4 */
/* So basically this is only calculator not real Roman numeral converter */
/*  */

public class TestRomanNumerals {
	
	private RomanNumerals rn;
	
	@Before
	public void init() {
		rn = new RomanNumerals();
	}
	@Test
	public void should_recognize_empty() {
		assertEquals(0, rn.convertToInteger(""));
	}
	
	@Test
	public void should_recognize_I() {
		assertEquals(1, rn.convertToInteger("I"));
	}
	@Test
	public void should_recognize_II() {
		assertEquals(2, rn.convertToInteger("II"));
	}
	
	@Test
	public void should_recognize_III() {
		assertEquals(3, rn.convertToInteger("III"));
	}
	
	@Test
	public void should_recognize_IV() {
		assertEquals(4, rn.convertToInteger("IV"));
	}
	
	@Test
	public void should_recognize_V() {
		assertEquals(5, rn.convertToInteger("V"));
	}
	
	@Test
	public void should_recognize_VI() {
		assertEquals(6, rn.convertToInteger("VI"));
	}
	
	@Test
	public void should_recognize_VII() {
		assertEquals(7, rn.convertToInteger("VII"));
	}
	
	@Test
	public void should_recognize_VIII() {
		assertEquals(8, rn.convertToInteger("VIII"));
	}
	
	@Test
	public void should_recognize_IX() {
		assertEquals(9, rn.convertToInteger("IX"));
	}
	
	@Test
	public void should_recognize_X() {
		assertEquals(10, rn.convertToInteger("X"));
	}
	
	@Test
	public void should_recognize_XI() {
		assertEquals(11, rn.convertToInteger("XI"));
	}
	
	@Test
	public void should_recognize_XII() {
		assertEquals(12, rn.convertToInteger("XII"));
	}
	
	@Test
	public void should_recognize_XIII() {
		assertEquals(13, rn.convertToInteger("XIII"));
	}
	
	@Test
	public void should_recognize_XIV() {
		assertEquals(14, rn.convertToInteger("XIV"));
	}
	
	@Test
	public void should_recognize_XV() {
		assertEquals(15, rn.convertToInteger("XV"));
	}
	
	@Test
	public void should_recognize_XVI() {
		assertEquals(16, rn.convertToInteger("XVI"));
	}
	
	@Test
	public void should_recognize_XVII() {
		assertEquals(17, rn.convertToInteger("XVII"));
	}
	
	@Test
	public void should_recognize_XVIII() {
		assertEquals(18, rn.convertToInteger("XVIII"));
	}
	
	@Test
	public void should_recognize_XIX() {
		assertEquals(19, rn.convertToInteger("XIX"));
	}
	
	@Test
	public void should_recognize_XX() {
		assertEquals(20, rn.convertToInteger("XX"));
	}
	
	@Test
	public void should_recognize_XXX() {
		assertEquals(30, rn.convertToInteger("XXX"));
	}
	
	@Test
	public void should_recognize_XL() {
		assertEquals(40, rn.convertToInteger("XL"));
	}
	
	@Test
	public void should_recognize_L() {
		assertEquals(50, rn.convertToInteger("L"));
	}
	
	@Test
	public void should_recognize_LX() {
		assertEquals(60, rn.convertToInteger("LX"));
	}
	
	@Test
	public void should_recognize_LXX() {
		assertEquals(70, rn.convertToInteger("LXX"));
	}
	
	@Test
	public void should_recognize_LXXX() {
		assertEquals(80, rn.convertToInteger("LXXX"));
	}
	
	@Test
	public void should_recognize_XC() {
		assertEquals(90, rn.convertToInteger("XC"));
	}
	
	@Test
	public void should_recognize_C() {
		assertEquals(100, rn.convertToInteger("C"));
	}
	
	@Test
	public void should_recognize_CC() {
		assertEquals(200, rn.convertToInteger("CC"));
	}
	
	@Test
	public void should_recognize_CCC() {
		assertEquals(300, rn.convertToInteger("CCC"));
	}
	
	@Test
	public void should_recognize_CD() {
		assertEquals(400, rn.convertToInteger("CD"));
	}
	
	@Test
	public void should_recognize_D() {
		assertEquals(500, rn.convertToInteger("D"));
	}
	
	@Test
	public void should_recognize_DC() {
		assertEquals(600, rn.convertToInteger("DC"));
	}
	
	@Test
	public void should_recognize_DCC() {
		assertEquals(700, rn.convertToInteger("DCC"));
	}
	
	@Test
	public void should_recognize_DCCC() {
		assertEquals(800, rn.convertToInteger("DCCC"));
	}
	
	@Test
	public void should_recognize_CM() {
		assertEquals(900, rn.convertToInteger("CM"));
	}
	
	@Test
	public void should_recognize_M() {
		assertEquals(1000, rn.convertToInteger("M"));
	}
	
	@Test
	public void should_recognize_MCMLXXXIV() {
		assertEquals(1984, rn.convertToInteger("MCMLXXXIV"));
	}
	
	@Test
	public void should_recognize_MMXIV() {
		assertEquals(2014, rn.convertToInteger("MMXIV"));
	}
	
}