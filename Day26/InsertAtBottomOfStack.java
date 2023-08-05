import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
  {
    if(myStack.isEmpty())
    {
      myStack.push(x);
      return myStack;
    }

    int n=myStack.peek();
    myStack.pop();

    //recursiveCall
    pushAtBottom(myStack,x);
    myStack.push(n);

    return myStack;

  }
}
