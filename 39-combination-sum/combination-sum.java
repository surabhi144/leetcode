class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> com = new ArrayList<>();
        recur(0, candidates, target, res, com, 0);
        return res;
    }
    public void recur(int idx, int[] candidates, int target, List<List<Integer>> res, List<Integer> com, int sum){
        if(sum > target)
         return;
        if(sum == target){
            res.add(new ArrayList<>(com));
            return;
        }
        for(int i = idx; i < candidates.length; i++){
            com.add(candidates[i]);
            recur(i, candidates, target, res, com, sum + candidates[i]);
            com.remove(com.size() - 1);
        }
    }
}