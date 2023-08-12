class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) 
    {
        //pop first k elements from queue and put in stack
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++)
        {
            st.push(q.remove());
        }
        
        //fetch from stack and push to queue
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }
        
        //fetch n-k elements in queue and push back in queue
        int len=q.size()-k;
        while(len>0)
        {
            q.add(q.remove()); 
            len--;
        }
        
        return q;
    }
}
