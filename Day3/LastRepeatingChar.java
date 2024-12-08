package Day3;

import java.util.HashMap;

public class LastRepeatingChar {

	public static void main(String[] args) {
		
		String str = "language";
		
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=str.length()-1;i>=0;i--)
		{
			char c = str.charAt(i);
			if(map.containsKey(c))
			{
				System.out.println(c);
				break;
			}
			else {
				map.put(c,1);
			}
		}

	}

}
