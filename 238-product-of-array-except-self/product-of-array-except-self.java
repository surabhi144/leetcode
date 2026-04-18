class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int current = 1;
        for(int i = 0 ; i<n ; i++){
            ans[i] = current;
            current = current * nums[i];
        }
        current = 1;
        for(int i = n-1; i>=0 ; i--){
            ans[i] = current * ans[i];
            current = current * nums[i];
        }
        return ans;
    }
}