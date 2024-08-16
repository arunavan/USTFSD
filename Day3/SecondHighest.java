package Day3;

public class SecondHighest {

	public static void main(String[] args) {

		int arr[] = {2,1,3,4,5,6,7,89,3,4};
		int max=Integer.MIN_VALUE;
		int max2 = arr[0];
		
		if(arr.length<2)
		{
			System.out.print("There is no Second Max Element");
		}
		else 
		{
			for(int i:arr)
			{
				if(i>max) {
					max2 = max;
					max = i;
				}
					
			}
			System.out.print("2nd Max : "+max2);
		}

	}

}
