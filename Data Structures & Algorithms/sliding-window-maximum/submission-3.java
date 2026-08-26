class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int left = 0;
        int right = k-1;
        int[] ans = new int[nums.length - k + 1];
        int pos = findMax(nums, left, right);
        ans[0] = nums[pos];
        left++;
        right++;
        for(int i = 1; i < ans.length; i++){
            if(pos>=left){
                if(nums[right]>nums[pos]){
                    ans[i] = nums[right];
                    pos = right;
                    left++;
                    right++;
                }
                else{
                    ans[i] = nums[pos];
                    left++;
                    right++;
                }
            }
            else{
                if(nums[right] >= nums[pos]){
                    ans[i] = nums[right];
                    pos = right;
                    left++;
                    right++;
                }
                else{
                    pos = findMax(nums, left, right);
                    ans[i] = nums[pos];
                    left++;
                    right++;
                }
            }
        }

        return ans;
    }

    public static int findMax(int[] arr, int s, int e){
        int max = -10001;
        int idx = 0;
        for(int i = s; i <= e; i++){
            if(arr[i] > max){
                max = arr[i];
                idx = i;
            }
        }

        return idx;
    }
}
