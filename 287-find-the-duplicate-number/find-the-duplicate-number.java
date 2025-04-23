class Solution {
    public int count(int mid, int[] nums){
        int c = 0;
        for(int num: nums){
            if(num <= mid)
             c++;
        }
        return c;
    }
    public int findDuplicate(int[] nums) {
       int low = 1, high = nums.length - 1;
       int mid = -1;
       while(low<high){
        mid = low + (high-low)/2;
        int c = count(mid,nums);
        if(c > mid)
         high = mid;
        else
         low = mid + 1; 
       }
       return low;
    }
}