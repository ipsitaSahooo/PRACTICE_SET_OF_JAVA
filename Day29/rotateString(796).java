lass Solution {
    public boolean rotateString(String s, String goal) 
    {
       return (s.length()==goal.length() && (s+s).contains(goal)); 
    }
}

OR(not so optimal)
    
import java.util.*;
class Solution 
{
    public boolean rotateString(String s, String goal) 
    {
        int n=s.length();
        for(int i=0;i<s.length();i++)
        {
            s=s.substring(1,n)+s.charAt(0);
            if(s.equals(goal))
            return true;
        }
        return false;
    }
}
