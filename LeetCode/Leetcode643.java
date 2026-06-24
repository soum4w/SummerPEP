package LeetCode;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        //first window
        for(int i=0; i<k; i++) windowSum += nums[i];
            
        double maxSum = windowSum;
        //slide the window 
        for(int i=k; i<nums.length; i++){
            windowSum+=nums[i];
            windowSum-=nums[i-k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum/k;
    }
}