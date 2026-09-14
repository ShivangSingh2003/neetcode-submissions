class Solution {
    public int findDuplicate(int[] nums) {
        int l = nums.length;
        for(int i = 0; i < l-1; i++){
            for(int j = i+1; j < l; j++){
                if(nums[i] == nums[j])
                    return nums[i];
            }
        }
        return -1;
    }
}
