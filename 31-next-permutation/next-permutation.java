class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        for(int i = nums.length - 2; i>=0; i--){
            if(nums[i] < nums[i+1])
             {
                idx = i;
                break;
             }
        }
        if(idx == -1)
         {
            Arrays.sort(nums);
            return;
         }
         int nxt = -1;
         for(int i = idx+1; i<nums.length; i++){
            if(nums[i] > nums[idx])
             {
                nxt = i;
             }
         }
         int temp = nums[nxt];
         nums[nxt] = nums[idx];
         nums[idx] = temp;
         rev(nums, idx+1, nums.length - 1);
    }

    void rev(int []nums, int i, int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}