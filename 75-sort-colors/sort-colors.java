class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0)
             zero++;
            else if(nums[i] == 1)
             one++;
            else
             two++;  
        }
        int i = 0;
        while(i < zero){
            nums[i] = 0;
            i++;
        }
        while(i < zero+one)
         {
            nums[i] = 1;
           i++;
         }
        while(i < nums.length)
         {nums[i] = 2;
         i++;
         } 
    }
}