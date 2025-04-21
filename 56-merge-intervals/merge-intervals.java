class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int size = intervals.length;
        int[][] res = new int[size][2];
        int first = intervals[0][0];
        int last = intervals[0][1];
        int idx = 0;
        for(int i = 1; i<size; i++){
            if(last >= intervals[i][0])
             last = Math.max(last, intervals[i][1]);
            else
            {
                res[idx][0] = first;
                res[idx][1] = last;
                idx++;
                first = intervals[i][0];
                last = intervals[i][1];
            } 
        }
        res[idx][0] = first;
        res[idx][1] = last;
        res = Arrays.copyOfRange(res, 0, idx+1);
        return res;
    }
}