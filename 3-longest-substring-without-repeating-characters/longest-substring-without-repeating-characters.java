class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int len = s.length();
        int j = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<len; i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen, i-j+1);
        }
        return maxLen;
    }
}