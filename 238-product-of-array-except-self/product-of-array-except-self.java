class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int pref = 1;
        int suff = 1;
        for(int i = 0; i < n ; i++){
            prefix[i] = pref * nums[i];
            pref = prefix[i];
        }
        for(int i = n-1; i>=0 ; i--){
            suffix[i] = suff * nums[i];
            suff = suffix[i];
        }
        for(int i = 0 ; i<n ; i++){
            if(i == 0)
             ans[i] = suffix[i+1];
            else if(i == n-1)
             ans[i] = prefix[i-1]; 
            else 
             ans[i] = prefix[i-1] * suffix[i+1];
        }
        return ans;
    }
}