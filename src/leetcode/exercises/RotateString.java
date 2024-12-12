package leetcode.exercises;

//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//A shift on s consists of moving the leftmost character of s to the rightmost position.

public class RotateString {

//	public static void main(String[] args) {
//		System.out.println(rotate("abcde", "cdeab"));
//	}

	public static boolean rotate(String s, String goal) {
		if (s == null || s.length() == 0 || s.length() != goal.length()) {
			return false;
		}
		return (s + s).contains(goal);

	}

}
