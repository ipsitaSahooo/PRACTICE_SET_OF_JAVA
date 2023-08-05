//redundant brackets are those brackets that are useless
//eg- ((a*b))  -   the outer bractes are useless
// so in case of redundant brackets return true else return false

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static boolean findRedundantBrackets(String s) 
    {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch=='(' || ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                st.push(ch);
            }
            else
            {
                //its either a closing bracket or a lowercase character
                if(ch==')')
                {
                    boolean ans=true;

                    while(st.peek()!='(')
                    {
                        char ch1=st.peek();
                        if(ch1=='+' || ch1=='-' || ch1=='*' || ch1=='/')
                        {
                            ans=false;
                        }
                        st.pop();

                    }
                    if(ans==true)
                    return true;

                    st.pop();
                }
            }
        }

        return false;
    }
}

//TC = O(n)
