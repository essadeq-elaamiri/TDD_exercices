package me.elaamiri;

public class FizzBuzz {

	public static String fizzBuzz(int number) {
		if(isMultipleOf(number, 3) && isMultipleOf(number, 5)) return "FizzBuzz";
		if(isMultipleOf(number, 3)) return "Fizz";
		if(isMultipleOf(number, 5)) return "Buzz";
		return String.valueOf(number);
	}
	
	private static boolean isMultipleOf(int number, int number2) {
		return number % number2 == 0;
	}
}
