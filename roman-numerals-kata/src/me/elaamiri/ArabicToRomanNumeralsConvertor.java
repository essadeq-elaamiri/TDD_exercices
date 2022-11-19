package me.elaamiri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArabicToRomanNumeralsConvertor {
	
	private static Map<Integer, String> bases = new HashMap<>();
	public ArabicToRomanNumeralsConvertor() {
		this.bases.put(1, "I");
		this.bases.put(4, "IV");
		this.bases.put(5, "V");
		this.bases.put(9 , "IX");
		this.bases.put(10, "X");
		this.bases.put(40,  "XL");
		this.bases.put(50,  "L");
		this.bases.put(90, "XC");
		this.bases.put(100, "C");
		this.bases.put(400, "CD");
		this.bases.put(500, "D");
		this.bases.put(900, "CM");
		this.bases.put(1000, "M");
	}
			
	
	public String convert(int arabicNumber) {
		String roman = "";
		
		List<Integer> keysList = new ArrayList(bases.keySet());
		Collections.sort(keysList, Collections.reverseOrder());
		Set<Integer> keys = new LinkedHashSet(keysList);
		
		for(Integer key: keys) {
			while(arabicNumber >= key) {
				roman += bases.get(key);
				arabicNumber -= key;
			}
		}
		/*
		if(arabicNumber == 500) return "D";
		if(arabicNumber == 400) return "CD";
		if(arabicNumber<500 && arabicNumber>100) return "C".repeat(arabicNumber/100);
		if(arabicNumber == 100) return "C";
		if(arabicNumber == 90) return "XC";
		if(arabicNumber<100 && arabicNumber>50) return "L"+"X".repeat(arabicNumber/10 - 5);
		if(arabicNumber == 50) return "L";
		if(arabicNumber == 40) return "XL";
		if(arabicNumber<50 && arabicNumber>10) return "X".repeat(arabicNumber/10);
		if(arabicNumber == 10) return "X";
		if(arabicNumber == 9) return "IX";
		if(arabicNumber<9 && arabicNumber>5) return "V"+"I".repeat(arabicNumber-5);
		if(arabicNumber == 5) return "V";
		if(arabicNumber == 4) return "IV";
		*/
		return roman;
	}
	
	public static String findBase(int number) {
		if(bases.containsKey(number)) return bases.get(number);
		int temp = number / 5;
		List<Integer> keysList = new ArrayList(bases.keySet());
		Collections.sort(keysList, Collections.reverseOrder());
		Set<Integer> keys = new LinkedHashSet(keysList);
		
		System.out.println(keys.toString());
		
		for(int key: keys) {
			if(number >= key && Math.abs(temp - (key/5)) < 10) return bases.get(key);
		}
		
		return "M";
	}
	
	private static int findBase2(int number) {
		if(bases.containsKey(number)) return number;
		int temp = number / 5;
		List<Integer> keysList = new ArrayList(bases.keySet());
		Collections.sort(keysList, Collections.reverseOrder());
		Set<Integer> keys = new LinkedHashSet(keysList);
		
		System.out.println(keys.toString());
		
		for(int key: keys) {
			if(number >= key && Math.abs(temp - (key/5)) < 10) return key;
		}
		
		return 1000;
	}

}
