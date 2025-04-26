class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n; i++){
            int first = nums[i];
            for(int j = i+1; j<n; j++){
                int sec = nums[j];
                long find = target;
                find = find - (first + sec);
                int k = j+1, l = n-1;
                while(k<l){
                    if(nums[k] + nums[l] == find){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(first);
                        temp.add(sec);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        k++;
                        l--;
                        if(set.contains(temp))
                         continue;
                        else
                         set.add(temp); 
                        result.add(temp);
                    }
                    else if(nums[k] + nums[l] > find)
                     l--;
                    else
                      k++;
                }    
            }
        }
        return result;
    }
}