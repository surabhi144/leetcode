class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int mindistance = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            int reversed = 0;
            int num = nums[i];
            while (num != 0) {
             int digit = num % 10;          // get last digit
             reversed = reversed * 10 + digit; // append it
             num = num/10; 
            }
            if(mp.containsKey(nums[i])){
                mindistance = Math.min(mindistance, i - mp.get(nums[i]));
            }
            mp.put(reversed, i);
        }
        return mindistance != Integer.MAX_VALUE ? mindistance : -1 ;
    }
}