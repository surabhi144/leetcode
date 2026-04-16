class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int mx = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            int left = 0, right = 0;
            if(map.containsKey(num))
             continue;
            if(map.containsKey(num-1))
             left = map.get(num-1);
            if(map.containsKey(num+1))
             right = map.get(num+1);
            map.put(num, left + right +1);
            map.put(num - left, 1+left+right);
            map.put(num + right, 1+left+right);
            mx = Math.max(mx, map.get(num));   
        }
        return mx;
    }
}