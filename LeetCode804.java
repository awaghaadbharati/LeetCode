import java.util.HashSet;

public class LeetCode804 {
public static void main(String[] args) {
	String words[] = {"gin", "zen", "gig", "msg"};
	System.out.println(uniqueMorseRepresentations(words));
}
public static int uniqueMorseRepresentations(String[] words) {
	String morseCode[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	HashSet<String> set=new HashSet<String>();
	for(int i=0;i<words.length;i++)
	{
		StringBuilder stringBuilder=new StringBuilder();
		String str=words[i];
		for(int j=0;j<str.length();j++)
		{
			stringBuilder.append(morseCode[str.charAt(j)-'a']);
		}
		set.add(stringBuilder.toString());
	}
	return set.size();
}
}
