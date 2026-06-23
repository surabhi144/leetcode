class Solution {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return robbing(nums, 0, memo);
    }
    int robbing(int[] nums, int i, int[] memo){
        if(i >= nums.length)
         return 0;
        if(memo[i] >= 0)
         return memo[i]; 
        memo[i] = Math.max(robbing(nums, i+1, memo), robbing(nums, i+2, memo) + nums[i]);
        return memo[i];
    }
}