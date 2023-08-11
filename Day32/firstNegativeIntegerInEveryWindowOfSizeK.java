class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long ans[]=new long[N-K+1];
        Deque<Long> que=new LinkedList<>();
        
        for(int i=0;i<N;i++){
            if(A[i]<0){
                que.add(A[i]);
            }
            
            if(i>=K-1){
                
                if(que.isEmpty()){
                    ans[i-K+1]=0;
                }else{
                    ans[i-K+1]=que.peekFirst();
                }
                if(A[i-K+1]<0){
                    que.removeFirst();
                }
            }
        }
        return ans;
    }
}
