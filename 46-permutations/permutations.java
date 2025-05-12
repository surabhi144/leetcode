class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        recur(0, nums, res, perm);
        return res;
    }

    public void recur(int idx, int[] nums, List<List<Integer>> res, List<Integer> perm){
        if(perm.size() == nums.length){
            res.add(new ArrayList<>(perm));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(perm.contains(nums[i]))
             continue;
            perm.add(nums[i]);
            recur(i+1, nums, res, perm);
            perm.remove(perm.size() - 1);
        }
    }
}