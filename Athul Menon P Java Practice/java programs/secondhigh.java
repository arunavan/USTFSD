public class secondhigh {

    public static void main(String[] args) {
        int[] arr = {5,7,2,9,1,10,11};
        int secondHighest=0;
	for (int i = 0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    for (int i = arr.length - 1;i>=0;i--) {
        if(arr[i] == arr[i-1]){
            continue;
        }
        else{
        secondHighest = arr[i-1];
        System.out.println("The second highest value in the array is: " + secondHighest);
        break;
        }
	}
}
}
