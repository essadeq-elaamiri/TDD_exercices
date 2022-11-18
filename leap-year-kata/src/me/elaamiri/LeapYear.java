package me.elaamiri;

public class LeapYear {
	
	public static boolean isALeapYear(int year) {
		if(year % 100 == 0) {
			if(year % 400 == 0) return true;
			return false;
		}
		else if(year % 400 == 0) {
			return true;
		}
		else if(year % 4 == 0) {
			return true;
		}
		
		return false;
	}
	
	// Other professional approach
	
	public static boolean isLeap(int year) {
		return isDivisibleBy(year, 100) ? isDivisibleBy(year, 400): isDivisibleBy(year, 4);
	}
	
	private static boolean isDivisibleBy(int year, int value) {
		return year % value  == 0;
	}
}
