public class highfreq{
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,3,4,6,7,8,5,3,6,7,8,3};
        int maxCount = 0;
        int mostFrequentElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = arr[i];
            }
        }
        System.out.println("Element with highest frequency: " + mostFrequentElement);
    }
}
