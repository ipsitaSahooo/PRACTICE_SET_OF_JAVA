//{ Driver Code Starts
import java.util.*;

class TwoStack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			twoStacks g = new twoStacks();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a);
					else if(stack_no ==2)
					 g.push2(a);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1()+" ");
					else if(stack_no==2)
					System.out.print(g.pop2()+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}


// } Driver Code Ends



class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    //Function to push an integer into the stack1.
    // Push in stack 1.
	public void push1(int x) {
		// Write your code here
		if ((top2-top1)>1){
           top1++;
           arr[top1]=x;
        }
	}

	// Push in stack 2.
	public void push2(int x) {
		// Write your code here
		if ((top2-top1)>1){
           top2--;
           arr[top2]=x;
       }
	}

	// Pop from stack 1 and return popped element.
	public int pop1() {
		// Write your code here
		if (top1>=0)
        {
            int ans=arr[top1];
            top1--;
            return ans;
        }
        else 
            return -1;
	}

	// Pop from stack 2 and return popped element.
	public int pop2() {
		// Write your code here
		if (top2 < size) 
        {
            int ans=arr[top2];
            top2++;
            return ans;
        }
        else 
            return -1;
	}
}

