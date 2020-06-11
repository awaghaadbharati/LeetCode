package Completed;

public class FibonacciNumberLC509 {
	public static void main(String[] args) {
		System.out.println(fib(10));
	}

	public static int fib(int N) {
		int fib0=0;
		int fib1=1;
		if(N==0)
			return fib0;
		if(N==1)
			return fib1;
		for(int i=2;i<=N;i++)
		{
			int temp=fib1;
			fib1=fib1+fib0;
			fib0=temp;
		}
		return fib1;
	}
}
