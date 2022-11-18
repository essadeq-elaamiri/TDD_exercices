package me.elaamiri;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzParameterizedTest {
	private String expected;
	private int number;
	
	public FizzBuzzParameterizedTest(String expected, int number) {
		this.expected = expected;
		this.number = number;
	}
	
	@Parameters
	public static Collection<Object[]> inputOutpu() {
		return List.of(
				new Object[] {"1", 1 },
				new Object[] {"2", 2 },
				new Object[] {"Fizz", 3 },
				new Object[] {"4", 4 },
				new Object[] {"Buzz", 5 },
				new Object[] {"Fizz", 6 },
				new Object[] {"7", 7 },
				new Object[] {"8", 8 },
				new Object[] {"Fizz", 9 },
				new Object[] {"Buzz", 10 },
				new Object[] {"11", 11 },
				new Object[] {"Fizz", 12 },
				new Object[] {"13", 13 },
				new Object[] {"14", 14 },
				new Object[] {"FizzBuzz", 15 }
				);
	}
	
	@Test
	public void test() {
		
		System.out.println(String.format("Ex: %s | Res: %d", expected, number));
		assertEquals(expected, FizzBuzz.fizzBuzz(number));
	}

}
