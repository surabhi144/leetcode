class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n < 2)
         return n;
        int count = 1;
        int mCount = 1;
        for(int i = 1; i<n; i++){
            if(nums[i] == nums[i-1])
             continue;
            if(nums[i]-nums[i-1] == 1)
             count++;
            else
             {
                mCount = Math.max(count, mCount);
                count = 1;
             } 
        }
        mCount = Math.max(count, mCount);
        return mCount;
    }
}