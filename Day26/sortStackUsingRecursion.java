import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static void sortedInsert(Stack<Integer> stack,int x)
	{
		if((stack.isEmpty()) || (!stack.isEmpty() && stack.peek()<x))
		{
			stack.push(x);
			return;
	    }
		int n=stack.peek();
		stack.pop();

		//recursiveCall
		sortedInsert(stack,x);

		stack.push(n);
	}

	public static void sortStack(Stack<Integer> stack) 
	{
		if(stack.isEmpty())
		return;

		int num=stack.peek();
		stack.pop();

		//recursiveCall
		sortStack(stack);

		sortedInsert(stack,num);
	}

}

//TC=O(n^2)
