package Day3;
import java.util.HashSet;

public class CountSubsequences {
	final static HashSet <String> set = new HashSet<String>();

	public static void main(String[] args) {
		String str = "var";
		
		subsequence(str,0,"");
		System.out.print(set.size());

	}
	public static void subsequence(String str,int index, String sub)
	{
		if(index<str.length())
		{
			subsequence(str, index+1, sub+str.charAt(index));
			subsequence(str,index+1,sub);
		}
		else {
			set.add(sub);
		}
		
		
	}

}
