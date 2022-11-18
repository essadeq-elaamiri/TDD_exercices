package me.elaamiri;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testReturnNumberAsString() {
		//assertEquals("12", FizzBuzz.fizzBuzz(12));
		//assertEquals("30", FizzBuzz.fizzBuzz(30));
		assertEquals("74", FizzBuzz.fizzBuzz(74));
		//assertEquals("714", FizzBuzz.fizzBuzz(714));
		//assertEquals("75", FizzBuzz.fizzBuzz(74));

	}
	
	// If the number is a multiple of three, return the string "Fizz".
	
	@Test
	public void testIfMulOf3Fizz() {
		//assertEquals("Fizz", FizzBuzz.fizzBuzz(30));
	}
	
	// If the number is a multiple of five, return the string "Buzz".
	@Test
	public void testIfMulOf5Fizz() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
		assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
	}
	
	@Test
	public void testIfMulOf3FizzAnd5() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
	}
	

}
