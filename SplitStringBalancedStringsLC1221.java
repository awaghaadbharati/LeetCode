package Completed;

public class SplitStringBalancedStringsLC1221 {
	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));
	}

	public static int balancedStringSplit(String s) {
		int lCount=0,rCount=0,result=0, strLen=s.length();
		for(int i=0;i<strLen;i++)
		{
			char c=s.charAt(i);
			if(c=='L')
				lCount++;
			if(c=='R')
				rCount++;
			if(lCount==rCount)
				result++;
			
		}
		return result;
	}
}
