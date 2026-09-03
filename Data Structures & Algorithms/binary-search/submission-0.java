class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (end+start)/2;
            int n = nums[mid];
            if(n == target)
                return mid;
            else if(n < target){
                start = mid+1;
                continue;
            }
            else{
                end = mid-1;
                continue;
            }
        }

        return -1;
    }
}
