
class Solution
{
    public static void solve (Stack<Integer> inputStack, int N, int count )
	{
		if (count==N/2)
		{
			inputStack.pop();
			return;
		}
    
		int n=inputStack.peek();
		inputStack.pop();

    //recursion
		solve (inputStack, N, count+1);
    
		inputStack.push(n);
	}
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int count=0;
		solve (s, sizeOfStack, count);
    }
}
