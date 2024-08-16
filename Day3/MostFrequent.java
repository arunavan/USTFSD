package Day3;

import java.util.HashMap;

public class MostFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,5,2,3,4,6,7,8,5,3,6,7,8,3};
		HashMap<Integer,Integer> map = new HashMap<>();
		int maxEle=arr[0],maxVal=0;
		for(int i:arr) {
			if(map.containsKey(i))
			{
				map.put(i,map.get(i)+1);
				if(map.get(i)>maxVal) {
					maxEle = i;
					maxVal=map.get(i);
				}
				
			}
			else {
				map.put(i, 1);
			}
		}
		System.out.println("Element : "+maxEle);
		System.out.println("Frequency : "+maxVal);
	}

}
