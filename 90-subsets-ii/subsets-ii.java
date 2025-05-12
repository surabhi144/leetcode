class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        recur(0, subset, res, nums.length, nums);
        return res;
    }
    public void recur(int idx, List<Integer> subset, List<List<Integer>> res, int n, int[] nums){
        res.add(new ArrayList<>(subset));
        for(int i = idx; i<n; i++){
            if(i != idx && nums[i] == nums[i-1])
             continue;
            subset.add(nums[i]);
            recur(i+1, subset, res, n, nums);
            subset.remove(subset.size() - 1);
        }
    }
}