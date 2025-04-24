class Solution {
    public int majorityElement(int[] nums) {
        int el = nums[0];
        int count = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == el)
             count++;
            else
             {
                if(count == 0)
                 el = nums[i];
                else 
                 count--; 
             }
        }
        return el;
    }
}