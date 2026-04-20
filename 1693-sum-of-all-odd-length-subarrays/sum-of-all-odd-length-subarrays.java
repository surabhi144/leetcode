class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for(int i = 0; i<len; i++){
            sum += arr[i];
            int currSum = arr[i];
            for(int j = i+1; j<len; j++){
                currSum += arr[j];
                if((i + j - 1)%2 == 1 )
                 sum += currSum;
            }
        }
        return sum;
    }
}