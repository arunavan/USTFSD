package My_Java_Programs;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 2, 3, 4, 6, 7, 8, 5, 3, 6, 7, 8, 3};
        int mostFrequentElement = array[0];
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            // Count the occurrences of array[i]
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            // Update the most frequent element if the current count is greater than maxCount
            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = array[i];
            }
        }

        // Print the most frequent element
        System.out.println("Most frequent element: " + mostFrequentElement);
    }
}
