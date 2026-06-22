class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int shortest = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            sum += nums[i];
            if(sum >= target){
                shortest = Math.min(shortest, i - j +1);
                while(sum >= target){
                    shortest = Math.min(shortest, i - j +1);
                    sum -= nums[j];
                    j++;
                }
            }
        }
        return shortest == Integer.MAX_VALUE ? 0 : shortest;
    }
}