package LeetCode;
//Kadane's algorithm

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            currentSum = Math.max(nums[i], currentSum+nums[i]); // *
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}

/*
currentSum = Math.max(nums[i], currentSum+nums[i]); ->

if nums[i] is greater than the previous sum + nums[i] then with the previous sum it will never make a greater value so we
are leaving the previous values and continue fresh with the current element 
*/