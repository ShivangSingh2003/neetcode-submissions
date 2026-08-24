class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int l = nums.length;
        int[] ans = new int[l];

        for(int i = 0; i < l; i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }

        for(int i = l-1; i>=0; i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}  
