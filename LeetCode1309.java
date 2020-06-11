package Completed;

public class LeetCode1309 {
	public static void main(String[] args) {
		// add 96 to character

		String s = "10#11#12";
		System.out.println(freqAlphabets(s));
	}

	public static String freqAlphabets(String s) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int num = 0;
			if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
				num = Integer.parseInt(s.substring(i, i + 2)) + 96;
				i = i + 2;
			} else
				num = Integer.parseInt(Character.toString(s.charAt(i))) + 96;
			result.append(Character.toString((char) num));
		}
		return result.toString();
	}
}
