class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxLen = 0;
        for(int num: set){
            if(!set.contains(num-1)){
                int curr = num;
                int len = 1;
                while(set.contains(num+1)){
                    len++;
                    num++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}