package Demo;

import java.util.Arrays;

public class FibonacciMemorization {
	static int fibonacci(int n,int[] dp) {
		//Base cases
		if(n<=1) {
			return n;
		}
		//Already calculated
		if(dp[n] != -1) {
			return dp[n];
		}
		//Calculate and store
		dp[n] = fibonacci(n-1,dp)
				+fibonacci(n-2,dp);
		return dp[n];
	}
	public static void main(String[] args) {
		int n = 10;
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		int result = fibonacci(n,dp);
		System.out.println("Fibonacci = "+result);
	}
}

//o/p:-
//Fibonacci = 55
