package me.elaamiri;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest2 {

	@Test
	public void testIfNotDivisibleBy4() {
		System.out.println("2011 |"+(2011% 4 == 0));
		assertFalse(LeapYear.isLeap(2011));
		System.out.println("1997 |"+(1997% 4 == 0));
		assertFalse(LeapYear.isLeap(1997));
	}
	
	@Test
	public void testIfDivisibleBy4() {
		//System.out.println("2040 |"+(2040 % 4 == 0));
		//assertTrue(LeapYear.isLeap(2040));
		System.out.println("1996 |"+(1996 % 4 == 0));
		assertTrue(LeapYear.isLeap(1996));
	}
	
	@Test
	public void testIfDivisibleBy400() {
		
		System.out.println("1600 |"+(1600 % 400 == 0));
		assertTrue(LeapYear.isLeap(1600));
	}
	
	@Test
	public void testIfDivisibleBy100ButNotBy400() {
		System.out.println("600 |"+(600 % 400 == 0));
		assertFalse(LeapYear.isLeap(600));
		
		System.out.println("1800 |"+(1800 % 400 == 0));
		assertFalse(LeapYear.isLeap(1800));
	}
	

}
