class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < len-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}