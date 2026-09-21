package Demo;

class FibonacciTabulation {
	static int fibonacci(int n) {
		//Base cases
		if(n<=1) {
			return n;
		}
		
		//Create DP Array
		int[] dp = new int[n+1];
		
		//Initialize first two fibonacci numbers
		dp[0] = 0;
		dp[1] = 1;
		
		//Build the table from bottom to up
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		
		//Return nth Fibonacci number
		return dp[n];
	}
	public static void main(String[] args) {
		int n=10;
		System.out.println("Fibonacci = "+fibonacci(n));
	}
}

//o/p:-
//Fibonacci = 55
