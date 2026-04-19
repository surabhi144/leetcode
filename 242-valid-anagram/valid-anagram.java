class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray(); 
        Arrays.sort(charS);

        char[] charT = t.toCharArray();
        Arrays.sort(charT);               

        String sortedS = new String(charS);
        String sortedT = new String(charT);

        return sortedS.equals(sortedT);
    }
}