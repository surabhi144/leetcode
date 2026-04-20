class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for(int i = 0; i<len; i++){
            int subarraysStarting = len - i;
            int subarraysEnding = i + 1;
            int totalSubarrays = subarraysStarting * subarraysEnding;
            int oddSubarrays = totalSubarrays % 2 == 0 ? totalSubarrays/2 : totalSubarrays/2 + 1;
            sum += arr[i]*oddSubarrays;
        }
        return sum;
    }
}