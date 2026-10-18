class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        permutations(ans, temp, nums, arr);
        return ans;
    }

    public void permutations(List<List<Integer>> ans, List<Integer> cur, int[] nums, boolean[] isUsed){
        if(cur.size() == nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!isUsed[i]){
                cur.add(nums[i]);
                isUsed[i] = true;
                permutations(ans, cur, nums, isUsed);
                isUsed[i] = false;
                cur.remove(cur.size()-1);
            }
        }
    }
}
