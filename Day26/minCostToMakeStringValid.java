// Min extra brackets required or min bracket reversals required to make a string valid

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMinimumCost(String str) 
    {
      
      //odd condition
      if(str.length()%2 == 1)
      {
        return -1;
      }

      Stack<Character> s=new Stack<>();

      for(int i=0;i<str.length();i++)
      {
        char ch=str.charAt(i);

        if(ch=='{')
        {
          s.push(ch);
        }
        else
        {
          //ch is closed brace
          if(!s.isEmpty() && s.peek()=='{')
          {
            s.pop();
          }
          else
          {
            s.push(ch);
          }
        }
    }
     //stack contains invalid expression
        int a=0;
        int b=0;

        while(!s.isEmpty())
        {
          if(s.peek()=='{')
          {
            b++;
          }
          else
          {
            a++;
          }
          s.pop();
        }

        int ans=(a+1)/2 + (b+1)/2;

        return ans;
      }
}
