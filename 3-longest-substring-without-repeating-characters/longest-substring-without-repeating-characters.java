class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> cSet = new HashSet<>();
        int n = s.length(), j = 0;
        int count = 0;
        int mCount = 0;
        for(int i = 0; i<n ; i++){
            if(!cSet.contains(s.charAt(i))){
                count++;
                cSet.add(s.charAt(i));
            }
            else{
                mCount = Math.max(count, mCount);
                while(j<i && cSet.contains(s.charAt(i))){
                    cSet.remove(s.charAt(j));
                    j++;
                    count--;
                }
                cSet.add(s.charAt(i));
                count++;
            }
        }
        mCount = Math.max(count, mCount);
        return mCount;
    }
}