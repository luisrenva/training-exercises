/**
 * Two Sum  TITLE
 * Given an array of integers and a value, determine if there are any two integers in the array
 * whose sum is equal to the given value. Return true if the sum exists and return false if it does not
 * array test = [5, 7, 1, 2, 8, 4, 3]
 */

class SumResult {

    public static void main (String [] args) {
        StringBuilder deleteDuplicates = new StringBuilder();
        int [] avoidDuplicateValues = new int [10];
        int k = 0;
        int array [] = { 5 , 7 , 1,  2, 8, 4 , 3};
        int target = 10;
        for (int i=0; i < array.length; i++) {
            for (int j=0; j < array.length; j++) {
                if (i == j) continue;

                if (array[i] + array[j] == target) {
                    if (deleteDuplicates.toString().contains(String.valueOf(array[i])) || deleteDuplicates.toString().contains(String.valueOf(array[j]))) {
                        continue;
                    }
                    deleteDuplicates.append(array[i]).append(array[j]);
                    System.out.println("Number: " + array[i] + "  number: "+ array[j] + "  matched the target: " +target);
                }
            }
        }
    }
}
