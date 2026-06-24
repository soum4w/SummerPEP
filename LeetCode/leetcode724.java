package LeetCode;
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0, sum = 0;
        for(int ele:nums) sum+=ele;
        for(int i=0; i<n; i++){
            right = sum - left - nums[i];
            if(right == left) return i;
            left += nums[i];
        }
        return -1;
    }
}