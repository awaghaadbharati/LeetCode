import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode383 {
	public static void main(String[] args) {

		System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
		char ransomNoteArray[] = ransomNote.toCharArray(); 
        Arrays.sort(ransomNoteArray);
        char magazineArray[] = ransomNote.toCharArray(); 
        Arrays.sort(magazineArray);
        if(ransomNoteArray.length>magazineArray.length)
        	return false;
        for(int i=0; i<ransomNoteArray.length;i++)
		{
			if(ransomNoteArray[i]<=magazineArray[i])
				return false;
			
		}
		
		return true;
		
	}
	/*
	 * public static boolean canConstruct(String ransomNote, String magazine) { if
	 * (magazine.length() < ransomNote.length()) return false; else {
	 * HashMap<Character, Integer> ransomMap = new HashMap<Character, Integer>();
	 * HashMap<Character, Integer> magazineMap = new HashMap<Character, Integer>();
	 * for (int i = 0; i < ransomNote.length(); i++) { if
	 * (!ransomMap.containsKey(ransomNote.charAt(i)))
	 * ransomMap.put(ransomNote.charAt(i), 1); else
	 * ransomMap.put(ransomNote.charAt(i), ransomMap.get(ransomNote.charAt(i)) + 1);
	 * } for (int i = 0; i < magazine.length(); i++) { if
	 * (ransomMap.containsKey(magazine.charAt(i))) { if
	 * (!magazineMap.containsKey(magazine.charAt(i)))
	 * magazineMap.put(magazine.charAt(i), 1); else
	 * magazineMap.put(magazine.charAt(i), magazineMap.get(magazine.charAt(i)) + 1);
	 * }
	 * 
	 * } if (ransomMap.size() > magazineMap.size()) return false; for
	 * (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
	 * if(!magazineMap.containsKey(entry.getKey())) return false; if
	 * (entry.getValue() > magazineMap.get(entry.getKey())) return false; } } return
	 * true; }
	 */}
