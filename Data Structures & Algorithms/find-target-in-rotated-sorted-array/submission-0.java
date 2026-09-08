class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len-1;

        while(start <= end){
            int mid = end + (start - end)/2;
            if(target == nums[mid])
                return mid;
            if(nums[mid] > nums[start]){
                if(target >= nums[start] && target <= nums[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else{
                if(target >= nums[mid] && target <= nums[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }
}
