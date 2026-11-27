class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        combos(nums, 0, target, curr, res);
        return res;
    }

    public void combos(int[] nums, int idx, int target, List<Integer> cur, List<List<Integer>> result){
        if(target == 0){
            List<Integer> temp = new ArrayList<>(cur);
            result.add(temp);
        }

        for(int i = idx; i < nums.length; i++){
            if(nums[i] > target)
                break;
            cur.add(nums[i]);
            combos(nums, i, target-nums[i], cur, result);
            cur.remove(cur.size()-1);
        }
    }
}
