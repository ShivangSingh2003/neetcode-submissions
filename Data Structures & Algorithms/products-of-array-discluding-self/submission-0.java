class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int prod = 1;
        int zeroCounter = 0;

        for(int i = 0; i < len; i++){
            if(nums[i] == 0){
                zeroCounter++;
                continue;
            }
            prod *= nums[i];
        }
        int[] arr = new int[len];

        if(zeroCounter > 1){
            for(int i = 0; i < len; i++){
                arr[i] = 0;
            }
        }
        else if(zeroCounter == 1){
            for(int i = 0; i < len; i++){
                if(nums[i] == 0){
                    arr[i] = prod;
                }
                else{
                    arr[i] = 0;
                }
            }
        }

        else{
            for(int i = 0; i < len; i++){
                arr[i] = prod/nums[i];
            }
        }

        return arr;
    }
}  
