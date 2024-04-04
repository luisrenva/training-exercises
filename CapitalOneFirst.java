package exercises;

//Given an String  "example of message" and with a limit, determine how many message I need to send by phone
// in case the number of character in string overpass the limit, if we exceed the limit then we split the string and
//concatenate <1/3> where 1 means 1 message of 3(total)
public class CapitalOneFirst {

	public static void main(String[] args) {
		calculateNumberOfMessages("My first message calculation", 8); // 10 messages
	}

	public static String calculateNumberOfMessages(String message, int limit) {
		String [] messages = {};
		StringBuilder response = new StringBuilder();
		int sizeOfMessage = message.length();

		if (sizeOfMessage > limit) {
			messages = message.split("");
			limit = limit -5; // this is because five is the concatenacion <1/total>
			int numberOfMessage = (int) Math.ceil((double) sizeOfMessage / (double) limit);

			int count = 0;
			
			if (numberOfMessage > 1) {
				int countMessages = 1;
				for (int i=0; i < sizeOfMessage; i++) {
					response.append(messages[i]);

					if (countMessages == limit) {
						count ++;
						response.append("<").append(count).append("/").append(numberOfMessage).append(">").append("\n");
						countMessages = 0;
					}
					countMessages ++;
					
					if (i == sizeOfMessage -1 ) {
						response.append("<").append(count+1).append("/").append(numberOfMessage).append(">");
					}
					
					
				}
				
				
								
			}
			
			//My first message calculation
			
//			for (String values : messages) {
//				System.out.println(values + "\n");
//			}
			
		} else {
			response.append(message);
		}
		System.out.println(response);
		return response.toString();
	}

}
