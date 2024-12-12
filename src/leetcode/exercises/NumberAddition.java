package leetcode.exercises;

//Coderbyte: Have the function NumberSearch(str) take the str parameter, search for all the numbers in the string, add them together, then return that final number.
//For example: if str is "88Hello 3World!" the output should be 91. You will have to differentiate between single digit numbers and multiple digit numbers like in the example above. So

public class NumberAddition {

	public static void main(String[] args) {
//		int response = NumberAddition("75Number9");
		int response = sum("88Hello 3World!");
		System.out.println(response);

	}

	public static int sum(String value) {
		String[] newArray = value.split("");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i].matches("\\d")) {
				sb.append(newArray[i]);
				if (i > 0) {
					if (i < newArray.length - 1) {
						if (!newArray[i + 1].matches("\\d")) {
							sb.append(",");
						}
					}
				}

			}
		}
		String[] temp = sb.toString().split(",");
		int response = 0;
		for (String tmpValue : temp) {
			response += Integer.parseInt(tmpValue);
		}

		return response;
	}

}
