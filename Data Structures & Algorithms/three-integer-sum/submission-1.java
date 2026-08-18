class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            left = i+1;
            right = nums.length-1;
            
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum<0){
                    left++;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[left]);
                    lst.add(nums[right]);
                    ans.add(lst);
                    while(left<right && nums[left+1] == nums[left]) left++;
                    while(left<right && nums[right-1] == nums[right]) right--;
                    left++;
                    right--;
                }
                
            }
        }

        return ans;
    }
}
