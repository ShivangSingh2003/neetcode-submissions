class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int prefix = 1;
        int suffix = 1;
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            
            arr[i] = prefix;
            prefix *= nums[i];
        }

        for(int i = len-1; i >= 0; i--){
            arr[i] *= suffix;
            suffix *= nums[i];
        }
        

        return arr;
    }
}  
