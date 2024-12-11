package leetcode.exercises;
import java.util.Arrays;

// Problem Statement
// You are given an array of positive numbers from 1 to n, such that all numbers from 1 to n
//  are present except one number, x. You have to find x. The input array is not sorted
// complexity O(n)
class MissingNumber {
    //TODO: add logic in case that is missing more than 1 number
    public static void main (String ... args) {
        int array[] = { 1, 4, 2, 6, 3 };
        Arrays.sort(array);

        int arraySize = array.length - 1;

        for (int i=0; i<= arraySize; i++) {
            if (arraySize == i) return;

            int currentPlusOne = array[i] + 1; 
            int nextValue = array[i+1];

            if (currentPlusOne != nextValue) {
                System.out.println("Missing value:  "+currentPlusOne);
                return;
            }
        }
    }
}