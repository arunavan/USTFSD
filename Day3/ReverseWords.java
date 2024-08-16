package Day3;

public class ReverseWords {

	public static void main(String[] args) {
		
		String words = "i love programming very much";
		StringBuilder rWords = new StringBuilder();
		StringBuilder word = new StringBuilder();
		for(char c: words.toCharArray()) {
			word.append(c);
			if(c==' ')
			{
				rWords.insert(0, word);
				word.setLength(0);
				
			}
		}
		rWords.insert(0," ");
		rWords.insert(0,word);
		System.out.print(rWords);

	}

}
