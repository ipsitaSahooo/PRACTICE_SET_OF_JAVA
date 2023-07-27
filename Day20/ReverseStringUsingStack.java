class Solution {
    public void reverseString(char[] s) 
    {
        Stack<Character> st=new Stack<>();

        for(char ch:s)
        {
            st.push(ch);
        }
        int i=0;
        while(!st.isEmpty())
        {
            s[i]=st.pop();
            i++;
        }
    }
}

//O(N)=TC
//O(1)=SC
