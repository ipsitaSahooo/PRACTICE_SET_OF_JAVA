//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //to check if a knows b or not
    boolean know(int M[][],int a,int b)
    {
        if(M[a][b] == 1)
        return true;
        else
        return false;
    }
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        Stack<Integer> st=new Stack<>();
        
        
        //step 1 - push all elements in stack;
        for(int i=0;i<n;i++)
        {
            st.push(i);
        }
        
        //step 2 
        while(st.size()>1)
        {
            int a=st.peek();
            st.pop();
            
            int b=st.peek();
            st.pop();
            
            if(know(M,a,b))
            {
                st.push(b);
            }
            else
            {
                st.push(a);
            }
        }
        
        int celeb=st.peek();
        
        //step 3 - you will be left with single element in the stack  
        //so verify it
        //2 conditions - in row all zero and in col all 1 except diagonal
        
        //row Check
        boolean rowCheck=false;
        int zeroCount=0;
        
        for(int i=0;i<n;i++)
        {
            if(M[celeb][i]==0)
            zeroCount++;
        }
        
        if(zeroCount==n)
        rowCheck=true;
        
        
        //COLUMN CHECK
        boolean colCheck=false;
        int oneCount=0;
        
        for(int i=0;i<n;i++)
        {
            if(M[i][celeb]==1)
            oneCount++;
        }
        
        if(oneCount==n-1)
        colCheck=true;
        
        
        
        if(rowCheck == true  && colCheck == true)
        return celeb;
        
        else
        return -1;
    }
}
