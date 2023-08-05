//LEETCODE QUES 921
//SIMILAR TO MIN COST TO MAKE A STRING VALID
//HERE ANS IS NO. OF EXTRA BRACES TO BE ADDED


//1ST APPROACH

class Solution {
    public int minAddToMakeValid(String s) 
    {
        int left =0;
        int right =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                left++;
            }
            else{
                if(left>0) left--;
                else right++;
            }
        }
        return left+right;
    }
}

//2ND APPRAOCH using stack

class Solution {
public:
    int minAddToMakeValid(string s) {
        stack <char> st;
        for(int i = 0; i < s.size(); i++)
        {
            if(s[i] == '(')
            {
                st.push(s[i]);
            }
            else
            {
                if(!st.empty() && st.top() == '(')
                {
                    st.pop();
                }
                else
                {
                    st.push(s[i]);
                }
            }
        }
        int a = 0, b = 0;
        while(!st.empty())
        {
            if(st.top() == ')')
            {
                a++;
                st.pop();
            }
            else 
            {
                b++;
                st.pop();
            }
        }

        return a + b;
    }
}
