package leetcode.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeByteArrayCouple {

	public static void main(String[] args) {
		
		int[] arr1 = { 2, 1, 1, 2, 3, 3 };
        int[] arr2 = {5, 4, 6, 7, 7, 6, 4, 5};
        int[] arr3 = {6, 2, 2, 6, 5, 14, 14, 1};
        int[] arr4 = {4, 5, 1, 4, 5 ,4, 4, 1};
        int[] arr5 = {4, 5, 5, 4, 14, 1};
        int[] arr6 = {1, 2, 3, 4};

		System.out.println(arrayCouples(arr1)); // Output: "3,3"
		System.out.println(arrayCouples(arr2)); // Output: "yes"
		System.out.println(arrayCouples(arr3)); // Output: "5,14,14,1"
		System.out.println(arrayCouples(arr4)); // Output: "yes"
		System.out.println(arrayCouples(arr5)); // Output: "14,1"
		System.out.println(arrayCouples(arr6)); // Output: "1, 2, 3, 4"
		
		
//		System.out.println(test(arr1)); // Output: "1, 2, 3, 4"
//		System.out.println(test(arr2)); // Output: "1, 2, 3, 4"
//		System.out.println(test(arr3)); // Output: "1, 2, 3, 4"
//		System.out.println(test(arr6)); // Output: "1, 2, 3, 4"
		
	}

	public static String arrayCouples(int[] arr) {
		if (arr.length % 2 != 0) {
			return "no";
		}

		Map<String, Integer> pairCounts = new HashMap<>();

		for (int i = 0; i < arr.length; i += 2) {
			String pair = arr[i] + "," + arr[i + 1];//tomamos los primeros dos y creamos un key y su inverso
			String reversePair = arr[i + 1] + "," + arr[i];

			pairCounts.put(pair, pairCounts.getOrDefault(pair, 0) + 1);
			// we need validate in case values are the same, this counts like only 1 
			if (arr[i] != arr[i + 1]) {
				pairCounts.put(reversePair, pairCounts.getOrDefault(reversePair, 0) - 1);
			}
			
		}
		
		String responseInCaseError = new String("");
		
		for (Map.Entry<String, Integer> mapValues: pairCounts.entrySet()) {
			if (mapValues.getValue() == 1 ) {
				responseInCaseError += mapValues.getKey();
				responseInCaseError += responseInCaseError.length() > 1 ? "," : "";
			}
			
		}
		if (!responseInCaseError.equals("")) {
			if(responseInCaseError.endsWith("," )) {
				responseInCaseError = responseInCaseError.substring(0, responseInCaseError.length() -1);
			}
			return responseInCaseError;
		} else {
			return "yes";
		}

	}	

}

