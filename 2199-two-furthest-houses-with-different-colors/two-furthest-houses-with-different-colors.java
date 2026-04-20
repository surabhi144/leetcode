class Solution {
    public int maxDistance(int[] colors) {
        int maxD = 0;
        int n = colors.length;
        for(int i = 0; i<n; i++){
            if(colors[i] != colors[0])
             maxD = Math.max(maxD, i);
            if(colors[i] != colors[n-1])
             maxD = Math.max(maxD, n-1-i); 
        }
        return maxD;
    }
}