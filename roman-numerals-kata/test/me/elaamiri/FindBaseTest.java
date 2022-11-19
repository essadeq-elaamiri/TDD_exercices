package me.elaamiri;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindBaseTest {

	@Test
	public void testFindBase() {
		assertEquals("I", ArabicToRomanNumeralsConvertor.findBase(4));
		assertEquals("X", ArabicToRomanNumeralsConvertor.findBase(10));
		assertEquals("V", ArabicToRomanNumeralsConvertor.findBase(9));
		assertEquals("X", ArabicToRomanNumeralsConvertor.findBase(29));
		assertEquals("L", ArabicToRomanNumeralsConvertor.findBase(80));
		assertEquals("M", ArabicToRomanNumeralsConvertor.findBase(2019));
		assertEquals("I", ArabicToRomanNumeralsConvertor.findBase(4));
		assertEquals("L", ArabicToRomanNumeralsConvertor.findBase(50));
		assertEquals("C", ArabicToRomanNumeralsConvertor.findBase(133));
		assertEquals("I", ArabicToRomanNumeralsConvertor.findBase(3));
		assertEquals("L", ArabicToRomanNumeralsConvertor.findBase(90));

	}

}
