class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> sl = new Stack<>();
        Stack<Integer> sr = new Stack<>();
        long[] left = new long[n];
        long[] right = new long[n];

        for(int i = 0; i<n; i++){
            while(!sl.isEmpty() && arr[sl.peek()] > arr[i])
             sl.pop();
            left[i] = sl.isEmpty() ? i+1 : i - sl.peek();
            sl.push(i); 
        }
        for(int i = n-1; i>=0; i--){
            while(!sr.isEmpty() && arr[sr.peek()] >= arr[i])
             sr.pop();
            right[i] = sr.isEmpty() ? n-i : sr.peek() - i;
            sr.push(i); 
        }

        long result = 0;
        for(int i = 0; i<n; i++){
            result = (result+arr[i] * left[i] * right[i]) % 1000000007;
        }
        return (int)result;
    }
}