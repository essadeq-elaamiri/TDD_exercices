package me.elaamiri;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanNumeralConverterParameterizedTest {
	private int arabic;
	private String roman;
	
	// constructor
	public RomanNumeralConverterParameterizedTest(int arabic, String roman) {
		this.arabic = arabic;
		this.roman = roman;
	}
	// Parameters
	@Parameters
	public static Collection<Object[]> inputOutput(){
		return List.of(
				new Object[] {1, "I"},
				new Object[] {2, "II"},
				new Object[] {3, "III"},
				new Object[] {4, "IV"},
				new Object[] {5, "V"},
				new Object[] {7, "VII"},
				new Object[] {9, "IX"},
				new Object[] {10, "X"},
				new Object[] {17, "XVII"},
				new Object[] {30, "XXX"},
				new Object[] {38, "XXXVIII"},
				new Object[] {479, "CDLXXIX"},
				new Object[] {3999, "MMMCMXCIX"}
				
				);
	}
	
	// tests
	
	@Test
	public void testPramaeteres() {
		ArabicToRomanNumeralsConvertor arabicToRomanNumeralsConvertor = new ArabicToRomanNumeralsConvertor();
		assertEquals(this.roman, arabicToRomanNumeralsConvertor.convert(arabic));
	}
}
