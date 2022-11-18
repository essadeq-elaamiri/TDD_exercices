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
}
