class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // using kandanes algo
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int overallSum = 0;
        for(int i = 0;i < nums.length;i++) {
            overallSum += nums[i];
            if(currSum < 0) {
                currSum = nums[i];
            } else {
                currSum += nums[i];
            }
            maxSum = Math.max(maxSum,currSum);
        }
        //finding min subArray using kadanes
        int minSum = Integer.MAX_VALUE;
        currSum = 0;
        for(int i = 0;i < nums.length;i++) {
            currSum += nums[i];
            minSum = Math.min(minSum,currSum);
            if(currSum > 0) {
                currSum = 0;
            }
        }

        return overallSum == currSum ?maxSum : Math.max(maxSum, overallSum - minSum);
    }
}
