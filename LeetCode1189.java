import java.util.HashMap;
import java.util.Map;

public class LeetCode1189 {
public static void main(String[] args) {
	String text="\"krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw\"";
	   	String balloon="balon";
		int count=Integer.MAX_VALUE;
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<text.length();i++)
		{
			if(balloon.indexOf(text.charAt(i))!=-1)
			{
				if(!map.containsKey(text.charAt(i)))
					map.put(text.charAt(i), 1);
				else
					map.put(text.charAt(i),map.get(text.charAt(i))+1);
			}
		}
		for(int i=0;i<balloon.length();i++)
		{
	        if(!map.containsKey(balloon.charAt(i)))
	        {
	                count=0;
			        return count;    
	        }
	        if((balloon.charAt(i)=='l' || balloon.charAt(i)=='o') && map.containsKey(balloon.charAt(i)))
	        {
	        	map.put(balloon.charAt(i),map.get(balloon.charAt(i))/2);
	    		
	        }
	            
	        if(count>map.get(balloon.charAt(i)))
				count=map.get(balloon.charAt(i));
		}
	}
}
