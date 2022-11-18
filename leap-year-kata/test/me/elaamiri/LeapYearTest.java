package me.elaamiri;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {
	
	@Test
	public void testIfNotDivisibleBy4() {
		System.out.println("2011 |"+(2011% 4 == 0));
		assertFalse(LeapYear.isALeapYear(2011));
		System.out.println("1997 |"+(1997% 4 == 0));
		assertFalse(LeapYear.isALeapYear(1997));
	}
	
	@Test
	public void testIfDivisibleBy4() {
		//System.out.println("2040 |"+(2040 % 4 == 0));
		//assertTrue(LeapYear.isALeapYear(2040));
		System.out.println("1996 |"+(1996 % 4 == 0));
		assertTrue(LeapYear.isALeapYear(1996));
	}
	
	@Test
	public void testIfDivisibleBy400() {
		
		System.out.println("1600 |"+(1600 % 400 == 0));
		assertTrue(LeapYear.isALeapYear(1600));
	}
	
	@Test
	public void testIfDivisibleBy100ButNotBy400() {
		System.out.println("600 |"+(600 % 400 == 0));
		assertFalse(LeapYear.isALeapYear(600));
		
		System.out.println("1800 |"+(1800 % 400 == 0));
		assertFalse(LeapYear.isALeapYear(1800));
	}
	

}
