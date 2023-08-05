import java.util.Stack;

public class Solution 
{
	public static void insertAtBottom(Stack<Integer> stack,int x)
	{
		if(stack.isEmpty())
		{
			stack.push(x);
			return;
		}

		int n=stack.peek();
		stack.pop();

		insertAtBottom(stack,x);
		stack.push(n);
	}
    
	public static void reverseStack(Stack<Integer> stack) 
	{
		if(stack.isEmpty())
		return;

		int num=stack.peek();
		stack.pop();

		//recusrioveCall
		reverseStack(stack);

		insertAtBottom(stack,num);		
	}

}
