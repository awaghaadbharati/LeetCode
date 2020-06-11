package Completed;

public class LongestPalindromicSubstringLC5 {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
	}

	/* Time limit exceeded
	 * public static String longestPalindrome(String s) { int strLen = s.length();
	 * for (int i = strLen; i > 0; i--) { for (int j = 0, k = i + j; k <= strLen;
	 * j++, k++) { String result = s.substring(j, k); //System.out.println(result);
	 * if (isPalindrome(result)) return result; } } return null; }
	 * 
	 * public static boolean isPalindrome(String s) { StringBuilder str = new
	 * StringBuilder(s);
	 * 
	 * if (s.equals(str.reverse().toString())) return true; return false; }
	 */	public static String longestPalindrome(String s)
	{
		int strLen=s.length();
		boolean dp[][]=new boolean[strLen][strLen];
		int startIndex=0;
		//int endIndex=1;
		int maxLength=1;
		for(int i=0;i<strLen;i++)
		{
			dp[i][i]=true;
		}
		for(int i=0;i<strLen-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				dp[i][i+1]=true;
				startIndex=i;
				maxLength=2;
			}
			else
			{
				dp[i][i+1]=false;
			}
		}
		int k=3;
		while(k<=strLen)
		{
			for(int i=0,j=i+k-1;j<strLen;i++,j++)
			{
				dp[i][j]=dp[i+1][j-1] && (s.charAt(i)==s.charAt(j));
				if(maxLength<k && dp[i][j])
				{	maxLength=k;
					startIndex=i;
				}
					
			}
			k++;
		}
		return s.substring(startIndex, startIndex+maxLength);
	}
	
}
 