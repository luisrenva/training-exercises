package leetcode.exercises;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateChar {

//	public static void main(String[] args) {
//		String result = firstDuplicatedCharacter("abcdefgabzyh");
//		System.out.println(result);
//
//	}
	
	static String firstDuplicatedCharacter(String chain) {
		String [] chainArray = chain.split("");
		Set<String> validateChar = new HashSet<>();
		
		for(String letter: chainArray) {
			if(!validateChar.add(letter)) {
				return letter;
			}
		}
		return "";
	}

}
