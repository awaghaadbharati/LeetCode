import java.util.HashMap;
import java.util.Map;

public class LeetCode771 {
	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";
		System.out.println(numJewelsInStones(J, S));
	}

	/*
	 * public static int numJewelsInStones(String J, String S) { HashMap<Character,
	 * Integer> map=new HashMap<Character, Integer>(); int sum=0; for(int
	 * i=0;i<J.length();i++) { map.put(J.charAt(i), 0); } for(int
	 * i=0;i<S.length();i++) { char c=S.charAt(i); if(map.containsKey(c)) map.put(c,
	 * map.get(c)+1); } for(Map.Entry<Character, Integer> entry:map.entrySet()) {
	 * sum+=entry.getValue(); } return sum; }
	 */
	public int numJewelsInStones(String J, String S) {
		char sArr[]=S.toCharArray();
		int sum=0;
		for(int i=0;i<sArr.length;i++)
		{
			if(J.indexOf(sArr[i])>=0)
				sum++;
		}
		return sum;
	}
}
