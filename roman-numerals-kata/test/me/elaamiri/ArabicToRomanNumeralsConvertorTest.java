package me.elaamiri;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRomanNumeralsConvertorTest {
	
	ArabicToRomanNumeralsConvertor arabicToRomanNumeralsConvertor = new ArabicToRomanNumeralsConvertor();
	
	@Test
	public void test1To4ArabTORoman() {
		assertEquals("II", arabicToRomanNumeralsConvertor.convert(2));
		assertEquals("III", arabicToRomanNumeralsConvertor.convert(3));

	}
	
	@Test
	public void test4ArabTORoman() {
		assertEquals("IV", arabicToRomanNumeralsConvertor.convert(4));

	}
	
	@Test
	public void test5ArabTORoman() {
		assertEquals("V", arabicToRomanNumeralsConvertor.convert(5));

	}
	
	@Test
	public void test6To9ArabTORoman() {
		assertEquals("VII", arabicToRomanNumeralsConvertor.convert(7));
		assertEquals("VIII", arabicToRomanNumeralsConvertor.convert(8));

	}
	
	@Test
	public void test9ArabTORoman() {
		assertEquals("IX", arabicToRomanNumeralsConvertor.convert(9));

	}
	
	@Test
	public void test10ArabTORoman() {
		assertEquals("X", arabicToRomanNumeralsConvertor.convert(10));

	}
	
	@Test
	public void test10To50ArabTORoman() {
		assertEquals("X", arabicToRomanNumeralsConvertor.convert(10));
		assertEquals("XX", arabicToRomanNumeralsConvertor.convert(20));
		assertEquals("XXX", arabicToRomanNumeralsConvertor.convert(30));
		assertEquals("XL", arabicToRomanNumeralsConvertor.convert(40));


	}
	
	@Test
	public void test50To100ArabTORoman() {
		assertEquals("LX", arabicToRomanNumeralsConvertor.convert(60));
		assertEquals("LXX", arabicToRomanNumeralsConvertor.convert(70));
		assertEquals("LXXX", arabicToRomanNumeralsConvertor.convert(80));

	}
	
	@Test
	public void test90And100ArabTORoman() {
		assertEquals("XC", arabicToRomanNumeralsConvertor.convert(90));
		assertEquals("C", arabicToRomanNumeralsConvertor.convert(100));

	}
	
	@Test
	public void test100To500ArabTORoman() {
		assertEquals("CC", arabicToRomanNumeralsConvertor.convert(200));
		assertEquals("CD", arabicToRomanNumeralsConvertor.convert(400));

	}
	

}
