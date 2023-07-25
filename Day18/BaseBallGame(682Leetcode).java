class Solution {
    public int calPoints(String[] operations) 
    {
        Stack<Integer> st = new Stack<>();
        int sum=0;

        int n=operations.length;
        for(int i=0;i<n;i++)
        {
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.push(2* st.peek());
            }
            else if(operations[i].equals("+") && st.size()>=2){
                int x = st.pop();
                int y = st.pop();
                int z = x+y;

                st.push(y);
                st.push(x);
                st.push(z);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }

        }

        while(!st.isEmpty())
        {
            sum+=st.pop();
        }
        return sum;
    }
}

//TC=O(N)
//SC=O(1)
