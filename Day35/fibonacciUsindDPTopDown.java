// SC=O(N)
// TC=O(N)
//TOP DOWN APPROACH
import java.util.*;
public class Solution 
{
	public static int fib(int n, int[] dp)
	{
		if(n==1 || n==0)
		return n;

		if(dp[n] != -1)
		return dp[n];

		dp[n]=fib(n-1,dp) + fib(n-2,dp);
		return dp[n];
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int dp[]=new int[n+1];
		
		//initialise the array with -1
		for(int i=0;i<n+1;i++)
		{
			dp[i]=-1;
		}
		
    System.out.println(fib(n,dp));
	}
}
