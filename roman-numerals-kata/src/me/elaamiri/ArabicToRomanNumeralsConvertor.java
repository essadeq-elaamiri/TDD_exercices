package me.elaamiri;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanNumeralsConvertor {
	
	private static HashMap<Integer, String> bases = 
			(HashMap<Integer, String>) Map.of(1, "I", 5, "V", 10, "X", 50, "L", 100, "C", 500, "D", 1000, "M");
	
	public static String convert(int arabicNumber) {
		if(arabicNumber == 10) return "X";
		if(arabicNumber == 9) return "IX";
		if(arabicNumber<9 && arabicNumber>5) return "V"+"I".repeat(arabicNumber);
		if(arabicNumber == 5) return "V";
		if(arabicNumber == 4) return "IV";
		return "I".repeat(arabicNumber);
	}
	
	private static String findBase(int number) {
		if(bases.containsKey(number)) return bases.get(number);
		
		for(int key: bases.keySet()) {
			if(number > key && number < (key*5)) return bases.get(key);
		}
		
		return null;
	}

}
