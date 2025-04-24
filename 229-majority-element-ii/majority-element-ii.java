class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        if(n < 2)
         return Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> maj = new ArrayList<>();
        int maj1 = nums[0], count1 = 1, count2 = 0, maj2 = nums[0];
        for(int i = 1; i<n; i++){
            if(nums[i] == maj1)
             count1++;
            else if(nums[i] == maj2)
             count2++;
            else{
                if(count1 == 0)
                 {
                    maj1 = nums[i];
                    count1++;
                 }
                else if(count2 == 0)
                 {
                    maj2 = nums[i];
                    count2++;
                 }
                else{
                    count1--;
                    count2--;
                }  
            }  
        }
        count1 = 0; count2 = 0;
        for(int num: nums){
            if(maj1 == num)
             count1++;
            else if(maj2 == num)
             count2++; 
        }
        if(count1 > n/3)
         maj.add(maj1);
        if(count2 > n/3)
         maj.add(maj2);
        return maj; 
    }
}