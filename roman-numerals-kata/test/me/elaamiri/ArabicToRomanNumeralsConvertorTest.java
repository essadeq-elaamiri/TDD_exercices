package me.elaamiri;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRomanNumeralsConvertorTest {

	@Test
	public void test1To4ArabTORoman() {
		assertEquals("II", ArabicToRomanNumeralsConvertor.convert(2));
		assertEquals("III", ArabicToRomanNumeralsConvertor.convert(3));

	}
	
	@Test
	public void test4ArabTORoman() {
		assertEquals("IV", ArabicToRomanNumeralsConvertor.convert(4));

	}
	
	@Test
	public void test5ArabTORoman() {
		assertEquals("V", ArabicToRomanNumeralsConvertor.convert(5));

	}
	
	@Test
	public void test6To9ArabTORoman() {
		assertEquals("VII", ArabicToRomanNumeralsConvertor.convert(7));
		assertEquals("VIII", ArabicToRomanNumeralsConvertor.convert(8));

	}
	
	@Test
	public void test9ArabTORoman() {
		assertEquals("IX", ArabicToRomanNumeralsConvertor.convert(9));

	}
	
	@Test
	public void test10ArabTORoman() {
		assertEquals("X", ArabicToRomanNumeralsConvertor.convert(10));

	}

}
