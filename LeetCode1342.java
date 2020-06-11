public class LeetCode1342 {
public static void main(String[] args) {
	int num=14;
	int count=0;
	while(num!=0)
	{
		if(num%2!=0)
		{
			num=num-1;
			count++;
		}
		else {
			num=num/2;
			count++;
		}
	}
	return count;
	
}	
}
