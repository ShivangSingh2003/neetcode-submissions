class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int start = i+1;
            int end = nums.length-1;

            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];

                if(sum < 0){
                    start++;
                }
                else if(sum > 0){
                    end--;
                }
                else{
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[start]);
                    lst.add(nums[end]);
                    ans.add(lst);

                    while(start<end && nums[start+1] == nums[start]) start++;
                    while(start<end && nums[end-1] == nums[end]) end--;

                    start++;
                    end--;
                }
            }
        }

        return ans;
    }
}
