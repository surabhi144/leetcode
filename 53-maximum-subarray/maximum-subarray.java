class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int mSum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            mSum = Math.max(sum, mSum);
            if(sum < 0)
             sum = 0;
        } 
        return mSum;
    }
}