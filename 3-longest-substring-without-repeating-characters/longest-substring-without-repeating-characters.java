class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int len = s.length();
        int j = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<len; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                j = Math.max(j, map.get(c) + 1);
            }
            map.put(c, i);
            maxLen = Math.max(maxLen, i-j+1);
        }
        return maxLen;
    }
}