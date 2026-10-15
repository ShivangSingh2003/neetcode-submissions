class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        subsetsHelper(nums, 0, lst, res);
        return res;
    }

    public void subsetsHelper(int[] nums, int index, List<Integer> cur, List<List<Integer>> answer){
        if(index == nums.length){
            answer.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[index]);
        subsetsHelper(nums, index+1, cur, answer);
        cur.remove(cur.size()-1);
        subsetsHelper(nums, index+1, cur, answer);
    }
}
