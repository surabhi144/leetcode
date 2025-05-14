class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = (0-nums[i]);
            int j = i+1, k = nums.length-1;
            List<Integer> triplet = new ArrayList<>();
            while(j<k){
                if(nums[j] + nums[k] == target){
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    ans.add(new ArrayList<>(triplet));
                    triplet = new ArrayList<>();
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }                    
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(nums[j] + nums[k] < target)
                 j++;
                else
                 k--; 
            }
        }
        return ans;
    }
}