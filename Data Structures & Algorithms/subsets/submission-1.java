class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        subsetHelper(ans, nums, 0, lst);
        return ans;
    }

    public void subsetHelper(List<List<Integer>> ans, int[] nums, int index, List<Integer> cur){
        if(index == nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }

        cur.add(nums[index]);
        subsetHelper(ans, nums, index+1, cur);
        cur.remove(cur.size()-1);
        subsetHelper(ans, nums, index+1, cur);
    }

}
