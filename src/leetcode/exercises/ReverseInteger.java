package leetcode.exercises;

import java.util.Stack;

public class ReverseInteger {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int result = reverseInteger(23);
//		System.out.println("Reverse value:  "+result);
//
//	}

	static int reverseInteger(int value) {
		String valueToReverse = String.valueOf(value);
		String[] charactersInInteger = valueToReverse.split("");
		Stack<String> result = new Stack<>();

		for (String val : charactersInInteger) {
			result.push(val);
		}

		StringBuilder concat = new StringBuilder();
		while (!result.isEmpty()) {
			concat.append(result.pop());
		}

		return Integer.parseInt(concat.toString());
	}

}
