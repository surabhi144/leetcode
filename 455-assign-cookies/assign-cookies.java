class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0;
        int happy = 0;
        for(int i = 0; i<s.length;i++){
            if(j<g.length && s[i] >= g[j]){
                happy++;
                j++;
            }
        }
        return happy;
    }
}