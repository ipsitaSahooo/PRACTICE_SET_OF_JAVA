
class GfG
{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q)
    {
        Stack<Integer> st=new Stack<>();
        
        while(!q.isEmpty())
        {
            st.push(q.remove());
        }
        
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }
        
        
        return q;
    }
}

//TC=O(N)
//SC=O(N)
